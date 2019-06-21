package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.c.r;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

final class WalletLqtSimpleCheckPwdUI$2
  implements EditHintPasswdView.a
{
  WalletLqtSimpleCheckPwdUI$2(WalletLqtSimpleCheckPwdUI paramWalletLqtSimpleCheckPwdUI)
  {
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(45710);
    if (paramBoolean)
    {
      WalletLqtSimpleCheckPwdUI.a(this.tlc, new r(WalletLqtSimpleCheckPwdUI.a(this.tlc).getText(), 7, this.tlc.cNH()));
      this.tlc.a(WalletLqtSimpleCheckPwdUI.b(this.tlc), true, false);
    }
    AppMethodBeat.o(45710);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSimpleCheckPwdUI.2
 * JD-Core Version:    0.6.2
 */