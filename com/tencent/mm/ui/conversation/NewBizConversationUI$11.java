package com.tencent.mm.ui.conversation;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.d;

final class NewBizConversationUI$11
  implements MenuItem.OnMenuItemClickListener
{
  NewBizConversationUI$11(NewBizConversationUI paramNewBizConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(34546);
    paramMenuItem = new d(this.zvm, 1, false);
    paramMenuItem.rBl = new NewBizConversationUI.11.1(this);
    paramMenuItem.rBm = new NewBizConversationUI.11.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(34546);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.NewBizConversationUI.11
 * JD-Core Version:    0.6.2
 */