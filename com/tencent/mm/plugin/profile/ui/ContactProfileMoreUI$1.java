package com.tencent.mm.plugin.profile.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactProfileMoreUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ContactProfileMoreUI$1(ContactProfileMoreUI paramContactProfileMoreUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(23422);
    this.pmg.finish();
    AppMethodBeat.o(23422);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactProfileMoreUI.1
 * JD-Core Version:    0.6.2
 */