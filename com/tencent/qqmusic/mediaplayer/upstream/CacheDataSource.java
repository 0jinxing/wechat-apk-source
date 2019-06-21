package com.tencent.qqmusic.mediaplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.DataRangeTracker;
import com.tencent.qqmusic.mediaplayer.downstream.IDataSink;
import com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector;
import com.tencent.qqmusic.mediaplayer.perf.Collectable;
import com.tencent.qqmusic.mediaplayer.perf.ErrorUploadCollector;
import com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class CacheDataSource
  implements Collectable, IDataSource
{
  private static final int CHUNK_LOAD_BUFFER_SIZE = 8192;
  private static final int DISCONTINUITY_THRESHOLD = 8192;
  static final long NO_RESET_PENDING = -9223372036854775808L;
  private static final int PROFILE_ending = 10;
  private static final int PROFILE_isCached = 8;
  private static final int PROFILE_lock = 5;
  private static final int PROFILE_onBufferEnd = 7;
  private static final int PROFILE_onBufferStarted = 4;
  private static final int PROFILE_onBytesTransferred = 9;
  private static final int PROFILE_onBytesTransferring = 3;
  private static final int PROFILE_onReadContinuity = 1;
  private static final int PROFILE_onReadDiscontinuity = 2;
  private static final int PROFILE_readAt = 6;
  private static final int PROFILE_total = 0;
  private static final int READ_WAIT_TIMEOUT = 30000;
  private static final String TAG = "CacheDataSource";
  private static final String[] profiles = { "total", "onReadContinuity", "onReadDiscontinuity", "onBytesTransferring", "onBufferStarted", "lock", "readAt", "onBufferEnd", "isCached", "onBytesTransferred", "ending" };
  private final IDataSource cacheSource;
  private final DataRangeTracker cachedDataTracker;
  private long[] costs;
  private long currentLoadStartPosition;
  private Chunk currentLoadingChunk;
  private CacheDataSource.Listener listener;
  private boolean loadFinished;
  private final Loader loader;
  private long nextContinuousPosition;
  private boolean opened;
  protected long pendingRestartPositionByte;
  protected long pendingStartPositionByte;
  private TimerTask pendingTask;
  private Timer restartHandler;

  public CacheDataSource(IDataSource paramIDataSource1, IDataSource paramIDataSource2, IDataSink paramIDataSink, Looper paramLooper)
  {
    this(paramIDataSource2, new CacheDataSource.1(paramLooper, paramIDataSource1, paramIDataSink));
    AppMethodBeat.i(104521);
    AppMethodBeat.o(104521);
  }

  public CacheDataSource(IDataSource paramIDataSource, Loader.Factory paramFactory)
  {
    AppMethodBeat.i(104522);
    this.currentLoadStartPosition = -9223372036854775808L;
    this.costs = new long[profiles.length];
    this.cacheSource = paramIDataSource;
    this.cachedDataTracker = new DataRangeTracker();
    this.opened = false;
    this.loadFinished = false;
    this.loader = paramFactory.createLoader(new CacheDataSource.LoaderListener(this, null));
    AppMethodBeat.o(104522);
  }

  private void clearState()
  {
    this.loadFinished = false;
  }

  private boolean isCached(long paramLong, int paramInt)
  {
    AppMethodBeat.i(104534);
    long l1 = this.loader.getUpstreamSize();
    long l2 = paramLong;
    int i = paramInt;
    if (l1 > 0L)
    {
      l2 = paramLong;
      i = paramInt;
      if (paramInt + paramLong > l1 - 1L)
      {
        paramInt = (int)(l1 - paramLong - 1L);
        l2 = paramLong;
        i = paramInt;
        if (paramInt < 0)
        {
          l2 = paramLong + paramInt;
          i = 0;
        }
      }
    }
    boolean bool = this.cachedDataTracker.isCached(l2, i);
    AppMethodBeat.o(104534);
    return bool;
  }

  private void onReadContinuity(long paramLong)
  {
  }

  private void onReadDiscontinuity(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(104531);
    if (paramLong == this.currentLoadStartPosition)
    {
      Logger.i("CacheDataSource", "[onReadDiscontinuity] same same position as current load. skip.");
      AppMethodBeat.o(104531);
    }
    while (true)
    {
      return;
      long l = paramLong - this.currentLoadStartPosition;
      if ((l >= 0L) && (l < 8192L))
      {
        Logger.i("CacheDataSource", "[onReadDiscontinuity] position diff is too small(" + l + "). skip.");
        AppMethodBeat.o(104531);
      }
      else
      {
        synchronized (this.cachedDataTracker)
        {
          paramLong = Math.max(paramLong, this.cachedDataTracker.findStart(paramLong));
          if (this.currentLoadStartPosition == paramLong)
          {
            Logger.i("CacheDataSource", "[onReadDiscontinuity] loadStartPosition is the same as current load. skip.");
            AppMethodBeat.o(104531);
          }
        }
        l = paramLong - this.currentLoadStartPosition;
        if ((l >= 0L) && (l < 8192L))
        {
          Logger.i("CacheDataSource", "[onReadDiscontinuity] loadStartPosition diff is too small(" + l + "). skip.");
          AppMethodBeat.o(104531);
        }
        else if (paramLong == getSize())
        {
          Logger.i("CacheDataSource", "[onReadDiscontinuity] no need to load from end. skip.");
          AppMethodBeat.o(104531);
        }
        else
        {
          Chunk localChunk = this.currentLoadingChunk;
          if ((paramBoolean) && (localChunk != null) && (localChunk.contains(paramLong)))
          {
            Logger.i("CacheDataSource", String.format("[onReadDiscontinuity] position is cached and loadStartPosition(%d) is under loading(%s). skip.", new Object[] { Long.valueOf(paramLong), localChunk }));
            AppMethodBeat.o(104531);
          }
          else
          {
            restartLoading(paramLong);
            AppMethodBeat.o(104531);
          }
        }
      }
    }
  }

  private void reportProfiling()
  {
  }

  private void restartLoading(long paramLong)
  {
    try
    {
      AppMethodBeat.i(104533);
      Logger.i("CacheDataSource", "[restartLoading] from: ".concat(String.valueOf(paramLong)));
      this.pendingStartPositionByte = paramLong;
      this.loadFinished = false;
      if (this.loader.isLoading())
      {
        this.cachedDataTracker.block();
        this.loader.cancelLoading();
        AppMethodBeat.o(104533);
      }
      while (true)
      {
        return;
        clearState();
        startLoadingIfNeeded();
        AppMethodBeat.o(104533);
      }
    }
    finally
    {
    }
  }

  @SuppressLint({"DefaultLocale"})
  private void scheduleRestart(long paramLong1, long paramLong2)
  {
    try
    {
      AppMethodBeat.i(104535);
      Logger.i("CacheDataSource", String.format("[scheduleRestart] position: %d, delay: %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) }));
      if (this.restartHandler == null)
      {
        localObject1 = new java/util/Timer;
        ((Timer)localObject1).<init>("CacheDataSource.Restart");
        this.restartHandler = ((Timer)localObject1);
      }
      if (this.pendingTask != null)
      {
        this.pendingTask.cancel();
        this.restartHandler.purge();
      }
      Object localObject1 = new com/tencent/qqmusic/mediaplayer/upstream/CacheDataSource$2;
      ((CacheDataSource.2)localObject1).<init>(this, paramLong1);
      this.pendingTask = ((TimerTask)localObject1);
      this.restartHandler.schedule(this.pendingTask, paramLong2);
      AppMethodBeat.o(104535);
      return;
    }
    finally
    {
    }
  }

  private boolean startLoadingIfNeeded()
  {
    while (true)
    {
      long l;
      try
      {
        AppMethodBeat.i(104532);
        boolean bool;
        if (this.loadFinished)
        {
          bool = false;
          AppMethodBeat.o(104532);
          return bool;
        }
        l = this.pendingStartPositionByte;
        this.pendingStartPositionByte = -9223372036854775808L;
        if (this.opened)
          break label164;
        if (l == -9223372036854775808L)
        {
          Logger.i("CacheDataSource", "[startLoadingIfNeeded] start a fresh load");
          Chunk localChunk = new com/tencent/qqmusic/mediaplayer/upstream/Chunk;
          localChunk.<init>(8192, 0L, -1L);
          this.currentLoadingChunk = localChunk;
          this.currentLoadStartPosition = localChunk.start;
          this.cachedDataTracker.unblock();
          this.loader.startLoading(localChunk);
          bool = true;
          AppMethodBeat.o(104532);
          continue;
        }
      }
      finally
      {
      }
      Logger.i("CacheDataSource", "[startLoadingIfNeeded] start a pending load: ".concat(String.valueOf(l)));
      Object localObject2 = new Chunk(8192, l, -1L);
      continue;
      label164: if (l == -9223372036854775808L)
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>("pendingStartPositionByte must be set!");
        AppMethodBeat.o(104532);
        throw ((Throwable)localObject2);
      }
      Logger.i("CacheDataSource", "[startLoadingIfNeeded] restart a pending load: ".concat(String.valueOf(l)));
      localObject2 = new Chunk(8192, l, -1L);
    }
  }

  public void accept(ErrorUploadCollector paramErrorUploadCollector)
  {
  }

  public void accept(PlayerInfoCollector paramPlayerInfoCollector)
  {
    int i = 1;
    AppMethodBeat.i(104536);
    int j = 1;
    long l = 0L;
    while (j < profiles.length)
    {
      l += this.costs[j];
      j++;
    }
    double d = (this.costs[0] - l) / this.costs.length;
    long[] arrayOfLong = new long[this.costs.length];
    System.arraycopy(this.costs, 0, arrayOfLong, 0, this.costs.length);
    for (int k = 1; ; k++)
    {
      j = i;
      if (k >= arrayOfLong.length)
        break;
      arrayOfLong[k] = Math.max(arrayOfLong[k] - ()d, 0L);
    }
    while (j < profiles.length)
    {
      paramPlayerInfoCollector.putLong("CacheDataSource." + profiles[j], arrayOfLong[j] / 1000000L);
      j++;
    }
    AppMethodBeat.o(104536);
  }

  public void close()
  {
    AppMethodBeat.i(104529);
    Logger.i("CacheDataSource", "[close] enter.");
    if (!this.opened)
      AppMethodBeat.o(104529);
    while (true)
    {
      return;
      this.cachedDataTracker.abandonLock();
      try
      {
        this.loader.shutdown();
        label44: this.cacheSource.close();
        if (this.listener != null)
          this.listener.onTransferEnd();
        reportProfiling();
        this.opened = false;
        Logger.i("CacheDataSource", "[close] exit");
        AppMethodBeat.o(104529);
      }
      catch (InterruptedException localInterruptedException)
      {
        break label44;
      }
    }
  }

  public boolean continueLoadIfNeeded()
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(104530);
        if (!this.opened)
        {
          Logger.w("CacheDataSource", "[continueLoadIfNeeded] not opened!");
          AppMethodBeat.o(104530);
          return bool;
        }
        if (this.pendingRestartPositionByte == -9223372036854775808L)
        {
          AppMethodBeat.o(104530);
          continue;
        }
      }
      finally
      {
      }
      if (this.loadFinished)
      {
        AppMethodBeat.o(104530);
      }
      else
      {
        long l = this.pendingRestartPositionByte;
        this.pendingRestartPositionByte = -9223372036854775808L;
        scheduleRestart(l, 0L);
        Logger.i("CacheDataSource", "[continueLoadIfNeeded] schedule restart from: ".concat(String.valueOf(l)));
        bool = true;
        AppMethodBeat.o(104530);
      }
    }
  }

  public AudioFormat.AudioType getAudioType()
  {
    AppMethodBeat.i(104528);
    AudioFormat.AudioType localAudioType = FormatDetector.getAudioFormat(this, false);
    AppMethodBeat.o(104528);
    return localAudioType;
  }

  protected long getBufferTimeout(long paramLong, int paramInt)
  {
    return 30000L;
  }

  public Loader getLoader()
  {
    return this.loader;
  }

  public long getSize()
  {
    AppMethodBeat.i(104527);
    long l = this.loader.getUpstreamSize();
    AppMethodBeat.o(104527);
    return l;
  }

  public boolean isCacheFileComplete()
  {
    AppMethodBeat.i(104523);
    long l = this.cachedDataTracker.getContinuousEnd();
    boolean bool;
    if ((l != -1L) && (l == this.loader.getUpstreamSize() - 1L))
    {
      bool = true;
      AppMethodBeat.o(104523);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104523);
    }
  }

  public void open()
  {
    AppMethodBeat.i(104525);
    Logger.i("CacheDataSource", "[open] enter.");
    if (this.opened)
      AppMethodBeat.o(104525);
    while (true)
    {
      return;
      this.nextContinuousPosition = 0L;
      this.pendingRestartPositionByte = -9223372036854775808L;
      this.cacheSource.open();
      this.loader.prepare();
      startLoadingIfNeeded();
      if (this.listener != null)
        this.listener.onTransferStart();
      this.opened = true;
      Logger.i("CacheDataSource", "[open] exit");
      AppMethodBeat.o(104525);
    }
  }

  public int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(104526);
    paramInt1 = -1;
    if (paramLong < 0L)
      try
      {
        Logger.e("CacheDataSource", "[readAt] invalid position: ".concat(String.valueOf(paramLong)));
        paramArrayOfByte = new java/io/IOException;
        paramArrayOfByte.<init>("invalid position: ".concat(String.valueOf(paramLong)));
        throw paramArrayOfByte;
      }
      catch (Throwable paramArrayOfByte)
      {
        Logger.e("CacheDataSource", "[readAt] error occurred: ".concat(String.valueOf(paramLong)), paramArrayOfByte);
        throw paramArrayOfByte;
      }
      finally
      {
        AppMethodBeat.o(104526);
      }
    this.cachedDataTracker.setFileTotalSize(getSize());
    boolean bool = isCached(paramLong, paramInt2);
    if (paramLong == this.nextContinuousPosition)
    {
      onReadContinuity(paramLong);
      if (this.listener != null)
        this.listener.onBytesTransferring(paramLong, paramInt2);
      if (bool)
        paramInt1 = this.cacheSource.readAt(paramLong, paramArrayOfByte, 0, paramInt2);
      if (paramInt1 >= 0)
        break label480;
      if (this.loader.isLoading())
        break label348;
      paramInt1 = this.cacheSource.readAt(paramLong, paramArrayOfByte, 0, paramInt2);
      paramArrayOfByte = new java/lang/StringBuilder;
      paramArrayOfByte.<init>("[readAt] load not started: ");
      Logger.e("CacheDataSource", paramLong + ", size: " + paramInt2 + ", read: " + paramInt1);
    }
    label258: label261: label348: label480: 
    while (true)
    {
      int i;
      if (paramInt1 > 0)
      {
        this.nextContinuousPosition = (paramInt1 + paramLong);
        i = 0;
        if (this.listener != null)
        {
          if (i == 0)
            break label464;
          this.listener.onBytesTransferError(paramLong, paramInt2, paramInt1);
        }
      }
      while (true)
      {
        while (true)
        {
          AppMethodBeat.o(104526);
          return paramInt1;
          Object localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("[readAt] onReadDiscontinuity. expected: ");
          Logger.i("CacheDataSource", this.nextContinuousPosition + ", actual: " + paramLong);
          onReadDiscontinuity(paramLong, bool);
          break;
          if (this.listener != null)
            this.listener.onBufferStarted(paramLong);
          try
          {
            this.cachedDataTracker.lock(paramLong, paramInt2, getBufferTimeout(paramLong, paramInt2));
            if (this.listener != null)
              this.listener.onBufferEnded();
            paramInt1 = this.cacheSource.readAt(paramLong, paramArrayOfByte, 0, paramInt2);
          }
          catch (InterruptedException paramArrayOfByte)
          {
            localObject = new java/io/IOException;
            ((IOException)localObject).<init>("interrupted!", paramArrayOfByte);
            AppMethodBeat.o(104526);
            throw ((Throwable)localObject);
          }
        }
        if (paramInt1 < 0)
        {
          i = 1;
          break label261;
        }
        if (paramInt2 == 0)
          break label258;
        i = 1;
        break label261;
        this.listener.onBytesTransferred(paramLong, paramInt1);
      }
    }
  }

  public void setListener(CacheDataSource.Listener paramListener)
  {
    this.listener = paramListener;
  }

  public boolean wait(int paramInt, long paramLong)
  {
    AppMethodBeat.i(104524);
    boolean bool = this.cachedDataTracker.lock(0L, paramInt, paramLong);
    AppMethodBeat.o(104524);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource
 * JD-Core Version:    0.6.2
 */