package com.tencent.mm.plugin.wallet.pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.ui.q.c;
import com.tencent.mm.plugin.wallet_core.utils.d;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.ad;

final class WalletPayUI$8
  implements q.c
{
  WalletPayUI$8(WalletPayUI paramWalletPayUI)
  {
  }

  public final void a(String paramString, FavorPayInfo paramFavorPayInfo, boolean paramBoolean)
  {
    AppMethodBeat.i(46043);
    if (WalletPayUI.h(this.tqj))
    {
      ab.w(this.tqj.TAG, "has received canceled");
      h.pYm.k(965L, 3L, 1L);
      AppMethodBeat.o(46043);
      return;
    }
    WalletPayUI.i(this.tqj);
    this.tqj.aqX();
    this.tqj.toH = paramFavorPayInfo;
    String str = this.tqj.TAG;
    label91: int i;
    if (this.tqj.toH == null)
    {
      paramFavorPayInfo = "";
      ab.i(str, "WalletPwdDialog showAlert with favinfo %s isNeedChangeBankcard %s", new Object[] { paramFavorPayInfo, Boolean.valueOf(paramBoolean) });
      if ((this.tqj.toH != null) && (paramBoolean))
        this.tqj.ap(-100, true);
      if (!bo.isNullOrNil(paramString))
      {
        if (this.tqj.pVL != null)
          break label229;
        i = 0;
        label157: if (this.tqj.pVL != null)
          break label244;
      }
    }
    label229: label244: for (paramFavorPayInfo = ""; ; paramFavorPayInfo = this.tqj.pVL.czZ)
    {
      ad.e(i, paramFavorPayInfo, 9, "");
      this.tqj.gHr = paramString;
      this.tqj.na(false);
      d.cSP();
      this.tqj.toJ = null;
      AppMethodBeat.o(46043);
      break;
      paramFavorPayInfo = this.tqj.toH.toString();
      break label91;
      i = this.tqj.pVL.cIf;
      break label157;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.8
 * JD-Core Version:    0.6.2
 */