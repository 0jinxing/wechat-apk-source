package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public class CardTagTextView extends TextView
{
  private int fillColor;
  private int khJ;
  private Paint kpQ;
  private RectF krZ;
  private int ksa;
  private int ksb;

  public CardTagTextView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(88951);
    this.krZ = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.kpQ = new Paint();
    this.khJ = 3;
    this.ksa = 9;
    this.ksb = 0;
    this.fillColor = 0;
    init();
    AppMethodBeat.o(88951);
  }

  public CardTagTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(88952);
    this.krZ = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.kpQ = new Paint();
    this.khJ = 3;
    this.ksa = 9;
    this.ksb = 0;
    this.fillColor = 0;
    init();
    AppMethodBeat.o(88952);
  }

  public CardTagTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(88953);
    this.krZ = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.kpQ = new Paint();
    this.khJ = 3;
    this.ksa = 9;
    this.ksb = 0;
    this.fillColor = 0;
    init();
    AppMethodBeat.o(88953);
  }

  private void init()
  {
    AppMethodBeat.i(88954);
    this.khJ = Math.round(a.getDensity(getContext()) * 0.5F);
    this.ksa = a.fromDPToPix(getContext(), 3);
    this.ksb = getCurrentTextColor();
    AppMethodBeat.o(88954);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(88956);
    this.krZ.left = this.ksa;
    this.krZ.top = this.khJ;
    this.krZ.right = (getWidth() - this.ksa);
    this.krZ.bottom = (getHeight() - this.khJ);
    this.kpQ.setAntiAlias(true);
    if (this.fillColor != 0)
    {
      this.kpQ.setColor(this.fillColor);
      this.kpQ.setStyle(Paint.Style.FILL);
      paramCanvas.drawRoundRect(this.krZ, getHeight() / 2 - this.khJ, getHeight() / 2 - this.khJ, this.kpQ);
    }
    this.kpQ.setColor(this.ksb);
    this.kpQ.setStrokeWidth(this.khJ);
    this.kpQ.setStyle(Paint.Style.STROKE);
    paramCanvas.drawRoundRect(this.krZ, getHeight() / 2 - this.khJ, getHeight() / 2 - this.khJ, this.kpQ);
    super.onDraw(paramCanvas);
    AppMethodBeat.o(88956);
  }

  public void setFillColor(int paramInt)
  {
    this.fillColor = paramInt;
  }

  public void setTextColor(int paramInt)
  {
    AppMethodBeat.i(88955);
    this.ksb = paramInt;
    super.setTextColor(paramInt);
    AppMethodBeat.o(88955);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.widget.CardTagTextView
 * JD-Core Version:    0.6.2
 */