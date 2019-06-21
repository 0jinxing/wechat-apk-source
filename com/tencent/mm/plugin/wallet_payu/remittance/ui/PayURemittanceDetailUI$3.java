package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.c.a.a;
import com.tencent.mm.ui.base.h;

final class PayURemittanceDetailUI$3
  implements a.a
{
  PayURemittanceDetailUI$3(PayURemittanceDetailUI paramPayURemittanceDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48546);
    h.d(this.tUG, this.tUG.getString(2131302398, new Object[] { PayURemittanceDetailUI.adl(PayURemittanceDetailUI.e(this.tUG)) }), this.tUG.getString(2131297031), this.tUG.getString(2131302403), this.tUG.getString(2131296868), new PayURemittanceDetailUI.3.1(this), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    });
    AppMethodBeat.o(48546);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.ui.PayURemittanceDetailUI.3
 * JD-Core Version:    0.6.2
 */