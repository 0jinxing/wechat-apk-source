package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.storage.n;

final class SnsCommentDetailUI$31
  implements View.OnClickListener
{
  SnsCommentDetailUI$31(SnsCommentDetailUI paramSnsCommentDetailUI, n paramn)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38814);
    if ((SnsCommentDetailUI.r(this.rqN) != null) && (this.rhJ.field_likeFlag == 0))
      SnsCommentDetailUI.r(this.rqN).jP(this.rhJ.field_snsId);
    SnsCommentDetailUI localSnsCommentDetailUI = this.rqN;
    LinearLayout localLinearLayout = (LinearLayout)paramView;
    paramView = (ImageView)localLinearLayout.findViewById(2131827695);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(0.9F, 1.5F, 0.9F, 1.5F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setDuration(400L);
    localScaleAnimation.setStartOffset(100L);
    localScaleAnimation.setRepeatCount(0);
    paramView.clearAnimation();
    paramView.startAnimation(localScaleAnimation);
    localScaleAnimation.setAnimationListener(new SnsCommentDetailUI.35(localSnsCommentDetailUI, localLinearLayout));
    SnsCommentDetailUI.F(this.rqN);
    AppMethodBeat.o(38814);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.31
 * JD-Core Version:    0.6.2
 */