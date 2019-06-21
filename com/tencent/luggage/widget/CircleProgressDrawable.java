package com.tencent.luggage.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class CircleProgressDrawable extends Drawable
{
  private static final RectF bRS;
  private static final RectF bRT;
  private int bRU;
  private int bRV;
  private boolean bRW;
  private int bRX;
  private CircleProgressDrawable.RingPathTransform bRY;
  private CircleProgressDrawable.RingRotation bRZ;
  private Paint mPaint;
  private int uV;

  static
  {
    AppMethodBeat.i(90949);
    bRS = new RectF(-21.0F, -21.0F, 21.0F, 21.0F);
    bRT = new RectF(-19.0F, -19.0F, 19.0F, 19.0F);
    AppMethodBeat.o(90949);
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(90948);
    Object localObject = getBounds();
    if ((((Rect)localObject).width() == 0) || (((Rect)localObject).height() == 0))
      AppMethodBeat.o(90948);
    while (true)
    {
      return;
      if (this.mPaint == null)
      {
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(this.bRV);
        this.mPaint.setStrokeCap(Paint.Cap.SQUARE);
        this.mPaint.setStrokeJoin(Paint.Join.MITER);
      }
      int i = paramCanvas.save();
      paramCanvas.translate(((Rect)localObject).left, ((Rect)localObject).top);
      int j = ((Rect)localObject).width();
      int k = ((Rect)localObject).height();
      localObject = this.mPaint;
      paramCanvas.scale(j / bRS.width(), k / bRS.height());
      paramCanvas.translate(bRS.width() / 2.0F, bRS.height() / 2.0F);
      if (this.bRW)
      {
        k = paramCanvas.save();
        ((Paint)localObject).setColor(this.bRX);
        paramCanvas.drawArc(bRT, 0.0F, 360.0F, false, (Paint)localObject);
        paramCanvas.restoreToCount(k);
      }
      k = paramCanvas.save();
      ((Paint)localObject).setColor(this.uV);
      paramCanvas.rotate(CircleProgressDrawable.RingRotation.a(this.bRZ));
      float f1 = this.bRY.vd;
      float f2 = this.bRY.vb;
      float f3 = this.bRY.vc;
      float f4 = this.bRY.vb;
      paramCanvas.drawArc(bRT, -90.0F + (f1 + f2) * 360.0F, 360.0F * (f3 - f4), false, (Paint)localObject);
      paramCanvas.restoreToCount(k);
      paramCanvas.restoreToCount(i);
      AppMethodBeat.o(90948);
    }
  }

  public final int getIntrinsicHeight()
  {
    return this.bRU;
  }

  public final int getIntrinsicWidth()
  {
    return this.bRU;
  }

  public final int getOpacity()
  {
    return -3;
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.widget.CircleProgressDrawable
 * JD-Core Version:    0.6.2
 */