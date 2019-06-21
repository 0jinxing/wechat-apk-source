package com.tencent.mm.plugin.location.ui.impl;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TrackPointAnimAvatar$2
  implements Animation.AnimationListener
{
  TrackPointAnimAvatar$2(TrackPointAnimAvatar paramTrackPointAnimAvatar)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(113732);
    this.nRn.bringToFront();
    TrackPointAnimAvatar.b(this.nRn).startAnimation(TrackPointAnimAvatar.c(this.nRn));
    AppMethodBeat.o(113732);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.TrackPointAnimAvatar.2
 * JD-Core Version:    0.6.2
 */