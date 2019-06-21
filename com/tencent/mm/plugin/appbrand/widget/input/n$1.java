package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class n$1
  implements Runnable
{
  n$1(n paramn)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(126663);
    ab.i("MicroMsg.AppBrandUIdRootFrameLayout", "hideInactivePanelView, mPanel %s", new Object[] { n.b(this.jeP).getClass().getSimpleName() });
    if (n.b(this.jeP) == null)
      AppMethodBeat.o(126663);
    while (true)
    {
      return;
      while (i < this.jeP.getChildCount())
      {
        View localView = this.jeP.getChildAt(i);
        if ((localView != null) && (localView != n.c(this.jeP)) && (localView != n.b(this.jeP)))
          n.cJ(localView);
        i++;
      }
      AppMethodBeat.o(126663);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.n.1
 * JD-Core Version:    0.6.2
 */