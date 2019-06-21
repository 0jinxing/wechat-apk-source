package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class WalletSecuritySettingUI$4
  implements DialogInterface.OnClickListener
{
  WalletSecuritySettingUI$4(WalletSecuritySettingUI paramWalletSecuritySettingUI, WalletSecuritySettingUI.e parame)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46396);
    if (this.tsU.tti.ttd == 1)
    {
      e.n(this.tsT.mController.ylL, this.tsU.tti.tte, true);
      AppMethodBeat.o(46396);
    }
    while (true)
    {
      return;
      if (this.tsU.tti.ttd == 2)
        e.p(this.tsU.tti.ttf, this.tsU.tti.ttg, 0, 1000);
      AppMethodBeat.o(46396);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI.4
 * JD-Core Version:    0.6.2
 */