package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ContactRemarkInfoViewUI$2
  implements MenuItem.OnMenuItemClickListener
{
  ContactRemarkInfoViewUI$2(ContactRemarkInfoViewUI paramContactRemarkInfoViewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33688);
    paramMenuItem = new Intent();
    paramMenuItem.setClass(this.zml.mController.ylL, ContactRemarkInfoModUI.class);
    paramMenuItem.putExtra("Contact_Scene", ContactRemarkInfoViewUI.c(this.zml));
    paramMenuItem.putExtra("Contact_User", ContactRemarkInfoViewUI.d(this.zml).field_username);
    this.zml.startActivity(paramMenuItem);
    AppMethodBeat.o(33688);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoViewUI.2
 * JD-Core Version:    0.6.2
 */