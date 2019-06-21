package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.k.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;

final class c$9
  implements b.a
{
  c$9(c paramc)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(113604);
    if (!paramBoolean)
    {
      if ((!c.A(this.nQa)) && (!com.tencent.mm.modelgeo.d.agA()))
      {
        c.B(this.nQa);
        h.a(this.nQa.activity, this.nQa.activity.getString(2131300421), this.nQa.activity.getString(2131297061), this.nQa.activity.getString(2131300878), this.nQa.activity.getString(2131296868), false, new c.9.1(this), null);
      }
      paramBoolean = false;
      AppMethodBeat.o(113604);
    }
    while (true)
    {
      return paramBoolean;
      if ((c.g(this.nQa) == -85.0D) || (c.h(this.nQa) == -1000.0D))
      {
        ab.d("MicroMsg.MMPoiMapUI", "first get location");
        String str = (int)(1000000.0F * paramFloat2) + "," + (int)(1000000.0F * paramFloat1);
        g.RP().Ry().set(ac.a.xMx, str);
        c.c(this.nQa, paramFloat2);
        c.d(this.nQa, paramFloat1);
        c.a(this.nQa, paramFloat2);
        c.b(this.nQa, paramFloat1);
        c.a(this.nQa, c.g(this.nQa));
        c.b(this.nQa, c.h(this.nQa));
        c.k(this.nQa).l(c.i(this.nQa), c.j(this.nQa));
        this.nQa.nMj.getIController().animateTo(c.g(this.nQa), c.h(this.nQa), com.tencent.mm.plugin.location.ui.d.bJM());
        if (!c.q(this.nQa))
          c.m(this.nQa);
      }
      paramBoolean = true;
      AppMethodBeat.o(113604);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c.9
 * JD-Core Version:    0.6.2
 */