package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cg.a.a;
import com.tencent.mm.ui.aj;

public class MMSwitchBtn extends View
{
  private int edgePadding;
  private int maxHeight;
  private int maxWidth;
  private int nfE;
  private Paint oJk;
  private float rLO;
  private float rLP;
  private long zMI;
  private int zMJ;
  private int zMK;
  private int zML;
  private boolean zMM;
  private boolean zMN;
  private float zMO;
  private float zMP;
  private int zMQ;
  private int zMR;
  private int zMS;
  private int zMT;
  public boolean zMU;
  private RectF zMV;
  private RectF zMW;
  private int zMX;
  private int zMY;
  private int zMZ;
  private String zNa;
  private String zNb;
  private MMSwitchBtn.b zNc;
  private MMSwitchBtn.a zNd;

  public MMSwitchBtn(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(112580);
    this.zMM = false;
    this.zMN = false;
    this.zMU = false;
    this.oJk = new Paint(1);
    this.zMV = new RectF();
    this.zMW = new RectF();
    this.zNc = new MMSwitchBtn.b(this, (byte)0);
    init();
    AppMethodBeat.o(112580);
  }

  public MMSwitchBtn(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112579);
    this.zMM = false;
    this.zMN = false;
    this.zMU = false;
    this.oJk = new Paint(1);
    this.zMV = new RectF();
    this.zMW = new RectF();
    this.zNc = new MMSwitchBtn.b(this, (byte)0);
    init();
    b(paramContext.obtainStyledAttributes(paramAttributeSet, a.a.MMSwitchBtn));
    AppMethodBeat.o(112579);
  }

  public MMSwitchBtn(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112578);
    this.zMM = false;
    this.zMN = false;
    this.zMU = false;
    this.oJk = new Paint(1);
    this.zMV = new RectF();
    this.zMW = new RectF();
    this.zNc = new MMSwitchBtn.b(this, (byte)0);
    init();
    b(paramContext.obtainStyledAttributes(paramAttributeSet, a.a.MMSwitchBtn));
    AppMethodBeat.o(112578);
  }

  private void b(TypedArray paramTypedArray)
  {
    AppMethodBeat.i(112582);
    this.zMY = paramTypedArray.getColor(0, this.zMS);
    this.zMX = paramTypedArray.getColor(1, this.zMR);
    this.zMZ = paramTypedArray.getColor(2, this.zMQ);
    this.zNa = paramTypedArray.getString(3);
    this.zNb = paramTypedArray.getString(4);
    paramTypedArray.recycle();
    AppMethodBeat.o(112582);
  }

  private void dKE()
  {
    if (this.zML < this.maxHeight)
    {
      this.zMW.top = ((this.maxHeight - this.zML) / 2 + this.edgePadding);
      this.zMW.bottom = (this.zMW.top + this.zML - this.edgePadding * 2);
      if (!this.zMU)
        break label137;
      this.zMW.left = (this.zMK + this.edgePadding);
    }
    for (this.zMW.right = (this.maxWidth - this.edgePadding); ; this.zMW.right = ((int)(this.zMP * 2.0F) + this.edgePadding))
    {
      return;
      this.zMW.top = this.edgePadding;
      this.zMW.bottom = (this.maxHeight - this.edgePadding);
      break;
      label137: this.zMW.left = this.edgePadding;
    }
  }

  private void dKF()
  {
    if (this.zMW.left < this.edgePadding)
      this.zMW.left = this.edgePadding;
    if (this.zMW.left > this.zMK + this.edgePadding)
      this.zMW.left = (this.zMK + this.edgePadding);
    this.zMW.right = (this.zMW.left + (int)(this.zMP * 2.0F));
  }

  private void dKb()
  {
    AppMethodBeat.i(112587);
    if (this.zMW.left > this.zMJ)
    {
      qW(true);
      AppMethodBeat.o(112587);
    }
    while (true)
    {
      return;
      qW(false);
      AppMethodBeat.o(112587);
    }
  }

  private void gq(boolean paramBoolean)
  {
    AppMethodBeat.i(112586);
    ViewParent localViewParent = getParent();
    if (localViewParent != null)
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    AppMethodBeat.o(112586);
  }

  private void init()
  {
    AppMethodBeat.i(112581);
    this.edgePadding = getResources().getDimensionPixelSize(2131427865);
    this.zMO = getResources().getDimensionPixelSize(2131427872);
    this.zMP = getResources().getDimensionPixelSize(2131427871);
    this.zMQ = getResources().getColor(2131690691);
    this.zMR = getResources().getColor(2131690550);
    this.zMS = getResources().getColor(2131690551);
    this.zMT = getResources().getColor(2131689765);
    this.zMY = this.zMS;
    this.zMX = this.zMR;
    this.zMZ = this.zMQ;
    this.nfE = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    AppMethodBeat.o(112581);
  }

  private void qW(boolean paramBoolean)
  {
    AppMethodBeat.i(112585);
    this.zMM = true;
    this.zNc.reset();
    if (paramBoolean)
      this.zNc.zNe = (this.zMK - ()this.zMW.left + this.edgePadding);
    for (this.zNc.direction = 1; ; this.zNc.direction = 0)
    {
      this.zNc.startX = this.zMW.left;
      this.zNc.setDuration(80L * this.zNc.zNe / this.zMK);
      startAnimation(this.zNc);
      AppMethodBeat.o(112585);
      return;
      this.zNc.zNe = (()this.zMW.left);
    }
  }

  public final boolean dKD()
  {
    return this.zMU;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(112589);
    int i;
    if (!isEnabled())
    {
      i = this.zMT;
      this.oJk.setAlpha(38);
    }
    while (true)
    {
      this.oJk.setColor(i);
      paramCanvas.drawRoundRect(this.zMV, this.zMO, this.zMO, this.oJk);
      this.oJk.setColor(this.zMY);
      this.oJk.setAlpha(Math.min(255, (int)((this.zMW.left - this.edgePadding) / this.zMK * 255.0F)));
      paramCanvas.drawRoundRect(this.zMV, this.zMO, this.zMO, this.oJk);
      this.oJk.setColor(this.zMZ);
      paramCanvas.drawRoundRect(this.zMW, this.zMP, this.zMP, this.oJk);
      if ((this.zNa != null) && (this.zNb != null))
      {
        Paint localPaint = new Paint();
        localPaint.setTextSize(getResources().getDimension(2131427859));
        localPaint.setTextAlign(Paint.Align.CENTER);
        localPaint.setColor(getResources().getColor(2131690693));
        localPaint.setAntiAlias(true);
        i = Math.min(255, (int)((this.zMW.left - this.edgePadding) / this.zMK * 255.0F));
        Rect localRect = new Rect();
        localPaint.getTextBounds(this.zNa, 0, this.zNa.length(), localRect);
        localPaint.setAlpha(i);
        float f1 = (this.zMV.left + this.zMV.right) / 2.0F;
        float f2 = this.zMP;
        float f3 = aj.fromDPToPix(getContext(), 1);
        float f4 = (this.zMV.top + this.zMV.bottom) / 2.0F;
        f4 = localRect.height() / 2.0F + f4 - aj.fromDPToPix(getContext(), 1);
        paramCanvas.drawText(this.zNa, f1 - f2 + f3, f4, localPaint);
        f3 = (this.zMV.left + this.zMV.right) / 2.0F;
        f1 = this.zMP;
        f2 = aj.fromDPToPix(getContext(), 1);
        localPaint.setAlpha(255 - i);
        paramCanvas.drawText(this.zNb, f3 + f1 - f2, f4, localPaint);
      }
      AppMethodBeat.o(112589);
      return;
      i = this.zMX;
      this.oJk.setAlpha(255);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(112584);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.maxWidth = (paramInt3 - paramInt1);
    this.maxHeight = (paramInt4 - paramInt2);
    this.zMK = (this.maxWidth - (int)(this.zMP * 2.0F) - this.edgePadding * 2);
    this.zMJ = (this.zMK / 2);
    this.zML = getResources().getDimensionPixelSize(2131427870);
    if (this.zML < this.maxHeight)
      this.zMV.top = ((this.maxHeight - this.zML) / 2);
    for (this.zMV.bottom = (this.zMV.top + this.zML); ; this.zMV.bottom = this.maxHeight)
    {
      this.zMV.left = 0.0F;
      this.zMV.right = this.maxWidth;
      dKE();
      this.oJk.setStyle(Paint.Style.FILL);
      this.oJk.setColor(this.zMR);
      AppMethodBeat.o(112584);
      return;
      this.zMV.top = 0.0F;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    AppMethodBeat.i(112588);
    if (this.zMM)
      AppMethodBeat.o(112588);
    while (true)
    {
      return true;
      if (isEnabled())
        break;
      AppMethodBeat.o(112588);
    }
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      if (this.zMN)
        invalidate();
      AppMethodBeat.o(112588);
      break;
      clearAnimation();
      this.rLO = paramMotionEvent.getX();
      this.rLP = paramMotionEvent.getY();
      this.zMI = SystemClock.elapsedRealtime();
      this.zMN = false;
      continue;
      float f1;
      float f2;
      if (this.zMN)
      {
        gq(true);
        f1 = paramMotionEvent.getX();
        f2 = this.rLO;
        RectF localRectF = this.zMW;
        localRectF.left = (f1 - f2 + localRectF.left);
        dKF();
      }
      while (true)
      {
        this.rLO = paramMotionEvent.getX();
        this.rLP = paramMotionEvent.getY();
        break;
        float f3 = paramMotionEvent.getX() - this.rLO;
        f2 = paramMotionEvent.getY() - this.rLP;
        int j = i;
        if (Math.abs(f3) >= this.nfE / 10.0F)
        {
          f1 = f2;
          if (f2 == 0.0F)
            f1 = 1.0F;
          j = i;
          if (Math.abs(f3 / f1) > 3.0F)
            j = 1;
        }
        if (j != 0)
        {
          this.zMN = true;
          gq(true);
        }
      }
      boolean bool;
      if (SystemClock.elapsedRealtime() - this.zMI < 300L)
        if (!this.zMU)
        {
          bool = true;
          label312: qW(bool);
        }
      while (true)
      {
        gq(false);
        this.zMN = false;
        break;
        bool = false;
        break label312;
        dKb();
      }
      if (this.zMN)
        dKb();
      gq(false);
      this.zMN = false;
    }
  }

  public void setCheck(boolean paramBoolean)
  {
    AppMethodBeat.i(112583);
    if (this.zMU != paramBoolean)
    {
      clearAnimation();
      this.zMU = paramBoolean;
      dKE();
      this.zMM = false;
      invalidate();
    }
    if (paramBoolean);
    for (String str = getContext().getString(2131303976); ; str = getContext().getString(2131303987))
    {
      setContentDescription(str);
      AppMethodBeat.o(112583);
      return;
    }
  }

  public void setSwitchListener(MMSwitchBtn.a parama)
  {
    this.zNd = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMSwitchBtn
 * JD-Core Version:    0.6.2
 */