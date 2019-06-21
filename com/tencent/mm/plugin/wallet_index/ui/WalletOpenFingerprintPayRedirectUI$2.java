package com.tencent.mm.plugin.wallet_index.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletOpenFingerprintPayRedirectUI$2
  implements DialogInterface.OnClickListener
{
  WalletOpenFingerprintPayRedirectUI$2(WalletOpenFingerprintPayRedirectUI paramWalletOpenFingerprintPayRedirectUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48291);
    this.tSl.finish();
    AppMethodBeat.o(48291);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletOpenFingerprintPayRedirectUI.2
 * JD-Core Version:    0.6.2
 */