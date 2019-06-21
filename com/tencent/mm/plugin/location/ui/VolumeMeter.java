package com.tencent.mm.plugin.location.ui;

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
  public boolean fAA;
  private Context mContext;
  private float maxRadius;
  public boolean nOg;
  private View nOh;
  private int nOi;
  private int nOj;
  public ak nOk;
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
    AppMethodBeat.i(113582);
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
    AppMethodBeat.o(113582);
  }

  public VolumeMeter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(113581);
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
    AppMethodBeat.o(113581);
  }

  private void init()
  {
    AppMethodBeat.i(113583);
    this.aFY = new Paint();
    AppMethodBeat.o(113583);
  }

  public final void bKh()
  {
    AppMethodBeat.i(113579);
    if (this.nOk == null)
    {
      new ak().postDelayed(new VolumeMeter.2(this), 100L);
      AppMethodBeat.o(113579);
    }
    while (true)
    {
      return;
      this.nOk.post(this);
      AppMethodBeat.o(113579);
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(113584);
    super.onDraw(paramCanvas);
    getWidth();
    getHeight();
    int[] arrayOfInt;
    if (this.nOh != null)
    {
      arrayOfInt = new int[2];
      this.nOh.getLocationInWindow(arrayOfInt);
      if ((arrayOfInt[0] != 0) && (arrayOfInt[1] != 0));
    }
    else
    {
      if ((this.nOi >= 0) && (this.nOj >= 0))
        break label157;
      AppMethodBeat.o(113584);
    }
    while (true)
    {
      return;
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
      label157: this.aFY.setColor(this.nOp);
      this.aFY.setAlpha(this.nOq);
      float f1 = BackwardSupportUtil.b.b(this.mContext, this.radius);
      float f2 = f1;
      if (f1 > this.maxRadius)
        f2 = this.maxRadius;
      f1 = f2;
      if (f2 < this.nOu)
        f1 = this.nOu;
      paramCanvas.drawCircle(this.nOi, this.nOj, f1, this.aFY);
      AppMethodBeat.o(113584);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(113585);
    this.radius = 0.0F;
    this.nOl = 0.0F;
    this.nOm = 0.0F;
    this.nOn = 0.0F;
    this.nOo = 0.0F;
    postInvalidate();
    AppMethodBeat.o(113585);
  }

  public void run()
  {
    AppMethodBeat.i(113580);
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
      AppMethodBeat.o(113580);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.VolumeMeter
 * JD-Core Version:    0.6.2
 */