package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

final class ar extends Drawable
{
  static ar.a aqk;
  private static final double rb = Math.cos(Math.toRadians(45.0D));
  ColorStateList aqi;
  private final int aqj;
  private final RectF aql;
  private Paint mPaint;
  private Paint rc;
  private Paint rd;
  float rf;
  private Path rg;
  float ri;
  private float rj;
  float rk;
  boolean rl = true;
  private final int rm;
  private final int ro;
  private boolean rp = true;
  private boolean rq = false;

  ar(Resources paramResources, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.rm = paramResources.getColor(2131689858);
    this.ro = paramResources.getColor(2131689857);
    this.aqj = paramResources.getDimensionPixelSize(2131428198);
    this.mPaint = new Paint(5);
    e(paramColorStateList);
    this.rc = new Paint(5);
    this.rc.setStyle(Paint.Style.FILL);
    this.rf = ((int)(0.5F + paramFloat1));
    this.aql = new RectF();
    this.rd = new Paint(this.rc);
    this.rd.setAntiAlias(false);
    p(paramFloat2, paramFloat3);
  }

  static float c(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean);
    for (paramFloat1 = (float)(1.5F * paramFloat1 + (1.0D - rb) * paramFloat2); ; paramFloat1 = 1.5F * paramFloat1)
      return paramFloat1;
  }

  static float d(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = paramFloat1;
    if (paramBoolean)
      f = (float)(paramFloat1 + (1.0D - rb) * paramFloat2);
    return f;
  }

  private static int n(float paramFloat)
  {
    int i = (int)(0.5F + paramFloat);
    int j = i;
    if (i % 2 == 1)
      j = i - 1;
    return j;
  }

  final void ap(boolean paramBoolean)
  {
    this.rp = paramBoolean;
    invalidateSelf();
  }

  public final void draw(Canvas paramCanvas)
  {
    int i = 1;
    float f1;
    float f2;
    float f3;
    int j;
    int k;
    float f4;
    if (this.rl)
    {
      Object localObject1 = getBounds();
      f1 = this.ri * 1.5F;
      this.aql.set(((Rect)localObject1).left + this.ri, ((Rect)localObject1).top + f1, ((Rect)localObject1).right - this.ri, ((Rect)localObject1).bottom - f1);
      Object localObject2 = new RectF(-this.rf, -this.rf, this.rf, this.rf);
      localObject1 = new RectF((RectF)localObject2);
      ((RectF)localObject1).inset(-this.rj, -this.rj);
      if (this.rg == null)
      {
        this.rg = new Path();
        this.rg.setFillType(Path.FillType.EVEN_ODD);
        this.rg.moveTo(-this.rf, 0.0F);
        this.rg.rLineTo(-this.rj, 0.0F);
        this.rg.arcTo((RectF)localObject1, 180.0F, 90.0F, false);
        this.rg.arcTo((RectF)localObject2, 270.0F, -90.0F, false);
        this.rg.close();
        f2 = this.rf / (this.rf + this.rj);
        localObject1 = this.rc;
        f3 = this.rf;
        f1 = this.rj;
        j = this.rm;
        k = this.rm;
        int m = this.ro;
        localObject2 = Shader.TileMode.CLAMP;
        ((Paint)localObject1).setShader(new RadialGradient(0.0F, 0.0F, f3 + f1, new int[] { j, k, m }, new float[] { 0.0F, f2, 1.0F }, (Shader.TileMode)localObject2));
        localObject2 = this.rd;
        f2 = -this.rf;
        f4 = this.rj;
        f1 = -this.rf;
        f3 = this.rj;
        m = this.rm;
        j = this.rm;
        k = this.ro;
        localObject1 = Shader.TileMode.CLAMP;
        ((Paint)localObject2).setShader(new LinearGradient(0.0F, f2 + f4, 0.0F, f1 - f3, new int[] { m, j, k }, new float[] { 0.0F, 0.5F, 1.0F }, (Shader.TileMode)localObject1));
        this.rd.setAntiAlias(false);
        this.rl = false;
      }
    }
    else
    {
      paramCanvas.translate(0.0F, this.rk / 2.0F);
      f3 = -this.rf - this.rj;
      f2 = this.rf + this.aqj + this.rk / 2.0F;
      if (this.aql.width() - 2.0F * f2 <= 0.0F)
        break label919;
      k = 1;
      label505: if (this.aql.height() - 2.0F * f2 <= 0.0F)
        break label925;
    }
    while (true)
    {
      j = paramCanvas.save();
      paramCanvas.translate(this.aql.left + f2, this.aql.top + f2);
      paramCanvas.drawPath(this.rg, this.rc);
      if (k != 0)
        paramCanvas.drawRect(0.0F, f3, this.aql.width() - 2.0F * f2, -this.rf, this.rd);
      paramCanvas.restoreToCount(j);
      j = paramCanvas.save();
      paramCanvas.translate(this.aql.right - f2, this.aql.bottom - f2);
      paramCanvas.rotate(180.0F);
      paramCanvas.drawPath(this.rg, this.rc);
      if (k != 0)
      {
        f4 = this.aql.width();
        f1 = -this.rf;
        paramCanvas.drawRect(0.0F, f3, f4 - 2.0F * f2, this.rj + f1, this.rd);
      }
      paramCanvas.restoreToCount(j);
      k = paramCanvas.save();
      paramCanvas.translate(this.aql.left + f2, this.aql.bottom - f2);
      paramCanvas.rotate(270.0F);
      paramCanvas.drawPath(this.rg, this.rc);
      if (i != 0)
        paramCanvas.drawRect(0.0F, f3, this.aql.height() - 2.0F * f2, -this.rf, this.rd);
      paramCanvas.restoreToCount(k);
      k = paramCanvas.save();
      paramCanvas.translate(this.aql.right - f2, this.aql.top + f2);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawPath(this.rg, this.rc);
      if (i != 0)
        paramCanvas.drawRect(0.0F, f3, this.aql.height() - 2.0F * f2, -this.rf, this.rd);
      paramCanvas.restoreToCount(k);
      paramCanvas.translate(0.0F, -this.rk / 2.0F);
      aqk.a(paramCanvas, this.aql, this.rf, this.mPaint);
      return;
      this.rg.reset();
      break;
      label919: k = 0;
      break label505;
      label925: i = 0;
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

  public final boolean getPadding(Rect paramRect)
  {
    int i = (int)Math.ceil(c(this.ri, this.rf, this.rp));
    int j = (int)Math.ceil(d(this.ri, this.rf, this.rp));
    paramRect.set(j, i, j, i);
    return true;
  }

  public final boolean isStateful()
  {
    if (((this.aqi != null) && (this.aqi.isStateful())) || (super.isStateful()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final float ky()
  {
    return Math.max(this.ri, this.rf + this.aqj + this.ri / 2.0F) * 2.0F + (this.ri + this.aqj) * 2.0F;
  }

  final float kz()
  {
    return Math.max(this.ri, this.rf + this.aqj + this.ri * 1.5F / 2.0F) * 2.0F + (this.ri * 1.5F + this.aqj) * 2.0F;
  }

  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.rl = true;
  }

  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    boolean bool = true;
    int i = this.aqi.getColorForState(paramArrayOfInt, this.aqi.getDefaultColor());
    if (this.mPaint.getColor() == i)
      bool = false;
    while (true)
    {
      return bool;
      this.mPaint.setColor(i);
      this.rl = true;
      invalidateSelf();
    }
  }

  final void p(float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 < 0.0F)
      throw new IllegalArgumentException("Invalid shadow size " + paramFloat1 + ". Must be >= 0");
    if (paramFloat2 < 0.0F)
      throw new IllegalArgumentException("Invalid max shadow size " + paramFloat2 + ". Must be >= 0");
    float f = n(paramFloat1);
    paramFloat2 = n(paramFloat2);
    paramFloat1 = f;
    if (f > paramFloat2)
    {
      if (!this.rq)
        this.rq = true;
      paramFloat1 = paramFloat2;
    }
    if ((this.rk == paramFloat1) && (this.ri == paramFloat2));
    while (true)
    {
      return;
      this.rk = paramFloat1;
      this.ri = paramFloat2;
      this.rj = ((int)(paramFloat1 * 1.5F + this.aqj + 0.5F));
      this.rl = true;
      invalidateSelf();
    }
  }

  public final void setAlpha(int paramInt)
  {
    this.mPaint.setAlpha(paramInt);
    this.rc.setAlpha(paramInt);
    this.rd.setAlpha(paramInt);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mPaint.setColorFilter(paramColorFilter);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ar
 * JD-Core Version:    0.6.2
 */