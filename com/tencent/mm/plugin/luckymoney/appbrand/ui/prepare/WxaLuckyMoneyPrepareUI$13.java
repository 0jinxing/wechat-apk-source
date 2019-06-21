package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class WxaLuckyMoneyPrepareUI$13
  implements MenuItem.OnMenuItemClickListener
{
  WxaLuckyMoneyPrepareUI$13(WxaLuckyMoneyPrepareUI paramWxaLuckyMoneyPrepareUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(42068);
    e.n(this.nTo.mController.ylL, "https://kf.qq.com/touch/scene_product.html?scene_id=kf7", false);
    AppMethodBeat.o(42068);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.13
 * JD-Core Version:    0.6.2
 */