package com.tencent.mm.plugin.appbrand.widget.header;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class GyroView extends View
{
  private float aqf;
  private float jcU;
  private float jcV;
  private float jcW;
  private float jcX;
  private float jcY;
  private float jcZ;
  private boolean jda;
  private Paint mPaint;

  public GyroView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(114922);
    this.jcU = 0.0F;
    this.jcV = 0.0F;
    this.jda = false;
    init();
    AppMethodBeat.o(114922);
  }

  public GyroView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(114923);
    this.jcU = 0.0F;
    this.jcV = 0.0F;
    this.jda = false;
    init();
    AppMethodBeat.o(114923);
  }

  private void init()
  {
    AppMethodBeat.i(114924);
    this.jcX = (40.0F * getResources().getDisplayMetrics().density);
    this.jcW = (100.0F * getResources().getDisplayMetrics().density);
    this.aqf = (20.0F * getResources().getDisplayMetrics().density);
    this.jcY = (10.0F * getResources().getDisplayMetrics().density);
    this.jcZ = (6.0F * getResources().getDisplayMetrics().density);
    this.mPaint = new Paint(1);
    this.mPaint.setStyle(Paint.Style.FILL);
    this.mPaint.setColor(-9934744);
    AppMethodBeat.o(114924);
  }

  public final void b(float paramFloat, int paramInt)
  {
    AppMethodBeat.i(114927);
    float f1 = (paramFloat - this.jcX) / (paramInt - this.jcX);
    float f2 = f1;
    if (this.jda)
      f2 = 1.0F - f1;
    this.jcV = Math.max(0.0F, Math.min(f2, 1.0F));
    f1 = paramFloat / this.jcX;
    f2 = f1;
    if (this.jda)
      f2 = 1.0F - f1;
    this.jcU = Math.max(0.0F, Math.min(f2, 1.0F));
    ab.d("MicroMsg.GyroView", "alvinluo GyroView setVerticalScroll y: %f, limit: %d, percent: %f, paddingPercent: %f", new Object[] { Float.valueOf(paramFloat), Integer.valueOf(paramInt), Float.valueOf(this.jcU), Float.valueOf(this.jcV) });
    postInvalidate();
    AppMethodBeat.o(114927);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(114925);
    super.onDraw(paramCanvas);
    float f1 = getMeasuredWidth() / 2.0F;
    float f2 = getMeasuredHeight() / 2.0F;
    if (this.jcV > 0.0F)
    {
      paramCanvas.drawCircle(f1, f2, this.jcY / 2.0F - this.jcV * (this.jcY - this.jcZ) / 2.0F, this.mPaint);
      paramCanvas.drawCircle(f1 - this.jcV * this.aqf, f2, this.jcZ / 2.0F, this.mPaint);
      paramCanvas.drawCircle(f1 + this.jcV * this.aqf, f2, this.jcZ / 2.0F, this.mPaint);
      AppMethodBeat.o(114925);
    }
    while (true)
    {
      return;
      paramCanvas.drawCircle(f1, f2, this.jcU * this.jcY / 2.0F, this.mPaint);
      AppMethodBeat.o(114925);
    }
  }

  public void setVerticalScroll(float paramFloat)
  {
    AppMethodBeat.i(114926);
    float f1 = (paramFloat - this.jcX) / (this.jcW - this.jcX);
    float f2 = f1;
    if (this.jda)
      f2 = 1.0F - f1;
    this.jcV = Math.max(0.0F, Math.min(f2, 1.0F));
    f2 = paramFloat / this.jcX;
    paramFloat = f2;
    if (this.jda)
      paramFloat = 1.0F - f2;
    this.jcU = Math.max(0.0F, Math.min(paramFloat, 1.0F));
    postInvalidate();
    AppMethodBeat.o(114926);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.header.GyroView
 * JD-Core Version:    0.6.2
 */