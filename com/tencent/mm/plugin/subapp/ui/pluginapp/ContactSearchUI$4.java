package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactSearchUI$4
  implements MenuItem.OnMenuItemClickListener
{
  ContactSearchUI$4(ContactSearchUI paramContactSearchUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(25528);
    this.svn.aqX();
    this.svn.finish();
    AppMethodBeat.o(25528);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI.4
 * JD-Core Version:    0.6.2
 */