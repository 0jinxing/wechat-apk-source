package com.tencent.mm.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMTagPanelScrollView;

public class LabelContainerView extends MMTagPanelScrollView
{
  private int LJ;
  boolean LW;
  float Mb;
  float Mc;
  float Md;
  float Me;
  boolean zmM;
  boolean zmN;
  boolean zmO;
  float zmP;
  float zmQ;
  float zmR;
  float zmS;
  private LabelContainerView.a zmT;

  public LabelContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(105209);
    this.LW = true;
    this.zmM = false;
    this.zmN = true;
    this.zmO = false;
    dHU();
    AppMethodBeat.o(105209);
  }

  public LabelContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(105208);
    this.LW = true;
    this.zmM = false;
    this.zmN = true;
    this.zmO = false;
    dHU();
    AppMethodBeat.o(105208);
  }

  private void dHU()
  {
    AppMethodBeat.i(105211);
    int i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.LJ = (i * i);
    AppMethodBeat.o(105211);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(105212);
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(105212);
    return bool;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(105210);
    int i = paramMotionEvent.getAction();
    int j;
    if ((i & 0xFF) == 6)
    {
      j = 1;
      if (j == 0)
        break label110;
    }
    int m;
    float f1;
    float f2;
    float f4;
    label110: for (int k = paramMotionEvent.getActionIndex(); ; k = -1)
    {
      m = paramMotionEvent.getPointerCount();
      int n = 0;
      f1 = 0.0F;
      for (f2 = 0.0F; n < m; f2 = f4)
      {
        float f3 = f1;
        f4 = f2;
        if (k != n)
        {
          f4 = f2 + paramMotionEvent.getX(n);
          f3 = f1 + paramMotionEvent.getY(n);
        }
        n++;
        f1 = f3;
      }
      j = 0;
      break;
    }
    if (j != 0)
    {
      j = m - 1;
      f4 = f2 / j;
      f1 /= j;
      switch (i)
      {
      default:
      case 0:
      case 2:
      case 1:
      case 3:
      }
    }
    while (true)
    {
      label172: boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(105210);
      while (true)
      {
        return bool;
        j = m;
        break;
        this.zmN = true;
        this.zmQ = f4;
        this.zmP = f4;
        this.zmS = f1;
        this.zmR = f1;
        this.zmO = true;
        break label172;
        j = (int)(f4 - this.zmP);
        k = (int)(f1 - this.zmR);
        if (k * k + j * j <= this.LJ)
          break label172;
        this.zmN = false;
        AppMethodBeat.o(105210);
        bool = true;
      }
      this.zmN = true;
      this.zmO = false;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(105213);
    int i = paramMotionEvent.getAction();
    int j;
    if ((i & 0xFF) == 6)
    {
      j = 1;
      if (j == 0)
        break label110;
    }
    int m;
    float f1;
    float f2;
    label110: for (int k = paramMotionEvent.getActionIndex(); ; k = -1)
    {
      m = paramMotionEvent.getPointerCount();
      int n = 0;
      f1 = 0.0F;
      float f4;
      for (f2 = 0.0F; n < m; f2 = f4)
      {
        float f3 = f1;
        f4 = f2;
        if (k != n)
        {
          f4 = f2 + paramMotionEvent.getX(n);
          f3 = f1 + paramMotionEvent.getY(n);
        }
        n++;
        f1 = f3;
      }
      j = 0;
      break;
    }
    if (j != 0)
    {
      j = m - 1;
      f2 /= j;
      f1 /= j;
      switch (i)
      {
      default:
      case 0:
      case 2:
      case 1:
      case 3:
      }
    }
    while (true)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(105213);
      return bool;
      j = m;
      break;
      this.LW = true;
      this.Mb = f2;
      this.Md = f2;
      this.Mc = f1;
      this.Me = f1;
      this.zmM = true;
      continue;
      if (!this.zmM)
      {
        this.LW = true;
        this.Mb = f2;
        this.Md = f2;
        this.Mc = f1;
        this.Me = f1;
        this.zmM = true;
      }
      if (this.zmT != null)
        this.zmT.bml();
      k = (int)(f2 - this.Md);
      j = (int)(f1 - this.Me);
      if (j * j + k * k > this.LJ)
      {
        this.LW = false;
        continue;
        if (((this.LW) || (!this.zmM)) && (this.zmT != null))
          this.zmT.bmk();
        this.LW = true;
        this.zmM = false;
      }
    }
  }

  public void setOnLabelContainerListener(LabelContainerView.a parama)
  {
    this.zmT = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.LabelContainerView
 * JD-Core Version:    0.6.2
 */