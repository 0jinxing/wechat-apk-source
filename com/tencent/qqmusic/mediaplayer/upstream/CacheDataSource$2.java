package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.TimerTask;

class CacheDataSource$2 extends TimerTask
{
  CacheDataSource$2(CacheDataSource paramCacheDataSource, long paramLong)
  {
  }

  public void run()
  {
    AppMethodBeat.i(104581);
    Logger.i("CacheDataSource", "[scheduleRestart] restart loading from position: " + this.val$restartPosition);
    CacheDataSource.access$100(this.this$0, this.val$restartPosition);
    AppMethodBeat.o(104581);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.2
 * JD-Core Version:    0.6.2
 */