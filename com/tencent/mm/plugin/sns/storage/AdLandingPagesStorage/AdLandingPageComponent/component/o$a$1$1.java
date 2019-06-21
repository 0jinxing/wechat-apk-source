package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.math.BigInteger;

final class o$a$1$1
  implements Animation.AnimationListener
{
  o$a$1$1(o.a.1 param1)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(37165);
    long l = new BigInteger((String)this.raF.raD.getTag()).longValue();
    if (l >= 3L)
    {
      paramAnimation = new AlphaAnimation(0.8F, 0.0F);
      paramAnimation.setDuration(this.raF.raE.raz);
      paramAnimation.setInterpolator(new DecelerateInterpolator(1.2F));
      paramAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          AppMethodBeat.i(37164);
          o.a.1.1.this.raF.raD.setAlpha(0.0F);
          AppMethodBeat.o(37164);
        }

        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
        }

        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
        }
      });
      this.raF.raD.startAnimation(paramAnimation);
      AppMethodBeat.o(37165);
    }
    while (true)
    {
      return;
      this.raF.raD.setTag(String.valueOf(l + 1L));
      o.a.a(this.raF.raE, this.raF.raD);
      AppMethodBeat.o(37165);
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o.a.1.1
 * JD-Core Version:    0.6.2
 */