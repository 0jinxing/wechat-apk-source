package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class BankRemitBankcardInputUI$25
  implements View.OnClickListener
{
  BankRemitBankcardInputUI$25(BankRemitBankcardInputUI paramBankRemitBankcardInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44541);
    this.pMO.aqX();
    paramView = BankRemitBankcardInputUI.r(this.pMO).getText();
    if ((BankRemitBankcardInputUI.s(this.pMO)) && (!bo.isNullOrNil(paramView)))
    {
      String str = BankRemitBankcardInputUI.r(this.pMO).getMD5Value();
      BankRemitBankcardInputUI.a(this.pMO, paramView, str);
      AppMethodBeat.o(44541);
    }
    while (true)
    {
      return;
      BankRemitBankcardInputUI.t(this.pMO);
      AppMethodBeat.o(44541);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.25
 * JD-Core Version:    0.6.2
 */