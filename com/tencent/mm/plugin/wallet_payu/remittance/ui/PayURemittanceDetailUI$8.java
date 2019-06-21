package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class PayURemittanceDetailUI$8
  implements DialogInterface.OnClickListener
{
  PayURemittanceDetailUI$8(PayURemittanceDetailUI paramPayURemittanceDetailUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48552);
    h.bQ(this.tUG.mController.ylL, this.tUG.getString(2131302392));
    AppMethodBeat.o(48552);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.ui.PayURemittanceDetailUI.8
 * JD-Core Version:    0.6.2
 */