package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.c.a.a;
import com.tencent.mm.ui.base.h;

final class PayURemittanceDetailUI$7
  implements a.a
{
  PayURemittanceDetailUI$7(PayURemittanceDetailUI paramPayURemittanceDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48551);
    h.d(this.tUG, this.tUG.getString(2131302398, new Object[] { PayURemittanceDetailUI.adm(PayURemittanceDetailUI.f(this.tUG)) }), this.tUG.getString(2131297031), this.tUG.getString(2131302403), this.tUG.getString(2131296868), new PayURemittanceDetailUI.7.1(this), new PayURemittanceDetailUI.7.2(this));
    AppMethodBeat.o(48551);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.ui.PayURemittanceDetailUI.7
 * JD-Core Version:    0.6.2
 */