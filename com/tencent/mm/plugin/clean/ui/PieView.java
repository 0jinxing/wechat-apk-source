package com.tencent.mm.plugin.clean.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PieView extends View
{
  private int cGC;
  private int hzv;
  private Paint kwU;
  private Paint kwV;
  private Paint kwW;
  private Paint kwX;
  private Paint kwY;
  private Paint kwZ;
  private Paint kxa;
  private int kxb;
  private int kxc;
  private int kxd;
  private int kxe;
  private int kxf;
  private int kxg;
  private int kxh;
  private int kxi;

  public PieView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(18735);
    this.hzv = 6;
    this.kxh = 0;
    this.cGC = 0;
    this.kxi = -90;
    initView();
    AppMethodBeat.o(18735);
  }

  public PieView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(18734);
    this.hzv = 6;
    this.kxh = 0;
    this.cGC = 0;
    this.kxi = -90;
    initView();
    AppMethodBeat.o(18734);
  }

  private static int Q(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if (paramInt2 - paramInt1 >= paramInt3)
      i = paramInt1 + paramInt3;
    while (true)
    {
      return i;
      i = paramInt2;
      if (paramInt1 - paramInt2 > paramInt3)
        i = paramInt1 - paramInt3;
    }
  }

  private void initView()
  {
    AppMethodBeat.i(18736);
    this.kwU = tt(-1);
    this.kwV = tt(-657931);
    this.kwW = tt(-2565928);
    this.kwX = tt(-15223279);
    this.kwY = tt(-7876878);
    this.kwZ = tt(-7876878);
    this.kxa = tt(-1644567);
    AppMethodBeat.o(18736);
  }

  private static Paint tt(int paramInt)
  {
    AppMethodBeat.i(18737);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setStyle(Paint.Style.FILL);
    localPaint.setColor(paramInt);
    AppMethodBeat.o(18737);
    return localPaint;
  }

  public void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(18738);
    float f1 = getMeasuredWidth() / 2;
    float f2 = getMeasuredHeight() / 2 + getTop();
    float f3 = getMeasuredHeight() / 3 + 15;
    RectF localRectF1 = new RectF(f1 - f3, f2 - f3, f1 + f3, f2 + f3);
    if (this.cGC == 0)
    {
      paramCanvas.drawCircle(f1, f2, f3, this.kwV);
      paramCanvas.drawArc(localRectF1, this.kxi, 45.0F, true, this.kwW);
      paramCanvas.drawCircle(f1, f2, f3 - 15.0F, this.kwU);
      this.kxi += 4;
      this.kxi %= 360;
    }
    RectF localRectF2;
    int i;
    int j;
    if (this.cGC == 1)
    {
      f3 = 10.0F + f3;
      localRectF2 = new RectF(f1 - f3, f2 - f3, f1 + f3, f3 + f2);
      this.kxb = Q(this.kxb, this.kxf, this.hzv);
      paramCanvas.drawArc(localRectF2, -90.0F, this.kxb, true, this.kwX);
      if (this.kxh > 0)
        break label363;
      if (this.kxb == this.kxf)
      {
        this.kxd = Q(this.kxd, this.kxg, this.hzv);
        paramCanvas.drawArc(localRectF1, this.kxf - 90, this.kxd, true, this.kwY);
      }
      if (this.kxd == this.kxg)
      {
        i = this.kxf;
        j = this.kxg;
        this.kxc = Q(this.kxc, 360 - i - j, this.hzv);
        paramCanvas.drawArc(localRectF1, this.kxf - 90 + this.kxg, this.kxc, true, this.kwZ);
      }
    }
    while (true)
    {
      invalidate();
      AppMethodBeat.o(18738);
      return;
      label363: if (this.kxb == this.kxf)
      {
        this.kxe = Q(this.kxe, this.kxh, this.hzv);
        paramCanvas.drawArc(localRectF2, this.kxf - 90, this.kxe, true, this.kxa);
      }
      if (this.kxe == this.kxh)
      {
        this.kxd = Q(this.kxd, this.kxg, this.hzv);
        paramCanvas.drawArc(localRectF1, this.kxh - 90 + this.kxf, this.kxd, true, this.kwY);
      }
      if (this.kxd == this.kxg)
      {
        j = this.kxf;
        int k = this.kxg;
        i = this.kxh;
        this.kxc = Q(this.kxc, 360 - j - k - i, this.hzv);
        paramCanvas.drawArc(localRectF1, this.kxf - 90 + this.kxg + this.kxh, this.kxc, true, this.kwZ);
      }
    }
  }

  public void setDeepGrayTargetAngle(int paramInt)
  {
    this.kxg = paramInt;
  }

  public void setGreenTargetAngle(int paramInt)
  {
    this.kxf = paramInt;
  }

  public void setOtherAccTargetAngle(int paramInt)
  {
    this.kxh = paramInt;
  }

  public void setStage(int paramInt)
  {
    this.cGC = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.PieView
 * JD-Core Version:    0.6.2
 */