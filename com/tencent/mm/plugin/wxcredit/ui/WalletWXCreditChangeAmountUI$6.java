package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wxcredit.a.c;
import com.tencent.mm.plugin.wxcredit.a.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.List;

final class WalletWXCreditChangeAmountUI$6
  implements View.OnClickListener
{
  WalletWXCreditChangeAmountUI$6(WalletWXCreditChangeAmountUI paramWalletWXCreditChangeAmountUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48694);
    if (WalletWXCreditChangeAmountUI.b(this.uZr))
      if (WalletWXCreditChangeAmountUI.c(this.uZr).uYS != null)
      {
        if (WalletWXCreditChangeAmountUI.d(this.uZr).getVisibility() == 0)
          WalletWXCreditChangeAmountUI.c(this.uZr).uYS.nYb = WalletWXCreditChangeAmountUI.d(this.uZr).getText().toString();
        if (WalletWXCreditChangeAmountUI.f(this.uZr).uYS == null)
          break label233;
        if (WalletWXCreditChangeAmountUI.g(this.uZr).getVisibility() == 0)
          WalletWXCreditChangeAmountUI.f(this.uZr).uYS.nYb = WalletWXCreditChangeAmountUI.g(this.uZr).getText().toString();
        label119: ArrayList localArrayList = new ArrayList();
        localArrayList.add(WalletWXCreditChangeAmountUI.c(this.uZr));
        localArrayList.add(WalletWXCreditChangeAmountUI.f(this.uZr));
        paramView = this.uZr.mBundle.getString("kreq_token");
        this.uZr.mBundle.getString("key_bank_type");
        paramView = new c(localArrayList, paramView);
        this.uZr.a(paramView, true, false);
        AppMethodBeat.o(48694);
      }
    while (true)
    {
      return;
      WalletWXCreditChangeAmountUI.c(this.uZr).nYb = WalletWXCreditChangeAmountUI.e(this.uZr).getText().toString();
      break;
      label233: WalletWXCreditChangeAmountUI.f(this.uZr).nYb = WalletWXCreditChangeAmountUI.h(this.uZr).getText().toString();
      break label119;
      t.makeText(this.uZr.mController.ylL, 2131305510, 0).show();
      AppMethodBeat.o(48694);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI.6
 * JD-Core Version:    0.6.2
 */