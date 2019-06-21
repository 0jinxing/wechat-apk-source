package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class j$1
  implements ValueAnimator.AnimatorUpdateListener
{
  j$1(j paramj)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(8179);
    j.a(this.uza, ((Integer)paramValueAnimator.getAnimatedValue("canvasTranslationX")).intValue());
    j.a(this.uza).left = ((Integer)paramValueAnimator.getAnimatedValue("translationX")).intValue();
    j.a(this.uza).top = ((Integer)paramValueAnimator.getAnimatedValue("translationY")).intValue();
    RectF localRectF = j.a(this.uza);
    float f1 = j.a(this.uza).left;
    float f2 = j.b(this.uza);
    localRectF.right = (((Float)paramValueAnimator.getAnimatedValue("scaleX")).floatValue() * f2 + f1);
    localRectF = j.a(this.uza);
    f2 = j.a(this.uza).top;
    f1 = j.c(this.uza);
    localRectF.bottom = (((Float)paramValueAnimator.getAnimatedValue("scaleY")).floatValue() * f1 + f2);
    this.uza.postInvalidate();
    AppMethodBeat.o(8179);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.j.1
 * JD-Core Version:    0.6.2
 */