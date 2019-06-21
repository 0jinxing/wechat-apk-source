package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class c$11 extends AnimatorListenerAdapter
{
  c$11(c paramc, RecyclerView.v paramv, int paramInt1, View paramView, int paramInt2, boolean paramBoolean, float paramFloat, ViewPropertyAnimator paramViewPropertyAnimator)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(133793);
    if (this.ahF != 0)
      this.val$view.setTranslationX(0.0F);
    if (this.ahG != 0)
      this.val$view.setTranslationY(0.0F);
    if (!this.iXb)
    {
      this.val$view.setAlpha(0.0F);
      AppMethodBeat.o(133793);
    }
    while (true)
    {
      return;
      this.val$view.setAlpha(this.iXa);
      AppMethodBeat.o(133793);
    }
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(133794);
    this.ahE.setListener(null);
    this.iWY.C(this.ahD);
    this.iWY.ahw.remove(this.ahD);
    this.iWY.hY();
    AppMethodBeat.o(133794);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(133792);
    this.iWY.F(this.ahD);
    AppMethodBeat.o(133792);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.c.11
 * JD-Core Version:    0.6.2
 */