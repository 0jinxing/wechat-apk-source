package com.tencent.mm.plugin.appbrand.widget.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i
{
  private int jcP;
  ValueAnimator jcQ;
  View view;

  public i(View paramView)
  {
    this.view = paramView;
  }

  final void c(int paramInt, final Runnable paramRunnable)
  {
    AppMethodBeat.i(77422);
    if (this.view == null)
      AppMethodBeat.o(77422);
    while (true)
    {
      return;
      this.jcP = paramInt;
      if (((this.view.getBackground() instanceof ColorDrawable)) && (((ColorDrawable)this.view.getBackground()).getColor() == paramInt))
      {
        if (paramRunnable != null)
          paramRunnable.run();
        if (this.jcQ != null)
          this.jcQ.cancel();
        AppMethodBeat.o(77422);
      }
      else
      {
        paramRunnable = new AnimatorListenerAdapter()
        {
          public final void onAnimationCancel(Animator paramAnonymousAnimator)
          {
            i.this.jcQ = null;
          }

          public final void onAnimationEnd(Animator paramAnonymousAnimator)
          {
            AppMethodBeat.i(77420);
            if (paramRunnable != null)
              paramRunnable.run();
            i.this.jcQ = null;
            AppMethodBeat.o(77420);
          }
        };
        if ((this.jcQ == null) || (!this.jcQ.isStarted()) || (!this.jcQ.isRunning()) || (this.jcP != paramInt))
          break;
        this.jcQ.addListener(paramRunnable);
        AppMethodBeat.o(77422);
      }
    }
    if (this.jcQ != null)
      this.jcQ.cancel();
    if ((this.view.getBackground() instanceof ColorDrawable));
    for (paramInt = ((ColorDrawable)this.view.getBackground()).getColor(); ; paramInt = 0)
    {
      this.jcQ = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.jcP) });
      this.jcQ.addListener(paramRunnable);
      this.jcQ.addUpdateListener(new i.2(this));
      this.jcQ.start();
      AppMethodBeat.o(77422);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.i
 * JD-Core Version:    0.6.2
 */