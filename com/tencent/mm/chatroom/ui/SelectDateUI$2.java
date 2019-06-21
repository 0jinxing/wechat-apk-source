package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelectDateUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SelectDateUI$2(SelectDateUI paramSelectDateUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104381);
    this.emr.finish();
    AppMethodBeat.o(104381);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectDateUI.2
 * JD-Core Version:    0.6.2
 */