package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WalletRealNameVerifyUI$1
  implements View.OnClickListener
{
  WalletRealNameVerifyUI$1(WalletRealNameVerifyUI paramWalletRealNameVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46620);
    paramView = new Intent(this.tvy.mController.ylL, WalletSelectProfessionUI.class);
    paramView.putExtra("key_profession_list", WalletRealNameVerifyUI.a(this.tvy));
    this.tvy.startActivityForResult(paramView, 1);
    AppMethodBeat.o(46620);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI.1
 * JD-Core Version:    0.6.2
 */