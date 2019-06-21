package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MainTabUI;

final class n$10
  implements Runnable
{
  n$10(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34607);
    n localn = this.zvB;
    Object localObject = (LauncherUI)localn.czX;
    if ((localObject == null) || (((LauncherUI)localObject).yjJ.getMainTabUI().mbt == 0))
    {
      localObject = localn.zuW;
      if (((ConversationListView)localObject).getFirstVisiblePosition() > ((ConversationListView)localObject).getFirstHeaderVisible() + 16)
        ((ConversationListView)localObject).setSelection(((ConversationListView)localObject).getFirstHeaderVisible() + 16);
      ((ConversationListView)localObject).post(new ConversationListView.3((ConversationListView)localObject));
    }
    AppMethodBeat.o(34607);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.n.10
 * JD-Core Version:    0.6.2
 */