package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;

class StreamDecodeDataComponent$1
  implements Runnable
{
  StreamDecodeDataComponent$1(StreamDecodeDataComponent paramStreamDecodeDataComponent)
  {
  }

  public void run()
  {
    AppMethodBeat.i(104694);
    if (this.this$0.getPlayerState() == 8)
    {
      Logger.w("StreamDecodeDataComponent", "[run] state changed to END during postRunnable!");
      AppMethodBeat.o(104694);
    }
    while (true)
    {
      return;
      this.this$0.mCallback.playerPrepared(this.this$0.mCorePlayer);
      AppMethodBeat.o(104694);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent.1
 * JD-Core Version:    0.6.2
 */