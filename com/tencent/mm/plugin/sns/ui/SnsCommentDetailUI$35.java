package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsCommentDetailUI$35
  implements Animation.AnimationListener
{
  boolean rrc = false;

  SnsCommentDetailUI$35(SnsCommentDetailUI paramSnsCommentDetailUI, LinearLayout paramLinearLayout)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(38819);
    if (this.rrd != null)
      this.rrd.setPressed(false);
    if (!this.rrc)
    {
      this.rrc = true;
      if (SnsCommentDetailUI.E(this.rqN) != null)
      {
        SnsCommentDetailUI.E(this.rqN).clearAnimation();
        SnsCommentDetailUI.E(this.rqN).setVisibility(8);
      }
    }
    AppMethodBeat.o(38819);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.35
 * JD-Core Version:    0.6.2
 */