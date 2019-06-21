package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemoteDebugMoveView$3
  implements Runnable
{
  RemoteDebugMoveView$3(RemoteDebugMoveView paramRemoteDebugMoveView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101854);
    if (this.hki.getY() + this.hki.getHeight() > RemoteDebugMoveView.c(this.hki))
      this.hki.setY(RemoteDebugMoveView.c(this.hki) - this.hki.getHeight());
    AppMethodBeat.o(101854);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView.3
 * JD-Core Version:    0.6.2
 */