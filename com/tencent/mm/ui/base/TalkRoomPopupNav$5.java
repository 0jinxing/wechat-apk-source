package com.tencent.mm.ui.base;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class TalkRoomPopupNav$5
  implements Animation.AnimationListener
{
  public TalkRoomPopupNav$5(TalkRoomPopupNav paramTalkRoomPopupNav)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(30010);
    TalkRoomPopupNav.d(this.yAR).setVisibility(8);
    TalkRoomPopupNav.d(this.yAR).setClickable(false);
    AppMethodBeat.o(30010);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.TalkRoomPopupNav.5
 * JD-Core Version:    0.6.2
 */