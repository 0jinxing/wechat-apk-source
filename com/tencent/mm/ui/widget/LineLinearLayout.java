package com.tencent.mm.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public class LineLinearLayout extends LinearLayout
{
  private Paint mPaint;
  private Rect mRect;
  private int zMd;

  public LineLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public LineLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107861);
    setWillNotDraw(false);
    this.mRect = new Rect();
    this.mPaint = new Paint();
    this.mPaint.setStyle(Paint.Style.STROKE);
    this.mPaint.setColor(-571543826);
    this.mPaint.setStrokeWidth(Math.round(a.getDensity(getContext()) * 0.5F));
    this.zMd = a.fromDPToPix(paramContext, 44);
    AppMethodBeat.o(107861);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107862);
    int i = getMeasuredHeight();
    Paint localPaint = this.mPaint;
    for (int j = 1; this.zMd * j < i; j++)
      paramCanvas.drawLine(0.0F, this.zMd * j, getMeasuredWidth(), this.zMd * j, localPaint);
    super.onDraw(paramCanvas);
    AppMethodBeat.o(107862);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.LineLinearLayout
 * JD-Core Version:    0.6.2
 */