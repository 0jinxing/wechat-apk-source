package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class BankRemitBankcardInputUI$20
  implements View.OnClickListener
{
  BankRemitBankcardInputUI$20(BankRemitBankcardInputUI paramBankRemitBankcardInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44535);
    ab.d("MicroMsg.BankRemitBankcardInputUI", "name iv click");
    if ((BankRemitBankcardInputUI.T(this.pMO)) || (!BankRemitBankcardInputUI.U(this.pMO)))
      BankRemitBankcardInputUI.V(this.pMO);
    while (true)
    {
      h.pYm.e(14673, new Object[] { Integer.valueOf(3) });
      AppMethodBeat.o(44535);
      return;
      paramView = new Intent(this.pMO.mController.ylL, BankRemitSelectPayeeUI.class);
      if (BankRemitBankcardInputUI.M(this.pMO) != null)
        paramView.putParcelableArrayListExtra("key_self_transfer_record_list", BankRemitBankcardInputUI.M(this.pMO));
      if (BankRemitBankcardInputUI.N(this.pMO) != null)
        paramView.putParcelableArrayListExtra("key_freq_transfer_record_list", BankRemitBankcardInputUI.N(this.pMO));
      this.pMO.startActivityForResult(paramView, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.20
 * JD-Core Version:    0.6.2
 */