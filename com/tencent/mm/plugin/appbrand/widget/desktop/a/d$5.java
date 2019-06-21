package com.tencent.mm.plugin.appbrand.widget.desktop.a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$5
  implements Animator.AnimatorListener
{
  d$5(d paramd, RecyclerView.v paramv1, Runnable paramRunnable, RecyclerView.v paramv2)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(134214);
    this.jbk.jbb.removeView(this.jbk.iYn);
    if (!this.jbk.jbf)
    {
      this.jbn.apJ.setVisibility(0);
      this.cfC.run();
      AppMethodBeat.o(134214);
    }
    while (true)
    {
      return;
      if ((this.jbo != null) && (this.jbo.apJ != null))
        this.jbo.apJ.setVisibility(0);
      if (this.jbn != null)
      {
        this.jbn.apJ.setVisibility(0);
        this.jbn.apJ.setScaleX(0.0F);
        this.jbn.apJ.setScaleY(0.0F);
        this.jbn.apJ.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setDuration(300L).setListener(null).start();
      }
      this.cfC.run();
      this.jbk.iYn.setScaleX(1.0F);
      this.jbk.iYn.setScaleY(1.0F);
      AppMethodBeat.o(134214);
    }
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.d.5
 * JD-Core Version:    0.6.2
 */