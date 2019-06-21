package com.tencent.mm.plugin.appbrand.page;

import android.support.v4.view.s;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.i.a;

final class g$2
  implements Runnable
{
  g$2(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87038);
    if ((s.av(this.irq)) && ((g.b(this.irq).getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) && (((ViewGroup.MarginLayoutParams)g.b(this.irq).getLayoutParams()).topMargin != g.b(this.irq).getTop()))
      g.b(this.irq).requestLayout();
    AppMethodBeat.o(87038);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.g.2
 * JD-Core Version:    0.6.2
 */