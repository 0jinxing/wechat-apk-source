package com.tencent.mm.e;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$8
  implements ValueAnimator.AnimatorUpdateListener
{
  int ccA;
  float ccB;
  int cjS;
  float cjT;
  float cjU;
  float cjV;
  float cjW;
  float cjX;
  float cjY;

  public c$8(c paramc, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(116162);
    this.cjS = 0;
    this.cjU = 0.0F;
    this.cjW = 0.0F;
    this.cjX = this.cjZ;
    this.cjY = this.cka;
    this.ccB = ((float)Math.pow(this.ckb, 0.0833333358168602D));
    this.ccA = 0;
    AppMethodBeat.o(116162);
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(116163);
    if (this.ccA < 12)
    {
      this.cjQ.getMainMatrix().postScale(this.ccB, this.ccB, c.d(this.cjQ).centerX() + this.cjU, c.d(this.cjQ).centerY() + this.cjW);
      c.e(this.cjQ).postScale(this.ccB, this.ccB, c.d(this.cjQ).centerX() + this.cjU, c.d(this.cjQ).centerY() + this.cjW);
      this.ccA += 1;
    }
    int i = ((Integer)paramValueAnimator.getAnimatedValue("rotation")).intValue();
    int j = ((Integer)paramValueAnimator.getAnimatedValue("deltaX")).intValue();
    int k = ((Integer)paramValueAnimator.getAnimatedValue("deltaY")).intValue();
    this.cjQ.getMainMatrix().postRotate(i - this.cjS, this.cjZ + this.cjU, this.cka + this.cjW);
    c.e(this.cjQ).postRotate(i - this.cjS, this.cjZ + this.cjU, this.cka + this.cjW);
    paramValueAnimator = new RectF();
    paramValueAnimator.set(c.d(this.cjQ));
    c.e(this.cjQ).mapRect(paramValueAnimator);
    this.cjX += j - this.cjT;
    this.cjY += k - this.cjV;
    this.cjU = (this.cjX - paramValueAnimator.centerX());
    this.cjW = (this.cjY - paramValueAnimator.centerY());
    this.cjQ.getMainMatrix().postTranslate(this.cjU, this.cjW);
    c.e(this.cjQ).postTranslate(this.cjU, this.cjW);
    this.cjQ.CP();
    this.cjS = i;
    this.cjT = j;
    this.cjV = k;
    AppMethodBeat.o(116163);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.c.8
 * JD-Core Version:    0.6.2
 */