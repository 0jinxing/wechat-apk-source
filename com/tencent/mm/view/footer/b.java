package com.tencent.mm.view.footer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.e;
import com.tencent.mm.api.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;

public final class b extends a
{
  private Bitmap AcI;
  private Bitmap AcJ;
  private Bitmap AcK;
  private Bitmap AcL;
  private Bitmap AcM;
  private Bitmap AcN;
  private Bitmap AcO;
  private Bitmap AcP;
  private Bitmap AcQ;
  private Bitmap AcR;
  private Bitmap AcS;
  private Bitmap AcT;
  private Bitmap AcU;
  private Bitmap AcV;
  private Rect[] AcW;
  private Rect[] AcX;
  private boolean AcY;
  private boolean AcZ;
  private boolean Ada;
  private boolean Adb;
  private boolean Adc;
  private int Add;
  private Paint zAp;

  public b(Context paramContext, com.tencent.mm.br.b paramb)
  {
    super(paramContext, paramb);
    AppMethodBeat.i(116427);
    this.AcW = new Rect[2];
    this.AcX = new Rect[4];
    this.Adc = true;
    this.Add = -1;
    AppMethodBeat.o(116427);
  }

  private void dMT()
  {
    AppMethodBeat.i(116436);
    if (this.AcW == null)
      this.AcW = new Rect[2];
    if (this.AcA == null)
      this.AcA = new Rect();
    float f1 = (getMeasuredWidth() - getPaddingLeftAndRight() - this.Acu.getWidth() - this.AcP.getWidth() - this.AcM.getWidth()) / 3.0F;
    int i = (int)(this.AcO.getWidth() / 2 + f1);
    int j = (getDetailHeight() - this.AcO.getWidth()) / 2 + this.AcO.getWidth() / 2;
    int k = this.AcO.getWidth() * 2;
    this.AcW[0] = new Rect(i - k, j - k, i + k, j + k);
    float f2 = i;
    i = (int)(f1 + this.AcO.getWidth() + f2);
    this.AcW[1] = new Rect(i - k, j - k, i + k, j + k);
    j = getMeasuredWidth() - getPaddingLeftAndRight() / 2 - this.Acu.getWidth() / 2;
    this.AcA.set(j - this.Acu.getWidth(), 0, j + this.Acu.getWidth(), getDetailHeight());
    AppMethodBeat.o(116436);
  }

  private void dMU()
  {
    AppMethodBeat.i(116437);
    if (this.AcX == null)
      this.AcX = new Rect[4];
    int i = (int)getResources().getDimension(2131428261);
    float f1 = i / 2 - this.AcR.getHeight() / 2;
    float f2 = getResources().getDimension(2131428406) / 2.0F;
    float f3 = this.AcV.getHeight() / 2;
    float f4 = i;
    float f5 = 1.0F * getPaddingLeftAndRight() / 2.0F;
    int j = (int)(f1 + this.AcV.getHeight() / 2);
    int k = (int)(f5 + this.AcV.getHeight() / 2);
    i = this.AcV.getHeight();
    this.AcX[0] = new Rect(k - i, j - i, k + i, j + i);
    j = (int)(f4 + (f2 - f3) + this.AcV.getHeight() / 2);
    this.AcX[1] = new Rect(k - i, j - i, k + i, j + i);
    k = getMeasuredWidth() - getPaddingLeftAndRight() / 2 - this.AcV.getHeight() / 2;
    this.AcX[2] = new Rect(k - i, j - i, k + i, j + i);
    k = getMeasuredWidth() / 2;
    this.AcX[3] = new Rect(k - i, j - i, k + i, j + i);
    AppMethodBeat.o(116437);
  }

  protected final boolean QG(int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(116432);
    boolean bool2 = super.QG(paramInt);
    switch (1.vwX[QF(paramInt).ordinal()])
    {
    default:
      bool1 = bool2;
    case 1:
    case 2:
    }
    AppMethodBeat.o(116432);
    return bool1;
  }

  protected final Bitmap a(e parame, boolean paramBoolean)
  {
    Bitmap localBitmap = null;
    if (parame == e.ccL)
      if (paramBoolean)
        localBitmap = this.AcL;
    while (true)
    {
      return localBitmap;
      localBitmap = this.AcK;
      continue;
      if (parame == e.ccK)
        if (paramBoolean)
          localBitmap = this.AcI;
        else
          localBitmap = this.AcJ;
    }
  }

  protected final void dMO()
  {
    AppMethodBeat.i(116428);
    super.dMO();
    this.zAp = new Paint(1);
    this.zAp.setTextSize(getResources().getDimension(2131428260));
    this.AcM = BitmapFactory.decodeResource(getResources(), 2130839607);
    this.AcN = BitmapFactory.decodeResource(getResources(), 2130839606);
    this.AcO = BitmapFactory.decodeResource(getResources(), 2130839609);
    this.AcP = BitmapFactory.decodeResource(getResources(), 2130839608);
    this.AcJ = d.v(getResources().getDrawable(2131231642));
    this.AcI = d.v(getResources().getDrawable(2131231641));
    this.AcK = d.v(getResources().getDrawable(2131231168));
    this.AcL = d.v(getResources().getDrawable(2131231167));
    this.AcQ = d.v(getResources().getDrawable(2131231873));
    this.AcR = d.v(getResources().getDrawable(2131231874));
    this.AcT = d.v(getResources().getDrawable(2131232011));
    this.AcS = d.v(getResources().getDrawable(2131232010));
    this.AcU = d.v(getResources().getDrawable(2131231048));
    this.AcV = d.v(getResources().getDrawable(2131231047));
    AppMethodBeat.o(116428);
  }

  protected final void dMQ()
  {
    AppMethodBeat.i(116435);
    super.dMQ();
    if (getCurFeatureType() == e.ccK)
    {
      dMT();
      AppMethodBeat.o(116435);
    }
    while (true)
    {
      return;
      if (getCurFeatureType() == e.ccL)
        dMU();
      AppMethodBeat.o(116435);
    }
  }

  protected final int getDetailHeight()
  {
    AppMethodBeat.i(116431);
    int i = super.getDetailHeight();
    if (i == 0)
      if (getCurFeatureType() == e.ccK)
      {
        i = (int)getResources().getDimension(2131428405);
        AppMethodBeat.o(116431);
      }
    while (true)
    {
      return i;
      if (getCurFeatureType() == e.ccL)
      {
        i = (int)(getResources().getDimension(2131428406) + getResources().getDimension(2131428261));
        AppMethodBeat.o(116431);
      }
      else
      {
        AppMethodBeat.o(116431);
      }
    }
  }

  protected final void hJ(int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(116433);
    super.hJ(paramInt1, paramInt2);
    switch (1.vwX[QF(this.jpc).ordinal()])
    {
    default:
      break;
      label52: AppMethodBeat.o(116433);
    case 2:
    case 1:
    }
    while (true)
    {
      return;
      for (i = 0; ; i++)
      {
        if (i >= this.AcW.length)
          break label134;
        localRect = this.AcW[i];
        if (localRect == null)
          ab.e("PhotoFooterView", "[onDetailTouchDispatch] detailRect is null! %s", new Object[] { Integer.valueOf(i) });
        if ((localRect != null) && (localRect.contains(paramInt1, paramInt2)))
        {
          this.Add = i;
          AppMethodBeat.o(116433);
          break;
        }
      }
      label134: AppMethodBeat.o(116433);
      continue;
      i++;
      if (i >= this.AcX.length)
        break label52;
      Rect localRect = this.AcX[i];
      if ((localRect == null) || (!localRect.contains(paramInt1, paramInt2)))
        break;
      if (i == 0)
      {
        this.AcZ = true;
        AppMethodBeat.o(116433);
      }
      else if (i == 1)
      {
        this.AcY = true;
        AppMethodBeat.o(116433);
      }
      else if (i == 2)
      {
        this.Ada = true;
        AppMethodBeat.o(116433);
      }
      else
      {
        if (i != 3)
          break label52;
        this.Adb = true;
        AppMethodBeat.o(116433);
      }
    }
  }

  protected final void hK(int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(116434);
    super.hK(paramInt1, paramInt2);
    switch (1.vwX[QF(this.jpc).ordinal()])
    {
    default:
    case 2:
    case 1:
    }
    label300: 
    while (true)
    {
      AppMethodBeat.o(116434);
      Rect localRect;
      while (true)
      {
        return;
        do
        {
          i++;
          if ((this.AcW == null) || (i >= this.AcW.length))
            break;
          localRect = this.AcW[i];
        }
        while ((localRect == null) || (!localRect.contains(paramInt1, paramInt2)) || (i != this.Add));
        getPresenter().getSelectedFeatureListener().a(e.ccK, i);
        this.Acw = this.jpc;
        AppMethodBeat.o(116434);
        continue;
        AppMethodBeat.o(116434);
      }
      for (i = 0; ; i++)
      {
        if ((this.AcX == null) || (i >= this.AcX.length))
          break label300;
        localRect = this.AcX[i];
        if ((localRect != null) && (localRect.contains(paramInt1, paramInt2)))
        {
          if (((i == 0) && (this.AcZ)) || ((i == 1) && (this.AcY)) || ((i == 2) && (this.Ada)) || ((i == 3) && (this.Adb)))
          {
            getPresenter().getSelectedFeatureListener().a(e.ccL, i);
            this.Acw = this.jpc;
          }
          this.AcZ = false;
          this.AcY = false;
          this.Ada = false;
          this.Adb = false;
          AppMethodBeat.o(116434);
          break;
        }
      }
    }
  }

  protected final void n(Canvas paramCanvas)
  {
    AppMethodBeat.i(116430);
    if (getCurFeatureType() != e.ccL)
    {
      super.n(paramCanvas);
      AppMethodBeat.o(116430);
    }
    while (true)
    {
      return;
      o(paramCanvas);
      AppMethodBeat.o(116430);
    }
  }

  protected final void o(Canvas paramCanvas)
  {
    AppMethodBeat.i(116438);
    super.o(paramCanvas);
    Paint localPaint;
    Bitmap localBitmap;
    label62: float f1;
    float f2;
    if (getCurFeatureType() == e.ccK)
    {
      localPaint = new Paint();
      if (CL())
      {
        localPaint.setAlpha(255);
        if ((!this.AcB) || (!CL()))
          break label240;
        localBitmap = this.Acv;
        paramCanvas.drawBitmap(localBitmap, getMeasuredWidth() - getPaddingLeftAndRight() / 2 - this.Acu.getWidth(), (getDetailHeight() - this.Acu.getHeight()) / 2, localPaint);
        f1 = (getMeasuredWidth() - getPaddingLeftAndRight() - this.Acu.getWidth() - this.AcP.getWidth() - this.AcM.getWidth()) / 3.0F;
        f2 = 1.0F * (getDetailHeight() - this.AcP.getHeight()) / 2.0F;
        if (this.Adc)
        {
          this.Add = 0;
          this.Adc = false;
        }
        if (this.Add != 0)
          break label248;
        paramCanvas.drawBitmap(this.AcN, f1, f2, null);
        paramCanvas.drawBitmap(this.AcO, f1 + f1 + this.AcP.getWidth(), f2, null);
        AppMethodBeat.o(116438);
      }
    }
    label240: label503: 
    while (true)
    {
      return;
      localPaint.setAlpha(160);
      break;
      localBitmap = this.Acu;
      break label62;
      label248: if (this.Add == 1)
      {
        paramCanvas.drawBitmap(this.AcM, f1, f2, null);
        paramCanvas.drawBitmap(this.AcP, f1 + f1 + this.AcP.getWidth(), f2, null);
        AppMethodBeat.o(116438);
      }
      else
      {
        paramCanvas.drawBitmap(this.AcM, f1, f2, null);
        paramCanvas.drawBitmap(this.AcO, f1 + f1 + this.AcP.getWidth(), f2, null);
        AppMethodBeat.o(116438);
        continue;
        if (getCurFeatureType() == e.ccL)
        {
          int i = (int)getResources().getDimension(2131428261);
          paramCanvas.drawLine(0.0F, i, getMeasuredWidth(), i, this.AcC);
          float f3 = getResources().getDimension(2131428406) / 2.0F - this.AcV.getHeight() / 2 + i;
          f2 = 1.0F * getPaddingLeftAndRight() / 2.0F;
          f1 = i / 2 - this.AcR.getHeight() / 2;
          if (this.AcZ)
          {
            paramCanvas.drawBitmap(this.AcR, f2, f1, null);
            if (!this.Ada)
              break label663;
            paramCanvas.drawBitmap(this.AcT, getMeasuredWidth() - f2 - this.AcV.getWidth(), f3, null);
            if (!this.AcY)
              break label694;
            paramCanvas.drawBitmap(this.AcU, f2, f3, null);
          }
          while (true)
          {
            f2 = getResources().getDimension(2131428260) * 2.0F;
            f3 = getResources().getDimension(2131428260);
            f1 = getResources().getDimension(2131428406) / 2.0F;
            f1 = (f3 - 8.0F) / 2.0F + f1 + i;
            f3 = getMeasuredWidth() / 2;
            if (!this.Adb)
              break label710;
            this.zAp.setColor(-1);
            this.zAp.setAlpha(160);
            paramCanvas.drawText(getResources().getString(2131298804), f3 - f2 / 2.0F, f1, this.zAp);
            AppMethodBeat.o(116438);
            break;
            paramCanvas.drawBitmap(this.AcQ, f2, f1, null);
            break label468;
            paramCanvas.drawBitmap(this.AcS, getMeasuredWidth() - f2 - this.AcV.getWidth(), f3, null);
            break label503;
            paramCanvas.drawBitmap(this.AcV, f2, f3, null);
          }
          if (CL())
          {
            this.zAp.setColor(-1);
            this.zAp.setAlpha(255);
            paramCanvas.drawText(getResources().getString(2131298804), f3 - f2 / 2.0F, f1, this.zAp);
            AppMethodBeat.o(116438);
          }
          else
          {
            this.zAp.setColor(-1);
            this.zAp.setAlpha(100);
            paramCanvas.drawText(getResources().getString(2131298804), f3 - f2 / 2.0F, f1, this.zAp);
          }
        }
        else
        {
          AppMethodBeat.o(116438);
        }
      }
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116429);
    if (getCurFeatureType() != e.ccL)
    {
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(116429);
    }
    while (true)
    {
      return;
      int i = View.MeasureSpec.getSize(paramInt1);
      int j = getPaddingLeft();
      paramInt2 = getPaddingRight();
      paramInt1 = View.MeasureSpec.makeMeasureSpec(getDetailHeight(), 1073741824);
      setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i - j - paramInt2, 1073741824), paramInt1);
      dMQ();
      AppMethodBeat.o(116429);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.footer.b
 * JD-Core Version:    0.6.2
 */