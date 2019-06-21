package com.tencent.mm.plugin.appbrand.ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$1
  implements Runnable
{
  g$1(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133089);
    g localg = this.iIs;
    if ((localg.getParent() instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)localg.getParent();
      localg.animate().alpha(0.0F).withEndAction(new g.1.2(this, localg, localViewGroup)).withStartAction(new g.1.1(this)).start();
    }
    AppMethodBeat.o(133089);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.g.1
 * JD-Core Version:    0.6.2
 */