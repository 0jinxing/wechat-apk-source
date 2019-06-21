package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class o$a$1
  implements Animation.AnimationListener
{
  o$a$1(o.a parama, ImageView paramImageView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(37166);
    paramAnimation = new AnimationSet(true);
    Object localObject = new TranslateAnimation(-5.0F, 0.0F, 0.0F, 0.0F);
    ((TranslateAnimation)localObject).setDuration(this.raE.ray);
    ((TranslateAnimation)localObject).setInterpolator(new DecelerateInterpolator(1.2F));
    ((TranslateAnimation)localObject).setStartTime(this.raE.ray);
    paramAnimation.addAnimation((Animation)localObject);
    localObject = new AlphaAnimation(0.3F, 0.8F);
    ((AlphaAnimation)localObject).setDuration(this.raE.ray);
    ((AlphaAnimation)localObject).setInterpolator(new DecelerateInterpolator(1.2F));
    ((AlphaAnimation)localObject).setStartTime(this.raE.ray);
    paramAnimation.addAnimation((Animation)localObject);
    paramAnimation.setAnimationListener(new o.a.1.1(this));
    this.raD.startAnimation(paramAnimation);
    AppMethodBeat.o(37166);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o.a.1
 * JD-Core Version:    0.6.2
 */