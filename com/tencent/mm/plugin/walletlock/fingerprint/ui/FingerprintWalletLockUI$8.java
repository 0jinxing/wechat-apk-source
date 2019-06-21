package com.tencent.mm.plugin.walletlock.fingerprint.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FingerprintWalletLockUI$8
  implements View.OnClickListener
{
  FingerprintWalletLockUI$8(FingerprintWalletLockUI paramFingerprintWalletLockUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(51505);
    FingerprintWalletLockUI.cTw();
    FingerprintWalletLockUI.a(this.tVx, "user cancel setting fingerprint lock");
    AppMethodBeat.o(51505);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.8
 * JD-Core Version:    0.6.2
 */