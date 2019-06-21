package com.tencent.mm.plugin.wallet.pay.ui;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.j;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.ui.b;
import com.tencent.mm.plugin.wallet_core.ui.c;
import com.tencent.mm.plugin.wallet_core.ui.l.b;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.ad;

final class WalletPayUI$30$1
  implements l.b
{
  WalletPayUI$30$1(WalletPayUI.30 param30)
  {
  }

  public final void a(FavorPayInfo paramFavorPayInfo)
  {
    int i = 1;
    AppMethodBeat.i(46071);
    this.tqo.tqj.toH = paramFavorPayInfo;
    Object localObject = this.tqo.tqj.TAG;
    int j;
    label79: label95: boolean bool;
    if (paramFavorPayInfo == null)
    {
      paramFavorPayInfo = "";
      ab.i((String)localObject, "WalletFavorDialog onSelectionDone %s", new Object[] { paramFavorPayInfo });
      if (this.tqo.tqj.toH != null)
      {
        if (this.tqo.tqj.pVL != null)
          break label463;
        j = 0;
        if (this.tqo.tqj.pVL != null)
          break label481;
        paramFavorPayInfo = "";
        ad.e(j, paramFavorPayInfo, 15, this.tqo.tqj.toH.tzb);
        if ((this.tqo.tqj.tgC != null) && (!b.a(this.tqo.tqj.toH, this.tqo.tqj.tgC)))
          break label498;
        this.tqo.tqj.tpJ.setVisibility(8);
        this.tqo.tqj.pTi.setOnClickListener(new WalletPayUI.30.1.1(this));
        bool = true;
      }
    }
    while (true)
    {
      label194: ab.i(this.tqo.tqj.TAG, "needBindBankCard %s", new Object[] { Boolean.valueOf(bool) });
      WalletPayUI.c(this.tqo.tqj).setVisibility(0);
      WalletPayUI.d(this.tqo.tqj).setVisibility(0);
      if (this.tqo.tqj.toH != null)
      {
        this.tqo.tqj.tpu = c.tDU.a(this.tqo.tqj.pWy);
        paramFavorPayInfo = this.tqo.tqj.tpu.acU(this.tqo.tqj.toH.tzb);
        if ((paramFavorPayInfo != null) && (paramFavorPayInfo.tmT == 0.0D))
        {
          WalletPayUI.c(this.tqo.tqj).setVisibility(8);
          WalletPayUI.d(this.tqo.tqj).setVisibility(8);
          bool = false;
        }
      }
      for (j = i; ; j = 0)
      {
        if (!bool)
        {
          this.tqo.tqj.tpI.setVisibility(8);
          this.tqo.tqj.tpJ.setVisibility(0);
          this.tqo.tqj.pTi.setOnClickListener(new WalletPayUI.30.1.3(this));
        }
        if (j != 0)
          this.tqo.tqj.tpJ.setVisibility(8);
        this.tqo.tqj.cOa();
        AppMethodBeat.o(46071);
        return;
        paramFavorPayInfo = paramFavorPayInfo.toString();
        break;
        label463: j = this.tqo.tqj.pVL.cIf;
        break label79;
        label481: paramFavorPayInfo = this.tqo.tqj.pVL.czZ;
        break label95;
        label498: localObject = this.tqo.tqj.tpu.acU(this.tqo.tqj.toH.tzb);
        if ((localObject == null) || (!this.tqo.tqj.tgC.cPc()))
          break label639;
        s.cNC();
        paramFavorPayInfo = s.cND().thy;
        double d = ((j)localObject).tmT;
        if ((paramFavorPayInfo == null) || (paramFavorPayInfo.twS >= d))
          break label639;
        ab.i(this.tqo.tqj.TAG, "balance not meet");
        this.tqo.tqj.tpJ.setVisibility(8);
        this.tqo.tqj.pTi.setOnClickListener(new WalletPayUI.30.1.2(this));
        bool = true;
        break label194;
      }
      label639: bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.30.1
 * JD-Core Version:    0.6.2
 */