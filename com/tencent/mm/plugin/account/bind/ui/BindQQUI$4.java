package com.tencent.mm.plugin.account.bind.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BindQQUI$4
  implements MenuItem.OnMenuItemClickListener
{
  BindQQUI$4(BindQQUI paramBindQQUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13547);
    this.gsw.aqX();
    this.gsw.finish();
    AppMethodBeat.o(13547);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindQQUI.4
 * JD-Core Version:    0.6.2
 */