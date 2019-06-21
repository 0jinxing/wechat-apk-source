package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class WalletSecuritySettingUI$5
  implements DialogInterface.OnClickListener
{
  WalletSecuritySettingUI$5(WalletSecuritySettingUI paramWalletSecuritySettingUI, WalletSecuritySettingUI.e parame)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46397);
    if (this.tsU.tth.ttd == 1)
    {
      e.n(this.tsT.mController.ylL, this.tsU.tth.tte, true);
      AppMethodBeat.o(46397);
    }
    while (true)
    {
      return;
      if (this.tsU.tth.ttd == 2)
      {
        e.p(this.tsU.tth.ttf, this.tsU.tth.ttg, 0, 1000);
        AppMethodBeat.o(46397);
      }
      else
      {
        paramDialogInterface.dismiss();
        AppMethodBeat.o(46397);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI.5
 * JD-Core Version:    0.6.2
 */