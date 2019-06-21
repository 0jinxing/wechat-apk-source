package com.tencent.mm.ui.chatting.gallery;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.tools.MMGestureGallery;

final class TranslationResultUI$5
  implements ValueAnimator.AnimatorUpdateListener
{
  TranslationResultUI$5(TranslationResultUI paramTranslationResultUI)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(138649);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    paramValueAnimator = (FrameLayout.LayoutParams)TranslationResultUI.e(this.yYi).getLayoutParams();
    paramValueAnimator.leftMargin = ((int)(TranslationResultUI.i(this.yYi) * f));
    paramValueAnimator.topMargin = ((int)(TranslationResultUI.j(this.yYi) * f));
    paramValueAnimator.rightMargin = ((int)(TranslationResultUI.h(this.yYi).getWidth() * f - TranslationResultUI.k(this.yYi) * f - paramValueAnimator.leftMargin));
    paramValueAnimator.bottomMargin = ((int)(TranslationResultUI.h(this.yYi).getHeight() * f - TranslationResultUI.l(this.yYi) * f - paramValueAnimator.topMargin));
    TranslationResultUI.e(this.yYi).setLayoutParams(paramValueAnimator);
    TranslationResultUI.f(this.yYi).setTranslationX(TranslationResultUI.m(this.yYi) * (1.0F - f));
    TranslationResultUI.f(this.yYi).setTranslationY(TranslationResultUI.n(this.yYi) * (1.0F - f));
    TranslationResultUI.f(this.yYi).setScaleX((1.0F - f) * TranslationResultUI.o(this.yYi) + f);
    TranslationResultUI.f(this.yYi).setScaleY((1.0F - f) * TranslationResultUI.p(this.yYi) + f);
    TranslationResultUI.q(this.yYi).setAlpha(1.0F - f);
    AppMethodBeat.o(138649);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.TranslationResultUI.5
 * JD-Core Version:    0.6.2
 */