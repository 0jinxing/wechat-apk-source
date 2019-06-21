package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;

class StreamDecodeDataComponent$2
  implements Runnable
{
  StreamDecodeDataComponent$2(StreamDecodeDataComponent paramStreamDecodeDataComponent)
  {
  }

  public void run()
  {
    AppMethodBeat.i(104688);
    this.this$0.mCallback.playerPaused(this.this$0.mCorePlayer);
    AppMethodBeat.o(104688);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent.2
 * JD-Core Version:    0.6.2
 */