package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.f.b.u.c;
import a.l;
import a.v;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"})
final class CommentItemView$e
  implements ValueAnimator.AnimatorUpdateListener
{
  CommentItemView$e(CommentItemView paramCommentItemView, int paramInt1, int paramInt2, u.c paramc, a.f.a.a parama)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(110345);
    j.o(paramValueAnimator, "it");
    paramValueAnimator = paramValueAnimator.getAnimatedValue();
    if (paramValueAnimator == null)
    {
      paramValueAnimator = new v("null cannot be cast to non-null type kotlin.Float");
      AppMethodBeat.o(110345);
      throw paramValueAnimator;
    }
    float f = ((Float)paramValueAnimator).floatValue();
    int i = (int)((this.siE - this.siF) * (1.0F - f));
    this.siD.setTranslationY(i);
    if (f < this.siG)
    {
      this.siD.setScaleX(f / this.siG);
      this.siD.setScaleY(f / this.siG);
      this.siD.setAlpha(f / this.siG * 0.5F + 0.5F);
      if (i < 100)
        this.siD.setAlpha(i / 100.0F);
      if (this.siD.getAlpha() >= 0.05F)
        break label476;
      paramValueAnimator = this.siD.getNormalAnimator();
      if (paramValueAnimator != null)
        paramValueAnimator.removeAllUpdateListeners();
      paramValueAnimator = this.siI;
      if (paramValueAnimator == null)
        break label476;
      paramValueAnimator.invoke();
      AppMethodBeat.o(110345);
    }
    while (true)
    {
      return;
      this.siD.setScaleX(1.0F);
      this.siD.setScaleY(1.0F);
      this.siD.setAlpha(1.0F);
      paramValueAnimator = (a.f.a.a)this.siH.AVE;
      if (paramValueAnimator != null)
        paramValueAnimator.invoke();
      this.siH.AVE = null;
      if (CommentItemView.a(this.siD))
        break;
      CommentItemView.b(this.siD);
      paramValueAnimator = this.siD;
      long l = 0L;
      Object localObject;
      if (!paramValueAnimator.sit.rVi)
      {
        localObject = ObjectAnimator.ofFloat(new float[] { 0.0F, 1.0F });
        ((ValueAnimator)localObject).addUpdateListener((ValueAnimator.AnimatorUpdateListener)new CommentItemView.d(paramValueAnimator));
        j.o(localObject, "sizeAnimator");
        ((ValueAnimator)localObject).setDuration(300L);
        ((ValueAnimator)localObject).start();
        l = 300L;
      }
      while (true)
      {
        localObject = paramValueAnimator.sis;
        if (localObject == null)
          j.avw("contentLayout");
        ((ViewGroup)localObject).setVisibility(0);
        localObject = paramValueAnimator.sis;
        if (localObject == null)
          j.avw("contentLayout");
        ((ViewGroup)localObject).setAlpha(0.0F);
        paramValueAnimator = paramValueAnimator.sis;
        if (paramValueAnimator == null)
          j.avw("contentLayout");
        paramValueAnimator = ObjectAnimator.ofFloat(paramValueAnimator, "alpha", new float[] { 0.0F, 1.0F });
        j.o(paramValueAnimator, "contentLayoutAnim");
        paramValueAnimator.setStartDelay(l);
        paramValueAnimator.setDuration(100L);
        paramValueAnimator.start();
        break;
        localObject = paramValueAnimator.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).width = paramValueAnimator.six;
        ((ViewGroup.LayoutParams)localObject).height = paramValueAnimator.siw;
        paramValueAnimator.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      label476: AppMethodBeat.o(110345);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CommentItemView.e
 * JD-Core Version:    0.6.2
 */