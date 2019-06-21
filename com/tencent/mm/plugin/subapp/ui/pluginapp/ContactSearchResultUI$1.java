package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactSearchResultUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ContactSearchResultUI$1(ContactSearchResultUI paramContactSearchResultUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(25515);
    this.svk.finish();
    AppMethodBeat.o(25515);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI.1
 * JD-Core Version:    0.6.2
 */