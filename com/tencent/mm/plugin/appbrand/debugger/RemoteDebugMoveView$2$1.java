package com.tencent.mm.plugin.appbrand.debugger;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemoteDebugMoveView$2$1
  implements Runnable
{
  RemoteDebugMoveView$2$1(RemoteDebugMoveView.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101852);
    if ((this.hkj.hki.getParent() instanceof View))
    {
      View localView = (View)this.hkj.hki.getParent();
      RemoteDebugMoveView.a(this.hkj.hki, localView.getMeasuredWidth());
      RemoteDebugMoveView.b(this.hkj.hki, localView.getMeasuredHeight());
      float f1 = Math.max(0.0F, Math.min(RemoteDebugMoveView.a(this.hkj.hki) - this.hkj.hki.getWidth(), this.hkj.hki.getX()));
      float f2 = Math.max(0.0F, Math.min(RemoteDebugMoveView.c(this.hkj.hki) - this.hkj.hki.getHeight(), this.hkj.hki.getY()));
      this.hkj.hki.setX(f1);
      this.hkj.hki.setY(f2);
      this.hkj.hki.requestLayout();
    }
    AppMethodBeat.o(101852);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView.2.1
 * JD-Core Version:    0.6.2
 */