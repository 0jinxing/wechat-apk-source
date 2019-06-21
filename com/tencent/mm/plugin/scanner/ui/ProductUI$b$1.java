package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ProductUI$b$1
  implements ProductScrollView.a
{
  ProductUI$b$1(ProductUI.b paramb)
  {
  }

  public final void bpT()
  {
    float f1 = 1.0F;
    AppMethodBeat.i(81103);
    ProductUI.b localb = this.qdD;
    int i = localb.qdA.getScrollY();
    float f2;
    label62: float f4;
    if (i < 0)
    {
      f2 = -1.0F;
      ab.v("MicroMsg.ProductUI.HeaderEffectHelper", "rate=".concat(String.valueOf(f2)));
      if (f2 != 1.0F)
        break label209;
      if (!localb.qdB)
      {
        localb.qdB = true;
        if (ProductUI.x(localb.qdu) != null)
        {
          float f3 = 1.0F - f2 - 0.2F;
          f4 = f3;
          if (f3 <= 0.0F)
            f4 = 0.0F;
          if (f2 == 0.0F)
            f4 = 1.0F;
          ProductUI.p(ProductUI.x(localb.qdu), f4);
        }
        if (ProductUI.y(localb.qdu) != null)
        {
          if (f2 != 0.0F)
            break label217;
          f4 = 0.0F;
        }
      }
    }
    while (true)
    {
      ProductUI.p(ProductUI.y(localb.qdu), f4);
      AppMethodBeat.o(81103);
      return;
      if ((i >= ProductUI.z(localb.qdu) - localb.acV) || (ProductUI.z(localb.qdu) == 0.0F))
      {
        f2 = 1.0F;
        break;
      }
      f2 = i * 1.37F / ProductUI.z(localb.qdu);
      break;
      label209: localb.qdB = false;
      break label62;
      label217: f4 = f1;
      if (f2 >= 0.0F)
      {
        f2 += 0.2F;
        f4 = f1;
        if (f2 <= 1.0F)
          f4 = f2;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductUI.b.1
 * JD-Core Version:    0.6.2
 */