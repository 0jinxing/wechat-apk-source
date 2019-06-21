package com.tencent.mm.plugin.appbrand.debugger;

import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$1
  implements Runnable
{
  u$1(u paramu)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101916);
    RemoteDebugMoveView localRemoteDebugMoveView = u.a(this.hkS);
    int i = this.hkS.getWidth();
    int j = this.hkS.getHeight();
    localRemoteDebugMoveView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    localRemoteDebugMoveView.hkc = i;
    localRemoteDebugMoveView.hkd = j;
    localRemoteDebugMoveView.post(new RemoteDebugMoveView.1(localRemoteDebugMoveView));
    this.hkS.addView(u.a(this.hkS));
    AppMethodBeat.o(101916);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.u.1
 * JD-Core Version:    0.6.2
 */