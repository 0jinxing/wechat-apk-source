package com.tencent.mm.plugin.mmsight.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import org.xwalk.core.Log;

public class CameraFrontSightView extends View
{
  private int bRV;
  public int mHeight;
  private Paint mPaint;
  public int mWidth;
  private long oAA;
  private int oAB;
  private int oAC;
  private ViewGroup.LayoutParams oAD;
  private boolean oAw;
  private boolean oAx;
  private boolean oAy;
  private boolean oAz;

  public CameraFrontSightView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(55068);
    this.mPaint = new Paint();
    this.oAw = false;
    this.oAx = false;
    this.oAy = false;
    this.oAz = false;
    this.oAA = 0L;
    AppMethodBeat.o(55068);
  }

  public CameraFrontSightView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(55067);
    this.mPaint = new Paint();
    this.oAw = false;
    this.oAx = false;
    this.oAy = false;
    this.oAz = false;
    this.oAA = 0L;
    AppMethodBeat.o(55067);
  }

  public final void X(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(55071);
    Object localObject = getLayoutParams();
    if (!(localObject instanceof ViewGroup.MarginLayoutParams))
    {
      Log.e("MicroMsg.CameraFrontSightView", "LayoutParams is not MarginLayoutParams! use doAimation()");
      AppMethodBeat.o(55071);
    }
    while (true)
    {
      return;
      localObject = (ViewGroup.MarginLayoutParams)localObject;
      ((ViewGroup.MarginLayoutParams)localObject).leftMargin = ((int)paramFloat1 - this.mWidth / 2);
      ((ViewGroup.MarginLayoutParams)localObject).topMargin = ((int)paramFloat2 - this.mHeight / 2);
      setLayoutParams((ViewGroup.LayoutParams)localObject);
      bQr();
      AppMethodBeat.o(55071);
    }
  }

  public final void bQr()
  {
    AppMethodBeat.i(55070);
    setVisibility(0);
    this.oAw = true;
    this.oAx = false;
    this.oAy = false;
    this.oAz = false;
    this.oAA = System.currentTimeMillis();
    invalidate();
    AppMethodBeat.o(55070);
  }

  public void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(55072);
    paramCanvas.translate(this.oAB / 2, this.oAC / 2);
    long l = System.currentTimeMillis() - this.oAA;
    if (l > 200L)
    {
      this.oAw = false;
      this.oAx = true;
    }
    if (l > 800L)
    {
      this.oAx = false;
      this.oAy = true;
    }
    if (l > 1100L)
    {
      this.oAy = false;
      this.oAz = true;
    }
    if (l > 1300L)
    {
      this.oAz = false;
      setVisibility(8);
      AppMethodBeat.o(55072);
      return;
    }
    float f;
    if (this.oAw)
    {
      f = (float)(200L - l) / 200.0F + 1.0F;
      paramCanvas.scale(f, f, this.oAB / 2, this.oAC / 2);
      this.mPaint.setAlpha((int)((2.0F - f) * 255.0F));
      label168: if (!this.oAx)
        break label506;
      f = (float)((l - 200L) % 200L) / 200.0F * 2.0F;
      Paint localPaint = this.mPaint;
      if (f <= 1.0F)
        break label497;
      f -= 1.0F;
      label211: localPaint.setAlpha((int)(f * 128.0F + 127.0F));
    }
    while (true)
    {
      if (this.oAz)
      {
        f = (float)(l - 1100L) / 200.0F;
        this.mPaint.setAlpha((int)((1.0F - f) * 255.0F));
      }
      paramCanvas.drawLine(0.0F, 0.0F, this.oAB, 0.0F, this.mPaint);
      paramCanvas.drawLine(0.0F, 0.0F, 0.0F, this.oAC, this.mPaint);
      paramCanvas.drawLine(this.oAB, 0.0F, this.oAB, this.oAC, this.mPaint);
      paramCanvas.drawLine(0.0F, this.oAC, this.oAB, this.oAC, this.mPaint);
      paramCanvas.drawLine(0.0F, this.oAC / 2, this.oAB / 10, this.oAC / 2, this.mPaint);
      paramCanvas.drawLine(this.oAB, this.oAC / 2, this.oAB * 9 / 10, this.oAC / 2, this.mPaint);
      paramCanvas.drawLine(this.oAB / 2, 0.0F, this.oAB / 2, this.oAC / 10, this.mPaint);
      paramCanvas.drawLine(this.oAB / 2, this.oAC, this.oAB / 2, this.oAC * 9 / 10, this.mPaint);
      invalidate();
      AppMethodBeat.o(55072);
      break;
      paramCanvas.scale(1.0F, 1.0F);
      break label168;
      label497: f = 1.0F - f;
      break label211;
      label506: this.mPaint.setAlpha(255);
    }
  }

  public final void ez(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55069);
    this.oAD = getLayoutParams();
    if (this.oAD != null)
    {
      this.oAD.width = paramInt1;
      this.oAD.height = paramInt2;
    }
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    this.oAB = (this.mWidth / 2);
    this.oAC = (this.mHeight / 2);
    this.bRV = a.fromDPToPix(getContext(), 1);
    this.mPaint.setColor(-12206054);
    this.mPaint.setStrokeWidth(this.bRV);
    AppMethodBeat.o(55069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView
 * JD-Core Version:    0.6.2
 */