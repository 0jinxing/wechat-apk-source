package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.support.v7.widget.RecyclerView.a;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class RecentAppBrandViewContainer$3
  implements Animator.AnimatorListener
{
  RecentAppBrandViewContainer$3(RecentAppBrandViewContainer paramRecentAppBrandViewContainer)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(133952);
    RecentAppBrandViewContainer.c(this.iYU).setVisibility(8);
    RecentAppBrandViewContainer.c(this.iYU).setScaleX(1.0F);
    RecentAppBrandViewContainer.c(this.iYU).setScaleY(1.0F);
    if ((RecentAppBrandViewContainer.d(this.iYU) != null) && (RecentAppBrandViewContainer.d(this.iYU).getAdapter() != null) && (3 < RecentAppBrandViewContainer.d(this.iYU).getDataCount()))
    {
      paramAnimator = RecentAppBrandViewContainer.d(this.iYU).qn(3);
      if (paramAnimator != null)
      {
        RecentAppBrandViewContainer.d(this.iYU).getShowList().add(3, paramAnimator);
        RecentAppBrandViewContainer.d(this.iYU).getAdapter().ch(3);
      }
    }
    AppMethodBeat.o(133952);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.RecentAppBrandViewContainer.3
 * JD-Core Version:    0.6.2
 */