package com.tencent.mm.plugin.appbrand.widget.h;

import android.graphics.Paint.FontMetricsInt;
import android.text.style.LineHeightSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements LineHeightSpan
{
  private final int gravity;
  public int height;

  public a(float paramFloat)
  {
    AppMethodBeat.i(126818);
    this.height = Math.round(paramFloat);
    this.gravity = 16;
    AppMethodBeat.o(126818);
  }

  public final boolean ax(float paramFloat)
  {
    AppMethodBeat.i(126817);
    boolean bool;
    if (this.height != Math.round(paramFloat))
    {
      bool = true;
      AppMethodBeat.o(126817);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(126817);
    }
  }

  public final void chooseHeight(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Paint.FontMetricsInt paramFontMetricsInt)
  {
    AppMethodBeat.i(126819);
    if (-paramFontMetricsInt.ascent > this.height)
    {
      paramInt1 = -this.height;
      paramFontMetricsInt.ascent = paramInt1;
      paramFontMetricsInt.top = paramInt1;
      paramFontMetricsInt.descent = 0;
      paramFontMetricsInt.bottom = 0;
      AppMethodBeat.o(126819);
    }
    while (true)
    {
      return;
      if (-paramFontMetricsInt.ascent + paramFontMetricsInt.descent > this.height)
      {
        paramFontMetricsInt.descent = paramFontMetricsInt.bottom;
        paramInt1 = paramFontMetricsInt.descent - this.height;
        paramFontMetricsInt.ascent = paramInt1;
        paramFontMetricsInt.top = paramInt1;
        AppMethodBeat.o(126819);
      }
      else if (-paramFontMetricsInt.ascent + paramFontMetricsInt.bottom > this.height)
      {
        paramFontMetricsInt.top = paramFontMetricsInt.ascent;
        paramFontMetricsInt.bottom = (paramFontMetricsInt.ascent + this.height);
        AppMethodBeat.o(126819);
      }
      else if (-paramFontMetricsInt.top + paramFontMetricsInt.bottom > this.height)
      {
        paramFontMetricsInt.top = (paramFontMetricsInt.bottom - this.height);
        AppMethodBeat.o(126819);
      }
      else
      {
        paramInt1 = this.height - (-paramFontMetricsInt.ascent + paramFontMetricsInt.descent);
        if (this.gravity == 48)
        {
          paramFontMetricsInt.descent += paramInt1;
          paramFontMetricsInt.bottom = (paramInt1 + paramFontMetricsInt.bottom);
          AppMethodBeat.o(126819);
        }
        else if (this.gravity == 80)
        {
          paramFontMetricsInt.top -= paramInt1;
          paramFontMetricsInt.ascent -= paramInt1;
          AppMethodBeat.o(126819);
        }
        else
        {
          if (this.gravity == 16)
          {
            paramInt1 = Math.round(paramInt1 / 2.0F);
            paramFontMetricsInt.top -= paramInt1;
            paramFontMetricsInt.ascent -= paramInt1;
            paramFontMetricsInt.bottom += paramInt1;
            paramFontMetricsInt.descent = (paramInt1 + paramFontMetricsInt.descent);
          }
          AppMethodBeat.o(126819);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.h.a
 * JD-Core Version:    0.6.2
 */