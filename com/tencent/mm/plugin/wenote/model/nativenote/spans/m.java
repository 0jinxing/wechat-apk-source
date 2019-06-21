package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class m
  implements LeadingMarginSpan, f<Boolean>, g<Boolean>
{
  public static float uSe = 0.0F;
  private float mWidth;
  private float nnX;
  private final int uRU;
  public boolean uRV;
  private final int uSd;

  private m(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.nnX = 10.0F;
    this.uSd = paramInt1;
    this.uRU = paramInt2;
    this.uRV = paramBoolean;
  }

  public m(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(26954);
    this.nnX = 10.0F;
    this.uSd = paramInt1;
    this.uRU = paramInt2;
    if ((paramBoolean1) && (paramBoolean3) && (!paramBoolean2));
    for (paramBoolean1 = true; ; paramBoolean1 = false)
    {
      this.uRV = paramBoolean1;
      AppMethodBeat.o(26954);
      return;
    }
  }

  public void drawLeadingMargin(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, boolean paramBoolean, Layout paramLayout)
  {
    AppMethodBeat.i(26956);
    paramCharSequence = (Spanned)paramCharSequence;
    if ((!this.uRV) && (paramCharSequence.getSpanStart(this) == paramInt6))
    {
      paramCharSequence = paramPaint.getStyle();
      float f = paramPaint.getTextSize();
      paramPaint.setStyle(Paint.Style.FILL);
      this.nnX = (paramInt4 - paramInt3);
      this.mWidth = paramPaint.measureText(this.uSd + ".");
      paramCanvas.drawText(this.uSd + ".", paramInt1, paramInt4, paramPaint);
      paramPaint.setStyle(paramCharSequence);
      paramPaint.setTextSize(f);
    }
    AppMethodBeat.o(26956);
  }

  public int getLeadingMargin(boolean paramBoolean)
  {
    AppMethodBeat.i(26955);
    float f;
    int i;
    if (this.mWidth + 2.0F > uSe)
    {
      f = this.mWidth + 2.0F;
      uSe = Math.max(Math.round(f), this.uRU);
      if (!this.uRV)
        break label65;
      i = 0;
      AppMethodBeat.o(26955);
    }
    while (true)
    {
      return i;
      f = uSe;
      break;
      label65: i = (int)uSe;
      AppMethodBeat.o(26955);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.m
 * JD-Core Version:    0.6.2
 */