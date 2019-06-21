package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView;
import java.util.ArrayList;

final class c$9 extends AnimatorListenerAdapter
{
  c$9(c paramc, RecyclerView.v paramv, View paramView, int paramInt, boolean paramBoolean, ViewPropertyAnimator paramViewPropertyAnimator)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(133787);
    paramAnimator = this.val$view;
    float f;
    if (this.iWY.iWW.qX(this.gvp))
    {
      f = 0.3F;
      paramAnimator.setAlpha(f);
      this.val$view.setScaleX(1.0F);
      this.val$view.setScaleY(1.0F);
      if (this.iXb)
        break label77;
      this.val$view.setVisibility(4);
      AppMethodBeat.o(133787);
    }
    while (true)
    {
      return;
      f = 1.0F;
      break;
      label77: this.val$view.setVisibility(0);
      AppMethodBeat.o(133787);
    }
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(133788);
    this.ahE.setListener(null);
    this.iWY.m(this.ahD);
    this.iWY.ahv.remove(this.ahD);
    this.iWY.hY();
    AppMethodBeat.o(133788);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.c.9
 * JD-Core Version:    0.6.2
 */