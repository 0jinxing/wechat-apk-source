package com.tencent.mm.plugin.wxcredit.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletWXCreditChangeAmountUI$8
  implements AdapterView.OnItemClickListener
{
  WalletWXCreditChangeAmountUI$8(WalletWXCreditChangeAmountUI paramWalletWXCreditChangeAmountUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(48696);
    this.uZr.dismissDialog(2);
    if (WalletWXCreditChangeAmountUI.l(this.uZr))
      if (paramInt == 0)
        WalletWXCreditChangeAmountUI.c(this.uZr).nYb = "Y";
    while (true)
    {
      WalletWXCreditChangeAmountUI.k(this.uZr);
      AppMethodBeat.o(48696);
      return;
      WalletWXCreditChangeAmountUI.c(this.uZr).nYb = "N";
      continue;
      if (paramInt == 0)
        WalletWXCreditChangeAmountUI.f(this.uZr).nYb = "Y";
      else
        WalletWXCreditChangeAmountUI.f(this.uZr).nYb = "N";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI.8
 * JD-Core Version:    0.6.2
 */