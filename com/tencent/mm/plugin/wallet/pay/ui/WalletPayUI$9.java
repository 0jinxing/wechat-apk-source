package com.tencent.mm.plugin.wallet.pay.ui;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletPayUI$9
  implements View.OnClickListener
{
  WalletPayUI$9(WalletPayUI paramWalletPayUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46044);
    ab.i(this.tqj.TAG, "WalletPwdDialog event1 %s", new Object[] { bo.dpG().toString() });
    this.tqj.toH = ((FavorPayInfo)paramView.getTag());
    if (this.tqj.toH != null)
      this.tqj.toH.tzf = "";
    this.tqj.c(false, 0, "");
    this.tqj.tpP.dismiss();
    this.tqj.gHr = null;
    this.tqj.tpP = null;
    this.tqj.toJ = null;
    AppMethodBeat.o(46044);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.9
 * JD-Core Version:    0.6.2
 */