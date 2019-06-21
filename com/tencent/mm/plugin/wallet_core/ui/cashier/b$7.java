package com.tencent.mm.plugin.wallet_core.ui.cashier;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.ad;

final class b$7
  implements a.a
{
  b$7(b paramb, boolean paramBoolean)
  {
  }

  public final void cMN()
  {
    AppMethodBeat.i(47771);
    ab.i("MicroMsg.WcPayCashierDialog", "on click add new bankcard");
    b.F(this.tMC).a(this.tMC);
    b.G(this.tMC);
    if (b.c(this.tMC) != null)
      b.c(this.tMC).cMN();
    AppMethodBeat.o(47771);
  }

  public final void i(Bankcard paramBankcard)
  {
    int i = 0;
    AppMethodBeat.i(47770);
    if (paramBankcard == null)
    {
      AppMethodBeat.o(47770);
      return;
    }
    ab.i("MicroMsg.WcPayCashierDialog", "on select bankcard: %s, %s", new Object[] { paramBankcard.field_bankName, paramBankcard.field_bindSerial });
    if ((this.tMC.tMq == null) || (!paramBankcard.field_bindSerial.equals(this.tMC.tMq.field_bindSerial)))
    {
      if (this.tMC.pVL != null)
        break label193;
      label82: if (this.tMC.pVL != null)
        break label207;
    }
    label193: label207: for (String str = ""; ; str = this.tMC.pVL.czZ)
    {
      ad.e(i, str, 13, paramBankcard.field_bindSerial);
      this.tMC.tMq = paramBankcard;
      b.u(this.tMC);
      b.p(this.tMC);
      b.q(this.tMC);
      b.v(this.tMC);
      b.w(this.tMC);
      b.E(this.tMC);
      b.F(this.tMC).a(this.tMC);
      b.G(this.tMC);
      this.tMC.show();
      AppMethodBeat.o(47770);
      break;
      i = this.tMC.pVL.cIf;
      break label82;
    }
  }

  public final void onCancel()
  {
    AppMethodBeat.i(47772);
    ab.i("MicroMsg.WcPayCashierDialog", "on bankcard dialog cancel");
    b.F(this.tMC).a(this.tMC);
    b.G(this.tMC);
    if (this.tMF)
    {
      this.tMC.cancel();
      AppMethodBeat.o(47772);
    }
    while (true)
    {
      return;
      this.tMC.show();
      AppMethodBeat.o(47772);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.b.7
 * JD-Core Version:    0.6.2
 */