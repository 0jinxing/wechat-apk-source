package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;

final class RemoteDebugMoveView$1
  implements Runnable
{
  RemoteDebugMoveView$1(RemoteDebugMoveView paramRemoteDebugMoveView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101851);
    this.hki.setX(RemoteDebugMoveView.a(this.hki) - RemoteDebugMoveView.b(this.hki));
    int i = (int)(a.getDensity(ah.getContext()) * 120.0F);
    this.hki.setY(i);
    AppMethodBeat.o(101851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView.1
 * JD-Core Version:    0.6.2
 */