package com.tencent.mm.plugin.wallet.pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.ad;

final class WalletPayUI$2
  implements View.OnClickListener
{
  WalletPayUI$2(WalletPayUI paramWalletPayUI)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 0;
    AppMethodBeat.i(46035);
    s.cNC();
    int j;
    if (s.cND().cQh())
    {
      if (this.tqj.pVL == null)
      {
        j = 0;
        if (this.tqj.pVL != null)
          break label141;
        paramView = "";
        label45: ad.e(j, paramView, 6, "");
      }
    }
    else
    {
      if (this.tqj.pWy.tAs != 1)
        break label183;
      s.cNC();
      if (s.cND().cQh())
      {
        if (this.tqj.pVL != null)
          break label155;
        j = i;
        label93: if (this.tqj.pVL != null)
          break label169;
      }
    }
    label141: label155: label169: for (paramView = ""; ; paramView = this.tqj.pVL.czZ)
    {
      ad.e(j, paramView, 5, "");
      WalletPayUI.f(this.tqj);
      AppMethodBeat.o(46035);
      return;
      j = this.tqj.pVL.cIf;
      break;
      paramView = this.tqj.pVL.czZ;
      break label45;
      j = this.tqj.pVL.cIf;
      break label93;
    }
    label183: ab.i(this.tqj.TAG, "SimpleReg , assigned userinfo pay! payWithNewBankcard");
    s.cNC();
    if (s.cND().cQh())
    {
      if (this.tqj.pVL != null)
        break label260;
      j = 0;
      label220: if (this.tqj.pVL != null)
        break label274;
    }
    label260: label274: for (paramView = ""; ; paramView = this.tqj.pVL.czZ)
    {
      ad.e(j, paramView, 5, "");
      this.tqj.b(false, 0, "");
      AppMethodBeat.o(46035);
      break;
      j = this.tqj.pVL.cIf;
      break label220;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.2
 * JD-Core Version:    0.6.2
 */