package com.tencent.mm.plugin.wallet_index.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_index.c.b;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletIapUI$5
  implements DialogInterface.OnCancelListener
{
  WalletIapUI$5(WalletIapUI paramWalletIapUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(48277);
    ab.i("MicroMsg.WalletIapUI", "showLoadingDialog onCancel currentScene: %d", new Object[] { Integer.valueOf(WalletIapUI.g(this.tSk)) });
    if (WalletIapUI.g(this.tSk) == 2);
    for (paramDialogInterface = b.bu(7, ""); ; paramDialogInterface = b.bu(1, ""))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("key_err_code", paramDialogInterface.nqa);
      localIntent.putExtra("key_err_msg", paramDialogInterface.nqb);
      this.tSk.setResult(-1, localIntent);
      this.tSk.finish();
      AppMethodBeat.o(48277);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletIapUI.5
 * JD-Core Version:    0.6.2
 */