package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPasswordSettingUI$4
  implements DialogInterface.OnCancelListener
{
  WalletPasswordSettingUI$4(WalletPasswordSettingUI paramWalletPasswordSettingUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(46351);
    if (WalletPasswordSettingUI.h(this.tsu) != null)
      WalletPasswordSettingUI.h(this.tsu).dismiss();
    AppMethodBeat.o(46351);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.4
 * JD-Core Version:    0.6.2
 */