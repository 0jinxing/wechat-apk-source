package com.tencent.mm.view.b;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.b.d;
import com.tencent.mm.b.d.1;
import com.tencent.mm.b.d.2;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends a
{
  private d Ach;
  private PointF Aci;
  private float Acj;
  private float Ack;
  private boolean Acl;
  public boolean Acm;

  public b(Context paramContext, com.tencent.mm.br.b paramb)
  {
    super(paramContext, paramb);
    AppMethodBeat.i(116416);
    this.Ach = new d(this);
    this.Aci = new PointF();
    this.Acj = 0.0F;
    this.Ack = 0.0F;
    this.Acl = false;
    this.Acm = false;
    AppMethodBeat.o(116416);
  }

  private void translate(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(116419);
    RectF localRectF = getCurImageRect();
    float f1 = paramFloat1 - this.Aci.x;
    float f2 = paramFloat2 - this.Aci.y;
    if (f1 > 0.0F)
      if (getBoardRect().left <= localRectF.left)
      {
        paramFloat1 = f1 * 0.5F;
        if (f2 <= 0.0F)
          break label266;
        if (getBoardRect().top > localRectF.top)
          break label221;
        paramFloat2 = f2 * 0.5F;
      }
    while (true)
    {
      getMainMatrix().postTranslate(paramFloat1, paramFloat2);
      AppMethodBeat.o(116419);
      return;
      paramFloat1 = f1;
      if (Math.abs(f1) <= Math.abs(localRectF.left - getBoardRect().left))
        break;
      paramFloat1 = getBoardRect().left - localRectF.left;
      break;
      if (getBoardRect().right >= localRectF.right)
      {
        paramFloat1 = f1 * 0.5F;
        break;
      }
      paramFloat1 = f1;
      if (Math.abs(f1) <= Math.abs(getBoardRect().right - localRectF.right))
        break;
      paramFloat1 = getBoardRect().right - localRectF.right;
      break;
      label221: paramFloat2 = f2;
      if (Math.abs(f2) > Math.abs(localRectF.top - getBoardRect().top))
      {
        paramFloat2 = getBoardRect().top - localRectF.top;
        continue;
        label266: if (getBoardRect().bottom >= localRectF.bottom)
        {
          paramFloat2 = f2 * 0.5F;
        }
        else
        {
          paramFloat2 = f2;
          if (Math.abs(f2) > Math.abs(getBoardRect().bottom - localRectF.bottom))
            paramFloat2 = getBoardRect().bottom - localRectF.bottom;
        }
      }
    }
  }

  protected final void V(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(116418);
    float f1 = paramMotionEvent.getX(paramMotionEvent.getPointerCount() - 1);
    float f2 = paramMotionEvent.getY(paramMotionEvent.getPointerCount() - 1);
    label93: d locald;
    Rect localRect;
    float f3;
    float f4;
    float f5;
    float f6;
    float f7;
    label317: int i;
    label334: int j;
    switch (paramMotionEvent.getActionMasked())
    {
    case 3:
    case 4:
    default:
    case 0:
    case 1:
      do
      {
        do
        {
          while (true)
          {
            this.Aci.x = f1;
            this.Aci.y = f2;
            AppMethodBeat.o(116418);
            return;
            this.Aci.set(f1, f2);
            this.Acj = 0.0F;
            this.Ack = getCurScale();
            paramMotionEvent = this.Ach;
            ab.d("MicroMsg.StickRoundAnim", "[cancel]");
            if ((paramMotionEvent.rD != null) && ((paramMotionEvent.rD.isRunning()) || (paramMotionEvent.rD.isStarted())))
              paramMotionEvent.rD.cancel();
            this.Acm = false;
          }
          this.Acj = 0.0F;
        }
        while (!this.Acm);
        locald = this.Ach;
      }
      while (!locald.cco);
      ab.d("MicroMsg.StickRoundAnim", "[play] start");
      paramMotionEvent = locald.ccv.getCurImageRect();
      localRect = locald.ccv.getBoardRect();
      locald.ccw = paramMotionEvent.centerX();
      locald.ccx = paramMotionEvent.centerY();
      f3 = localRect.centerY() - paramMotionEvent.centerY();
      f4 = localRect.centerX() - paramMotionEvent.centerX();
      f5 = locald.ccv.getCurScale();
      f6 = locald.ccv.getMaxScale();
      f7 = locald.ccv.getMinScale();
      if (f5 > f6)
      {
        locald.mScale = f6;
        locald.ccy = true;
        if (localRect.height() >= paramMotionEvent.height())
          break label651;
        i = 1;
        if (localRect.width() >= paramMotionEvent.width())
          break label657;
        j = 1;
        label351: if (i != 0)
          f3 = 0.0F;
        if (j != 0)
          f4 = 0.0F;
        if ((paramMotionEvent.top <= localRect.top) || (i == 0))
          break label663;
        f3 = localRect.top - paramMotionEvent.top;
      }
      break;
    case 5:
    case 6:
    case 2:
    }
    label399: label431: label741: label1023: 
    while (true)
    {
      if ((paramMotionEvent.left > localRect.left) && (j != 0))
      {
        f7 = localRect.left - paramMotionEvent.left;
        ab.d("MicroMsg.StickRoundAnim", "%s %s ", new Object[] { Float.valueOf(f7), Float.valueOf(f3) });
        if (f5 <= f6)
          break label741;
      }
      for (locald.ccz = true; ; locald.ccz = false)
      {
        locald.rD = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("deltaY", new float[] { 0.0F, f3 }), PropertyValuesHolder.ofFloat("deltaX", new float[] { 0.0F, f7 }), PropertyValuesHolder.ofFloat("scale", new float[] { 0.0F, 80.0F }) });
        locald.rD.addUpdateListener(new d.1(locald, f5));
        locald.rD.addListener(new d.2(locald));
        locald.rD.setInterpolator(new LinearInterpolator());
        locald.rD.setDuration(80L);
        locald.rD.start();
        break;
        if (f5 < f7)
        {
          locald.mScale = f7;
          locald.ccy = true;
          break label317;
        }
        locald.ccy = false;
        break label317;
        i = 0;
        break label334;
        j = 0;
        break label351;
        if ((paramMotionEvent.bottom >= localRect.bottom) || (i == 0))
          break label1023;
        f3 = localRect.bottom - paramMotionEvent.bottom;
        break label399;
        f7 = f4;
        if (paramMotionEvent.right >= localRect.right)
          break label431;
        f7 = f4;
        if (j == 0)
          break label431;
        f7 = localRect.right - paramMotionEvent.right;
        break label431;
      }
      this.Acj = 0.0F;
      this.Ack = getCurScale();
      break;
      this.Acj = 0.0F;
      this.Acl = true;
      break;
      if (this.Acl)
      {
        this.Acl = false;
        AppMethodBeat.o(116418);
        break label93;
      }
      if (paramMotionEvent.getPointerCount() == 2)
      {
        this.Acm = true;
        f3 = paramMotionEvent.getX(0) - paramMotionEvent.getX(1);
        f4 = paramMotionEvent.getY(0) - paramMotionEvent.getY(1);
        f4 = (float)Math.sqrt(f3 * f3 + f4 * f4);
        if (this.Acj == 0.0F)
        {
          this.Acj = f4;
          break;
        }
        f3 = f4 / this.Acj * this.Ack;
        if (this.AbY * 0.5F <= f3)
        {
          f4 = f3;
          if (f3 > this.AbX)
          {
            f4 = this.AbX;
            f4 = (f3 - this.AbX) * 0.2F + f4;
          }
          getMainMatrix().postScale(f4 / getCurScale(), f4 / getCurScale(), f1, f2);
        }
        this.Ach.cco = true;
        translate(f1, f2);
        postInvalidate();
        break;
      }
      if ((paramMotionEvent.getPointerCount() != 1) || (!dML()))
        break;
      this.Acm = true;
      this.Ach.cco = true;
      translate(f1, f2);
      postInvalidate();
      break;
    }
  }

  public final boolean dMM()
  {
    return true;
  }

  public final float getMinScale()
  {
    AppMethodBeat.i(116420);
    float f1;
    float f2;
    if (getPresenter().dlU().CG() == com.tencent.mm.e.a.ciZ)
    {
      f1 = getBoardRect().width() / getCurImageRect().width();
      f2 = getBoardRect().height() / getCurImageRect().height();
      if (f1 > f2)
      {
        f1 *= getCurScale();
        AppMethodBeat.o(116420);
      }
    }
    while (true)
    {
      return f1;
      f1 = f2;
      break;
      f1 = super.getMinScale();
      AppMethodBeat.o(116420);
    }
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116417);
    paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
    paramCanvas.setMatrix(getMainMatrix());
    paramCanvas.save();
    paramCanvas.clipRect(getAliveRect());
    Bitmap localBitmap = getPresenter().dlV();
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
      paramCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, null);
    paramCanvas.restore();
    getPresenter().onDraw(paramCanvas);
    AppMethodBeat.o(116417);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.b.b
 * JD-Core Version:    0.6.2
 */