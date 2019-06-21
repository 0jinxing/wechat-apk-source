package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class c$2 extends AnimatorListenerAdapter
{
  c$2(c paramc, c.a parama, ViewPropertyAnimator paramViewPropertyAnimator, View paramView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(133775);
    this.ahI.setListener(null);
    this.val$view.setAlpha(1.0F);
    this.val$view.setTranslationX(0.0F);
    this.val$view.setTranslationY(0.0F);
    this.iWY.m(this.iWZ.ahL);
    this.iWY.ahy.remove(this.iWZ.ahL);
    this.iWY.hY();
    AppMethodBeat.o(133775);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.c.2
 * JD-Core Version:    0.6.2
 */