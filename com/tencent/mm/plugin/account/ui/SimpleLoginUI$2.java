package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SimpleLoginUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SimpleLoginUI$2(SimpleLoginUI paramSimpleLoginUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(125597);
    SimpleLoginUI.f(this.gIp);
    AppMethodBeat.o(125597);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.SimpleLoginUI.2
 * JD-Core Version:    0.6.2
 */