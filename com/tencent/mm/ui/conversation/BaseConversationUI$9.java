package com.tencent.mm.ui.conversation;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class BaseConversationUI$9
  implements Animation.AnimationListener
{
  BaseConversationUI$9(BaseConversationUI paramBaseConversationUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(34061);
    aw.RS().doM();
    al.Ma(0);
    BaseConversationUI.access$600(this.zqF);
    ab.i("MicroMsg.BaseConversationUI", "klem pop out onAnimationEnd");
    AppMethodBeat.o(34061);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(34060);
    aw.RS().doK();
    al.Ma(-8);
    ab.i("MicroMsg.BaseConversationUI", "klem pop out onAnimationStart");
    this.zqF.onSettle(true, 0);
    AppMethodBeat.o(34060);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.9
 * JD-Core Version:    0.6.2
 */