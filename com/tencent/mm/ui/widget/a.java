package com.tencent.mm.ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class a extends ImageSpan
{
  public int zLT = 0;

  public a(Drawable paramDrawable)
  {
    super(paramDrawable, 1);
  }

  public void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    AppMethodBeat.i(107847);
    paramCharSequence = getDrawable();
    paramCanvas.save();
    paramPaint = paramPaint.getFontMetricsInt();
    paramInt1 = paramPaint.descent;
    paramInt2 = paramPaint.ascent;
    paramCanvas.translate(paramFloat, paramPaint.descent + paramInt4 - (paramInt1 - paramInt2) / 2 - (paramCharSequence.getBounds().bottom - paramCharSequence.getBounds().top) / 2);
    paramCharSequence.draw(paramCanvas);
    paramCanvas.restore();
    AppMethodBeat.o(107847);
  }

  public int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    AppMethodBeat.i(107846);
    paramCharSequence = getDrawable().getBounds();
    if (paramFontMetricsInt != null)
    {
      paramPaint = paramPaint.getFontMetricsInt();
      int i = paramPaint.descent;
      paramInt2 = paramPaint.ascent;
      paramInt1 = paramCharSequence.bottom - paramCharSequence.top;
      paramInt2 = paramPaint.ascent + (i - paramInt2) / 2;
      paramFontMetricsInt.ascent = (paramInt2 - paramInt1 / 2);
      paramFontMetricsInt.top = paramFontMetricsInt.ascent;
      paramFontMetricsInt.bottom = (paramInt2 + paramInt1 / 2);
      paramFontMetricsInt.descent = paramFontMetricsInt.bottom;
    }
    paramInt1 = paramCharSequence.right;
    AppMethodBeat.o(107846);
    return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a
 * JD-Core Version:    0.6.2
 */