package com.tencent.mm.plugin.walletlock.fingerprint.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FingerprintWalletLockUI$5
  implements Runnable
{
  FingerprintWalletLockUI$5(FingerprintWalletLockUI paramFingerprintWalletLockUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(51502);
    FingerprintWalletLockUI.j(this.tVx).setVisibility(0);
    AppMethodBeat.o(51502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.5
 * JD-Core Version:    0.6.2
 */