package com.tencent.mm.svg.a;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Gravity;
import android.view.View;
import com.tencent.mm.svg.b.c;
import java.lang.ref.WeakReference;

public abstract class b extends Drawable
{
  protected final Rect Hx = new Rect();
  public long mDuration = 0L;
  protected ColorFilter uN;
  protected int ycT = 0;
  protected boolean ycU = false;
  protected Paint ycV = new Paint();
  protected WeakReference<View> ycW;
  protected int ycX = 0;
  protected int ycY = 0;
  protected int ycZ = 0;
  protected int yda = 0;
  protected float ydb;

  public b(int paramInt1, int paramInt2, int paramInt3)
  {
    this.ycZ = paramInt1;
    this.yda = paramInt2;
    this.ydb = 1.0F;
    this.ycX = this.ycZ;
    this.ycY = this.yda;
    setLevel(10000);
    this.ycT = paramInt3;
  }

  private void dvG()
  {
    View localView = a.w(this);
    eC(localView);
    if (localView != null)
    {
      if (this.uN != null)
        setColorFilter(this.uN);
      a.b(localView, this.ycV);
    }
  }

  protected final void dvE()
  {
    this.Hx.set(0, 0, getIntrinsicWidth(), getIntrinsicHeight());
  }

  protected final void dvF()
  {
    if (this.ycU)
    {
      Rect localRect = getBounds();
      Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), localRect, this.Hx);
    }
    this.ycU = false;
  }

  protected final View dvH()
  {
    try
    {
      Object localObject1 = this.ycW;
      if (localObject1 == null);
      for (localObject1 = null; ; localObject1 = (View)this.ycW.get())
        return localObject1;
    }
    finally
    {
    }
  }

  protected final void eC(View paramView)
  {
    try
    {
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(paramView);
      this.ycW = localWeakReference;
      return;
    }
    finally
    {
      paramView = finally;
    }
    throw paramView;
  }

  public int getIntrinsicHeight()
  {
    return this.ycY;
  }

  public int getIntrinsicWidth()
  {
    return this.ycX;
  }

  public int getOpacity()
  {
    int i = -3;
    View localView = dvH();
    if ((localView != null) && (localView.getAlpha() < 1.0F));
    while (true)
    {
      return i;
      if ((this.ycV == null) || (this.ycV.getAlpha() >= 255))
        i = 0;
    }
  }

  protected final void m(Canvas paramCanvas)
  {
    if (com.tencent.mm.svg.b.b.dvJ())
    {
      int i = this.Hx.height() / 3;
      paramCanvas.save();
      Paint localPaint = new Paint();
      localPaint.setStyle(Paint.Style.FILL);
      localPaint.setColor(-12303292);
      localPaint.setAlpha(127);
      localPaint.setTextSize(i);
      localPaint.setStrokeWidth(1.0F);
      float f = localPaint.measureText("SVG");
      paramCanvas.translate(this.Hx.width() - f, this.Hx.height() * 2 / 3);
      paramCanvas.drawText("SVG", 0.0F, i, localPaint);
      paramCanvas.restore();
    }
  }

  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.ycU = true;
  }

  protected boolean onLevelChange(int paramInt)
  {
    dvG();
    return super.onLevelChange(paramInt);
  }

  @TargetApi(17)
  public void setAlpha(int paramInt)
  {
    this.ycV.setAlpha(paramInt);
    View localView = dvH();
    if ((localView != null) && (Build.VERSION.SDK_INT >= 17));
    try
    {
      localView.setLayerPaint(this.ycV);
      return;
    }
    catch (NoSuchMethodError localNoSuchMethodError)
    {
      while (true)
        c.printErrStackTrace("MicroMsg.SVGDrawable", localNoSuchMethodError, "samsung", new Object[0]);
    }
  }

  @TargetApi(17)
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.ycV.setColorFilter(paramColorFilter);
    View localView = dvH();
    if ((localView != null) && (Build.VERSION.SDK_INT >= 17));
    while (true)
    {
      try
      {
        localView.setLayerPaint(this.ycV);
        return;
      }
      catch (NoSuchMethodError paramColorFilter)
      {
        c.printErrStackTrace("MicroMsg.SVGDrawable", paramColorFilter, "samsung", new Object[0]);
        continue;
      }
      if (localView == null)
        this.uN = paramColorFilter;
    }
  }

  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    dvG();
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.svg.a.b
 * JD-Core Version:    0.6.2
 */