package com.tencent.mm.ui.conversation;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class BaseConversationUI$6$1
  implements Animation.AnimationListener
{
  BaseConversationUI$6$1(BaseConversationUI.6 param6)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(34052);
    BaseConversationUI.access$802(this.zqG.zqF, false);
    ab.i("MicroMsg.BaseConversationUI", "klem animationEnd");
    BaseConversationUI.access$1000(this.zqG.zqF);
    AppMethodBeat.o(34052);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(34051);
    ab.i("MicroMsg.BaseConversationUI", "klem onAnimationStart onDrawed->onAnimationStart:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - this.zqG.start) });
    BaseConversationUI.access$802(this.zqG.zqF, true);
    BaseConversationUI.access$900(this.zqG.zqF);
    this.zqG.zqF.onSettle(false, 0);
    AppMethodBeat.o(34051);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.6.1
 * JD-Core Version:    0.6.2
 */