package com.tencent.mm.wallet_core.ui.formview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends ReplacementSpan
{
  private int Aig;

  public d(int paramInt)
  {
    this.Aig = paramInt;
  }

  private TextPaint c(Paint paramPaint)
  {
    AppMethodBeat.i(138105);
    paramPaint = new TextPaint(paramPaint);
    paramPaint.setTextSize(this.Aig);
    AppMethodBeat.o(138105);
    return paramPaint;
  }

  public final void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    AppMethodBeat.i(138104);
    paramCharSequence = paramCharSequence.subSequence(paramInt1, paramInt2);
    paramPaint = c(paramPaint);
    Paint.FontMetricsInt localFontMetricsInt = paramPaint.getFontMetricsInt();
    paramCharSequence = paramCharSequence.toString();
    paramInt1 = localFontMetricsInt.descent;
    paramCanvas.drawText(paramCharSequence, paramFloat, paramInt4 - ((localFontMetricsInt.ascent + (paramInt1 + paramInt4 + paramInt4)) / 2 - (paramInt5 + paramInt3) / 2), paramPaint);
    AppMethodBeat.o(138104);
  }

  public final int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    AppMethodBeat.i(138103);
    paramCharSequence = paramCharSequence.subSequence(paramInt1, paramInt2);
    paramInt1 = (int)c(paramPaint).measureText(paramCharSequence.toString());
    AppMethodBeat.o(138103);
    return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.d
 * JD-Core Version:    0.6.2
 */