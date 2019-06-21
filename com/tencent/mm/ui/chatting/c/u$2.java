package com.tencent.mm.ui.chatting.c;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.af;
import com.tencent.mm.ui.chatting.d.a;

final class u$2
  implements Runnable
{
  u$2(u paramu)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31541);
    ab.i("MicroMsg.HistoryMsgTongueComponent", "show animation! GoBackToHistoryMsgLayout!!!");
    u.a(this.yQN).setVisibility(0);
    u.a(this.yQN, 1);
    if (((af)this.yQN.cgL.aF(af.class)).dFa())
      this.yQN.OB(1);
    while (true)
    {
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(u.a(this.yQN).getWidth(), 0.0F, 0.0F, 0.0F);
      localTranslateAnimation.setDuration(300L);
      localTranslateAnimation.setInterpolator(AnimationUtils.loadInterpolator(this.yQN.cgL.yTx.getContext(), 17432581));
      u.a(this.yQN).startAnimation(localTranslateAnimation);
      AppMethodBeat.o(31541);
      return;
      if (u.b(this.yQN))
        this.yQN.OB(3);
      else
        this.yQN.OB(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.u.2
 * JD-Core Version:    0.6.2
 */