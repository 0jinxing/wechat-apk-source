package com.tencent.mm.plugin.walletlock.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FingerprintWalletLockUI$13
  implements DialogInterface.OnClickListener
{
  FingerprintWalletLockUI$13(FingerprintWalletLockUI paramFingerprintWalletLockUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(51510);
    this.tVx.finish();
    FingerprintWalletLockUI.cTw();
    AppMethodBeat.o(51510);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.13
 * JD-Core Version:    0.6.2
 */