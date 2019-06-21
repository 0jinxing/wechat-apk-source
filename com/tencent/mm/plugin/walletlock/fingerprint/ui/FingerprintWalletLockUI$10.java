package com.tencent.mm.plugin.walletlock.fingerprint.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.walletlock.fingerprint.a.d.a;
import com.tencent.mm.sdk.platformtools.ab;

final class FingerprintWalletLockUI$10
  implements d.a
{
  FingerprintWalletLockUI$10(FingerprintWalletLockUI paramFingerprintWalletLockUI)
  {
  }

  public final void aC(int paramInt, String paramString)
  {
    AppMethodBeat.i(51507);
    ab.i("MicroMsg.FingerprintWalletLockUI", "prepare onFinish errCode: %d, errMsg: %s, time: %d", new Object[] { Integer.valueOf(paramInt), paramString, Long.valueOf(System.currentTimeMillis()) });
    if (FingerprintWalletLockUI.c(this.tVx))
    {
      ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo has cancelled and return");
      AppMethodBeat.o(51507);
    }
    while (true)
    {
      return;
      if (paramInt == 0)
      {
        FingerprintWalletLockUI.h(this.tVx);
        AppMethodBeat.o(51507);
      }
      else
      {
        FingerprintWalletLockUI.b(this.tVx, this.tVx.getString(2131304881));
        AppMethodBeat.o(51507);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.10
 * JD-Core Version:    0.6.2
 */