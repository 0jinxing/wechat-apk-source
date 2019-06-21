package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import a.l;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class DynamicBackgroundGLSurfaceView$b$b
  implements Runnable
{
  DynamicBackgroundGLSurfaceView$b$b(DynamicBackgroundGLSurfaceView.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135226);
    Object localObject = DynamicBackgroundGLSurfaceView.b.a(this.iZw);
    if (localObject != null)
    {
      if ((((GradientColorBackgroundView)localObject).getVisibility() != 0) || (this.iZw.iZp))
        break label164;
      localObject = DynamicBackgroundGLSurfaceView.b.b(this.iZw);
      if (localObject != null)
        ((GameGLSurfaceView)localObject).setVisibility(0);
      this.iZw.iZp = true;
      localObject = DynamicBackgroundGLSurfaceView.b.a(this.iZw);
      if (localObject != null)
        ((GradientColorBackgroundView)localObject).setAlpha(1.0F);
      ab.d("MicroMsg.DynamicBgSurfaceView", "alvinluo GradientColorBackgroundView do alpha animation");
      localObject = DynamicBackgroundGLSurfaceView.b.a(this.iZw);
      if (localObject == null)
        break label164;
      localObject = ((GradientColorBackgroundView)localObject).animate();
      if (localObject == null)
        break label164;
      localObject = ((ViewPropertyAnimator)localObject).alpha(0.0F);
      if (localObject == null)
        break label164;
      localObject = ((ViewPropertyAnimator)localObject).setDuration(DynamicBackgroundGLSurfaceView.b.aPG());
      if (localObject == null)
        break label164;
      localObject = ((ViewPropertyAnimator)localObject).setListener((Animator.AnimatorListener)new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          this.iZx.iZw.iZp = false;
        }

        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          AppMethodBeat.i(135225);
          paramAnonymousAnimator = DynamicBackgroundGLSurfaceView.b.a(this.iZx.iZw);
          if (paramAnonymousAnimator != null)
            paramAnonymousAnimator.setVisibility(4);
          this.iZx.iZw.iZp = false;
          AppMethodBeat.o(135225);
        }

        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
        }

        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
        }
      });
      if (localObject == null)
        break label164;
      ((ViewPropertyAnimator)localObject).start();
      AppMethodBeat.o(135226);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135226);
      continue;
      label164: AppMethodBeat.o(135226);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.DynamicBackgroundGLSurfaceView.b.b
 * JD-Core Version:    0.6.2
 */