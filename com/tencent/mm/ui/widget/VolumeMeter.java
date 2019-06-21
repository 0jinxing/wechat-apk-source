package com.tencent.mm.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ak;

public class VolumeMeter extends ImageView
  implements Runnable
{
  private Paint aFY;
  private boolean fAA;
  private Context mContext;
  private float maxRadius;
  private boolean nOg;
  private View nOh;
  private int nOi;
  private int nOj;
  private ak nOk;
  private float nOl;
  private float nOm;
  private float nOn;
  private float nOo;
  private int nOp;
  private int nOq;
  private float nOr;
  private float nOs;
  private int nOt;
  private float nOu;
  private float nOv;
  private float nOw;
  private float radius;

  public VolumeMeter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(108004);
    this.fAA = false;
    this.nOg = false;
    this.nOi = -1;
    this.nOj = -1;
    this.nOk = null;
    this.nOp = -6751336;
    this.nOq = 70;
    this.nOr = 0.5F;
    this.nOs = 0.001F;
    this.nOt = 20;
    this.radius = 0.0F;
    this.nOv = 40.0F;
    this.nOw = 30.0F;
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(108004);
  }

  public VolumeMeter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(108003);
    this.fAA = false;
    this.nOg = false;
    this.nOi = -1;
    this.nOj = -1;
    this.nOk = null;
    this.nOp = -6751336;
    this.nOq = 70;
    this.nOr = 0.5F;
    this.nOs = 0.001F;
    this.nOt = 20;
    this.radius = 0.0F;
    this.nOv = 40.0F;
    this.nOw = 30.0F;
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(108003);
  }

  private void init()
  {
    AppMethodBeat.i(108005);
    this.aFY = new Paint();
    AppMethodBeat.o(108005);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(108006);
    super.onDraw(paramCanvas);
    getWidth();
    getHeight();
    if ((this.nOh == null) || (this.nOh.getVisibility() == 4))
    {
      if ((this.nOi >= 0) && (this.nOj >= 0))
        break label168;
      AppMethodBeat.o(108006);
    }
    while (true)
    {
      return;
      int[] arrayOfInt = new int[2];
      this.nOh.getLocationInWindow(arrayOfInt);
      if ((arrayOfInt[0] == 0) || (arrayOfInt[1] == 0))
        break;
      int i = this.nOh.getWidth();
      int j = this.nOh.getHeight();
      if ((i == 0) || (j == 0))
        break;
      int k = BackwardSupportUtil.b.b(this.mContext, 50.0F);
      this.nOi = (arrayOfInt[0] + i / 2);
      this.nOj = (arrayOfInt[1] + j / 2 - k / 2);
      this.nOu = (i / 2);
      this.maxRadius = (i / 2 * 2.0F);
      break;
      label168: this.aFY.setColor(this.nOp);
      this.aFY.setAlpha(this.nOq);
      float f1 = BackwardSupportUtil.b.b(this.mContext, this.radius);
      float f2 = f1;
      if (f1 > this.maxRadius)
        f2 = this.maxRadius;
      f1 = f2;
      if (f2 < this.nOu)
        f1 = this.nOu;
      paramCanvas.drawCircle(this.nOi, this.nOj, f1, this.aFY);
      AppMethodBeat.o(108006);
    }
  }

  public void run()
  {
    AppMethodBeat.i(108002);
    float f1;
    float f2;
    float f3;
    if (this.fAA)
    {
      f1 = this.nOn;
      if (this.nOm <= this.nOl)
        break label147;
      f2 = (this.nOm - this.nOl) / this.nOw;
      if (f2 <= this.nOr)
        break label128;
      f3 = this.nOr;
      f3 += f1;
    }
    while (true)
    {
      this.nOn = f3;
      this.nOo = this.nOn;
      this.radius = ((float)(260.0D * Math.sqrt(this.nOn) - 130.0F * this.nOn) / 1.5F);
      postInvalidate();
      this.nOk.postDelayed(this, this.nOt);
      AppMethodBeat.o(108002);
      return;
      label128: f3 = f2;
      if (f2 >= this.nOs)
        break;
      f3 = this.nOs;
      break;
      label147: if (this.nOm <= this.nOl)
      {
        f2 = (this.nOl - this.nOm) / this.nOv;
        if (f2 > this.nOr)
          f3 = this.nOr;
        while (true)
        {
          f3 = f1 - f3;
          break;
          f3 = f2;
          if (f2 < this.nOs)
            f3 = this.nOs;
        }
      }
      f3 = f1;
    }
  }

  public void setArchView(View paramView)
  {
    this.nOh = paramView;
  }

  public void setVolume(float paramFloat)
  {
    this.nOl = this.nOm;
    this.nOm = paramFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.VolumeMeter
 * JD-Core Version:    0.6.2
 */