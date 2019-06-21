package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BindFacebookUI$2
  implements MenuItem.OnMenuItemClickListener
{
  BindFacebookUI$2(BindFacebookUI paramBindFacebookUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(124726);
    BindFacebookUI.b(this.gAv);
    AppMethodBeat.o(124726);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.BindFacebookUI.2
 * JD-Core Version:    0.6.2
 */