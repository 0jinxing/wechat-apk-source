package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelectedMemberChattingRecordUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SelectedMemberChattingRecordUI$3(SelectedMemberChattingRecordUI paramSelectedMemberChattingRecordUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(104438);
    this.emY.setResult(0);
    this.emY.finish();
    AppMethodBeat.o(104438);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI.3
 * JD-Core Version:    0.6.2
 */