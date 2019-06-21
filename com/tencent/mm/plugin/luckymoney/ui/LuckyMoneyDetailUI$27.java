package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyDetailUI$27
  implements MenuItem.OnMenuItemClickListener
{
  LuckyMoneyDetailUI$27(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(42677);
    h.pYm.e(11701, new Object[] { Integer.valueOf(LuckyMoneyDetailUI.ya(LuckyMoneyDetailUI.q(this.oeA))), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4) });
    paramMenuItem = new Intent();
    paramMenuItem.setClass(this.oeA.mController.ylL, LuckyMoneyMyRecordUI.class);
    paramMenuItem.putExtra("key_type", 2);
    this.oeA.startActivity(paramMenuItem);
    AppMethodBeat.o(42677);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.27
 * JD-Core Version:    0.6.2
 */