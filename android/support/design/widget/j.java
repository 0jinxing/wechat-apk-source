package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
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
import android.support.v4.content.b;
import android.support.v7.d.a.a;

final class j extends a
{
  static final double rb = Math.cos(Math.toRadians(45.0D));
  float nR;
  final Paint rc;
  final Paint rd;
  final RectF re;
  float rf;
  Path rg;
  float rh;
  float ri;
  float rj;
  float rk;
  private boolean rl = true;
  private final int rm;
  private final int rn;
  private final int ro;
  boolean rp = true;
  private boolean rq = false;

  public j(Context paramContext, Drawable paramDrawable, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    super(paramDrawable);
    this.rm = b.i(paramContext, 2131689931);
    this.rn = b.i(paramContext, 2131689930);
    this.ro = b.i(paramContext, 2131689929);
    this.rc = new Paint(5);
    this.rc.setStyle(Paint.Style.FILL);
    this.rf = Math.round(paramFloat1);
    this.re = new RectF();
    this.rd = new Paint(this.rc);
    this.rd.setAntiAlias(false);
    p(paramFloat2, paramFloat3);
  }

  public static float c(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean);
    for (paramFloat1 = (float)(1.5F * paramFloat1 + (1.0D - rb) * paramFloat2); ; paramFloat1 = 1.5F * paramFloat1)
      return paramFloat1;
  }

  public static float d(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = paramFloat1;
    if (paramBoolean)
      f = (float)(paramFloat1 + (1.0D - rb) * paramFloat2);
    return f;
  }

  private static int n(float paramFloat)
  {
    int i = Math.round(paramFloat);
    int j = i;
    if (i % 2 == 1)
      j = i - 1;
    return j;
  }

  public final void draw(Canvas paramCanvas)
  {
    float f1;
    float f2;
    float f3;
    int j;
    int k;
    if (this.rl)
    {
      Object localObject = getBounds();
      f1 = this.ri * 1.5F;
      this.re.set(((Rect)localObject).left + this.ri, ((Rect)localObject).top + f1, ((Rect)localObject).right - this.ri, ((Rect)localObject).bottom - f1);
      this.mDrawable.setBounds((int)this.re.left, (int)this.re.top, (int)this.re.right, (int)this.re.bottom);
      RectF localRectF = new RectF(-this.rf, -this.rf, this.rf, this.rf);
      localObject = new RectF(localRectF);
      ((RectF)localObject).inset(-this.rj, -this.rj);
      if (this.rg == null)
      {
        this.rg = new Path();
        this.rg.setFillType(Path.FillType.EVEN_ODD);
        this.rg.moveTo(-this.rf, 0.0F);
        this.rg.rLineTo(-this.rj, 0.0F);
        this.rg.arcTo((RectF)localObject, 180.0F, 90.0F, false);
        this.rg.arcTo(localRectF, 270.0F, -90.0F, false);
        this.rg.close();
        f2 = -((RectF)localObject).top;
        if (f2 > 0.0F)
        {
          f1 = this.rf / f2;
          f3 = (1.0F - f1) / 2.0F;
          localPaint = this.rc;
          i = this.rm;
          j = this.rn;
          k = this.ro;
          Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
          localPaint.setShader(new RadialGradient(0.0F, 0.0F, f2, new int[] { 0, i, j, k }, new float[] { 0.0F, f1, f1 + f3, 1.0F }, localTileMode));
        }
        Paint localPaint = this.rd;
        f3 = localRectF.top;
        f1 = ((RectF)localObject).top;
        i = this.rm;
        k = this.rn;
        j = this.ro;
        localObject = Shader.TileMode.CLAMP;
        localPaint.setShader(new LinearGradient(0.0F, f3, 0.0F, f1, new int[] { i, k, j }, new float[] { 0.0F, 0.5F, 1.0F }, (Shader.TileMode)localObject));
        this.rd.setAntiAlias(false);
        this.rl = false;
      }
    }
    else
    {
      k = paramCanvas.save();
      paramCanvas.rotate(this.nR, this.re.centerX(), this.re.centerY());
      f3 = -this.rf - this.rj;
      f1 = this.rf;
      if (this.re.width() - 2.0F * f1 <= 0.0F)
        break label1059;
      j = 1;
      label530: if (this.re.height() - 2.0F * f1 <= 0.0F)
        break label1065;
    }
    label1059: label1065: for (int i = 1; ; i = 0)
    {
      float f4 = this.rk;
      float f5 = this.rk;
      f2 = this.rk;
      float f6 = this.rk;
      float f7 = this.rk;
      float f8 = this.rk;
      f2 = f1 / (f2 - f6 * 0.5F + f1);
      f5 = f1 / (f4 - f5 * 0.25F + f1);
      f4 = f1 / (f1 + (f7 - f8 * 1.0F));
      int m = paramCanvas.save();
      paramCanvas.translate(this.re.left + f1, this.re.top + f1);
      paramCanvas.scale(f2, f5);
      paramCanvas.drawPath(this.rg, this.rc);
      if (j != 0)
      {
        paramCanvas.scale(1.0F / f2, 1.0F);
        paramCanvas.drawRect(0.0F, f3, this.re.width() - 2.0F * f1, -this.rf, this.rd);
      }
      paramCanvas.restoreToCount(m);
      m = paramCanvas.save();
      paramCanvas.translate(this.re.right - f1, this.re.bottom - f1);
      paramCanvas.scale(f2, f4);
      paramCanvas.rotate(180.0F);
      paramCanvas.drawPath(this.rg, this.rc);
      if (j != 0)
      {
        paramCanvas.scale(1.0F / f2, 1.0F);
        f8 = this.re.width();
        f7 = -this.rf;
        paramCanvas.drawRect(0.0F, f3, f8 - 2.0F * f1, this.rj + f7, this.rd);
      }
      paramCanvas.restoreToCount(m);
      j = paramCanvas.save();
      paramCanvas.translate(this.re.left + f1, this.re.bottom - f1);
      paramCanvas.scale(f2, f4);
      paramCanvas.rotate(270.0F);
      paramCanvas.drawPath(this.rg, this.rc);
      if (i != 0)
      {
        paramCanvas.scale(1.0F / f4, 1.0F);
        paramCanvas.drawRect(0.0F, f3, this.re.height() - 2.0F * f1, -this.rf, this.rd);
      }
      paramCanvas.restoreToCount(j);
      j = paramCanvas.save();
      paramCanvas.translate(this.re.right - f1, this.re.top + f1);
      paramCanvas.scale(f2, f5);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawPath(this.rg, this.rc);
      if (i != 0)
      {
        paramCanvas.scale(1.0F / f5, 1.0F);
        paramCanvas.drawRect(0.0F, f3, this.re.height() - 2.0F * f1, -this.rf, this.rd);
      }
      paramCanvas.restoreToCount(j);
      paramCanvas.restoreToCount(k);
      super.draw(paramCanvas);
      return;
      this.rg.reset();
      break;
      j = 0;
      break label530;
    }
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

  public final void o(float paramFloat)
  {
    p(paramFloat, this.ri);
  }

  public final void onBoundsChange(Rect paramRect)
  {
    this.rl = true;
  }

  final void p(float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 < 0.0F) || (paramFloat2 < 0.0F))
      throw new IllegalArgumentException("invalid shadow size");
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
      this.rj = Math.round(paramFloat1 * 1.5F);
      this.rh = paramFloat2;
      this.rl = true;
      invalidateSelf();
    }
  }

  public final void setAlpha(int paramInt)
  {
    super.setAlpha(paramInt);
    this.rc.setAlpha(paramInt);
    this.rd.setAlpha(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.design.widget.j
 * JD-Core Version:    0.6.2
 */