package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bt;
import com.tencent.mm.g.a.bt.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.g;

final class WalletBiometricPaySettingsUI$2
  implements DialogInterface.OnClickListener
{
  WalletBiometricPaySettingsUI$2(WalletBiometricPaySettingsUI paramWalletBiometricPaySettingsUI, f paramf)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46222);
    paramDialogInterface = g.b(this.trd.mController.ylL, false, null);
    bt localbt = new bt();
    bt.a locala = localbt.cuS;
    if (WalletBiometricPaySettingsUI.a(this.trd).bxe());
    for (paramInt = 1; ; paramInt = 2)
    {
      locala.cuU = paramInt;
      localbt.callback = new WalletBiometricPaySettingsUI.2.1(this, localbt, paramDialogInterface);
      a.xxA.a(localbt, this.trd.getMainLooper());
      WalletBiometricPaySettingsUI.d(this.trd);
      this.iFR.notifyDataSetChanged();
      AppMethodBeat.o(46222);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI.2
 * JD-Core Version:    0.6.2
 */