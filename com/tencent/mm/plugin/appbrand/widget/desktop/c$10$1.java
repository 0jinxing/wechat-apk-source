package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.c;
import java.util.ArrayList;

final class c$10$1 extends AnimatorListenerAdapter
{
  c$10$1(c.10 param10)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(133789);
    this.iXd.val$view.setAlpha(1.0F);
    this.iXd.val$view.setScaleX(1.0F);
    this.iXd.val$view.setScaleY(1.0F);
    this.iXd.val$view.setVisibility(0);
    AppMethodBeat.o(133789);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(133790);
    this.iXd.ahE.setListener(null);
    ((BaseAppBrandRecentView.c)this.iXd.ahD).iYe.animate().setListener(null);
    this.iXd.iWY.m(this.iXd.ahD);
    this.iXd.iWY.ahv.remove(this.iXd.ahD);
    this.iXd.iWY.hY();
    AppMethodBeat.o(133790);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.c.10.1
 * JD-Core Version:    0.6.2
 */