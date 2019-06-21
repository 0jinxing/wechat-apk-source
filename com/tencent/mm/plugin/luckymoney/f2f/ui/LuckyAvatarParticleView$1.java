package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class LuckyAvatarParticleView$1
  implements ValueAnimator.AnimatorUpdateListener
{
  LuckyAvatarParticleView$1(LuckyAvatarParticleView paramLuckyAvatarParticleView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(42160);
    if (((Float)paramValueAnimator.getAnimatedValue()).floatValue() == 1.0F)
    {
      LuckyAvatarParticleView.a(this.nUD).clear();
      LuckyAvatarParticleView.b(this.nUD).clear();
      LuckyAvatarParticleView.c(this.nUD).clear();
    }
    while (true)
    {
      this.nUD.invalidate();
      AppMethodBeat.o(42160);
      return;
      if (((Float)paramValueAnimator.getAnimatedValue()).floatValue() == 0.0F)
        LuckyAvatarParticleView.d(this.nUD);
      else
        for (int i = 0; i < LuckyAvatarParticleView.a(this.nUD).size(); i++)
          LuckyAvatarParticleView.a(this.nUD, i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyAvatarParticleView.1
 * JD-Core Version:    0.6.2
 */