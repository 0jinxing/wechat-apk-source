package com.tencent.voip.mars.comm;

import com.tencent.matrix.trace.core.AppMethodBeat;

class WakerLock$1
  implements Runnable
{
  WakerLock$1(WakerLock paramWakerLock)
  {
  }

  public void run()
  {
    AppMethodBeat.i(92745);
    this.this$0.unLock();
    AppMethodBeat.o(92745);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.voip.mars.comm.WakerLock.1
 * JD-Core Version:    0.6.2
 */