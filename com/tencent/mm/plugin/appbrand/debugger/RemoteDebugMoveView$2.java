package com.tencent.mm.plugin.appbrand.debugger;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemoteDebugMoveView$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private int counter = 0;

  RemoteDebugMoveView$2(RemoteDebugMoveView paramRemoteDebugMoveView)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(101853);
    int i = this.counter + 1;
    this.counter = i;
    if (i < 2)
      AppMethodBeat.o(101853);
    while (true)
    {
      return;
      this.hki.getViewTreeObserver().removeOnGlobalLayoutListener(this);
      this.hki.post(new RemoteDebugMoveView.2.1(this));
      AppMethodBeat.o(101853);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView.2
 * JD-Core Version:    0.6.2
 */