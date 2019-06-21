package com.tencent.mm.plugin.scanner.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.LinkedList;
import java.util.List;

final class ProductFurtherInfoUI$2
  implements MenuItem.OnMenuItemClickListener
{
  ProductFurtherInfoUI$2(ProductFurtherInfoUI paramProductFurtherInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(81045);
    LinkedList localLinkedList = new LinkedList();
    paramMenuItem = new LinkedList();
    localLinkedList.add(this.qcF.getString(2131302768));
    paramMenuItem.add(Integer.valueOf(0));
    h.a(this.qcF.mController.ylL, "", localLinkedList, paramMenuItem, "", false, new ProductFurtherInfoUI.2.1(this));
    AppMethodBeat.o(81045);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI.2
 * JD-Core Version:    0.6.2
 */