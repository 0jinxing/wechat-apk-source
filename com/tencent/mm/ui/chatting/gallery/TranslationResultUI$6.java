package com.tencent.mm.ui.chatting.gallery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class TranslationResultUI$6 extends AnimatorListenerAdapter
{
  TranslationResultUI$6(TranslationResultUI paramTranslationResultUI)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(138651);
    super.onAnimationEnd(paramAnimator);
    this.yYi.finish();
    this.yYi.overridePendingTransition(2131034130, 2131034130);
    AppMethodBeat.o(138651);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(138650);
    super.onAnimationStart(paramAnimator);
    if (TranslationResultUI.f(this.yYi).getScale() > 1.0F)
      TranslationResultUI.f(this.yYi).dzA();
    TranslationResultUI.a(this.yYi, TranslationResultUI.f(this.yYi).getTranslationX());
    TranslationResultUI.b(this.yYi, TranslationResultUI.f(this.yYi).getTranslationY());
    TranslationResultUI.c(this.yYi, TranslationResultUI.f(this.yYi).getScaleX());
    TranslationResultUI.d(this.yYi, TranslationResultUI.f(this.yYi).getScaleY());
    AppMethodBeat.o(138650);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.TranslationResultUI.6
 * JD-Core Version:    0.6.2
 */