package com.tencent.mm.plugin.profile.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactMoreInfoUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ContactMoreInfoUI$1(ContactMoreInfoUI paramContactMoreInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(23406);
    this.pmf.finish();
    AppMethodBeat.o(23406);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.1
 * JD-Core Version:    0.6.2
 */