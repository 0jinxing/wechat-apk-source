package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelstat.d;
import com.tencent.mm.ui.chatting.ChattingUIFragment;

final class BaseConversationUI$8$1
  implements Runnable
{
  BaseConversationUI$8$1(BaseConversationUI.8 param8)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34057);
    d.b(4, this.zqI.zqF.getLocalClassName(), this.zqI.zqF.hashCode());
    d.b(3, "ChattingUI" + BaseConversationUI.access$100(this.zqI.zqF).getIdentityString(), BaseConversationUI.access$100(this.zqI.zqF).hashCode());
    AppMethodBeat.o(34057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.8.1
 * JD-Core Version:    0.6.2
 */