package com.tencent.mm.plugin.subapp.ui.autoadd;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AutoAddFriendUI$3
  implements MenuItem.OnMenuItemClickListener
{
  AutoAddFriendUI$3(AutoAddFriendUI paramAutoAddFriendUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(25331);
    this.stv.finish();
    AppMethodBeat.o(25331);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI.3
 * JD-Core Version:    0.6.2
 */