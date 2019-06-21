package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class f$5 extends AnimatorListenerAdapter
{
  f$5(f paramf, RecyclerView.v paramv, View paramView, ViewPropertyAnimator paramViewPropertyAnimator)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(133907);
    this.val$view.setScaleX(1.0F);
    this.val$view.setScaleY(1.0F);
    AppMethodBeat.o(133907);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(133908);
    this.ahE.setListener(null);
    this.iYC.m(this.ahD);
    this.iYC.ahv.remove(this.ahD);
    this.iYC.hY();
    AppMethodBeat.o(133908);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.f.5
 * JD-Core Version:    0.6.2
 */