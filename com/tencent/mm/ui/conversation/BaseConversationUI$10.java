package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelstat.d;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.ui.chatting.ChattingUIFragment;

final class BaseConversationUI$10
  implements Runnable
{
  BaseConversationUI$10(BaseConversationUI paramBaseConversationUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34062);
    if (BaseConversationUI.access$100(this.zqF) == null)
      AppMethodBeat.o(34062);
    while (true)
    {
      return;
      d.b(4, "ChattingUI" + BaseConversationUI.access$000(this.zqF), BaseConversationUI.access$100(this.zqF).hashCode());
      d.h("ChattingUI" + BaseConversationUI.access$000(this.zqF), BaseConversationUI.access$400(this.zqF), ah.anT());
      d.b(3, this.zqF.getLocalClassName(), this.zqF.hashCode());
      AppMethodBeat.o(34062);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.10
 * JD-Core Version:    0.6.2
 */