package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.view.View;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MCanvasView$1
  implements Runnable
{
  MCanvasView$1(MCanvasView paramMCanvasView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103711);
    Object localObject = this.heh.getParent();
    ViewParent localViewParent;
    do
    {
      ((View)localObject).forceLayout();
      localViewParent = ((ViewParent)localObject).getParent();
      localObject = localViewParent;
    }
    while ((localViewParent instanceof View));
    if (localViewParent != null)
    {
      localViewParent.requestLayout();
      this.heh.invalidate();
    }
    AppMethodBeat.o(103711);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.widget.MCanvasView.1
 * JD-Core Version:    0.6.2
 */