package com.tencent.qqmusic.mediaplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.qqmusic.mediaplayer.downstream.IDataSink;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public abstract class DefaultLoader extends Thread
  implements Loader
{
  private static final int MSG_LOAD_CANCELLED = 5;
  private static final int MSG_LOAD_COMPLETED = 3;
  private static final int MSG_LOAD_ERROR = 4;
  private static final int MSG_LOAD_PROGRESS = 2;
  private static final int MSG_LOAD_STARTED = 1;
  private static final int SIZE_UNSET = -1;
  private static final String TAG = "DefaultLoader";
  private final Chunk END_OF_QUEUE = new Chunk(0, 0L, 0L);
  private IDataSink cacheSink;
  private volatile boolean cancelled = false;
  private final BlockingQueue<Chunk> chunks;
  private final Handler eventHandler;
  private volatile boolean isLoading = false;
  private volatile boolean shutdown;
  private IDataSource upstream;
  private long upstreamSize = -1L;
  private final UriLoader uriLoader;

  protected DefaultLoader(Looper paramLooper, UriLoader paramUriLoader, Loader.Listener paramListener)
  {
    this.uriLoader = paramUriLoader;
    this.eventHandler = new Handler(paramLooper, new DefaultLoader.1(this, paramListener));
    this.chunks = new LinkedBlockingQueue(1);
  }

  private boolean loadChunk(Chunk paramChunk)
  {
    if ((this.upstream == null) || (this.cacheSink == null))
      throw new IllegalStateException("loader must be prepared first!");
    long l1 = paramChunk.start;
    long l2 = paramChunk.size;
    Logger.d("DefaultLoader", "[loadChunk] enter. startPosition: " + l1 + ", chunkSize: " + l2);
    paramChunk = new byte[paramChunk.bufferSize];
    int i;
    int j;
    long l3;
    int k;
    if (l2 == -1L)
    {
      i = 1;
      if (i == 0)
        break label208;
      j = paramChunk.length;
      l3 = 0L;
      k = 0;
    }
    label408: label414: 
    while (true)
    {
      long l4 = l1 + l3;
      while (true)
      {
        int m;
        boolean bool;
        try
        {
          m = this.upstream.readAt(l4, paramChunk, 0, j);
          if (m == -1)
          {
            Logger.i("DefaultLoader", "[loadChunk] read EOF.");
            Logger.d("DefaultLoader", "[loadChunk] exit. startPosition: " + l1 + ", loadedBytes: " + l3 + ", this.cancelled: " + this.cancelled + ", shutdown: " + this.shutdown);
            if (k != 0)
              break label408;
            bool = true;
            return bool;
            i = 0;
            break;
            label208: j = (int)Math.min(paramChunk.length, l2);
          }
        }
        catch (IOException paramChunk)
        {
          throw new IOException(new SourceReadException(paramChunk, ""));
        }
        if (m == 0)
        {
          Logger.d("DefaultLoader", "[loadChunk] read none.");
        }
        else
        {
          if (m < 0)
            throw new IOException(new SourceReadException("read error: ".concat(String.valueOf(m)), ""));
          while (true)
          {
            try
            {
              k = this.cacheSink.write(l4, paramChunk, 0, m);
              long l5 = k;
              l3 = m + l3;
              this.eventHandler.removeMessages(2);
              this.eventHandler.obtainMessage(2, (int)l1, (int)(l5 + l4 - 1L)).sendToTarget();
              if ((this.cancelled) || (this.shutdown))
              {
                k = 1;
                if (k == 0)
                  if ((i != 0) || (l3 < l2))
                    break label414;
              }
            }
            catch (IOException paramChunk)
            {
              throw new IOException(new SinkWriteException(paramChunk));
            }
            k = 0;
          }
          bool = false;
        }
      }
    }
  }

  public void cancelLoading()
  {
    Logger.i("DefaultLoader", "[cancelLoading] cancel");
    this.uriLoader.cancelLoading();
    this.cancelled = true;
  }

  protected abstract IDataSink createCacheSink(StreamingRequest paramStreamingRequest);

  protected abstract IDataSource createUpStream(StreamingRequest paramStreamingRequest);

  public long getUpstreamSize()
  {
    return this.upstreamSize;
  }

  public boolean isLoading()
  {
    if (this.uriLoader.isLoading());
    for (boolean bool = true; ; bool = this.isLoading)
      return bool;
  }

  public void prepare()
  {
    if (this.upstream != null)
      this.upstream.close();
    if (this.cacheSink != null)
      this.cacheSink.close();
  }

  public void run()
  {
    while (true)
    {
      if (!this.shutdown);
      try
      {
        Chunk localChunk = (Chunk)this.chunks.take();
        if (this.END_OF_QUEUE == localChunk)
        {
          Logger.i("DefaultLoader", "[run] end of queue!");
          return;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
          Logger.w("DefaultLoader", "[run] interrupted when taking chunk");
        try
        {
          if (!loadChunk(localInterruptedException))
            break label95;
          this.eventHandler.obtainMessage(3).sendToTarget();
        }
        catch (IOException localIOException)
        {
          Logger.e("DefaultLoader", "[run] got error!", localIOException);
          this.eventHandler.obtainMessage(4, localIOException).sendToTarget();
        }
      }
      continue;
      label95: this.eventHandler.obtainMessage(5).sendToTarget();
    }
  }

  public void shutdown()
  {
    this.shutdown = true;
    this.chunks.offer(this.END_OF_QUEUE);
    join();
    try
    {
      if (this.upstream != null)
        this.upstream.close();
    }
    catch (IOException localIOException1)
    {
      try
      {
        while (true)
        {
          if (this.cacheSink != null)
            this.cacheSink.close();
          return;
          localIOException1 = localIOException1;
          Logger.w("DefaultLoader", "[shutdown] failed to close upstream");
        }
      }
      catch (IOException localIOException2)
      {
        while (true)
          Logger.w("DefaultLoader", "[shutdown] failed to close cacheSink");
      }
    }
  }

  public void startLoading(Chunk paramChunk)
  {
    Logger.i("DefaultLoader", "[startLoading] chunk: ".concat(String.valueOf(paramChunk)));
    this.chunks.clear();
    if (!this.chunks.offer(paramChunk))
      throw new IllegalStateException("exceeds maximum of queue!");
    this.isLoading = true;
    Logger.i("DefaultLoader", "[handleMessage] loading = true");
    this.cancelled = false;
    if (getState() == Thread.State.NEW)
      this.uriLoader.startLoading(0, TimeUnit.MILLISECONDS, new DefaultLoader.2(this));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader
 * JD-Core Version:    0.6.2
 */