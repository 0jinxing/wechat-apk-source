package com.tencent.mm.ui.conversation;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.ChattingUIFragment;
import com.tencent.mm.ui.tools.TestTimeForChatting;
import com.tencent.mm.ui.tools.TestTimeForChatting.a;
import com.tencent.mm.ui.widget.SwipeBackLayout;

final class BaseConversationUI$6$2
  implements TestTimeForChatting.a
{
  BaseConversationUI$6$2(BaseConversationUI.6 param6)
  {
  }

  public final void dyY()
  {
    AppMethodBeat.i(34053);
    ab.i("MicroMsg.BaseConversationUI", "[onDrawed]");
    this.zqG.start = System.currentTimeMillis();
    if (BaseConversationUI.access$100(this.zqG.zqF) == null)
    {
      ab.e("MicroMsg.BaseConversationUI", "chattingFragmet is null!");
      AppMethodBeat.o(34053);
      return;
    }
    if (BaseConversationUI.access$100(this.zqG.zqF).getSwipeBackLayout() != null)
      BaseConversationUI.access$100(this.zqG.zqF).getSwipeBackLayout().startAnimation(BaseConversationUI.access$700(this.zqG.zqF));
    while (true)
    {
      BaseConversationUI.access$200(this.zqG.zqF).setOndispatchDraw(null);
      AppMethodBeat.o(34053);
      break;
      BaseConversationUI.access$100(this.zqG.zqF).getView().startAnimation(BaseConversationUI.access$700(this.zqG.zqF));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.6.2
 * JD-Core Version:    0.6.2
 */