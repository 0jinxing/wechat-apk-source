package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class f$8 extends AnimatorListenerAdapter
{
  f$8(f paramf, f.a parama, ViewPropertyAnimator paramViewPropertyAnimator, View paramView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(133913);
    this.ahJ.setListener(null);
    this.ahK.setAlpha(1.0F);
    this.ahK.setTranslationX(0.0F);
    this.ahK.setTranslationY(0.0F);
    this.iYC.m(this.iYD.ahM);
    this.iYC.ahy.remove(this.iYD.ahM);
    this.iYC.hY();
    AppMethodBeat.o(133913);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.f.8
 * JD-Core Version:    0.6.2
 */