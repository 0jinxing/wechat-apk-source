package com.tencent.mm.ui.base;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TalkRoomPopupNav$7
  implements Animation.AnimationListener
{
  TalkRoomPopupNav$7(TalkRoomPopupNav paramTalkRoomPopupNav)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(30013);
    TalkRoomPopupNav.c(this.yAR).setVisibility(4);
    TalkRoomPopupNav.e(this.yAR).setVisibility(4);
    AppMethodBeat.o(30013);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.TalkRoomPopupNav.7
 * JD-Core Version:    0.6.2
 */