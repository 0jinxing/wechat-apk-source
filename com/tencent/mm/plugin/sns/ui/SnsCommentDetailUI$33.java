package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsCommentDetailUI$33
  implements Animation.AnimationListener
{
  SnsCommentDetailUI$33(SnsCommentDetailUI paramSnsCommentDetailUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(38816);
    ab.d("MicroMsg.SnsCommentDetailUI", "onAnimationEnd");
    if (SnsCommentDetailUI.E(this.rqN) != null)
    {
      SnsCommentDetailUI.E(this.rqN).clearAnimation();
      SnsCommentDetailUI.E(this.rqN).setVisibility(8);
    }
    AppMethodBeat.o(38816);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.33
 * JD-Core Version:    0.6.2
 */