package com.tencent.mm.plugin.wallet.pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.g;
import com.tencent.mm.plugin.wallet_core.ui.cashier.b.a;
import com.tencent.mm.plugin.wallet_core.utils.d;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.ad;

final class WalletPayUI$7
  implements b.a
{
  WalletPayUI$7(WalletPayUI paramWalletPayUI)
  {
  }

  public final void a(String paramString, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard)
  {
    AppMethodBeat.i(46040);
    if (WalletPayUI.h(this.tqj))
    {
      ab.w(this.tqj.TAG, "has received canceled");
      com.tencent.mm.plugin.report.service.h.pYm.k(965L, 3L, 1L);
      AppMethodBeat.o(46040);
      return;
    }
    WalletPayUI.i(this.tqj);
    this.tqj.aqX();
    this.tqj.toH = paramFavorPayInfo;
    this.tqj.tgC = paramBankcard;
    paramBankcard = this.tqj.TAG;
    label98: int i;
    if (this.tqj.toH == null)
    {
      paramFavorPayInfo = "";
      ab.i(paramBankcard, "WalletPwdDialog showAlert with favinfo %s", new Object[] { paramFavorPayInfo });
      if (!bo.isNullOrNil(paramString))
      {
        if (this.tqj.pVL != null)
          break label196;
        i = 0;
        label132: if (this.tqj.pVL != null)
          break label211;
      }
    }
    label196: label211: for (paramFavorPayInfo = ""; ; paramFavorPayInfo = this.tqj.pVL.czZ)
    {
      ad.e(i, paramFavorPayInfo, 9, "");
      this.tqj.gHr = paramString;
      this.tqj.na(false);
      d.cSP();
      AppMethodBeat.o(46040);
      break;
      paramFavorPayInfo = this.tqj.toH.toString();
      break label98;
      i = this.tqj.pVL.cIf;
      break label132;
    }
  }

  public final void cMN()
  {
    AppMethodBeat.i(46042);
    ab.i(this.tqj.TAG, "click add new bankcard");
    Object localObject = g.cPl();
    if (((g)localObject).aFF())
    {
      com.tencent.mm.ui.base.h.b(this.tqj.mController.ylL, ((g)localObject).pbp, this.tqj.getString(2131297061), true);
      AppMethodBeat.o(46042);
      return;
    }
    int i;
    if (this.tqj.pVL == null)
    {
      i = 0;
      label74: if (this.tqj.pVL != null)
        break label125;
    }
    label125: for (localObject = ""; ; localObject = this.tqj.pVL.czZ)
    {
      ad.e(i, (String)localObject, 14, "");
      this.tqj.cOg();
      AppMethodBeat.o(46042);
      break;
      i = this.tqj.pVL.cIf;
      break label74;
    }
  }

  public final void onCancel()
  {
    AppMethodBeat.i(46041);
    ab.i(this.tqj.TAG, "cashier dialog canceled");
    WalletPayUI.j(this.tqj);
    int i;
    if (this.tqj.pVL == null)
    {
      i = 0;
      if (this.tqj.pVL != null)
        break label96;
    }
    label96: for (String str = ""; ; str = this.tqj.pVL.czZ)
    {
      ad.e(i, str, 10, "");
      if (this.tqj.bwP())
        this.tqj.finish();
      AppMethodBeat.o(46041);
      return;
      i = this.tqj.pVL.cIf;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.7
 * JD-Core Version:    0.6.2
 */