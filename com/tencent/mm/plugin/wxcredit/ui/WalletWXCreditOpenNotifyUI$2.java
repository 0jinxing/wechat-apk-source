package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wxcredit.b;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletWXCreditOpenNotifyUI$2
  implements View.OnClickListener
{
  WalletWXCreditOpenNotifyUI$2(WalletWXCreditOpenNotifyUI paramWalletWXCreditOpenNotifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48741);
    paramView = new Bundle();
    paramView.putParcelable("key_bankcard", this.uZD.mBundle.getParcelable("key_bankcard"));
    a.a(this.uZD, b.class, paramView);
    AppMethodBeat.o(48741);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI.2
 * JD-Core Version:    0.6.2
 */