package com.tencent.mm.ui.appbrand;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class NewPullDownView extends View
{
  private float jcU;
  private boolean jda;
  private float yrw;
  private float yrx;
  private Paint yry;
  private Paint yrz;

  public NewPullDownView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(29969);
    this.jcU = 0.0F;
    this.jda = false;
    this.yrw = (20.0F * getResources().getDisplayMetrics().density);
    this.yrx = (14.0F * getResources().getDisplayMetrics().density - getResources().getDisplayMetrics().density * 4.0F);
    this.yry = new Paint(1);
    this.yry.setStyle(Paint.Style.FILL);
    this.yry.setColor(-4408132);
    this.yrz = new Paint(1);
    this.yrz.setStyle(Paint.Style.STROKE);
    this.yrz.setColor(0);
    this.yrz.setStrokeWidth(getResources().getDisplayMetrics().density * 4.0F);
    this.yrz.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    AppMethodBeat.o(29969);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(29970);
    super.onDraw(paramCanvas);
    float f1 = getMeasuredWidth() / 2;
    float f2 = getMeasuredHeight() / 2;
    paramCanvas.saveLayer(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight(), null, 31);
    paramCanvas.drawCircle(f1, f2, this.jcU * this.yrw / 2.0F, this.yry);
    if (this.jcU >= 0.4F)
      paramCanvas.drawCircle(f1, f2, (this.jcU - 0.4F) / 0.6F * this.yrx / 2.0F, this.yrz);
    paramCanvas.restore();
    AppMethodBeat.o(29970);
  }

  public void setVerticalScrollPercent(float paramFloat)
  {
    AppMethodBeat.i(29971);
    ab.i("MicroMsg.PullDownView", "[setVerticalScrollPercent] percent:%s", new Object[] { Float.valueOf(paramFloat) });
    float f = paramFloat;
    if (this.jda)
      f = 1.0F - paramFloat;
    this.jcU = Math.max(0.0F, Math.min(f, 1.0F));
    postInvalidate();
    AppMethodBeat.o(29971);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.appbrand.NewPullDownView
 * JD-Core Version:    0.6.2
 */