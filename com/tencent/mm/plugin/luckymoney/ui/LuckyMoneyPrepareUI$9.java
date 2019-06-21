package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class LuckyMoneyPrepareUI$9
  implements n.d
{
  LuckyMoneyPrepareUI$9(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(42949);
    if (paramInt == 0)
    {
      paramMenuItem = new Intent();
      paramMenuItem.setClass(this.ohI.mController.ylL, LuckyMoneyMyRecordUI.class);
      paramMenuItem.putExtra("key_type", 2);
      this.ohI.startActivity(paramMenuItem);
      AppMethodBeat.o(42949);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
      {
        h.pYm.e(15511, new Object[] { Integer.valueOf(LuckyMoneyPrepareUI.w(this.ohI)), Integer.valueOf(1) });
        if (LuckyMoneyPrepareUI.w(this.ohI) == 1)
        {
          e.n(this.ohI.mController.ylL, "https://kf.qq.com/touch/scene_product.html?scene_id=kf7", false);
          AppMethodBeat.o(42949);
        }
        else
        {
          if (LuckyMoneyPrepareUI.e(this.ohI) != null);
          for (paramMenuItem = LuckyMoneyPrepareUI.e(this.ohI).nWK; ; paramMenuItem = "")
          {
            ab.i("MicroMsg.LuckyMoneyPrepareUI", "show qa foreign, config url: %s", new Object[] { paramMenuItem });
            if ((LuckyMoneyPrepareUI.e(this.ohI) == null) || (bo.isNullOrNil(LuckyMoneyPrepareUI.e(this.ohI).nWK)))
              break label229;
            e.n(this.ohI.mController.ylL, LuckyMoneyPrepareUI.e(this.ohI).nWK, false);
            AppMethodBeat.o(42949);
            break;
          }
          label229: e.n(this.ohI.mController.ylL, "https://hkwallet.moneydata.hk/hybrid/www/weixin/hongbao_hk_v2/zh_hk/faq.shtml", false);
        }
      }
      else
      {
        AppMethodBeat.o(42949);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.9
 * JD-Core Version:    0.6.2
 */