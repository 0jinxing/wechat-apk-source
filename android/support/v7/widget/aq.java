package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

final class aq extends Drawable
{
  float aqc;
  private final RectF aqd;
  private final Rect aqe;
  float aqf;
  private boolean aqg = false;
  private boolean aqh = true;
  ColorStateList aqi;
  private final Paint mPaint;
  private PorterDuffColorFilter uM;
  private ColorStateList vH;
  private PorterDuff.Mode vI = PorterDuff.Mode.SRC_IN;

  aq(ColorStateList paramColorStateList, float paramFloat)
  {
    this.aqc = paramFloat;
    this.mPaint = new Paint(5);
    e(paramColorStateList);
    this.aqd = new RectF();
    this.aqe = new Rect();
  }

  private PorterDuffColorFilter b(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList == null) || (paramMode == null));
    for (paramColorStateList = null; ; paramColorStateList = new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode))
      return paramColorStateList;
  }

  final void a(float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramFloat == this.aqf) && (this.aqg == paramBoolean1) && (this.aqh == paramBoolean2));
    while (true)
    {
      return;
      this.aqf = paramFloat;
      this.aqg = paramBoolean1;
      this.aqh = paramBoolean2;
      h(null);
      invalidateSelf();
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    Paint localPaint = this.mPaint;
    if ((this.uM != null) && (localPaint.getColorFilter() == null))
      localPaint.setColorFilter(this.uM);
    for (int i = 1; ; i = 0)
    {
      paramCanvas.drawRoundRect(this.aqd, this.aqc, this.aqc, localPaint);
      if (i != 0)
        localPaint.setColorFilter(null);
      return;
    }
  }

  final void e(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = paramColorStateList;
    if (paramColorStateList == null)
      localColorStateList = ColorStateList.valueOf(0);
    this.aqi = localColorStateList;
    this.mPaint.setColor(this.aqi.getColorForState(getState(), this.aqi.getDefaultColor()));
  }

  public final int getOpacity()
  {
    return -3;
  }

  public final void getOutline(Outline paramOutline)
  {
    paramOutline.setRoundRect(this.aqe, this.aqc);
  }

  final void h(Rect paramRect)
  {
    Rect localRect = paramRect;
    if (paramRect == null)
      localRect = getBounds();
    this.aqd.set(localRect.left, localRect.top, localRect.right, localRect.bottom);
    this.aqe.set(localRect);
    if (this.aqg)
    {
      float f1 = ar.c(this.aqf, this.aqc, this.aqh);
      float f2 = ar.d(this.aqf, this.aqc, this.aqh);
      this.aqe.inset((int)Math.ceil(f2), (int)Math.ceil(f1));
      this.aqd.set(this.aqe);
    }
  }

  public final boolean isStateful()
  {
    if (((this.vH != null) && (this.vH.isStateful())) || ((this.aqi != null) && (this.aqi.isStateful())) || (super.isStateful()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    h(paramRect);
  }

  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    boolean bool1 = true;
    int i = this.aqi.getColorForState(paramArrayOfInt, this.aqi.getDefaultColor());
    boolean bool2;
    if (i != this.mPaint.getColor())
    {
      bool2 = true;
      if (bool2)
        this.mPaint.setColor(i);
      if ((this.vH == null) || (this.vI == null))
        break label87;
      this.uM = b(this.vH, this.vI);
      bool2 = bool1;
    }
    label87: 
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
    }
  }

  public final void setAlpha(int paramInt)
  {
    this.mPaint.setAlpha(paramInt);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mPaint.setColorFilter(paramColorFilter);
  }

  public final void setTintList(ColorStateList paramColorStateList)
  {
    this.vH = paramColorStateList;
    this.uM = b(this.vH, this.vI);
    invalidateSelf();
  }

  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    this.vI = paramMode;
    this.uM = b(this.vH, this.vI);
    invalidateSelf();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.aq
 * JD-Core Version:    0.6.2
 */