package com.tencent.mm.chatroom.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class SelectDelRoomManagerUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SelectDelRoomManagerUI$1(SelectDelRoomManagerUI paramSelectDelRoomManagerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104397);
    if (SelectDelRoomManagerUI.a(this.emw))
    {
      h.a(this.emw, this.emw.getString(2131302527), "", new SelectDelRoomManagerUI.1.1(this), new SelectDelRoomManagerUI.1.2(this));
      AppMethodBeat.o(104397);
    }
    while (true)
    {
      return true;
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("Select_Contact", bo.c(SelectDelRoomManagerUI.b(this.emw), ","));
      this.emw.setResult(-1, paramMenuItem);
      this.emw.finish();
      AppMethodBeat.o(104397);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI.1
 * JD-Core Version:    0.6.2
 */