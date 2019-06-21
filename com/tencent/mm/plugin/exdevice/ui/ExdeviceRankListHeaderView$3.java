package com.tencent.mm.plugin.exdevice.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class ExdeviceRankListHeaderView$3
  implements Animation.AnimationListener
{
  ExdeviceRankListHeaderView$3(ExdeviceRankListHeaderView paramExdeviceRankListHeaderView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(20205);
    ExdeviceRankListHeaderView.d(this.lDK).reset();
    al.n(ExdeviceRankListHeaderView.f(this.lDK), 4000L);
    AppMethodBeat.o(20205);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(20204);
    ExdeviceRankListHeaderView.e(this.lDK).setVisibility(0);
    AppMethodBeat.o(20204);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView.3
 * JD-Core Version:    0.6.2
 */