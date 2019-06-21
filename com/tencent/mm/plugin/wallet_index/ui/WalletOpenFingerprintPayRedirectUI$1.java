package com.tencent.mm.plugin.wallet_index.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletOpenFingerprintPayRedirectUI$1
  implements DialogInterface.OnCancelListener
{
  WalletOpenFingerprintPayRedirectUI$1(WalletOpenFingerprintPayRedirectUI paramWalletOpenFingerprintPayRedirectUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(48290);
    WalletOpenFingerprintPayRedirectUI.a(this.tSl);
    WalletOpenFingerprintPayRedirectUI.a(this.tSl, "");
    AppMethodBeat.o(48290);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletOpenFingerprintPayRedirectUI.1
 * JD-Core Version:    0.6.2
 */