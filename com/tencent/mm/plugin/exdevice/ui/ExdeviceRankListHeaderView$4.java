package com.tencent.mm.plugin.exdevice.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceRankListHeaderView$4
  implements Animation.AnimationListener
{
  ExdeviceRankListHeaderView$4(ExdeviceRankListHeaderView paramExdeviceRankListHeaderView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(20207);
    ExdeviceRankListHeaderView.e(this.lDK).setVisibility(4);
    AppMethodBeat.o(20207);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(20206);
    ExdeviceRankListHeaderView.e(this.lDK).setVisibility(0);
    AppMethodBeat.o(20206);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView.4
 * JD-Core Version:    0.6.2
 */