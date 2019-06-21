package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.WaitNotify.WaitListener;

class BaseDecodeDataComponent$1
  implements WaitNotify.WaitListener
{
  BaseDecodeDataComponent$1(BaseDecodeDataComponent paramBaseDecodeDataComponent)
  {
  }

  public boolean keepWaiting()
  {
    AppMethodBeat.i(104671);
    boolean bool = this.this$0.isPaused();
    AppMethodBeat.o(104671);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.1
 * JD-Core Version:    0.6.2
 */