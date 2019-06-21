package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.support.v7.widget.RecyclerView.v;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.c;

final class AppBrandDesktopHalfItemView$2
  implements Animator.AnimatorListener
{
  AppBrandDesktopHalfItemView$2(AppBrandDesktopHalfItemView paramAppBrandDesktopHalfItemView)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(134126);
    if ((AppBrandDesktopHalfItemView.g(this.jaE) != null) && (AppBrandDesktopHalfItemView.g(this.jaE).jaG != null) && (AppBrandDesktopHalfItemView.g(this.jaE).jaG.apJ != null) && ((AppBrandDesktopHalfItemView.g(this.jaE).jaG instanceof BaseAppBrandRecentView.c)))
      ((BaseAppBrandRecentView.c)AppBrandDesktopHalfItemView.g(this.jaE).jaG).gne.setVisibility(0);
    AppBrandDesktopHalfItemView.j(this.jaE);
    AppMethodBeat.o(134126);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfItemView.2
 * JD-Core Version:    0.6.2
 */