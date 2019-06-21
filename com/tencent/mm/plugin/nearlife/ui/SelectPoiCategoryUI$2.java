package com.tencent.mm.plugin.nearlife.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelectPoiCategoryUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SelectPoiCategoryUI$2(SelectPoiCategoryUI paramSelectPoiCategoryUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22999);
    this.oSS.setResult(0, null);
    this.oSS.finish();
    AppMethodBeat.o(22999);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI.2
 * JD-Core Version:    0.6.2
 */