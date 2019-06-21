package com.tencent.neattextview.textview.b;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.neattextview.textview.layout.d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a extends b<BackgroundColorSpan>
{
  public a(int paramInt1, int paramInt2, CharacterStyle paramCharacterStyle)
  {
    super(paramInt1, paramInt2, paramCharacterStyle);
  }

  public final void a(Canvas paramCanvas, TextPaint paramTextPaint, List<d> paramList)
  {
    AppMethodBeat.i(3241);
    fz(paramList);
    int i = paramTextPaint.getColor();
    paramTextPaint.setColor(((BackgroundColorSpan)this.AjW).getBackgroundColor());
    paramList = this.AjV.iterator();
    while (paramList.hasNext())
      paramCanvas.drawRect((RectF)paramList.next(), paramTextPaint);
    paramTextPaint.setColor(i);
    AppMethodBeat.o(3241);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.neattextview.textview.b.a
 * JD-Core Version:    0.6.2
 */