package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

final class WalletCheckPwdNewUI$3
  implements EditHintPasswdView.a
{
  WalletCheckPwdNewUI$3(WalletCheckPwdNewUI paramWalletCheckPwdNewUI)
  {
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(47323);
    ab.i("MicroMsg.WalletCheckPwdNewUI", "input isValid: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
      WalletCheckPwdNewUI.c(this.tHc).acQ(WalletCheckPwdNewUI.b(this.tHc).getText());
    AppMethodBeat.o(47323);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI.3
 * JD-Core Version:    0.6.2
 */