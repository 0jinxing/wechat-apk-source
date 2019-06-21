package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class PhoneRechargeUI$18
  implements View.OnClickListener
{
  PhoneRechargeUI$18(PhoneRechargeUI paramPhoneRechargeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44272);
    if (PhoneRechargeUI.f(this.pHs) != null)
      PhoneRechargeUI.g(this.pHs);
    while (true)
    {
      PhoneRechargeUI.h(this.pHs).setVisibility(8);
      AppMethodBeat.o(44272);
      return;
      ab.e("MicroMsg.PhoneRechargeUI", "hy: no banner but show ad. should not happen");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.18
 * JD-Core Version:    0.6.2
 */