package com.tencent.mm.plugin.brandservice.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EnterpriseBizContactPlainListUI$2
  implements MenuItem.OnMenuItemClickListener
{
  EnterpriseBizContactPlainListUI$2(EnterpriseBizContactPlainListUI paramEnterpriseBizContactPlainListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13981);
    this.jMl.aqX();
    this.jMl.finish();
    AppMethodBeat.o(13981);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI.2
 * JD-Core Version:    0.6.2
 */