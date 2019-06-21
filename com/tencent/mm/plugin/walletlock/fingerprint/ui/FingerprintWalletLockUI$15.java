package com.tencent.mm.plugin.walletlock.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class FingerprintWalletLockUI$15
  implements DialogInterface.OnClickListener
{
  FingerprintWalletLockUI$15(FingerprintWalletLockUI paramFingerprintWalletLockUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(51512);
    ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user click set gesture");
    ((b)g.K(b.class)).b(this.tVx, 1, 4);
    AppMethodBeat.o(51512);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.15
 * JD-Core Version:    0.6.2
 */