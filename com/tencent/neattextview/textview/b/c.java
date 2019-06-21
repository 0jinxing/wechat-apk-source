package com.tencent.neattextview.textview.b;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.neattextview.textview.layout.d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class c extends b<ClickableSpan>
{
  public boolean ozq;

  public c(int paramInt1, int paramInt2, ClickableSpan paramClickableSpan)
  {
    super(paramInt1, paramInt2, paramClickableSpan);
  }

  public final void a(Canvas paramCanvas, TextPaint paramTextPaint, List<d> paramList)
  {
    AppMethodBeat.i(3242);
    fz(paramList);
    if (this.ozq)
    {
      int i = paramTextPaint.getColor();
      int j = paramTextPaint.bgColor;
      boolean bool = paramTextPaint.isUnderlineText();
      ((ClickableSpan)this.AjW).updateDrawState(paramTextPaint);
      paramTextPaint.setColor(paramTextPaint.bgColor);
      paramList = this.AjV.iterator();
      while (paramList.hasNext())
        paramCanvas.drawRect((RectF)paramList.next(), paramTextPaint);
      paramTextPaint.setColor(i);
      paramTextPaint.setUnderlineText(bool);
      paramTextPaint.bgColor = j;
      this.ozq = false;
    }
    AppMethodBeat.o(3242);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.neattextview.textview.b.c
 * JD-Core Version:    0.6.2
 */