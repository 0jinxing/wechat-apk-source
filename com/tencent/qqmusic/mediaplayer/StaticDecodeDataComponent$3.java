package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;

class StaticDecodeDataComponent$3
  implements Runnable
{
  StaticDecodeDataComponent$3(StaticDecodeDataComponent paramStaticDecodeDataComponent)
  {
  }

  public void run()
  {
    AppMethodBeat.i(104482);
    this.this$0.mCallback.playerStopped(this.this$0.mCorePlayer);
    AppMethodBeat.o(104482);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.3
 * JD-Core Version:    0.6.2
 */