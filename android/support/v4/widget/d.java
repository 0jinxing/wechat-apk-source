package android.support.v4.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.f.l;
import android.support.v4.view.b.b;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public final class d extends Drawable
  implements Animatable
{
  private static final Interpolator Pb = new b();
  private static final int[] Pc = { -16777216 };
  private static final Interpolator mf = new LinearInterpolator();
  private Animator Cz;
  final d.a Pd;
  private float Pe;
  private boolean Pf;
  private Resources mResources;
  private float nR;

  public d(Context paramContext)
  {
    this.mResources = ((Context)l.checkNotNull(paramContext)).getResources();
    this.Pd = new d.a();
    this.Pd.setColors(Pc);
    this.Pd.setStrokeWidth(2.5F);
    invalidateSelf();
    paramContext = this.Pd;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    localValueAnimator.addUpdateListener(new d.1(this, paramContext));
    localValueAnimator.setRepeatCount(-1);
    localValueAnimator.setRepeatMode(1);
    localValueAnimator.setInterpolator(mf);
    localValueAnimator.addListener(new d.2(this, paramContext));
    this.Cz = localValueAnimator;
  }

  private static void a(float paramFloat, d.a parama)
  {
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    if (paramFloat > 0.75F)
    {
      paramFloat = (paramFloat - 0.75F) / 0.25F;
      i = parama.eA();
      j = parama.Pn[parama.ez()];
      k = i >> 24 & 0xFF;
      m = i >> 16 & 0xFF;
      n = i >> 8 & 0xFF;
      i1 = i & 0xFF;
      i = (int)(((j >> 24 & 0xFF) - k) * paramFloat);
      i2 = (int)(((j >> 16 & 0xFF) - m) * paramFloat);
      i3 = (int)(((j >> 8 & 0xFF) - n) * paramFloat);
    }
    for (parama.HD = ((int)(paramFloat * ((j & 0xFF) - i1)) + i1 | (k + i << 24 | m + i2 << 16 | i3 + n << 8)); ; parama.HD = parama.eA())
      return;
  }

  private void d(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    d.a locala = this.Pd;
    float f = this.mResources.getDisplayMetrics().density;
    locala.setStrokeWidth(paramFloat2 * f);
    locala.Pv = (paramFloat1 * f);
    locala.aR(0);
    locala.Pw = ((int)(paramFloat3 * f));
    locala.Px = ((int)(f * paramFloat4));
  }

  public final void B(float paramFloat)
  {
    d.a locala = this.Pd;
    if (paramFloat != locala.Pu)
      locala.Pu = paramFloat;
    invalidateSelf();
  }

  public final void C(float paramFloat)
  {
    this.Pd.Pl = 0.0F;
    this.Pd.Pm = paramFloat;
    invalidateSelf();
  }

  public final void D(float paramFloat)
  {
    this.Pd.nR = paramFloat;
    invalidateSelf();
  }

  public final void H(boolean paramBoolean)
  {
    this.Pd.I(paramBoolean);
    invalidateSelf();
  }

  public final void aQ(int paramInt)
  {
    if (paramInt == 0)
      d(11.0F, 3.0F, 12.0F, 6.0F);
    while (true)
    {
      invalidateSelf();
      return;
      d(7.5F, 2.5F, 10.0F, 5.0F);
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    paramCanvas.save();
    paramCanvas.rotate(this.nR, localRect.exactCenterX(), localRect.exactCenterY());
    d.a locala = this.Pd;
    RectF localRectF = locala.Pi;
    float f1 = locala.Pv + locala.uW / 2.0F;
    if (locala.Pv <= 0.0F)
      f1 = Math.min(localRect.width(), localRect.height()) / 2.0F - Math.max(locala.Pw * locala.Pu / 2.0F, locala.uW / 2.0F);
    localRectF.set(localRect.centerX() - f1, localRect.centerY() - f1, localRect.centerX() + f1, f1 + localRect.centerY());
    f1 = (locala.Pl + locala.nR) * 360.0F;
    float f2 = (locala.Pm + locala.nR) * 360.0F - f1;
    locala.mPaint.setColor(locala.HD);
    locala.mPaint.setAlpha(locala.mAlpha);
    float f3 = locala.uW / 2.0F;
    localRectF.inset(f3, f3);
    paramCanvas.drawCircle(localRectF.centerX(), localRectF.centerY(), localRectF.width() / 2.0F, locala.Pk);
    localRectF.inset(-f3, -f3);
    paramCanvas.drawArc(localRectF, f1, f2, false, locala.mPaint);
    if (locala.Ps)
    {
      if (locala.Pt != null)
        break label483;
      locala.Pt = new Path();
      locala.Pt.setFillType(Path.FillType.EVEN_ODD);
    }
    while (true)
    {
      f3 = Math.min(localRectF.width(), localRectF.height()) / 2.0F;
      float f4 = locala.Pw * locala.Pu / 2.0F;
      locala.Pt.moveTo(0.0F, 0.0F);
      locala.Pt.lineTo(locala.Pw * locala.Pu, 0.0F);
      locala.Pt.lineTo(locala.Pw * locala.Pu / 2.0F, locala.Px * locala.Pu);
      locala.Pt.offset(f3 + localRectF.centerX() - f4, localRectF.centerY() + locala.uW / 2.0F);
      locala.Pt.close();
      locala.Pj.setColor(locala.HD);
      locala.Pj.setAlpha(locala.mAlpha);
      paramCanvas.save();
      paramCanvas.rotate(f1 + f2, localRectF.centerX(), localRectF.centerY());
      paramCanvas.drawPath(locala.Pt, locala.Pj);
      paramCanvas.restore();
      paramCanvas.restore();
      return;
      label483: locala.Pt.reset();
    }
  }

  public final int getAlpha()
  {
    return this.Pd.mAlpha;
  }

  public final int getOpacity()
  {
    return -3;
  }

  public final boolean isRunning()
  {
    return this.Cz.isRunning();
  }

  public final void setAlpha(int paramInt)
  {
    this.Pd.mAlpha = paramInt;
    invalidateSelf();
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.Pd.mPaint.setColorFilter(paramColorFilter);
    invalidateSelf();
  }

  public final void start()
  {
    this.Cz.cancel();
    this.Pd.eB();
    if (this.Pd.Pm != this.Pd.Pl)
    {
      this.Pf = true;
      this.Cz.setDuration(666L);
      this.Cz.start();
    }
    while (true)
    {
      return;
      this.Pd.aR(0);
      this.Pd.eC();
      this.Cz.setDuration(1332L);
      this.Cz.start();
    }
  }

  public final void stop()
  {
    this.Cz.cancel();
    this.nR = 0.0F;
    this.Pd.I(false);
    this.Pd.aR(0);
    this.Pd.eC();
    invalidateSelf();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.d
 * JD-Core Version:    0.6.2
 */