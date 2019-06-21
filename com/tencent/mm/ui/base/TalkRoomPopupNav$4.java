package com.tencent.mm.ui.base;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class TalkRoomPopupNav$4
  implements Animation.AnimationListener
{
  public TalkRoomPopupNav$4(TalkRoomPopupNav paramTalkRoomPopupNav)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(30009);
    TalkRoomPopupNav.c(this.yAR).startAnimation(AnimationUtils.loadAnimation(this.yAR.getContext(), 2131034180));
    TalkRoomPopupNav.c(this.yAR).setVisibility(0);
    AppMethodBeat.o(30009);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.TalkRoomPopupNav.4
 * JD-Core Version:    0.6.2
 */