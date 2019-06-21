package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBankcardIdUI$9
  implements DialogInterface.OnClickListener
{
  WalletBankcardIdUI$9(WalletBankcardIdUI paramWalletBankcardIdUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(47169);
    if (WalletBankcardIdUI.d(this.tEv) == null);
    for (paramDialogInterface = null; ; paramDialogInterface = WalletBankcardIdUI.e(this.tEv).findFocus())
    {
      if ((paramDialogInterface != null) && ((paramDialogInterface instanceof EditText)))
        this.tEv.showVKB();
      AppMethodBeat.o(47169);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.9
 * JD-Core Version:    0.6.2
 */