package com.tencent.mm.plugin.wxcredit.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletWXCreditChangeAmountUI$1
  implements View.OnClickListener
{
  WalletWXCreditChangeAmountUI$1(WalletWXCreditChangeAmountUI paramWalletWXCreditChangeAmountUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48688);
    WalletWXCreditChangeAmountUI.a(this.uZr, true);
    WalletWXCreditChangeAmountUI.a(this.uZr);
    this.uZr.showDialog(1);
    AppMethodBeat.o(48688);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI.1
 * JD-Core Version:    0.6.2
 */