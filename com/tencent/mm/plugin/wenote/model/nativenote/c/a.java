package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends View
{
  private int eno;
  private Paint mPaint;
  private int mType;
  private int shT;
  private int tWp;
  private RectF uQN;
  private RectF uQO;
  private RectF uQP;
  private RectF uQQ;
  private int uQR;
  private int uQS;
  private a.a uQT;

  public a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, a.a parama)
  {
    super(paramContext);
    AppMethodBeat.i(26851);
    this.mType = 2;
    this.mType = paramInt1;
    this.uQS = paramInt2;
    this.tWp = paramInt3;
    this.uQR = (this.uQS * 2 / 5);
    this.eno = this.uQR;
    this.shT = (this.uQR * 3 / 4);
    this.mPaint = new Paint(1);
    this.mPaint.setColor(paramInt4);
    this.uQT = parama;
    this.uQN = new RectF(this.eno, this.uQS, this.eno + this.uQR * 2, this.uQS + this.uQR * 2);
    this.uQO = new RectF(this.shT - this.uQR, this.uQS, this.shT + this.uQR, this.uQS + this.uQR * 2);
    this.uQP = new RectF(this.eno, this.uQS, this.eno + this.uQR * 2, this.uQS + this.uQR * 2);
    this.uQQ = new RectF(this.eno + this.tWp, this.uQS, this.eno + this.tWp + this.uQR * 2, this.uQS + this.uQR * 2);
    AppMethodBeat.o(26851);
  }

  public final int getOffsetForCursorMid()
  {
    return this.eno + this.uQR + 1;
  }

  public final int getType()
  {
    return this.mType;
  }

  public final int getViewHeight()
  {
    return this.uQS + this.uQR * 2 + this.eno;
  }

  public final int getViewPadding()
  {
    return this.eno;
  }

  public final int getViewWidth()
  {
    if ((this.mType == 3) || (this.mType == 4));
    for (int i = this.eno + this.uQR + this.shT; ; i = this.tWp + (this.eno + this.uQR) * 2)
      return i;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(26852);
    switch (this.mType)
    {
    default:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(26852);
      while (true)
      {
        return;
        paramCanvas.drawRect(this.eno + this.uQR, 0.0F, this.eno + this.uQR + this.tWp, this.uQS + this.uQR * 2, this.mPaint);
        paramCanvas.drawArc(this.uQP, 90.0F, 180.0F, true, this.mPaint);
        paramCanvas.drawArc(this.uQQ, 270.0F, 180.0F, true, this.mPaint);
        AppMethodBeat.o(26852);
        continue;
        paramCanvas.drawRect(this.eno + this.uQR + this.shT - this.tWp, 0.0F, this.eno + this.uQR + this.shT, this.uQS, this.mPaint);
        paramCanvas.drawArc(this.uQN, 90.0F, 180.0F, true, this.mPaint);
        paramCanvas.drawRect(this.eno + this.uQR, this.uQS, this.eno + this.uQR + this.shT, this.uQS + this.uQR * 2, this.mPaint);
        AppMethodBeat.o(26852);
      }
      paramCanvas.drawRect(0.0F, 0.0F, this.tWp, this.uQS, this.mPaint);
      paramCanvas.drawRect(0.0F, this.uQS, this.shT, this.uQS + this.uQR * 2, this.mPaint);
      paramCanvas.drawArc(this.uQO, 270.0F, 180.0F, true, this.mPaint);
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(26853);
    if (this.uQT != null)
      this.uQT.a(this.mType, paramMotionEvent);
    AppMethodBeat.o(26853);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.c.a
 * JD-Core Version:    0.6.2
 */