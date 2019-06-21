package com.tencent.mm.plugin.wxcredit.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletWXCreditChangeAmountUI$4
  implements View.OnClickListener
{
  WalletWXCreditChangeAmountUI$4(WalletWXCreditChangeAmountUI paramWalletWXCreditChangeAmountUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48692);
    WalletWXCreditChangeAmountUI.a(this.uZr, false);
    WalletWXCreditChangeAmountUI.a(this.uZr);
    this.uZr.showDialog(1);
    AppMethodBeat.o(48692);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI.4
 * JD-Core Version:    0.6.2
 */