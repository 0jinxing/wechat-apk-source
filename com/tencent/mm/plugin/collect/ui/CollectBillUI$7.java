package com.tencent.mm.plugin.collect.ui;

import android.view.MenuItem;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.collect.model.a;
import com.tencent.mm.ui.base.n.d;

final class CollectBillUI$7
  implements n.d
{
  CollectBillUI$7(CollectBillUI paramCollectBillUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(41217);
    if (paramMenuItem.getItemId() == 0)
    {
      paramMenuItem = (AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo();
      paramMenuItem = (a)CollectBillUI.b(this.kFX).getItemAtPosition(paramMenuItem.position);
      if (paramMenuItem != null)
        CollectBillUI.a(this.kFX, paramMenuItem.kBD, paramMenuItem.timestamp);
    }
    AppMethodBeat.o(41217);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillUI.7
 * JD-Core Version:    0.6.2
 */