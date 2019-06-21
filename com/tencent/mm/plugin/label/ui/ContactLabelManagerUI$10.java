package com.tencent.mm.plugin.label.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactLabelManagerUI$10
  implements MenuItem.OnMenuItemClickListener
{
  ContactLabelManagerUI$10(ContactLabelManagerUI paramContactLabelManagerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22595);
    this.nIh.finish();
    AppMethodBeat.o(22595);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.10
 * JD-Core Version:    0.6.2
 */