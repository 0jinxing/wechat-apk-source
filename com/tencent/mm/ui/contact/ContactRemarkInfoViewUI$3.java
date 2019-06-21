package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactRemarkInfoViewUI$3
  implements MenuItem.OnMenuItemClickListener
{
  ContactRemarkInfoViewUI$3(ContactRemarkInfoViewUI paramContactRemarkInfoViewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33689);
    this.zml.finish();
    AppMethodBeat.o(33689);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoViewUI.3
 * JD-Core Version:    0.6.2
 */