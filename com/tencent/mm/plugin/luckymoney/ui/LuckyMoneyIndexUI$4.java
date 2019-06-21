package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.LinkedList;
import java.util.List;

final class LuckyMoneyIndexUI$4
  implements MenuItem.OnMenuItemClickListener
{
  LuckyMoneyIndexUI$4(LuckyMoneyIndexUI paramLuckyMoneyIndexUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(42725);
    com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4) });
    LinkedList localLinkedList = new LinkedList();
    paramMenuItem = new LinkedList();
    localLinkedList.add(this.oeJ.getString(2131301135));
    paramMenuItem.add(Integer.valueOf(0));
    localLinkedList.add(this.oeJ.getString(2131301137));
    paramMenuItem.add(Integer.valueOf(1));
    com.tencent.mm.ui.base.h.a(this.oeJ.mController.ylL, "", localLinkedList, paramMenuItem, "", false, new LuckyMoneyIndexUI.4.1(this));
    AppMethodBeat.o(42725);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI.4
 * JD-Core Version:    0.6.2
 */