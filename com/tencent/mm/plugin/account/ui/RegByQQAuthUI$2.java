package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegByQQAuthUI$2
  implements MenuItem.OnMenuItemClickListener
{
  RegByQQAuthUI$2(RegByQQAuthUI paramRegByQQAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(125500);
    this.gHj.aqX();
    this.gHj.finish();
    AppMethodBeat.o(125500);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByQQAuthUI.2
 * JD-Core Version:    0.6.2
 */