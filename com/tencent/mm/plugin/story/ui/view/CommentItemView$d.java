package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import a.v;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"})
final class CommentItemView$d
  implements ValueAnimator.AnimatorUpdateListener
{
  CommentItemView$d(CommentItemView paramCommentItemView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(110344);
    j.o(paramValueAnimator, "it");
    paramValueAnimator = paramValueAnimator.getAnimatedValue();
    if (paramValueAnimator == null)
    {
      paramValueAnimator = new v("null cannot be cast to non-null type kotlin.Float");
      AppMethodBeat.o(110344);
      throw paramValueAnimator;
    }
    float f = ((Float)paramValueAnimator).floatValue();
    paramValueAnimator = this.siD.getLayoutParams();
    paramValueAnimator.width = (CommentItemView.c(this.siD) + (int)((CommentItemView.d(this.siD) - CommentItemView.c(this.siD)) * f));
    int i = CommentItemView.c(this.siD);
    paramValueAnimator.height = ((int)(f * (CommentItemView.e(this.siD) - CommentItemView.c(this.siD))) + i);
    this.siD.setLayoutParams(paramValueAnimator);
    AppMethodBeat.o(110344);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CommentItemView.d
 * JD-Core Version:    0.6.2
 */