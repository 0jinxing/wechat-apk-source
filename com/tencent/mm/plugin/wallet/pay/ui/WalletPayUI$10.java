package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.ad;

final class WalletPayUI$10
  implements DialogInterface.OnCancelListener
{
  WalletPayUI$10(WalletPayUI paramWalletPayUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    int i = 0;
    AppMethodBeat.i(46045);
    ab.i(this.tqj.TAG, "WalletPwdDialog event2 %s", new Object[] { bo.dpG().toString() });
    WalletPayUI.k(this.tqj);
    WalletPayUI.j(this.tqj);
    if (this.tqj.pVL == null)
      if (this.tqj.pVL != null)
        break label151;
    label151: for (String str = ""; ; str = this.tqj.pVL.czZ)
    {
      ad.e(i, str, 10, "");
      if (paramDialogInterface != null)
        paramDialogInterface.dismiss();
      this.tqj.gHr = null;
      this.tqj.tpP = null;
      if (this.tqj.bwP())
        this.tqj.finish();
      this.tqj.toJ = null;
      AppMethodBeat.o(46045);
      return;
      i = this.tqj.pVL.cIf;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.10
 * JD-Core Version:    0.6.2
 */