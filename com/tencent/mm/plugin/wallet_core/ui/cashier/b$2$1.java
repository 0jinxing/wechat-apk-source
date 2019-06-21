package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.ui.l.b;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.ad;
import java.util.List;

final class b$2$1
  implements l.b
{
  b$2$1(b.2 param2)
  {
  }

  public final void a(FavorPayInfo paramFavorPayInfo)
  {
    int i = 0;
    AppMethodBeat.i(47758);
    ab.i("MicroMsg.WcPayCashierDialog", "on select favor: %s", new Object[] { paramFavorPayInfo.tzb });
    b.a(this.tMD.tMC, null);
    this.tMD.tMC.toH = paramFavorPayInfo;
    if (this.tMD.tMC.pVL == null)
    {
      if (this.tMD.tMC.pVL != null)
        break label281;
      paramFavorPayInfo = "";
      label77: ad.e(i, paramFavorPayInfo, 15, this.tMD.tMC.toH.tzb);
      paramFavorPayInfo = com.tencent.mm.plugin.wallet_core.ui.b.bt(this.tMD.tMC.toH.tzc, this.tMD.tMC.toH.tzd);
      this.tMD.tMC.toH.tzf = "";
      if (!com.tencent.mm.plugin.wallet_core.ui.b.a(this.tMD.tMC.toH, this.tMD.tMC.tMq))
        break label329;
      if (paramFavorPayInfo.size() != 0)
        break label298;
      this.tMD.tMC.toH.tzf = this.tMD.tMC.getContext().getString(2131304796);
      label205: b.o(this.tMD.tMC);
    }
    while (true)
    {
      b.p(this.tMD.tMC);
      b.q(this.tMD.tMC);
      b.a(this.tMD.tMC, b.r(this.tMD.tMC).kRK);
      AppMethodBeat.o(47758);
      return;
      i = this.tMD.tMC.pVL.cIf;
      break;
      label281: paramFavorPayInfo = this.tMD.tMC.pVL.czZ;
      break label77;
      label298: this.tMD.tMC.toH.tzf = this.tMD.tMC.getContext().getString(2131304797);
      break label205;
      label329: this.tMD.tMC.show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.2.1
 * JD-Core Version:    0.6.2
 */