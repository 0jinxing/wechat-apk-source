package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.plugin.scanner.a.c;
import com.tencent.mm.plugin.scanner.a.l;
import com.tencent.mm.plugin.scanner.util.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

final class ProductUI$1
  implements b.a
{
  ProductUI$1(ProductUI paramProductUI)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(81079);
    if (paramBoolean)
    {
      ab.i("MicroMsg.scanner.ProductUI", "getLocation suc");
      if (ProductUI.a(this.qdu) != null)
      {
        ab.i("MicroMsg.scanner.ProductUI", "do getActionInfoScene, lng=" + paramFloat1 + ", lat=" + paramFloat2);
        c localc = new c(ProductUI.b(this.qdu), l.cU(ProductUI.a(this.qdu).qiL), ProductUI.c(this.qdu), ProductUI.d(this.qdu), paramFloat1, paramFloat2);
        g.Rg().a(localc, 0);
      }
      if (ProductUI.e(this.qdu) != null)
        ProductUI.e(this.qdu).c(ProductUI.f(this.qdu));
      if (!ProductUI.g(this.qdu))
      {
        ProductUI.h(this.qdu);
        o.a(2011, paramFloat1, paramFloat2, (int)paramDouble2);
      }
      AppMethodBeat.o(81079);
    }
    while (true)
    {
      return false;
      if ((!ProductUI.i(this.qdu)) && (!d.agA()))
      {
        ProductUI.j(this.qdu);
        h.a(this.qdu, this.qdu.getString(2131300421), this.qdu.getString(2131297061), this.qdu.getString(2131300878), this.qdu.getString(2131296868), false, new ProductUI.1.1(this), null);
      }
      ab.w("MicroMsg.scanner.ProductUI", "getLocation fail");
      AppMethodBeat.o(81079);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductUI.1
 * JD-Core Version:    0.6.2
 */