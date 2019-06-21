package com.tencent.mm.plugin.label.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactLabelEditUI$7
  implements MenuItem.OnMenuItemClickListener
{
  ContactLabelEditUI$7(ContactLabelEditUI paramContactLabelEditUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22544);
    this.nHW.onBackPressed();
    AppMethodBeat.o(22544);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelEditUI.7
 * JD-Core Version:    0.6.2
 */