package com.tencent.mm.plugin.recharge.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class PhoneRechargeUI$17
  implements b.a
{
  PhoneRechargeUI$17(PhoneRechargeUI paramPhoneRechargeUI)
  {
  }

  public final void a(q paramq)
  {
    AppMethodBeat.i(44271);
    if (!PhoneRechargeUI.a(this.pHs, paramq.tmN, paramq.fjD))
      if (!bo.isNullOrNil(paramq.url))
      {
        paramq = PhoneRechargeUI.b(this.pHs, paramq.url);
        PhoneRechargeUI.c(this.pHs, paramq);
        AppMethodBeat.o(44271);
      }
    while (true)
    {
      return;
      if (PhoneRechargeUI.a(this.pHs, paramq))
      {
        PhoneRechargeUI.d(this.pHs, paramq.id);
        AppMethodBeat.o(44271);
      }
      else
      {
        ab.w("MicroMsg.PhoneRechargeUI", "error dataFlow click");
        AppMethodBeat.o(44271);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.17
 * JD-Core Version:    0.6.2
 */