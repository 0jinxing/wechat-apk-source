package com.tencent.luggage.d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$1
  implements Runnable
{
  boolean done = false;

  f$1(f paramf, boolean paramBoolean, e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(90774);
    if (this.done)
      AppMethodBeat.o(90774);
    while (true)
    {
      return;
      this.done = true;
      Object localObject1;
      ObjectAnimator localObjectAnimator;
      Object localObject2;
      if ((this.bPt.bPk.peek() != null) && (this.bPr))
      {
        localObject1 = (e)this.bPt.bPk.peek();
        localObjectAnimator = ObjectAnimator.ofFloat(((e)localObject1).getContentView(), "translationX", new float[] { 0.0F, -(((e)localObject1).getContentView().getWidth() * 0.25F) });
        localObjectAnimator.setDuration(250L);
        localObject2 = ObjectAnimator.ofFloat(((e)localObject1).getContentView(), "translationX", new float[] { 0.0F });
        ((ObjectAnimator)localObject2).setDuration(0L);
        localObject3 = new AnimatorSet();
        ((AnimatorSet)localObject3).playSequentially(new Animator[] { localObjectAnimator, localObject2 });
        ((e)localObject1).a((Animator)localObject3, null);
        ((e)this.bPt.bPk.peek()).wV();
      }
      this.bPs.getContentView().bringToFront();
      this.bPs.getContentView().setVisibility(0);
      this.bPs.wT();
      Object localObject3 = new f.1.1(this);
      if (this.bPr)
      {
        e locale = this.bPs;
        localObjectAnimator = ObjectAnimator.ofFloat(locale.getContentView(), "translationX", new float[] { locale.getContentView().getWidth(), 0.0F });
        localObjectAnimator.setDuration(250L);
        localObject1 = ObjectAnimator.ofFloat(locale.getContentView(), "alpha", new float[] { 0.0F, 1.0F });
        ((ObjectAnimator)localObject1).setDuration(166L);
        localObject2 = new AnimatorSet();
        ((AnimatorSet)localObject2).playTogether(new Animator[] { localObjectAnimator, localObject1 });
        locale.a((Animator)localObject2, (Runnable)localObject3);
        AppMethodBeat.o(90774);
      }
      else
      {
        ((Runnable)localObject3).run();
        AppMethodBeat.o(90774);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.f.1
 * JD-Core Version:    0.6.2
 */