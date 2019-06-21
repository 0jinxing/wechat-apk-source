package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelstat.d;
import com.tencent.mm.ui.chatting.ChattingUIFragment;

final class BaseConversationUI$1
  implements Runnable
{
  BaseConversationUI$1(BaseConversationUI paramBaseConversationUI, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34045);
    String str;
    if (this.zqE)
    {
      str = "ChattingUI" + BaseConversationUI.access$000(this.zqF);
      if (!this.zqE)
        break label76;
    }
    label76: for (int i = BaseConversationUI.access$100(this.zqF).hashCode(); ; i = this.zqF.hashCode())
    {
      d.b(3, str, i);
      AppMethodBeat.o(34045);
      return;
      str = this.zqF.getLocalClassName();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.1
 * JD-Core Version:    0.6.2
 */