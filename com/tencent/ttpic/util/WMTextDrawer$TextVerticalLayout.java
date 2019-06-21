package com.tencent.ttpic.util;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.TextWMElement;
import java.util.ArrayList;
import java.util.Iterator;

class WMTextDrawer$TextVerticalLayout extends WMTextDrawer.TextLayout
{
  public WMTextDrawer$TextVerticalLayout(WMTextDrawer paramWMTextDrawer, TextWMElement paramTextWMElement, int paramInt1, int paramInt2, String paramString)
  {
    super(paramTextWMElement, paramInt1, paramInt2, paramString);
  }

  protected void drawText(Canvas paramCanvas)
  {
    AppMethodBeat.i(84281);
    this.mWMElement.mTextRect.set(this.mWMTokenizer.getTextRect());
    float f1 = this.mWMTokenizer.getFontHeight() / 2.0F;
    float f2 = (Math.abs(this.mPaint.ascent()) - this.mPaint.descent()) / 2.0F;
    paramCanvas.save();
    Iterator localIterator = this.mWMTokenizer.getTokens().iterator();
    while (localIterator.hasNext())
    {
      WMTokenizer.Token localToken = (WMTokenizer.Token)localIterator.next();
      float f3 = localToken.x;
      float f4 = localToken.y + (f1 + f2);
      for (int i = 0; i < localToken.text.length(); i++)
      {
        draw(paramCanvas, String.valueOf(localToken.text.charAt(i)), f3, f4);
        f4 += this.mWMTokenizer.getFontHeight();
      }
    }
    paramCanvas.restore();
    AppMethodBeat.o(84281);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.WMTextDrawer.TextVerticalLayout
 * JD-Core Version:    0.6.2
 */