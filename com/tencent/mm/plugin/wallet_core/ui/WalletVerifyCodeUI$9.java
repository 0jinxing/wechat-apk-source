package com.tencent.mm.plugin.wallet_core.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class WalletVerifyCodeUI$9
  implements MenuItem.OnMenuItemClickListener
{
  WalletVerifyCodeUI$9(WalletVerifyCodeUI paramWalletVerifyCodeUI, String paramString)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(47698);
    e.n(this.tLn.mController.ylL, this.tLr, false);
    AppMethodBeat.o(47698);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.9
 * JD-Core Version:    0.6.2
 */