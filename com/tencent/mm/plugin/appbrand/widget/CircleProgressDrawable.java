package com.tencent.mm.plugin.appbrand.widget;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.Iterator;

public final class CircleProgressDrawable extends Drawable
{
  private static final RectF bRS;
  private static final RectF bRT;
  private int bRU;
  private int bRV;
  private boolean bRW;
  private int bRX;
  public CircleProgressDrawable.RingPathTransform iTY;
  public CircleProgressDrawable.RingRotation iTZ;
  private Paint mPaint;
  public ArrayList<Animator> uC;
  private int uV;

  static
  {
    AppMethodBeat.i(77393);
    bRS = new RectF(-21.0F, -21.0F, 21.0F, 21.0F);
    bRT = new RectF(-19.0F, -19.0F, 19.0F, 19.0F);
    AppMethodBeat.o(77393);
  }

  public CircleProgressDrawable()
  {
    AppMethodBeat.i(77388);
    this.bRV = 4;
    this.uV = -16777216;
    this.bRW = false;
    this.bRX = 0;
    this.iTY = new CircleProgressDrawable.RingPathTransform((byte)0);
    this.iTZ = new CircleProgressDrawable.RingRotation((byte)0);
    this.bRU = Math.round(ah.getResources().getDisplayMetrics().density * 48.0F);
    this.uC = new ArrayList();
    AppMethodBeat.o(77388);
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(77392);
    Object localObject = getBounds();
    if ((((Rect)localObject).width() == 0) || (((Rect)localObject).height() == 0))
      AppMethodBeat.o(77392);
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
        j = paramCanvas.save();
        ((Paint)localObject).setColor(this.bRX);
        paramCanvas.drawArc(bRT, 0.0F, 360.0F, false, (Paint)localObject);
        paramCanvas.restoreToCount(j);
      }
      j = paramCanvas.save();
      ((Paint)localObject).setColor(this.uV);
      paramCanvas.rotate(CircleProgressDrawable.RingRotation.a(this.iTZ));
      float f1 = this.iTY.vd;
      float f2 = this.iTY.vb;
      float f3 = this.iTY.vc;
      float f4 = this.iTY.vb;
      paramCanvas.drawArc(bRT, -90.0F + (f1 + f2) * 360.0F, 360.0F * (f3 - f4), false, (Paint)localObject);
      paramCanvas.restoreToCount(j);
      paramCanvas.restoreToCount(i);
      AppMethodBeat.o(77392);
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

  public final void setStrokeColor(int paramInt)
  {
    AppMethodBeat.i(77389);
    this.uV = paramInt;
    invalidateSelf();
    AppMethodBeat.o(77389);
  }

  public final void start()
  {
    AppMethodBeat.i(77390);
    Iterator localIterator = this.uC.iterator();
    int i;
    while (localIterator.hasNext())
      if (((Animator)localIterator.next()).isStarted())
      {
        i = 1;
        if (i == 0)
          break label54;
        AppMethodBeat.o(77390);
      }
    while (true)
    {
      return;
      i = 0;
      break;
      label54: localIterator = this.uC.iterator();
      while (localIterator.hasNext())
        ((Animator)localIterator.next()).start();
      invalidateSelf();
      AppMethodBeat.o(77390);
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(77391);
    Iterator localIterator = this.uC.iterator();
    while (localIterator.hasNext())
      ((Animator)localIterator.next()).end();
    AppMethodBeat.o(77391);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable
 * JD-Core Version:    0.6.2
 */