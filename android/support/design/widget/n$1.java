package android.support.design.widget;

import android.support.v4.view.s;
import android.support.v4.widget.t;
import android.support.v4.widget.t.a;
import android.view.View;
import android.view.ViewParent;

final class n$1 extends t.a
{
  private int mActivePointerId = -1;
  private int rM;

  n$1(n paramn)
  {
  }

  public final void N(int paramInt)
  {
    if (this.rN.rE != null)
      this.rN.rE.I(paramInt);
  }

  public final void a(View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool = true;
    this.mActivePointerId = -1;
    int i = paramView.getWidth();
    int j;
    if (paramFloat1 != 0.0F)
      if (s.T(paramView) == 1)
      {
        j = 1;
        if (this.rN.rI != 2)
          break label114;
        j = 1;
        label45: if (j == 0)
          break label290;
        if (paramView.getLeft() >= this.rM)
          break label278;
        j = this.rM - i;
        label70: if (!this.rN.nl.D(j, paramView.getTop()))
          break label302;
        s.b(paramView, new n.b(this.rN, paramView, bool));
      }
    while (true)
    {
      return;
      j = 0;
      break;
      label114: if (this.rN.rI == 0)
      {
        if (j != 0)
        {
          if (paramFloat1 < 0.0F)
          {
            j = 1;
            break label45;
          }
          j = 0;
          break label45;
        }
        if (paramFloat1 > 0.0F)
        {
          j = 1;
          break label45;
        }
        j = 0;
        break label45;
      }
      if (this.rN.rI == 1)
      {
        if (j != 0)
        {
          if (paramFloat1 > 0.0F)
          {
            j = 1;
            break label45;
          }
          j = 0;
          break label45;
        }
        if (paramFloat1 < 0.0F)
        {
          j = 1;
          break label45;
        }
        j = 0;
        break label45;
        j = paramView.getLeft();
        int k = this.rM;
        int m = Math.round(paramView.getWidth() * this.rN.rJ);
        if (Math.abs(j - k) >= m)
        {
          j = 1;
          break label45;
        }
        j = 0;
        break label45;
      }
      j = 0;
      break label45;
      label278: j = this.rM + i;
      break label70;
      label290: j = this.rM;
      bool = false;
      break label70;
      label302: if ((bool) && (this.rN.rE != null))
        this.rN.rE.onDismiss(paramView);
    }
  }

  public final void b(View paramView, int paramInt1, int paramInt2)
  {
    float f1 = this.rM + paramView.getWidth() * this.rN.rK;
    float f2 = this.rM + paramView.getWidth() * this.rN.rL;
    if (paramInt1 <= f1)
      paramView.setAlpha(1.0F);
    while (true)
    {
      return;
      if (paramInt1 >= f2)
        paramView.setAlpha(0.0F);
      else
        paramView.setAlpha(n.p(1.0F - n.c(f1, f2, paramInt1)));
    }
  }

  public final boolean b(View paramView, int paramInt)
  {
    if ((this.mActivePointerId == -1) && (this.rN.h(paramView)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int c(View paramView, int paramInt)
  {
    return paramView.getTop();
  }

  public final int d(View paramView, int paramInt)
  {
    int i;
    int j;
    if (s.T(paramView) == 1)
    {
      i = 1;
      if (this.rN.rI != 0)
        break label72;
      if (i == 0)
        break label53;
      i = this.rM - paramView.getWidth();
      j = this.rM;
    }
    while (true)
    {
      return n.clamp(i, paramInt, j);
      i = 0;
      break;
      label53: i = this.rM;
      j = this.rM + paramView.getWidth();
      continue;
      label72: if (this.rN.rI == 1)
      {
        if (i != 0)
        {
          i = this.rM;
          j = this.rM + paramView.getWidth();
        }
        else
        {
          i = this.rM - paramView.getWidth();
          j = this.rM;
        }
      }
      else
      {
        i = this.rM - paramView.getWidth();
        j = this.rM + paramView.getWidth();
      }
    }
  }

  public final void k(View paramView, int paramInt)
  {
    this.mActivePointerId = paramInt;
    this.rM = paramView.getLeft();
    paramView = paramView.getParent();
    if (paramView != null)
      paramView.requestDisallowInterceptTouchEvent(true);
  }

  public final int s(View paramView)
  {
    return paramView.getWidth();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.design.widget.n.1
 * JD-Core Version:    0.6.2
 */