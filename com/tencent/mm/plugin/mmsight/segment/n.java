package com.tencent.mm.plugin.mmsight.segment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public final class n extends View
{
  private Paint borderPaint;
  private int borderWidth;
  private View.OnTouchListener mNa;
  private n.a oyL;
  private boolean oyM;
  boolean oyN;
  private int oyO;
  private int oyP;
  Drawable oyQ;
  Drawable oyR;
  private int oyS;
  private float oyT;
  private int oyU;
  float oyV;
  private int oyW;
  private Paint oyX;
  private float oyY;
  private Paint oyZ;
  private Paint oza;
  private int ozb;
  private float ozc;
  private float ozd;
  private float oze;
  private int ozf;
  Rect ozg;
  Rect ozh;
  private int padding;

  public n(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(55016);
    this.oyM = false;
    this.oyN = false;
    this.oyV = -1.0F;
    this.ozd = -1.0F;
    this.oze = -1.0F;
    this.padding = 0;
    this.mNa = new n.2(this);
    this.oyS = a.fromDPToPix(getContext(), 8);
    this.oyT = (this.oyS * 0.5F);
    this.ozf = a.fromDPToPix(getContext(), 8);
    this.oyQ = new n.b(this, a.g(getContext(), 2131232093), a.g(getContext(), 2131232092));
    this.oyR = new n.b(this, a.g(getContext(), 2131232093), a.g(getContext(), 2131232092));
    this.oyU = a.fromDPToPix(getContext(), 1);
    this.oyW = a.al(getContext(), 2131428734);
    this.oyV = -1.0F;
    this.oyX = new Paint();
    this.oyX.setColor(a.i(getContext(), 2131690691));
    this.oyX.setAlpha(102);
    this.oyZ = new Paint();
    this.oyZ.setColor(a.i(getContext(), 2131689761));
    this.oyZ.setAlpha(102);
    this.borderPaint = new Paint();
    this.borderPaint.setColor(a.i(getContext(), 2131690691));
    this.borderPaint.setStyle(Paint.Style.STROKE);
    this.borderWidth = ew(getContext());
    this.borderPaint.setStrokeWidth(this.borderWidth);
    this.oyY = (this.borderWidth * 0.5F);
    this.oza = new Paint();
    this.oza.setColor(a.i(getContext(), 2131690691));
    this.oza.setStyle(Paint.Style.STROKE);
    this.ozb = ew(getContext());
    this.ozc = (this.ozb * 0.5F);
    this.oza.setStrokeWidth(this.ozb);
    this.oza.setAlpha(178);
    setOnTouchListener(this.mNa);
    AppMethodBeat.o(55016);
  }

  private static int ew(Context paramContext)
  {
    AppMethodBeat.i(55017);
    int i = Math.round(TypedValue.applyDimension(1, 1.5F, paramContext.getResources().getDisplayMetrics()));
    AppMethodBeat.o(55017);
    return i;
  }

  private boolean ja(boolean paramBoolean)
  {
    AppMethodBeat.i(55020);
    if (paramBoolean)
    {
      paramBoolean = n.b.a((n.b)this.oyQ);
      AppMethodBeat.o(55020);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = n.b.a((n.b)this.oyR);
      AppMethodBeat.o(55020);
    }
  }

  public final int getLeftSliderBound()
  {
    AppMethodBeat.i(55021);
    int i = this.oyQ.getBounds().left;
    AppMethodBeat.o(55021);
    return i;
  }

  public final int getRightSliderBound()
  {
    AppMethodBeat.i(55022);
    int i = this.oyR.getBounds().right;
    AppMethodBeat.o(55022);
    return i;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(55018);
    if (this.oyV > 0.0F)
    {
      float f = getWidth() * this.oyV;
      paramCanvas.drawRect(f - this.oyU * 0.5F, 0.0F, this.oyU * 0.5F + f, this.oyW, this.oyX);
    }
    if (!this.oyM)
      AppMethodBeat.o(55018);
    while (true)
    {
      return;
      int i = this.oyQ.getBounds().centerX();
      int j = this.oyR.getBounds().centerX();
      if ((ja(true)) || (ja(false)))
        paramCanvas.drawRect(this.padding + this.ozc, this.ozc, getWidth() - this.padding - this.ozc, getBottom() - this.ozc, this.oza);
      if (this.oyQ.getBounds().left > 0)
        paramCanvas.drawRect(0.0F, 0.0F, i, getHeight(), this.oyZ);
      if (this.oyR.getBounds().right < getWidth())
        paramCanvas.drawRect(j, 0.0F, getWidth(), getHeight(), this.oyZ);
      paramCanvas.drawLine(i, this.oyY, j, this.oyY, this.borderPaint);
      paramCanvas.drawLine(i, getHeight() - this.oyY, j, getHeight() - this.oyY, this.borderPaint);
      this.oyQ.draw(paramCanvas);
      this.oyR.draw(paramCanvas);
      AppMethodBeat.o(55018);
    }
  }

  public final void setCursorPos(float paramFloat)
  {
    AppMethodBeat.i(55019);
    if (!this.oyM)
      AppMethodBeat.o(55019);
    while (true)
    {
      return;
      this.oyV = paramFloat;
      invalidate();
      AppMethodBeat.o(55019);
    }
  }

  public final void setOnSliderTouchListener(n.a parama)
  {
    this.oyL = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.n
 * JD-Core Version:    0.6.2
 */