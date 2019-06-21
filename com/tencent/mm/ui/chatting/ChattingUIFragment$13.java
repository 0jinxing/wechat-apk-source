package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.conversation.BaseConversationUI;

final class ChattingUIFragment$13
  implements Runnable
{
  ChattingUIFragment$13(ChattingUIFragment paramChattingUIFragment)
  {
  }

  public final void run()
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(30843);
    ab.i("MicroMsg.ChattingUIFragment", "[finish] isCurrentActivity:%s", new Object[] { Boolean.valueOf(this.yLv.isCurrentActivity) });
    if (this.yLv.isCurrentActivity)
    {
      ChattingUIFragment.f(this.yLv);
      AppMethodBeat.o(30843);
    }
    Object localObject;
    while (true)
    {
      return;
      if (!(this.yLv.thisActivity() instanceof LauncherUI))
        break;
      localObject = (LauncherUI)this.yLv.thisActivity();
      if (localObject != null)
      {
        if (!this.yLv.isSupportNavigationSwipeBack());
        while (true)
        {
          ((LauncherUI)localObject).closeChatting(bool2);
          AppMethodBeat.o(30843);
          break;
          bool2 = false;
        }
      }
      ab.e("MicroMsg.ChattingUIFragment", "LauncherUI is null!???");
      AppMethodBeat.o(30843);
    }
    if ((this.yLv.thisActivity() instanceof BaseConversationUI))
    {
      localObject = (BaseConversationUI)this.yLv.thisActivity();
      if (localObject != null)
        if (this.yLv.isSupportNavigationSwipeBack())
          break label185;
    }
    label185: for (bool2 = bool1; ; bool2 = false)
    {
      ((BaseConversationUI)localObject).closeChatting(bool2);
      AppMethodBeat.o(30843);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUIFragment.13
 * JD-Core Version:    0.6.2
 */