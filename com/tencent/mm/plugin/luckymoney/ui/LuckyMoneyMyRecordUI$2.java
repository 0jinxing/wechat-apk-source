package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class LuckyMoneyMyRecordUI$2
  implements MenuItem.OnMenuItemClickListener
{
  LuckyMoneyMyRecordUI$2(LuckyMoneyMyRecordUI paramLuckyMoneyMyRecordUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(42758);
    paramMenuItem = new d(this.ofb.mController.ylL, 1, false);
    paramMenuItem.rBl = new LuckyMoneyMyRecordUI.2.1(this);
    paramMenuItem.rBm = new LuckyMoneyMyRecordUI.2.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(42758);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.2
 * JD-Core Version:    0.6.2
 */