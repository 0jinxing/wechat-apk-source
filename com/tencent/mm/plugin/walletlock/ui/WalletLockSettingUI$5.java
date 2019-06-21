package com.tencent.mm.plugin.walletlock.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.a.a;

final class WalletLockSettingUI$5
  implements Runnable
{
  WalletLockSettingUI$5(WalletLockSettingUI paramWalletLockSettingUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(51747);
    try
    {
      a.Ri(3);
      AppMethodBeat.o(51747);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WalletLockSettingUI", "Remove AK after close wallet lock failed! " + localException.getMessage());
        AppMethodBeat.o(51747);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI.5
 * JD-Core Version:    0.6.2
 */