package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;

class StaticDecodeDataComponent$4
  implements Runnable
{
  StaticDecodeDataComponent$4(StaticDecodeDataComponent paramStaticDecodeDataComponent)
  {
  }

  public void run()
  {
    AppMethodBeat.i(104778);
    this.this$0.mCallback.playerEnded(this.this$0.mCorePlayer);
    AppMethodBeat.o(104778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.4
 * JD-Core Version:    0.6.2
 */