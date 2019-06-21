package com.tencent.mm.plugin.product.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallProductSelectSkuUI$1
  implements f.a
{
  MallProductSelectSkuUI$1(MallProductSelectSkuUI paramMallProductSelectSkuUI)
  {
  }

  public final void t(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(44105);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      MallProductSelectSkuUI.a(this.pju);
      AppMethodBeat.o(44105);
    }
    while (true)
    {
      return;
      this.pju.UJ(paramString);
      AppMethodBeat.o(44105);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI.1
 * JD-Core Version:    0.6.2
 */