package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.IChattingUIProxy;
import com.tencent.mm.ui.tools.TestTimeForChatting;

final class BaseConversationUI$5
  implements Runnable
{
  BaseConversationUI$5(BaseConversationUI paramBaseConversationUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34049);
    aw.RS().doM();
    al.Ma(0);
    this.zqF.onSwipe(1.0F);
    if ((BaseConversationUI.access$200(this.zqF) != null) && (BaseConversationUI.access$100(this.zqF) != null))
      BaseConversationUI.access$200(this.zqF).dJZ();
    BaseConversationUI.access$500(this.zqF).onEnterEnd();
    BaseConversationUI.access$600(this.zqF);
    AppMethodBeat.o(34049);
  }

  public final String toString()
  {
    AppMethodBeat.i(34050);
    String str = super.toString() + "|chattingView_onAnimationEnd";
    AppMethodBeat.o(34050);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.5
 * JD-Core Version:    0.6.2
 */