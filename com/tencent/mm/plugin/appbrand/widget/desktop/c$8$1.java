package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class c$8$1 extends AnimatorListenerAdapter
{
  c$8$1(c.8 param8)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(133784);
    ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo onAnimationCancel");
    ((BaseAppBrandRecentView.c)this.iXc.ahD).iYe.setAlpha(1.0F);
    ((BaseAppBrandRecentView.c)this.iXc.ahD).iYe.setScaleX(1.0F);
    ((BaseAppBrandRecentView.c)this.iXc.ahD).iYe.setScaleY(1.0F);
    ((BaseAppBrandRecentView.c)this.iXc.ahD).iYe.animate().setListener(null);
    this.iXc.val$view.setVisibility(0);
    this.iXc.iWY.iWV = false;
    AppMethodBeat.o(133784);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(133785);
    ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo onAnimationEnd");
    this.iXc.ahE.setListener(null);
    ((BaseAppBrandRecentView.c)this.iXc.ahD).iYe.setAlpha(1.0F);
    ((BaseAppBrandRecentView.c)this.iXc.ahD).iYe.setScaleX(1.0F);
    ((BaseAppBrandRecentView.c)this.iXc.ahD).iYe.setScaleY(1.0F);
    ((BaseAppBrandRecentView.c)this.iXc.ahD).iYe.animate().setListener(null);
    this.iXc.iWY.m(this.iXc.ahD);
    this.iXc.iWY.ahv.remove(this.iXc.ahD);
    this.iXc.iWY.hY();
    this.iXc.iWY.iWV = false;
    AppMethodBeat.o(133785);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.c.8.1
 * JD-Core Version:    0.6.2
 */