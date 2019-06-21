package com.tencent.mm.plugin.wallet_core.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

final class WalletSetPasswordUI$2
  implements EditHintPasswdView.a
{
  WalletSetPasswordUI$2(WalletSetPasswordUI paramWalletSetPasswordUI)
  {
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(47665);
    if (paramBoolean)
    {
      String str = this.tKL.nrZ.getMd5Value();
      Bundle localBundle = new Bundle();
      localBundle.putString("key_new_pwd1", str);
      this.tKL.nrZ.cey();
      a.j(this.tKL, localBundle);
    }
    AppMethodBeat.o(47665);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.2
 * JD-Core Version:    0.6.2
 */