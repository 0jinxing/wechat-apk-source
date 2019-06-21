package com.tencent.mm.plugin.walletlock.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.a.a;

final class WalletLockSettingUI$3
  implements Runnable
{
  WalletLockSettingUI$3(WalletLockSettingUI paramWalletLockSettingUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(51746);
    try
    {
      a.Ri(3);
      AppMethodBeat.o(51746);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WalletLockSettingUI", "Remove AK after open gesture lock failed! " + localException.getMessage());
        AppMethodBeat.o(51746);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI.3
 * JD-Core Version:    0.6.2
 */