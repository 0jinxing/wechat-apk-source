package com.tencent.mm.plugin.wxcredit.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.wallet_core.ui.e;

final class WalletWXCreditOpenUI$2
  implements View.OnClickListener
{
  WalletWXCreditOpenUI$2(WalletWXCreditOpenUI paramWalletWXCreditOpenUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48751);
    e.a(this.uZG, WalletWXCreditOpenUI.b(this.uZG).field_bankcardType, WalletWXCreditOpenUI.b(this.uZG).field_bankName, true, false);
    AppMethodBeat.o(48751);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI.2
 * JD-Core Version:    0.6.2
 */