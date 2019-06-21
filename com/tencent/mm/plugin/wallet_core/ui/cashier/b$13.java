package com.tencent.mm.plugin.wallet_core.ui.cashier;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.ui.e;

final class b$13 extends s
{
  b$13(b paramb)
  {
  }

  public final void bgW()
  {
    int i = 0;
    AppMethodBeat.i(47778);
    ab.i("MicroMsg.WcPayCashierDialog", "click pay btn: %s", new Object[] { Integer.valueOf(b.g(this.tMC)) });
    String str;
    if (this.tMC.pVL == null)
    {
      if (this.tMC.pVL != null)
        break label113;
      str = "";
      label54: ad.e(i, str, 20, "");
      b.h(this.tMC);
      if (b.g(this.tMC) != 1)
        break label127;
      b.i(this.tMC);
      e.QS(9);
      AppMethodBeat.o(47778);
    }
    while (true)
    {
      return;
      i = this.tMC.pVL.cIf;
      break;
      label113: str = this.tMC.pVL.czZ;
      break label54;
      label127: if (b.g(this.tMC) == 2)
      {
        b.j(this.tMC);
        AppMethodBeat.o(47778);
      }
      else
      {
        ab.i("MicroMsg.WcPayCashierDialog", "wrong mode, switch pwd");
        b.k(this.tMC);
        AppMethodBeat.o(47778);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.13
 * JD-Core Version:    0.6.2
 */