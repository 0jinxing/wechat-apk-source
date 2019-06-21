package com.tencent.mm.plugin.walletlock.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FingerprintWalletLockUI$14
  implements DialogInterface.OnCancelListener
{
  FingerprintWalletLockUI$14(FingerprintWalletLockUI paramFingerprintWalletLockUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(51511);
    ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo cancel not support fingerprint dialog");
    this.tVx.finish();
    FingerprintWalletLockUI.cTw();
    AppMethodBeat.o(51511);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.14
 * JD-Core Version:    0.6.2
 */