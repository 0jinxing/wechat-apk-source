package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.b.a;

public class BorderNumView extends View
{
  private static int yfA = 100;
  private static int yfy = 22;
  private static int yfz = 105;
  private Context context;
  private Paint mPaint;
  private int yfx;

  public BorderNumView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(29137);
    this.context = null;
    this.yfx = 100;
    this.context = paramContext;
    init();
    AppMethodBeat.o(29137);
  }

  public BorderNumView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(29138);
    this.context = null;
    this.yfx = 100;
    this.context = paramContext;
    init();
    AppMethodBeat.o(29138);
  }

  private void init()
  {
    AppMethodBeat.i(29139);
    this.mPaint = new Paint();
    AppMethodBeat.o(29139);
  }

  public void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(29140);
    super.onDraw(paramCanvas);
    if (this.yfx < 100)
      yfy += 15;
    if (this.yfx >= 1000)
      yfA -= 20;
    float f1 = b.a.b(this.context, yfy);
    float f2 = b.a.b(this.context, yfz);
    String str = this.yfx;
    this.mPaint.setAntiAlias(true);
    this.mPaint.setTextSize(yfA);
    this.mPaint.setColor(-11491572);
    this.mPaint.setStyle(Paint.Style.STROKE);
    this.mPaint.setStrokeWidth(8.0F);
    paramCanvas.drawText(str, f1, f2, this.mPaint);
    this.mPaint.setTextSize(yfA);
    this.mPaint.setColor(-1770573);
    this.mPaint.setStyle(Paint.Style.FILL);
    this.mPaint.setStrokeWidth(8.0F);
    paramCanvas.drawText(str, f1, f2, this.mPaint);
    AppMethodBeat.o(29140);
  }

  public void setPaintNum(int paramInt)
  {
    this.yfx = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.BorderNumView
 * JD-Core Version:    0.6.2
 */