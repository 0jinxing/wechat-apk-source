package com.tencent.mm.plugin.label.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactLabelMemberListUI$4
  implements MenuItem.OnMenuItemClickListener
{
  ContactLabelMemberListUI$4(ContactLabelMemberListUI paramContactLabelMemberListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22642);
    paramMenuItem = new Intent();
    paramMenuItem.setClass(this.nIz, ContactLabelEditUI.class);
    paramMenuItem.putExtra("label_id", ContactLabelMemberListUI.c(this.nIz));
    paramMenuItem.putExtra("label_name", ContactLabelMemberListUI.d(this.nIz));
    this.nIz.startActivityForResult(paramMenuItem, 10001);
    AppMethodBeat.o(22642);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelMemberListUI.4
 * JD-Core Version:    0.6.2
 */