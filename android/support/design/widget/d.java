package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v4.a.b;

class d extends Drawable
{
  final Paint mPaint = new Paint(1);
  final Rect mRect = new Rect();
  final RectF nI = new RectF();
  float nJ;
  private int nK;
  private int nL;
  private int nM;
  private int nN;
  private ColorStateList nO;
  private int nP;
  private boolean nQ = true;
  float nR;

  public d()
  {
    this.mPaint.setStyle(Paint.Style.STROKE);
  }

  final void a(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
      this.nP = paramColorStateList.getColorForState(getState(), this.nP);
    this.nO = paramColorStateList;
    this.nQ = true;
    invalidateSelf();
  }

  final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.nK = paramInt1;
    this.nL = paramInt2;
    this.nM = paramInt3;
    this.nN = paramInt4;
  }

  public void draw(Canvas paramCanvas)
  {
    if (this.nQ)
    {
      localObject1 = this.mPaint;
      Object localObject2 = this.mRect;
      copyBounds((Rect)localObject2);
      float f1 = this.nJ / ((Rect)localObject2).height();
      int i = b.s(this.nK, this.nP);
      int j = b.s(this.nL, this.nP);
      int k = b.s(b.u(this.nL, 0), this.nP);
      int m = b.s(b.u(this.nN, 0), this.nP);
      int n = b.s(this.nN, this.nP);
      int i1 = b.s(this.nM, this.nP);
      f2 = ((Rect)localObject2).top;
      float f3 = ((Rect)localObject2).bottom;
      localObject2 = Shader.TileMode.CLAMP;
      ((Paint)localObject1).setShader(new LinearGradient(0.0F, f2, 0.0F, f3, new int[] { i, j, k, m, n, i1 }, new float[] { 0.0F, f1, 0.5F, 0.5F, 1.0F - f1, 1.0F }, (Shader.TileMode)localObject2));
      this.nQ = false;
    }
    float f2 = this.mPaint.getStrokeWidth() / 2.0F;
    Object localObject1 = this.nI;
    copyBounds(this.mRect);
    ((RectF)localObject1).set(this.mRect);
    ((RectF)localObject1).left += f2;
    ((RectF)localObject1).top += f2;
    ((RectF)localObject1).right -= f2;
    ((RectF)localObject1).bottom -= f2;
    paramCanvas.save();
    paramCanvas.rotate(this.nR, ((RectF)localObject1).centerX(), ((RectF)localObject1).centerY());
    paramCanvas.drawOval((RectF)localObject1, this.mPaint);
    paramCanvas.restore();
  }

  public int getOpacity()
  {
    if (this.nJ > 0.0F);
    for (int i = -3; ; i = -2)
      return i;
  }

  public boolean getPadding(Rect paramRect)
  {
    int i = Math.round(this.nJ);
    paramRect.set(i, i, i, i);
    return true;
  }

  public boolean isStateful()
  {
    if (((this.nO != null) && (this.nO.isStateful())) || (super.isStateful()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void onBoundsChange(Rect paramRect)
  {
    this.nQ = true;
  }

  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.nO != null)
    {
      int i = this.nO.getColorForState(paramArrayOfInt, this.nP);
      if (i != this.nP)
      {
        this.nQ = true;
        this.nP = i;
      }
    }
    if (this.nQ)
      invalidateSelf();
    return this.nQ;
  }

  public void setAlpha(int paramInt)
  {
    this.mPaint.setAlpha(paramInt);
    invalidateSelf();
  }

  final void setBorderWidth(float paramFloat)
  {
    if (this.nJ != paramFloat)
    {
      this.nJ = paramFloat;
      this.mPaint.setStrokeWidth(1.3333F * paramFloat);
      this.nQ = true;
      invalidateSelf();
    }
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mPaint.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.design.widget.d
 * JD-Core Version:    0.6.2
 */