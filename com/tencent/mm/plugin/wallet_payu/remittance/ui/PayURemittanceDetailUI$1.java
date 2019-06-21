package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.c.a.a;
import com.tencent.mm.ui.base.h;

final class PayURemittanceDetailUI$1
  implements a.a
{
  PayURemittanceDetailUI$1(PayURemittanceDetailUI paramPayURemittanceDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48543);
    h.d(this.tUG, this.tUG.getString(2131302382), this.tUG.getString(2131297031), this.tUG.getString(2131302455), this.tUG.getString(2131296868), new PayURemittanceDetailUI.1.1(this), new PayURemittanceDetailUI.1.2(this));
    AppMethodBeat.o(48543);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.ui.PayURemittanceDetailUI.1
 * JD-Core Version:    0.6.2
 */