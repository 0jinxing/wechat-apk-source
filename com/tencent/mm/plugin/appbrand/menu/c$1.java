package com.tencent.mm.plugin.appbrand.menu;

import android.support.v4.view.s;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements Runnable
{
  c$1(c paramc, View paramView1, View paramView2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132198);
    if (!s.av(this.imp))
      AppMethodBeat.o(132198);
    while (true)
    {
      return;
      this.imp.animate().alpha(0.0F).setDuration(1000L).setListener(new c.1.1(this));
      AppMethodBeat.o(132198);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.c.1
 * JD-Core Version:    0.6.2
 */