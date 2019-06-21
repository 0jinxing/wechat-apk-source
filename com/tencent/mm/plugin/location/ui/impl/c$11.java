package com.tencent.mm.plugin.location.ui.impl;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.k.b;
import com.tencent.mm.plugin.k.d;
import com.tencent.mm.sdk.platformtools.ab;

final class c$11
  implements View.OnClickListener
{
  c$11(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113606);
    ab.d("MicroMsg.MMPoiMapUI", "click lat: %s, lng: %s", new Object[] { Double.valueOf(c.g(this.nQa)), Double.valueOf(c.h(this.nQa)) });
    if ((c.g(this.nQa) == -85.0D) || (c.h(this.nQa) == -1000.0D))
    {
      ab.i("MicroMsg.MMPoiMapUI", "invalid lat lng");
      AppMethodBeat.o(113606);
    }
    while (true)
    {
      return;
      this.nQa.nMj.getIController().animateTo(c.g(this.nQa), c.h(this.nQa));
      c.a(this.nQa, c.g(this.nQa));
      c.b(this.nQa, c.h(this.nQa));
      c.k(this.nQa).l(c.i(this.nQa), c.j(this.nQa));
      c.l(this.nQa).setBackgroundResource(2130839182);
      c.l(this.nQa).setEnabled(true);
      c.m(this.nQa);
      c.n(this.nQa);
      c.o(this.nQa).nPV = false;
      AppMethodBeat.o(113606);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c.11
 * JD-Core Version:    0.6.2
 */