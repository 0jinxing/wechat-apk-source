package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class f$4 extends AnimatorListenerAdapter
{
  f$4(f paramf, RecyclerView.v paramv, ViewPropertyAnimator paramViewPropertyAnimator, View paramView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(133906);
    this.ahE.setListener(null);
    this.val$view.setAlpha(1.0F);
    this.iYC.B(this.ahD);
    this.iYC.ahx.remove(this.ahD);
    this.iYC.hY();
    AppMethodBeat.o(133906);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(133905);
    this.iYC.D(this.ahD);
    AppMethodBeat.o(133905);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.f.4
 * JD-Core Version:    0.6.2
 */