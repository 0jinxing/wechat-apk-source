package com.tencent.mm.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.e.c;

final class a$1
  implements ValueAnimator.AnimatorUpdateListener
{
  Matrix ccl;
  Rect ccm;

  a$1(a parama)
  {
    AppMethodBeat.i(116135);
    this.ccl = new Matrix(this.ccn.ccd.getMainMatrix());
    this.ccm = new Rect(this.ccn.cch);
    AppMethodBeat.o(116135);
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(116136);
    float f1 = ((Float)paramValueAnimator.getAnimatedValue("deltaY")).floatValue();
    float f2 = ((Float)paramValueAnimator.getAnimatedValue("deltaX")).floatValue();
    float f3 = ((Float)paramValueAnimator.getAnimatedValue("scale")).floatValue();
    float f4 = ((Float)paramValueAnimator.getAnimatedValue("background_alpha")).floatValue();
    this.ccn.ccj.reset();
    this.ccn.ccj.postTranslate(f2, f1);
    paramValueAnimator = new RectF(this.ccm);
    this.ccn.ccj.mapRect(paramValueAnimator);
    paramValueAnimator.round(this.ccn.cch);
    this.ccn.ccj.postScale(f3, f3, this.ccn.cch.centerX(), this.ccn.cch.centerY());
    paramValueAnimator = new Matrix(this.ccl);
    paramValueAnimator.postConcat(this.ccn.ccj);
    this.ccn.ccd.getMainMatrix().set(paramValueAnimator);
    com.tencent.mm.y.a.jA((int)f4);
    paramValueAnimator = new RectF(this.ccm);
    this.ccn.ccj.mapRect(paramValueAnimator);
    paramValueAnimator.round(this.ccn.cch);
    this.ccn.ccd.CP();
    AppMethodBeat.o(116136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.b.a.1
 * JD-Core Version:    0.6.2
 */