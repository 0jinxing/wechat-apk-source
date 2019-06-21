package com.tencent.mm.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.view.b.a;

public final class d$1
  implements ValueAnimator.AnimatorUpdateListener
{
  int ccA;
  float ccB;
  float ccs;
  float cct;

  public d$1(d paramd, float paramFloat)
  {
    AppMethodBeat.i(116143);
    this.ccs = 0.0F;
    this.cct = 0.0F;
    this.ccA = 0;
    this.ccB = ((float)Math.pow(this.ccD.mScale / this.ccC, 0.25D));
    AppMethodBeat.o(116143);
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(116144);
    float f2 = ((Float)paramValueAnimator.getAnimatedValue("deltaY")).floatValue();
    float f3 = ((Float)paramValueAnimator.getAnimatedValue("deltaX")).floatValue();
    if ((this.ccA < 4) && (this.ccD.ccy))
    {
      this.ccD.ccv.getMainMatrix().postScale(this.ccB, this.ccB);
      this.ccA += 1;
    }
    paramValueAnimator = this.ccD.ccv.getCurImageRect();
    Object localObject = this.ccD.ccv.getBoardRect();
    float f4;
    if (!this.ccD.ccz)
    {
      localObject = this.ccD;
      ((d)localObject).ccw += f3 - this.cct;
      localObject = this.ccD;
      ((d)localObject).ccx += f2 - this.ccs;
      f1 = this.ccD.ccw - paramValueAnimator.centerX();
      f4 = this.ccD.ccx - paramValueAnimator.centerY();
      this.ccD.ccv.getMainMatrix().postTranslate(f1, f4);
      this.ccD.ccv.postInvalidate();
      this.ccs = f2;
      this.cct = f3;
      AppMethodBeat.o(116144);
      return;
    }
    if (paramValueAnimator.top > ((Rect)localObject).top);
    for (float f5 = ((Rect)localObject).top - paramValueAnimator.top; ; f5 = 0.0F)
    {
      if (paramValueAnimator.right < ((Rect)localObject).right)
        f1 = ((Rect)localObject).right - paramValueAnimator.right;
      if (paramValueAnimator.bottom < ((Rect)localObject).bottom)
        f5 = ((Rect)localObject).bottom - paramValueAnimator.bottom;
      f4 = f5;
      if (paramValueAnimator.left <= ((Rect)localObject).left)
        break;
      f1 = ((Rect)localObject).left - paramValueAnimator.left;
      f4 = f5;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.b.d.1
 * JD-Core Version:    0.6.2
 */