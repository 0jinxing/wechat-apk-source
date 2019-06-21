package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

class SendDataToDeviceProgressBar extends ImageView
{
  private int bottom;
  private ak fbD;
  private int lAB;
  private int lAC;
  private Runnable lAD;
  private int left;
  private Context mContext;
  private Paint mPaint;
  private int njL;
  private int right;
  private int top;

  public SendDataToDeviceProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SendDataToDeviceProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(30999);
    this.lAB = 2;
    this.left = -1;
    this.top = -1;
    this.right = -1;
    this.bottom = -1;
    this.lAC = -1;
    this.njL = 10;
    this.lAD = new SendDataToDeviceProgressBar.1(this);
    setImageResource(2130840856);
    this.mContext = paramContext;
    this.mPaint = new Paint();
    this.mPaint.setAntiAlias(true);
    this.mPaint.setStyle(Paint.Style.STROKE);
    this.left = this.mContext.getResources().getDimensionPixelSize(2131428623);
    this.top = this.left;
    this.lAC = this.mContext.getResources().getDimensionPixelSize(2131428624);
    this.fbD = new ak(Looper.getMainLooper());
    AppMethodBeat.o(30999);
  }

  private void dCN()
  {
    AppMethodBeat.i(31002);
    this.fbD.removeCallbacks(this.lAD);
    this.fbD.postDelayed(this.lAD, 0L);
    AppMethodBeat.o(31002);
  }

  public final void Os(int paramInt)
  {
    AppMethodBeat.i(31000);
    int i = paramInt;
    if (paramInt >= 100)
      i = 100;
    this.lAB = ((int)(i / 100.0F * 360.0F));
    dCN();
    AppMethodBeat.o(31000);
  }

  public final int getProgress()
  {
    return (int)(this.lAB / 360.0F * 100.0F);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(31001);
    super.onDraw(paramCanvas);
    int i = getWidth() / 2;
    this.mPaint.setColor(this.mContext.getResources().getColor(2131690355));
    this.mPaint.setStrokeWidth(this.lAC);
    if (this.right == -1)
      this.right = (i * 2 - this.left);
    if (this.bottom == -1)
      this.bottom = this.right;
    RectF localRectF = new RectF(this.left, this.top, this.right, this.bottom);
    paramCanvas.drawArc(localRectF, 270.0F, this.lAB, false, this.mPaint);
    int j = this.lAB + 270;
    i = j;
    if (j > 360)
      i = j - 360;
    this.mPaint.setColor(this.mContext.getResources().getColor(2131690352));
    paramCanvas.drawArc(localRectF, i, 360 - this.lAB, false, this.mPaint);
    AppMethodBeat.o(31001);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.SendDataToDeviceProgressBar
 * JD-Core Version:    0.6.2
 */