package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelstat.d;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.ui.chatting.ChattingUIFragment;

final class BaseConversationUI$4
  implements Runnable
{
  BaseConversationUI$4(BaseConversationUI paramBaseConversationUI, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34048);
    String str;
    if (this.zqE)
    {
      str = "ChattingUI" + BaseConversationUI.access$000(this.zqF);
      if (!this.zqE)
        break label118;
    }
    label118: for (int i = BaseConversationUI.access$100(this.zqF).hashCode(); ; i = this.zqF.hashCode())
    {
      d.b(4, str, i);
      if (this.zqE)
        d.h("ChattingUI" + BaseConversationUI.access$000(this.zqF), BaseConversationUI.access$400(this.zqF), ah.anT());
      AppMethodBeat.o(34048);
      return;
      str = this.zqF.getLocalClassName();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.4
 * JD-Core Version:    0.6.2
 */