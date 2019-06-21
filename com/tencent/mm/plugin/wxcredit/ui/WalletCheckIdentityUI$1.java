package com.tencent.mm.plugin.wxcredit.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletCheckIdentityUI$1
  implements View.OnClickListener
{
  WalletCheckIdentityUI$1(WalletCheckIdentityUI paramWalletCheckIdentityUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48681);
    paramView = WalletCheckIdentityUI.a(this.uYW).getText();
    String str = WalletCheckIdentityUI.b(this.uYW).getText();
    if (WalletCheckIdentityUI.a(this.uYW, paramView, str))
      this.uYW.dOE().p(new Object[] { paramView, str });
    AppMethodBeat.o(48681);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI.1
 * JD-Core Version:    0.6.2
 */