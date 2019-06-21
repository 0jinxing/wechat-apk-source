package android.support.v7.d.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;

public final class b extends Drawable
{
  private static final float Yg = (float)Math.toRadians(45.0D);
  private float Yh;
  private float Yi;
  private float Yj;
  private float Yk;
  private boolean Yl;
  private boolean Ym;
  private float Yn;
  private float Yo;
  private int Yp;
  private final Paint mPaint;
  private final int mSize;
  private final Path vr;

  public final void T(boolean paramBoolean)
  {
    if (this.Ym != paramBoolean)
    {
      this.Ym = paramBoolean;
      invalidateSelf();
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int i;
    float f1;
    float f2;
    switch (this.Yp)
    {
    case 2:
    default:
      if (a.g(this) == 1)
      {
        i = 1;
        f1 = (float)Math.sqrt(this.Yh * this.Yh * 2.0F);
        f2 = this.Yi;
        float f3 = f2 + (f1 - f2) * this.Yn;
        f2 = this.Yi;
        float f4 = f2 + (this.Yj - f2) * this.Yn;
        float f5 = Math.round(0.0F + (this.Yo - 0.0F) * this.Yn);
        float f6 = 0.0F + (Yg - 0.0F) * this.Yn;
        if (i == 0)
          break label476;
        f2 = 0.0F;
        label152: if (i == 0)
          break label483;
        f1 = 180.0F;
        label160: float f7 = this.Yn;
        float f8 = (float)Math.round(f3 * Math.cos(f6));
        f3 = (float)Math.round(f3 * Math.sin(f6));
        this.vr.rewind();
        f6 = this.Yk + this.mPaint.getStrokeWidth();
        float f9 = f6 + (-this.Yo - f6) * this.Yn;
        f6 = -f4 / 2.0F;
        this.vr.moveTo(f6 + f5, 0.0F);
        this.vr.rLineTo(f4 - f5 * 2.0F, 0.0F);
        this.vr.moveTo(f6, f9);
        this.vr.rLineTo(f8, f3);
        this.vr.moveTo(f6, -f9);
        this.vr.rLineTo(f8, -f3);
        this.vr.close();
        paramCanvas.save();
        f3 = this.mPaint.getStrokeWidth();
        f4 = (int)(localRect.height() - 3.0F * f3 - this.Yk * 2.0F) / 4 * 2;
        f5 = this.Yk;
        paramCanvas.translate(localRect.centerX(), f3 * 1.5F + f5 + f4);
        if (!this.Yl)
          break label494;
        if ((i ^ this.Ym) == 0)
          break label489;
        i = -1;
        label409: paramCanvas.rotate(i * ((f1 - f2) * f7 + f2));
      }
      break;
    case 0:
    case 1:
    case 3:
    }
    while (true)
    {
      paramCanvas.drawPath(this.vr, this.mPaint);
      paramCanvas.restore();
      return;
      i = 0;
      break;
      i = 1;
      break;
      if (a.g(this) == 0)
      {
        i = 1;
        break;
      }
      i = 0;
      break;
      i = 0;
      break;
      label476: f2 = -180.0F;
      break label152;
      label483: f1 = 0.0F;
      break label160;
      label489: i = 1;
      break label409;
      label494: if (i != 0)
        paramCanvas.rotate(180.0F);
    }
  }

  public final int getIntrinsicHeight()
  {
    return this.mSize;
  }

  public final int getIntrinsicWidth()
  {
    return this.mSize;
  }

  public final int getOpacity()
  {
    return -3;
  }

  public final void setAlpha(int paramInt)
  {
    if (paramInt != this.mPaint.getAlpha())
    {
      this.mPaint.setAlpha(paramInt);
      invalidateSelf();
    }
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mPaint.setColorFilter(paramColorFilter);
    invalidateSelf();
  }

  public final void setProgress(float paramFloat)
  {
    if (this.Yn != paramFloat)
    {
      this.Yn = paramFloat;
      invalidateSelf();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.d.a.b
 * JD-Core Version:    0.6.2
 */