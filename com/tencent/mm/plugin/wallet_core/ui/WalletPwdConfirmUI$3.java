package com.tencent.mm.plugin.wallet_core.ui;

import android.os.Bundle;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

final class WalletPwdConfirmUI$3
  implements EditHintPasswdView.a
{
  WalletPwdConfirmUI$3(WalletPwdConfirmUI paramWalletPwdConfirmUI)
  {
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(47540);
    if (paramBoolean)
    {
      String str1 = this.tJx.mBundle.getString("key_new_pwd1");
      String str2 = this.tJx.nrZ.getMd5Value();
      if ((str1 == null) || (!str1.equals(str2)))
      {
        a.o(this.tJx, -1002);
        AppMethodBeat.o(47540);
      }
    }
    while (true)
    {
      return;
      WalletPwdConfirmUI.b(this.tJx).setEnabled(paramBoolean);
      WalletPwdConfirmUI.b(this.tJx).setClickable(paramBoolean);
      AppMethodBeat.o(47540);
      continue;
      WalletPwdConfirmUI.b(this.tJx).setEnabled(paramBoolean);
      WalletPwdConfirmUI.b(this.tJx).setClickable(paramBoolean);
      AppMethodBeat.o(47540);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.3
 * JD-Core Version:    0.6.2
 */