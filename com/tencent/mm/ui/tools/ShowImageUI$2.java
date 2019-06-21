package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.base.h;
import java.util.LinkedList;
import java.util.List;

final class ShowImageUI$2
  implements MenuItem.OnMenuItemClickListener
{
  ShowImageUI$2(ShowImageUI paramShowImageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(34993);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    if ((ShowImageUI.a(this.zHH)) && (d.afj("favorite")))
    {
      localLinkedList2.add(Integer.valueOf(0));
      localLinkedList1.add(this.zHH.getString(2131302498));
      localLinkedList2.add(Integer.valueOf(1));
      localLinkedList1.add(this.zHH.getString(2131301955));
      localLinkedList2.add(Integer.valueOf(2));
      localLinkedList1.add(this.zHH.getString(2131302711));
    }
    while (true)
    {
      paramMenuItem = new dq();
      paramMenuItem.cxc.cvx = this.zHH.getIntent().getLongExtra("key_message_id", -1L);
      a.xxA.m(paramMenuItem);
      if (paramMenuItem.cxd.cwB)
      {
        localLinkedList2.add(Integer.valueOf(3));
        localLinkedList1.add(this.zHH.getString(2131298160));
      }
      h.a(this.zHH, "", localLinkedList1, localLinkedList2, "", false, new ShowImageUI.2.1(this));
      AppMethodBeat.o(34993);
      return true;
      localLinkedList2.add(Integer.valueOf(0));
      localLinkedList1.add(this.zHH.getString(2131302498));
      localLinkedList2.add(Integer.valueOf(2));
      localLinkedList1.add(this.zHH.getString(2131302711));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShowImageUI.2
 * JD-Core Version:    0.6.2
 */