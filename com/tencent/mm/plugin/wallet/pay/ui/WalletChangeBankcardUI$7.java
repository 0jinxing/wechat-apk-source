package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletChangeBankcardUI$7
  implements DialogInterface.OnCancelListener
{
  WalletChangeBankcardUI$7(WalletChangeBankcardUI paramWalletChangeBankcardUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(45964);
    ab.i("MicroMsg.WalletChangeBankcardUI", "WalletPwdDialog event2 %s", new Object[] { bo.dpG().toString() });
    WalletChangeBankcardUI.c(this.toL);
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    this.toL.gHr = null;
    if (WalletChangeBankcardUI.d(this.toL).getVisibility() != 0)
      this.toL.bwW();
    this.toL.toJ = null;
    AppMethodBeat.o(45964);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI.7
 * JD-Core Version:    0.6.2
 */