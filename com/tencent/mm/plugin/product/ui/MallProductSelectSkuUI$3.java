package com.tencent.mm.plugin.product.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallProductSelectSkuUI$3
  implements MallProductSelectAmountView.a
{
  MallProductSelectSkuUI$3(MallProductSelectSkuUI paramMallProductSelectSkuUI)
  {
  }

  public final void eZ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(44108);
    switch (paramInt2)
    {
    case 2:
    default:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(44108);
      while (true)
      {
        return;
        MallProductSelectSkuUI.c(this.pju).setText(2131301355);
        MallProductSelectSkuUI.c(this.pju).setVisibility(0);
        AppMethodBeat.o(44108);
      }
      MallProductSelectSkuUI.c(this.pju).setText(this.pju.getString(2131301356, new Object[] { Integer.valueOf(paramInt1) }));
      MallProductSelectSkuUI.c(this.pju).setVisibility(0);
    }
  }

  public final void gF(int paramInt)
  {
    AppMethodBeat.i(44107);
    MallProductSelectSkuUI.b(this.pju).mCount = paramInt;
    MallProductSelectSkuUI.c(this.pju).setVisibility(8);
    AppMethodBeat.o(44107);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI.3
 * JD-Core Version:    0.6.2
 */