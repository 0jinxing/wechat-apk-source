package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PayURemittanceDetailUI$1$1
  implements DialogInterface.OnClickListener
{
  PayURemittanceDetailUI$1$1(PayURemittanceDetailUI.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48542);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("transaction_id", PayURemittanceDetailUI.a(this.tUH.tUG));
    paramDialogInterface.putExtra("receiver_name", PayURemittanceDetailUI.b(this.tUH.tUG));
    paramDialogInterface.putExtra("total_fee", PayURemittanceDetailUI.c(this.tUH.tUG));
    paramDialogInterface.putExtra("fee_type", PayURemittanceDetailUI.d(this.tUH.tUG));
    this.tUH.tUG.an(paramDialogInterface);
    AppMethodBeat.o(48542);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.ui.PayURemittanceDetailUI.1.1
 * JD-Core Version:    0.6.2
 */