package com.tencent.mm.media.editor.c;

import a.f.a.b;
import a.f.b.j;
import a.l;
import a.v;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"})
final class a$a
  implements ValueAnimator.AnimatorUpdateListener
{
  a$a(a parama, float paramFloat1, float paramFloat2, float paramFloat3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, b paramb)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(12900);
    Object localObject = this.eUz;
    j.o(paramValueAnimator, "animation");
    paramValueAnimator = paramValueAnimator.getAnimatedValue();
    if (paramValueAnimator == null)
    {
      paramValueAnimator = new v("null cannot be cast to non-null type kotlin.Float");
      AppMethodBeat.o(12900);
      throw paramValueAnimator;
    }
    float f = ((Float)paramValueAnimator).floatValue();
    paramValueAnimator = new Matrix();
    paramValueAnimator.setTranslate(-localObject.eUy[0], -localObject.eUy[1]);
    paramValueAnimator.postScale(a.j(this.eUA, this.eUB, f), a.j(this.eUA, this.eUB, f));
    paramValueAnimator.postRotate(this.eUC);
    paramValueAnimator.postTranslate(a.j(this.eUD[0], this.eUE[0], f), a.j(this.eUD[1], this.eUE[1], f));
    localObject = this.eUF;
    if (localObject != null)
    {
      ((b)localObject).am(paramValueAnimator);
      AppMethodBeat.o(12900);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(12900);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.c.a.a
 * JD-Core Version:    0.6.2
 */