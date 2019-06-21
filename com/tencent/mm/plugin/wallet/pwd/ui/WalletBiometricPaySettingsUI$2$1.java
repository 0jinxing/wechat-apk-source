package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.bt;
import com.tencent.mm.g.a.bt.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletBiometricPaySettingsUI$2$1
  implements Runnable
{
  WalletBiometricPaySettingsUI$2$1(WalletBiometricPaySettingsUI.2 param2, bt parambt, Dialog paramDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(46221);
    if (this.tre.cuT != null)
    {
      if (this.trf != null)
        this.trf.dismiss();
      ab.i("MicroMsg.WalletBiometricPaySettingsUI", "close event result: %s", new Object[] { Integer.valueOf(this.tre.cuT.retCode) });
      if (this.tre.cuT.retCode == 0)
      {
        g.RO().eJo.a(new y(null, 19), 0);
        AppMethodBeat.o(46221);
      }
    }
    while (true)
    {
      return;
      WalletBiometricPaySettingsUI.b(this.trg.trd);
      WalletBiometricPaySettingsUI.c(this.trg.trd);
      AppMethodBeat.o(46221);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI.2.1
 * JD-Core Version:    0.6.2
 */