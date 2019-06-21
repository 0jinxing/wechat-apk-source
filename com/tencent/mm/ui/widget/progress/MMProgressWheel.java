package com.tencent.mm.ui.widget.progress;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cg.a.a;

public class MMProgressWheel extends View
{
  private static final String TAG;
  private float Yn;
  private int dL;
  private final int zTc;
  private final int zTd;
  private final long zTe;
  private int zTf;
  private int zTg;
  private boolean zTh;
  private double zTi;
  private double zTj;
  private float zTk;
  private boolean zTl;
  private long zTm;
  private int zTn;
  private int zTo;
  private Paint zTp;
  private Paint zTq;
  private RectF zTr;
  private float zTs;
  private long zTt;
  private boolean zTu;
  private float zTv;
  private boolean zTw;
  private MMProgressWheel.a zTx;
  private boolean zTy;

  static
  {
    AppMethodBeat.i(112958);
    TAG = MMProgressWheel.class.getSimpleName();
    AppMethodBeat.o(112958);
  }

  public MMProgressWheel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112940);
    this.zTc = 16;
    this.zTd = 270;
    this.zTe = 200L;
    this.dL = 28;
    this.zTf = 4;
    this.zTg = 4;
    this.zTh = false;
    this.zTi = 0.0D;
    this.zTj = 460.0D;
    this.zTk = 0.0F;
    this.zTl = true;
    this.zTm = 0L;
    this.zTn = -1442840576;
    this.zTo = 16777215;
    this.zTp = new Paint();
    this.zTq = new Paint();
    this.zTr = new RectF();
    this.zTs = 230.0F;
    this.zTt = 0L;
    this.Yn = 0.0F;
    this.zTv = 0.0F;
    this.zTw = false;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.MMProgressWheel);
    paramContext = getContext().getResources().getDisplayMetrics();
    this.zTf = ((int)TypedValue.applyDimension(1, this.zTf, paramContext));
    this.zTg = ((int)TypedValue.applyDimension(1, this.zTg, paramContext));
    this.dL = ((int)TypedValue.applyDimension(1, this.dL, paramContext));
    this.dL = ((int)paramAttributeSet.getDimension(6, this.dL));
    this.zTh = paramAttributeSet.getBoolean(7, false);
    this.zTf = ((int)paramAttributeSet.getDimension(8, this.zTf));
    this.zTg = ((int)paramAttributeSet.getDimension(3, this.zTg));
    this.zTs = (paramAttributeSet.getFloat(4, this.zTs / 360.0F) * 360.0F);
    this.zTj = paramAttributeSet.getInt(5, (int)this.zTj);
    this.zTn = paramAttributeSet.getColor(1, this.zTn);
    this.zTo = paramAttributeSet.getColor(2, this.zTo);
    this.zTu = paramAttributeSet.getBoolean(9, false);
    if (paramAttributeSet.getBoolean(0, false))
    {
      this.zTt = SystemClock.uptimeMillis();
      this.zTw = true;
      invalidate();
    }
    paramAttributeSet.recycle();
    float f;
    if (Build.VERSION.SDK_INT >= 17)
    {
      f = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0F);
      if (f == 0.0F)
        break label434;
    }
    while (true)
    {
      this.zTy = bool;
      AppMethodBeat.o(112940);
      return;
      f = Settings.System.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0F);
      break;
      label434: bool = false;
    }
  }

  private void dLu()
  {
    AppMethodBeat.i(112943);
    this.zTp.setColor(this.zTn);
    this.zTp.setAntiAlias(true);
    this.zTp.setStyle(Paint.Style.STROKE);
    this.zTp.setStrokeWidth(this.zTf);
    this.zTq.setColor(this.zTo);
    this.zTq.setAntiAlias(true);
    this.zTq.setStyle(Paint.Style.STROKE);
    this.zTq.setStrokeWidth(this.zTg);
    AppMethodBeat.o(112943);
  }

  private void dLv()
  {
    AppMethodBeat.i(112947);
    if (this.zTx != null)
      Math.round(this.Yn * 100.0F / 360.0F);
    AppMethodBeat.o(112947);
  }

  public int getBarColor()
  {
    return this.zTn;
  }

  public int getBarWidth()
  {
    return this.zTf;
  }

  public int getCircleRadius()
  {
    return this.dL;
  }

  public float getProgress()
  {
    if (this.zTw);
    for (float f = -1.0F; ; f = this.Yn / 360.0F)
      return f;
  }

  public int getRimColor()
  {
    return this.zTo;
  }

  public int getRimWidth()
  {
    return this.zTg;
  }

  public float getSpinSpeed()
  {
    return this.zTs / 360.0F;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int i = 1;
    int j = 1;
    AppMethodBeat.i(112945);
    super.onDraw(paramCanvas);
    paramCanvas.drawArc(this.zTr, 360.0F, 360.0F, false, this.zTq);
    if (!this.zTy)
    {
      AppMethodBeat.o(112945);
      return;
    }
    label144: float f2;
    if (this.zTw)
    {
      long l = SystemClock.uptimeMillis() - this.zTt;
      f1 = (float)l * this.zTs / 1000.0F;
      boolean bool;
      if (this.zTm >= 200L)
      {
        double d = this.zTi;
        this.zTi = (l + d);
        if (this.zTi > this.zTj)
        {
          this.zTi -= this.zTj;
          this.zTm = 0L;
          if (!this.zTl)
          {
            bool = true;
            this.zTl = bool;
          }
        }
        else
        {
          f2 = (float)Math.cos((this.zTi / this.zTj + 1.0D) * 3.141592653589793D) / 2.0F + 0.5F;
          if (!this.zTl)
            break label308;
          this.zTk = (f2 * 254.0F);
        }
      }
      while (true)
      {
        this.Yn += f1;
        if (this.Yn > 360.0F)
          this.Yn -= 360.0F;
        this.zTt = SystemClock.uptimeMillis();
        f2 = this.Yn - 90.0F;
        f1 = 16.0F + this.zTk;
        if (isInEditMode())
        {
          f2 = 0.0F;
          f1 = 135.0F;
        }
        paramCanvas.drawArc(this.zTr, f2, f1, false, this.zTp);
        if (j != 0)
          invalidate();
        AppMethodBeat.o(112945);
        break;
        bool = false;
        break label144;
        label308: f2 = (1.0F - f2) * 254.0F;
        this.Yn += this.zTk - f2;
        this.zTk = f2;
        continue;
        this.zTm = (l + this.zTm);
      }
    }
    float f1 = this.Yn;
    if (this.Yn != this.zTv)
    {
      this.Yn = Math.min((float)(SystemClock.uptimeMillis() - this.zTt) / 1000.0F * this.zTs + this.Yn, this.zTv);
      this.zTt = SystemClock.uptimeMillis();
    }
    for (j = i; ; j = 0)
    {
      if (f1 != this.Yn)
        dLv();
      f2 = 0.0F;
      f1 = this.Yn;
      if (!this.zTu)
      {
        f2 = (float)(1.0D - Math.pow(1.0F - this.Yn / 360.0F, 4.0D)) * 360.0F;
        f1 = (float)(1.0D - Math.pow(1.0F - this.Yn / 360.0F, 2.0D)) * 360.0F;
      }
      if (isInEditMode())
        f1 = 360.0F;
      while (true)
      {
        paramCanvas.drawArc(this.zTr, f2 - 90.0F, f1, false, this.zTp);
        break;
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112941);
    super.onMeasure(paramInt1, paramInt2);
    int i = this.dL + getPaddingLeft() + getPaddingRight();
    int j = this.dL + getPaddingTop() + getPaddingBottom();
    int k = View.MeasureSpec.getMode(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt1);
    int n = View.MeasureSpec.getMode(paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt2);
    if (k != 1073741824)
    {
      paramInt1 = i;
      if (k != -2147483648);
    }
    for (paramInt1 = Math.min(i, m); ; paramInt1 = m)
    {
      if ((n == 1073741824) || (k == 1073741824))
        paramInt2 = i1;
      while (true)
      {
        setMeasuredDimension(paramInt1, paramInt2);
        AppMethodBeat.o(112941);
        return;
        paramInt2 = j;
        if (n == -2147483648)
          paramInt2 = Math.min(j, i1);
      }
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(112950);
    if (!(paramParcelable instanceof MMProgressWheel.WheelSavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      AppMethodBeat.o(112950);
    }
    while (true)
    {
      return;
      paramParcelable = (MMProgressWheel.WheelSavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getSuperState());
      this.Yn = paramParcelable.Yn;
      this.zTv = paramParcelable.zTv;
      this.zTw = paramParcelable.zTw;
      this.zTs = paramParcelable.zTs;
      this.zTf = paramParcelable.zTf;
      this.zTn = paramParcelable.zTn;
      this.zTg = paramParcelable.zTg;
      this.zTo = paramParcelable.zTo;
      this.dL = paramParcelable.dL;
      this.zTu = paramParcelable.zTu;
      this.zTh = paramParcelable.zTh;
      this.zTt = SystemClock.uptimeMillis();
      AppMethodBeat.o(112950);
    }
  }

  public Parcelable onSaveInstanceState()
  {
    AppMethodBeat.i(112949);
    MMProgressWheel.WheelSavedState localWheelSavedState = new MMProgressWheel.WheelSavedState(super.onSaveInstanceState());
    localWheelSavedState.Yn = this.Yn;
    localWheelSavedState.zTv = this.zTv;
    localWheelSavedState.zTw = this.zTw;
    localWheelSavedState.zTs = this.zTs;
    localWheelSavedState.zTf = this.zTf;
    localWheelSavedState.zTn = this.zTn;
    localWheelSavedState.zTg = this.zTg;
    localWheelSavedState.zTo = this.zTo;
    localWheelSavedState.dL = this.dL;
    localWheelSavedState.zTu = this.zTu;
    localWheelSavedState.zTh = this.zTh;
    AppMethodBeat.o(112949);
    return localWheelSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(112942);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt4 = getPaddingTop();
    int i = getPaddingBottom();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    if (!this.zTh)
    {
      paramInt3 = Math.min(Math.min(paramInt1 - j - k, paramInt2 - i - paramInt4), this.dL * 2 - this.zTf * 2);
      paramInt1 = j + (paramInt1 - j - k - paramInt3) / 2;
      paramInt2 = paramInt4 + (paramInt2 - paramInt4 - i - paramInt3) / 2;
    }
    for (this.zTr = new RectF(this.zTf + paramInt1, this.zTf + paramInt2, paramInt1 + paramInt3 - this.zTf, paramInt2 + paramInt3 - this.zTf); ; this.zTr = new RectF(j + this.zTf, paramInt4 + this.zTf, paramInt1 - k - this.zTf, paramInt2 - i - this.zTf))
    {
      dLu();
      invalidate();
      AppMethodBeat.o(112942);
      return;
    }
  }

  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    AppMethodBeat.i(112946);
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt == 0)
      this.zTt = SystemClock.uptimeMillis();
    AppMethodBeat.o(112946);
  }

  public void setBarColor(int paramInt)
  {
    AppMethodBeat.i(112955);
    this.zTn = paramInt;
    dLu();
    if (!this.zTw)
      invalidate();
    AppMethodBeat.o(112955);
  }

  public void setBarWidth(int paramInt)
  {
    AppMethodBeat.i(112954);
    this.zTf = paramInt;
    if (!this.zTw)
      invalidate();
    AppMethodBeat.o(112954);
  }

  public void setCallback(MMProgressWheel.a parama)
  {
    AppMethodBeat.i(112944);
    this.zTx = parama;
    if (!this.zTw)
      dLv();
    AppMethodBeat.o(112944);
  }

  public void setCircleRadius(int paramInt)
  {
    AppMethodBeat.i(112953);
    this.dL = paramInt;
    if (!this.zTw)
      invalidate();
    AppMethodBeat.o(112953);
  }

  public void setInstantProgress(float paramFloat)
  {
    AppMethodBeat.i(112948);
    if (this.zTw)
    {
      this.Yn = 0.0F;
      this.zTw = false;
    }
    float f;
    if (paramFloat > 1.0F)
    {
      f = paramFloat - 1.0F;
      if (Math.abs(f - this.zTv) > 0.0F)
        break label67;
      AppMethodBeat.o(112948);
    }
    while (true)
    {
      return;
      f = paramFloat;
      if (paramFloat >= 0.0F)
        break;
      f = 0.0F;
      break;
      label67: this.zTv = Math.min(f * 360.0F, 360.0F);
      this.Yn = this.zTv;
      this.zTt = SystemClock.uptimeMillis();
      invalidate();
      AppMethodBeat.o(112948);
    }
  }

  public void setLinearProgress(boolean paramBoolean)
  {
    AppMethodBeat.i(112952);
    this.zTu = paramBoolean;
    if (!this.zTw)
      invalidate();
    AppMethodBeat.o(112952);
  }

  public void setProgress(float paramFloat)
  {
    AppMethodBeat.i(112951);
    if (this.zTw)
    {
      this.Yn = 0.0F;
      this.zTw = false;
      dLv();
    }
    float f;
    if (paramFloat > 1.0F)
    {
      f = paramFloat - 1.0F;
      if (Math.abs(f - this.zTv) > 0.0F)
        break label71;
      AppMethodBeat.o(112951);
    }
    while (true)
    {
      return;
      f = paramFloat;
      if (paramFloat >= 0.0F)
        break;
      f = 0.0F;
      break;
      label71: if (this.Yn == this.zTv)
        this.zTt = SystemClock.uptimeMillis();
      this.zTv = Math.min(f * 360.0F, 360.0F);
      invalidate();
      AppMethodBeat.o(112951);
    }
  }

  public void setRimColor(int paramInt)
  {
    AppMethodBeat.i(112956);
    this.zTo = paramInt;
    dLu();
    if (!this.zTw)
      invalidate();
    AppMethodBeat.o(112956);
  }

  public void setRimWidth(int paramInt)
  {
    AppMethodBeat.i(112957);
    this.zTg = paramInt;
    if (!this.zTw)
      invalidate();
    AppMethodBeat.o(112957);
  }

  public void setSpinSpeed(float paramFloat)
  {
    this.zTs = (360.0F * paramFloat);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.progress.MMProgressWheel
 * JD-Core Version:    0.6.2
 */