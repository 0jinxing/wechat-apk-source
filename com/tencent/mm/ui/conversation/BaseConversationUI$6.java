package com.tencent.mm.ui.conversation;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout.a;
import com.tencent.mm.ui.tools.TestTimeForChatting;

final class BaseConversationUI$6
  implements OnLayoutChangedLinearLayout.a
{
  long start = 0L;

  BaseConversationUI$6(BaseConversationUI paramBaseConversationUI)
  {
  }

  public final void dyX()
  {
    AppMethodBeat.i(34054);
    if (BaseConversationUI.access$700(this.zqF) == null)
    {
      BaseConversationUI.access$702(this.zqF, AnimationUtils.loadAnimation(this.zqF, MMFragmentActivity.a.ync));
      BaseConversationUI.access$700(this.zqF).setAnimationListener(new BaseConversationUI.6.1(this));
    }
    if (BaseConversationUI.access$1100(this.zqF))
    {
      BaseConversationUI.access$200(this.zqF).setOndispatchDraw(new BaseConversationUI.6.2(this));
      BaseConversationUI.access$1102(this.zqF, false);
    }
    while (true)
    {
      BaseConversationUI.access$1200(this.zqF).yAx = null;
      ab.i("MicroMsg.BaseConversationUI", "klem CHATTING ONLAYOUT ");
      AppMethodBeat.o(34054);
      return;
      BaseConversationUI.access$900(this.zqF);
      BaseConversationUI.access$1000(this.zqF);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.6
 * JD-Core Version:    0.6.2
 */