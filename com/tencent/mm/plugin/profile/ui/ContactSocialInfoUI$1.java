package com.tencent.mm.plugin.profile.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactSocialInfoUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ContactSocialInfoUI$1(ContactSocialInfoUI paramContactSocialInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(23440);
    this.pmv.finish();
    AppMethodBeat.o(23440);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI.1
 * JD-Core Version:    0.6.2
 */