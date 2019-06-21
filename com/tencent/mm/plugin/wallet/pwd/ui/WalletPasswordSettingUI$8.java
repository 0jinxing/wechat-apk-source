package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bt;
import com.tencent.mm.sdk.b.a;

final class WalletPasswordSettingUI$8
  implements DialogInterface.OnClickListener
{
  WalletPasswordSettingUI$8(WalletPasswordSettingUI paramWalletPasswordSettingUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46358);
    paramDialogInterface = new bt();
    paramDialogInterface.callback = new WalletPasswordSettingUI.8.1(this, paramDialogInterface);
    a.xxA.a(paramDialogInterface, this.tsu.getMainLooper());
    AppMethodBeat.o(46358);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.8
 * JD-Core Version:    0.6.2
 */