package com.tencent.mm.ui.base;

import android.os.Build.VERSION;
import android.support.v4.view.p;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

public abstract class x extends p
{
  private final w yAD;

  public x()
  {
    this(new w());
  }

  private x(w paramw)
  {
    this.yAD = paramw;
    SparseArray[] arrayOfSparseArray = new SparseArray[1];
    for (int i = 0; i <= 0; i++)
      arrayOfSparseArray[0] = new SparseArray();
    paramw.yAB = 1;
    paramw.yAC = arrayOfSparseArray[0];
    paramw.yAA = arrayOfSparseArray;
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramObject = (View)paramObject;
    paramViewGroup.removeView(paramObject);
    int i = getItemViewType(paramInt);
    if (i != -1)
    {
      paramViewGroup = this.yAD;
      if (paramViewGroup.yAB != 1)
        break label59;
      paramViewGroup.yAC.put(paramInt, paramObject);
    }
    while (true)
    {
      if (Build.VERSION.SDK_INT >= 14)
        paramObject.setAccessibilityDelegate(null);
      return;
      label59: paramViewGroup.yAA[i].put(paramInt, paramObject);
    }
  }

  public int getItemViewType(int paramInt)
  {
    return 0;
  }

  public abstract View getView(int paramInt, View paramView, ViewGroup paramViewGroup);

  public final Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    Object localObject1 = null;
    int i = getItemViewType(paramInt);
    Object localObject2 = localObject1;
    w localw;
    if (i != -1)
    {
      localw = this.yAD;
      if (localw.yAB != 1)
        break label63;
      localObject2 = w.a(localw.yAC, paramInt);
    }
    while (true)
    {
      localObject2 = getView(paramInt, (View)localObject2, paramViewGroup);
      paramViewGroup.addView((View)localObject2);
      return localObject2;
      label63: localObject2 = localObject1;
      if (i >= 0)
      {
        localObject2 = localObject1;
        if (i < localw.yAA.length)
          localObject2 = w.a(localw.yAA[i], paramInt);
      }
    }
  }

  public final boolean isViewFromObject(View paramView, Object paramObject)
  {
    if (paramView == paramObject);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void notifyDataSetChanged()
  {
    w localw = this.yAD;
    View[] arrayOfView = localw.yAy;
    int[] arrayOfInt = localw.yAz;
    Object localObject1;
    int j;
    label38: View localView;
    if (localw.yAB > 1)
    {
      i = 1;
      localObject1 = localw.yAC;
      j = arrayOfView.length - 1;
      if (j < 0)
        break label158;
      localView = arrayOfView[j];
      localObject2 = localObject1;
      if (localView != null)
      {
        k = arrayOfInt[j];
        arrayOfView[j] = null;
        arrayOfInt[j] = -1;
        if (k < 0)
          break label152;
      }
    }
    label152: for (int m = 1; ; m = 0)
    {
      localObject2 = localObject1;
      if (m != 0)
      {
        if (i != 0)
          localObject1 = localw.yAA[k];
        ((SparseArray)localObject1).put(j, localView);
        localObject2 = localObject1;
        if (Build.VERSION.SDK_INT >= 14)
        {
          localView.setAccessibilityDelegate(null);
          localObject2 = localObject1;
        }
      }
      j--;
      localObject1 = localObject2;
      break label38;
      i = 0;
      break;
    }
    label158: int k = localw.yAy.length;
    int n = localw.yAB;
    Object localObject2 = localw.yAA;
    for (int i = 0; i < n; i++)
    {
      localObject1 = localObject2[i];
      int i1 = ((SparseArray)localObject1).size();
      j = i1 - 1;
      m = 0;
      while (m < i1 - k)
      {
        ((SparseArray)localObject1).remove(((SparseArray)localObject1).keyAt(j));
        m++;
        j--;
      }
    }
    super.notifyDataSetChanged();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.x
 * JD-Core Version:    0.6.2
 */