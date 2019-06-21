package com.tencent.mm.plugin.appbrand.widget.desktop.a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$2
  implements Animator.AnimatorListener
{
  e$2(e parame, RecyclerView.v paramv, Runnable paramRunnable)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(134227);
    this.jbr.jbb.removeView(this.jbr.iYn);
    this.jbr.iYn.setVisibility(8);
    if (this.jbs != null)
      this.jbs.apJ.setVisibility(0);
    this.cfC.run();
    AppMethodBeat.o(134227);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.e.2
 * JD-Core Version:    0.6.2
 */