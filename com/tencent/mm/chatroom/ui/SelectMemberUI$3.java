package com.tencent.mm.chatroom.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelectMemberUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SelectMemberUI$3(SelectMemberUI paramSelectMemberUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104411);
    paramMenuItem = new Intent();
    this.emG.setResult(0, paramMenuItem);
    this.emG.finish();
    AppMethodBeat.o(104411);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectMemberUI.3
 * JD-Core Version:    0.6.2
 */