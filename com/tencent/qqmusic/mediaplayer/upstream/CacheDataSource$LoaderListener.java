package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.DataRangeTracker;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;

class CacheDataSource$LoaderListener
  implements Loader.Listener
{
  private long loadedPosition = -9223372036854775808L;

  private CacheDataSource$LoaderListener(CacheDataSource paramCacheDataSource)
  {
  }

  public void onLoadCancelled(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(104517);
      Logger.i("CacheDataSource", "[onLoadCancelled] enter. terminated: ".concat(String.valueOf(paramBoolean)));
      if (!paramBoolean);
      while (true)
      {
        try
        {
          if (!CacheDataSource.access$200(this.this$0))
            CacheDataSource.access$300(this.this$0).abandonLock();
          AppMethodBeat.o(104517);
          return;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          IOException localIOException = new java/io/IOException;
          localIOException.<init>("failed to start load after cancelling", localIllegalStateException);
          onLoadError(localIOException);
        }
        CacheDataSource.access$300(this.this$0).abandonLock();
        AppMethodBeat.o(104517);
      }
    }
    finally
    {
    }
  }

  public void onLoadCompleted()
  {
    AppMethodBeat.i(104518);
    CacheDataSource.access$402(this.this$0, -9223372036854775808L);
    CacheDataSource.access$502(this.this$0, null);
    CacheDataSource.access$602(this.this$0, true);
    CacheDataSource.access$300(this.this$0).abandonLock();
    if (CacheDataSource.access$700(this.this$0) != null)
      CacheDataSource.access$700(this.this$0).onStreamingFinished();
    AppMethodBeat.o(104518);
  }

  public void onLoadError(IOException paramIOException)
  {
    AppMethodBeat.i(104520);
    Logger.e("CacheDataSource", "[onLoadError] enter.", paramIOException);
    long l1;
    if (this.loadedPosition == -9223372036854775808L)
    {
      l1 = 0L;
      this.this$0.pendingRestartPositionByte = this.loadedPosition;
      if (CacheDataSource.access$700(this.this$0) == null)
        break label141;
      long l2 = CacheDataSource.access$700(this.this$0).onStreamingError(paramIOException);
      if (l2 < 0L)
        break label103;
      CacheDataSource.access$900(this.this$0, l1, l2);
      this.this$0.pendingRestartPositionByte = -9223372036854775808L;
      AppMethodBeat.o(104520);
    }
    while (true)
    {
      return;
      l1 = this.loadedPosition;
      break;
      label103: CacheDataSource.access$402(this.this$0, -9223372036854775808L);
      CacheDataSource.access$502(this.this$0, null);
      CacheDataSource.access$300(this.this$0).abandonLock();
      AppMethodBeat.o(104520);
      continue;
      label141: CacheDataSource.access$402(this.this$0, -9223372036854775808L);
      CacheDataSource.access$502(this.this$0, null);
      CacheDataSource.access$300(this.this$0).abandonLock();
      AppMethodBeat.o(104520);
    }
  }

  public void onLoadProgress(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(104519);
    this.loadedPosition = paramLong2;
    CacheDataSource.access$300(this.this$0).addRange(paramLong1, paramLong2);
    if (CacheDataSource.access$700(this.this$0) != null)
      CacheDataSource.access$700(this.this$0).onUpStreamTransfer(paramLong2, CacheDataSource.access$800(this.this$0).getUpstreamSize());
    AppMethodBeat.o(104519);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.LoaderListener
 * JD-Core Version:    0.6.2
 */