package com.tencent.mm.ui.base;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.LineBackgroundSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.textview.b;

public final class c
  implements LineBackgroundSpan
{
  private final int color;
  private int end;
  private Rect rect;
  private int start;
  private View ysm;

  public c(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(112502);
    this.ysm = paramView;
    this.color = paramInt1;
    this.start = paramInt2;
    this.end = paramInt3;
    this.rect = new Rect();
    AppMethodBeat.o(112502);
  }

  public final void drawBackground(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, int paramInt8)
  {
    AppMethodBeat.i(112503);
    if (this.end < paramInt6)
      AppMethodBeat.o(112503);
    while (true)
    {
      return;
      if (this.start <= paramInt7)
        break;
      AppMethodBeat.o(112503);
    }
    int i = paramPaint.getColor();
    int j = b.ar(this.ysm, this.start);
    int k = b.ar(this.ysm, this.end);
    paramInt7 = paramInt1;
    paramInt5 = paramInt2;
    if (j <= paramInt8)
    {
      paramInt7 = paramInt1;
      paramInt5 = paramInt2;
      if (paramInt8 <= k)
      {
        if (j == paramInt8)
          paramInt1 = (int)b.as(this.ysm, this.start);
        if (k != paramInt8)
          break label271;
        paramInt5 = (int)b.as(this.ysm, this.end);
      }
    }
    for (paramInt7 = paramInt1; ; paramInt7 = paramInt1)
    {
      paramInt1 = (int)(paramInt4 + paramPaint.descent());
      this.rect.left = paramInt7;
      if (this.start == paramInt6)
      {
        paramCharSequence = this.rect;
        paramCharSequence.left -= 4;
      }
      this.rect.right = paramInt5;
      if (this.end == paramInt5)
      {
        paramCharSequence = this.rect;
        paramCharSequence.right += 4;
      }
      this.rect.top = paramInt3;
      this.rect.bottom = paramInt1;
      paramPaint.setColor(this.color);
      paramCanvas.drawRect(this.rect, paramPaint);
      paramPaint.setColor(i);
      AppMethodBeat.o(112503);
      break;
      label271: paramInt5 = (int)b.av(this.ysm, paramInt8);
    }
  }

  public final void setPosition(int paramInt1, int paramInt2)
  {
    this.start = paramInt1;
    this.end = paramInt2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.c
 * JD-Core Version:    0.6.2
 */