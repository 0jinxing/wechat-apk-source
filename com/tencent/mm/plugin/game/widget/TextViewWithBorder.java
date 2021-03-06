package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TextViewWithBorder extends AppCompatTextView
{
  public TextViewWithBorder(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(112417);
    Paint localPaint = new Paint();
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setColor(getResources().getColor(2131690105));
    paramCanvas.drawRoundRect(new RectF(2.0F, 2.0F, getWidth() - 2, getHeight() - 2), 5.0F, 5.0F, localPaint);
    super.onDraw(paramCanvas);
    AppMethodBeat.o(112417);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.widget.TextViewWithBorder
 * JD-Core Version:    0.6.2
 */