package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;

class StaticDecodeDataComponent$1
  implements Runnable
{
  StaticDecodeDataComponent$1(StaticDecodeDataComponent paramStaticDecodeDataComponent)
  {
  }

  public void run()
  {
    AppMethodBeat.i(104687);
    if (this.this$0.getPlayerState() == 8)
    {
      Logger.w("StaticDecodeDataComponent", "[run] state changed to END during postRunnable!");
      AppMethodBeat.o(104687);
    }
    while (true)
    {
      return;
      this.this$0.mCallback.playerPrepared(this.this$0.mCorePlayer);
      AppMethodBeat.o(104687);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.1
 * JD-Core Version:    0.6.2
 */