package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class LuckyMoneyPrepareUI$5
  implements MenuItem.OnMenuItemClickListener
{
  LuckyMoneyPrepareUI$5(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(42945);
    if ((LuckyMoneyPrepareUI.e(this.ohI) != null) && (!bo.isNullOrNil(LuckyMoneyPrepareUI.e(this.ohI).nWK)))
      e.n(this.ohI.mController.ylL, LuckyMoneyPrepareUI.e(this.ohI).nWK, false);
    while (true)
    {
      AppMethodBeat.o(42945);
      return true;
      e.n(this.ohI.mController.ylL, "https://hkwallet.moneydata.hk/hybrid/www/weixin/hongbao_hk_v2/zh_hk/faq.shtml", false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.5
 * JD-Core Version:    0.6.2
 */