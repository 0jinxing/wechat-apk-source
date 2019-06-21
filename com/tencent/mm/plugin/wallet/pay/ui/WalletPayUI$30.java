package com.tencent.mm.plugin.wallet.pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.ui.l;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.ad;

final class WalletPayUI$30
  implements View.OnClickListener
{
  WalletPayUI$30(WalletPayUI paramWalletPayUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46072);
    int i;
    if (this.tqj.pVL == null)
    {
      i = 0;
      if (this.tqj.pVL != null)
        break label99;
    }
    label99: for (paramView = ""; ; paramView = this.tqj.pVL.czZ)
    {
      ad.e(i, paramView, 12, "");
      l.a(this.tqj.mController.ylL, this.tqj.pWy, this.tqj.toH.tzb, new WalletPayUI.30.1(this), null);
      AppMethodBeat.o(46072);
      return;
      i = this.tqj.pVL.cIf;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.30
 * JD-Core Version:    0.6.2
 */