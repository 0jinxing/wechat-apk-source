package com.tencent.mm.plugin.walletlock.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FingerprintWalletLockUI$4
  implements DialogInterface.OnClickListener
{
  FingerprintWalletLockUI$4(FingerprintWalletLockUI paramFingerprintWalletLockUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(51501);
    this.tVx.finish();
    AppMethodBeat.o(51501);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.4
 * JD-Core Version:    0.6.2
 */