package com.tencent.mm.chatroom.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class SelectAddRoomManagerUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SelectAddRoomManagerUI$1(SelectAddRoomManagerUI paramSelectAddRoomManagerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104370);
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("Select_Contact", bo.c(SelectAddRoomManagerUI.a(this.emm), ","));
    this.emm.setResult(-1, paramMenuItem);
    this.emm.finish();
    this.emm.aqX();
    AppMethodBeat.o(104370);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectAddRoomManagerUI.1
 * JD-Core Version:    0.6.2
 */