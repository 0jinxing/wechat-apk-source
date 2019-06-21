package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

final class v
{
  final v.b aha;
  final v.a ahb;
  final List<View> ahc;

  v(v.b paramb)
  {
    this.aha = paramb;
    this.ahb = new v.a();
    this.ahc = new ArrayList();
  }

  private int bH(int paramInt)
  {
    if (paramInt < 0)
      paramInt = -1;
    while (true)
    {
      return paramInt;
      int i = this.aha.getChildCount();
      int j = paramInt;
      while (true)
      {
        if (j >= i)
          break label71;
        int k = paramInt - (j - this.ahb.bK(j));
        if (k == 0)
          while (true)
          {
            paramInt = j;
            if (!this.ahb.get(j))
              break;
            j++;
          }
        j += k;
      }
      label71: paramInt = -1;
    }
  }

  final void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (paramInt < 0);
    for (paramInt = this.aha.getChildCount(); ; paramInt = bH(paramInt))
    {
      this.ahb.m(paramInt, paramBoolean);
      if (paramBoolean)
        aW(paramView);
      this.aha.attachViewToParent(paramView, paramInt, paramLayoutParams);
      return;
    }
  }

  final void a(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramInt < 0);
    for (paramInt = this.aha.getChildCount(); ; paramInt = bH(paramInt))
    {
      this.ahb.m(paramInt, paramBoolean);
      if (paramBoolean)
        aW(paramView);
      this.aha.addView(paramView, paramInt);
      return;
    }
  }

  final void aW(View paramView)
  {
    this.ahc.add(paramView);
    this.aha.ba(paramView);
  }

  final boolean aX(View paramView)
  {
    if (this.ahc.remove(paramView))
      this.aha.bb(paramView);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final boolean aY(View paramView)
  {
    return this.ahc.contains(paramView);
  }

  final View bI(int paramInt)
  {
    return this.aha.getChildAt(paramInt);
  }

  final void detachViewFromParent(int paramInt)
  {
    paramInt = bH(paramInt);
    this.ahb.bJ(paramInt);
    this.aha.detachViewFromParent(paramInt);
  }

  final View getChildAt(int paramInt)
  {
    paramInt = bH(paramInt);
    return this.aha.getChildAt(paramInt);
  }

  final int getChildCount()
  {
    return this.aha.getChildCount() - this.ahc.size();
  }

  final int hU()
  {
    return this.aha.getChildCount();
  }

  final int indexOfChild(View paramView)
  {
    int i = -1;
    int j = this.aha.indexOfChild(paramView);
    if (j == -1);
    while (true)
    {
      return i;
      if (!this.ahb.get(j))
        i = j - this.ahb.bK(j);
    }
  }

  final void removeViewAt(int paramInt)
  {
    paramInt = bH(paramInt);
    View localView = this.aha.getChildAt(paramInt);
    if (localView == null);
    while (true)
    {
      return;
      if (this.ahb.bJ(paramInt))
        aX(localView);
      this.aha.removeViewAt(paramInt);
    }
  }

  public final String toString()
  {
    return this.ahb.toString() + ", hidden list:" + this.ahc.size();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.v
 * JD-Core Version:    0.6.2
 */