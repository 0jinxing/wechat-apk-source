package com.tencent.mm.plugin.mmsight.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class MMSightCircularProgressBar extends View
{
  private Paint aFY;
  boolean cFy;
  int duration;
  private Context mContext;
  float oAH;
  int oAI;
  int oAJ;
  private RectF oAK;
  c oAL;
  MMSightCircularProgressBar.a oAM;
  private int oAN;
  private float offset;
  private float strokeWidth;

  public MMSightCircularProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(55082);
    this.oAH = 0.0F;
    this.oAI = 0;
    this.oAJ = 0;
    this.duration = 0;
    this.strokeWidth = 0.0F;
    this.offset = 0.0F;
    this.cFy = false;
    this.oAN = Color.parseColor("#1AAD19");
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(55082);
  }

  public MMSightCircularProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(55083);
    this.oAH = 0.0F;
    this.oAI = 0;
    this.oAJ = 0;
    this.duration = 0;
    this.strokeWidth = 0.0F;
    this.offset = 0.0F;
    this.cFy = false;
    this.oAN = Color.parseColor("#1AAD19");
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(55083);
  }

  private void init()
  {
    AppMethodBeat.i(55084);
    float f = this.mContext.getResources().getDimensionPixelSize(2131428554);
    this.strokeWidth = this.mContext.getResources().getDimensionPixelSize(2131428556);
    this.offset = (this.strokeWidth / 2.0F);
    this.oAK = new RectF(this.offset, this.offset, f - this.offset, f - this.offset);
    this.aFY = new Paint();
    this.aFY.setStyle(Paint.Style.STROKE);
    this.aFY.setStrokeWidth(this.strokeWidth);
    this.aFY.setColor(this.oAN);
    this.aFY.setAlpha(153);
    this.aFY.setAntiAlias(true);
    AppMethodBeat.o(55084);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(55089);
    paramCanvas.save();
    paramCanvas.translate(this.offset, this.offset);
    paramCanvas.rotate(180.0F, this.oAK.right / 2.0F, this.oAK.bottom / 2.0F);
    paramCanvas.drawArc(this.oAK, 90.0F, 360.0F * (this.oAH / this.oAJ), false, this.aFY);
    paramCanvas.restore();
    AppMethodBeat.o(55089);
  }

  public void setCircularColor(int paramInt)
  {
    AppMethodBeat.i(55088);
    if ((this.aFY != null) && (paramInt != 0))
      this.aFY.setColor(paramInt);
    AppMethodBeat.o(55088);
  }

  public void setDuration(int paramInt)
  {
    AppMethodBeat.i(55086);
    ab.i("MicroMsg.MMSightCircularProgressBar", "setDuration: %s", new Object[] { Integer.valueOf(paramInt) });
    this.duration = paramInt;
    AppMethodBeat.o(55086);
  }

  public void setInitProgress(int paramInt)
  {
    AppMethodBeat.i(55087);
    ab.i("MicroMsg.MMSightCircularProgressBar", "setInitProgress: %s, isStart: %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.cFy) });
    if (!this.cFy)
      this.oAI = paramInt;
    AppMethodBeat.o(55087);
  }

  public void setMaxProgress(int paramInt)
  {
    AppMethodBeat.i(55085);
    ab.i("MicroMsg.MMSightCircularProgressBar", "setMaxProgress: %s", new Object[] { Integer.valueOf(paramInt) });
    this.oAJ = paramInt;
    AppMethodBeat.o(55085);
  }

  public void setProgressCallback(MMSightCircularProgressBar.a parama)
  {
    this.oAM = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar
 * JD-Core Version:    0.6.2
 */