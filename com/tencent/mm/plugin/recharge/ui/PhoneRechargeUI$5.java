package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.e;
import com.tencent.mm.sdk.platformtools.ab;

final class PhoneRechargeUI$5
  implements View.OnClickListener
{
  PhoneRechargeUI$5(PhoneRechargeUI paramPhoneRechargeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44256);
    if (!PhoneRechargeUI.a(this.pHs, PhoneRechargeUI.k(this.pHs).tmN, PhoneRechargeUI.k(this.pHs).fjD))
    {
      paramView = PhoneRechargeUI.b(this.pHs, PhoneRechargeUI.k(this.pHs).url);
      ab.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramView });
      PhoneRechargeUI.c(this.pHs, paramView);
    }
    AppMethodBeat.o(44256);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.5
 * JD-Core Version:    0.6.2
 */