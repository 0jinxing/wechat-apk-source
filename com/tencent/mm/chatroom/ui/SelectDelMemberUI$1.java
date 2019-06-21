package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class SelectDelMemberUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SelectDelMemberUI$1(SelectDelMemberUI paramSelectDelMemberUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104387);
    h.a(this.emt, this.emt.getString(2131302527), "", new SelectDelMemberUI.1.1(this), new SelectDelMemberUI.1.2(this));
    AppMethodBeat.o(104387);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectDelMemberUI.1
 * JD-Core Version:    0.6.2
 */