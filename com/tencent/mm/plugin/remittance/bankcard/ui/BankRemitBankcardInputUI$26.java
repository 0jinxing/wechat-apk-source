package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class BankRemitBankcardInputUI$26
  implements View.OnClickListener
{
  BankRemitBankcardInputUI$26(BankRemitBankcardInputUI paramBankRemitBankcardInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44542);
    ab.i("MicroMsg.BankRemitBankcardInputUI", "click arrive time et");
    this.pMO.aqX();
    BankRemitBankcardInputUI.r(this.pMO).cex();
    if (!BankRemitBankcardInputUI.u(this.pMO))
    {
      paramView = new Intent(this.pMO.mController.ylL, BankRemitSelectArriveTimeUI.class);
      if ((BankRemitBankcardInputUI.v(this.pMO) != null) && (BankRemitBankcardInputUI.v(this.pMO).pLN != null))
        paramView.putParcelableArrayListExtra("key_arrive_time_parcel_list", BankRemitBankcardInputUI.v(this.pMO).pLN);
      if (BankRemitBankcardInputUI.w(this.pMO) != null)
        paramView.putExtra("key_select_arrive_time", BankRemitBankcardInputUI.w(this.pMO).pLQ);
      this.pMO.startActivityForResult(paramView, 3);
    }
    AppMethodBeat.o(44542);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.26
 * JD-Core Version:    0.6.2
 */