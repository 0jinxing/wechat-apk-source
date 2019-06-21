package com.tencent.mm.ui.conversation;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NewBizConversationUI$12
  implements MenuItem.OnMenuItemClickListener
{
  NewBizConversationUI$12(NewBizConversationUI paramNewBizConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(34547);
    this.zvm.finish();
    AppMethodBeat.o(34547);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.NewBizConversationUI.12
 * JD-Core Version:    0.6.2
 */