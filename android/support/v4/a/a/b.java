package android.support.v4.a.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public abstract class b extends Drawable
{
  public boolean HA;
  private int HB;
  private int HC;
  private int Ht = 160;
  private int Hu = 119;
  public final BitmapShader Hv;
  private final Matrix Hw = new Matrix();
  final Rect Hx = new Rect();
  private final RectF Hy = new RectF();
  private boolean Hz = true;
  public final Bitmap mBitmap;
  public final Paint mPaint = new Paint(3);
  public float rf;

  b(Resources paramResources, Bitmap paramBitmap)
  {
    if (paramResources != null)
      this.Ht = paramResources.getDisplayMetrics().densityDpi;
    this.mBitmap = paramBitmap;
    if (this.mBitmap != null)
    {
      this.HB = this.mBitmap.getScaledWidth(this.Ht);
      this.HC = this.mBitmap.getScaledHeight(this.Ht);
      paramBitmap = this.mBitmap;
      paramResources = Shader.TileMode.CLAMP;
    }
    for (this.Hv = new BitmapShader(paramBitmap, paramResources, paramResources); ; this.Hv = null)
    {
      return;
      this.HC = -1;
      this.HB = -1;
    }
  }

  private void dB()
  {
    this.rf = (Math.min(this.HC, this.HB) / 2);
  }

  public static boolean s(float paramFloat)
  {
    if (paramFloat > 0.05F);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  void a(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2)
  {
    throw new UnsupportedOperationException();
  }

  public final void dA()
  {
    this.HA = true;
    this.Hz = true;
    dB();
    this.mPaint.setShader(this.Hv);
    invalidateSelf();
  }

  public void draw(Canvas paramCanvas)
  {
    Bitmap localBitmap = this.mBitmap;
    if (localBitmap == null);
    while (true)
    {
      return;
      dz();
      if (this.mPaint.getShader() == null)
        paramCanvas.drawBitmap(localBitmap, null, this.Hx, this.mPaint);
      else
        paramCanvas.drawRoundRect(this.Hy, this.rf, this.rf, this.mPaint);
    }
  }

  final void dz()
  {
    if (this.Hz)
    {
      if (!this.HA)
        break label220;
      int i = Math.min(this.HB, this.HC);
      a(this.Hu, i, i, getBounds(), this.Hx);
      int j = Math.min(this.Hx.width(), this.Hx.height());
      int k = Math.max(0, (this.Hx.width() - j) / 2);
      i = Math.max(0, (this.Hx.height() - j) / 2);
      this.Hx.inset(k, i);
      this.rf = (j * 0.5F);
    }
    while (true)
    {
      this.Hy.set(this.Hx);
      if (this.Hv != null)
      {
        this.Hw.setTranslate(this.Hy.left, this.Hy.top);
        this.Hw.preScale(this.Hy.width() / this.mBitmap.getWidth(), this.Hy.height() / this.mBitmap.getHeight());
        this.Hv.setLocalMatrix(this.Hw);
        this.mPaint.setShader(this.Hv);
      }
      this.Hz = false;
      return;
      label220: a(this.Hu, this.HB, this.HC, getBounds(), this.Hx);
    }
  }

  public int getAlpha()
  {
    return this.mPaint.getAlpha();
  }

  public ColorFilter getColorFilter()
  {
    return this.mPaint.getColorFilter();
  }

  public int getIntrinsicHeight()
  {
    return this.HC;
  }

  public int getIntrinsicWidth()
  {
    return this.HB;
  }

  public int getOpacity()
  {
    int i = -3;
    int j = i;
    if (this.Hu == 119)
    {
      if (!this.HA)
        break label25;
      j = i;
    }
    while (true)
    {
      return j;
      label25: Bitmap localBitmap = this.mBitmap;
      j = i;
      if (localBitmap != null)
      {
        j = i;
        if (!localBitmap.hasAlpha())
        {
          j = i;
          if (this.mPaint.getAlpha() >= 255)
          {
            j = i;
            if (!s(this.rf))
              j = -1;
          }
        }
      }
    }
  }

  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    if (this.HA)
      dB();
    this.Hz = true;
  }

  public void setAlpha(int paramInt)
  {
    if (paramInt != this.mPaint.getAlpha())
    {
      this.mPaint.setAlpha(paramInt);
      invalidateSelf();
    }
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mPaint.setColorFilter(paramColorFilter);
    invalidateSelf();
  }

  public void setDither(boolean paramBoolean)
  {
    this.mPaint.setDither(paramBoolean);
    invalidateSelf();
  }

  public void setFilterBitmap(boolean paramBoolean)
  {
    this.mPaint.setFilterBitmap(paramBoolean);
    invalidateSelf();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.a.a.b
 * JD-Core Version:    0.6.2
 */