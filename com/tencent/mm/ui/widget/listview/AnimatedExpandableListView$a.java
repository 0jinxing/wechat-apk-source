package com.tencent.mm.ui.widget.listview;

import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import java.util.List;

public abstract class AnimatedExpandableListView$a extends BaseExpandableListAdapter
{
  private SparseArray<AnimatedExpandableListView.d> zQU = new SparseArray();
  private AnimatedExpandableListView zQV;

  private AnimatedExpandableListView.d Qk(int paramInt)
  {
    AnimatedExpandableListView.d locald1 = (AnimatedExpandableListView.d)this.zQU.get(paramInt);
    AnimatedExpandableListView.d locald2 = locald1;
    if (locald1 == null)
    {
      locald2 = new AnimatedExpandableListView.d((byte)0);
      this.zQU.put(paramInt, locald2);
    }
    return locald2;
  }

  public abstract int Ec(int paramInt);

  public final void Ql(int paramInt)
  {
    Qk(paramInt).zRh = -1;
  }

  public abstract View d(int paramInt1, int paramInt2, View paramView);

  public final int getChildType(int paramInt1, int paramInt2)
  {
    if (Qk(paramInt1).mSe);
    for (paramInt1 = 0; ; paramInt1 = 1)
      return paramInt1;
  }

  public final int getChildTypeCount()
  {
    return 2;
  }

  public final View getChildView(int paramInt1, int paramInt2, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    AnimatedExpandableListView.d locald = Qk(paramInt1);
    if (locald.mSe)
    {
      if ((paramView instanceof AnimatedExpandableListView.b))
        break label478;
      paramView = new AnimatedExpandableListView.b(paramViewGroup.getContext(), (byte)0);
      paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
    }
    label478: 
    while (true)
    {
      if (paramInt2 < locald.zRg)
      {
        paramView.getLayoutParams().height = 0;
        paramViewGroup = paramView;
      }
      while (true)
      {
        return paramViewGroup;
        ExpandableListView localExpandableListView = (ExpandableListView)paramViewGroup;
        AnimatedExpandableListView.b localb = (AnimatedExpandableListView.b)paramView;
        localb.zRa.clear();
        AnimatedExpandableListView.b.a(localb, localExpandableListView.getDivider(), paramViewGroup.getMeasuredWidth(), localExpandableListView.getDividerHeight());
        int i = View.MeasureSpec.makeMeasureSpec(paramViewGroup.getWidth(), 1073741824);
        int j = View.MeasureSpec.makeMeasureSpec(0, 0);
        paramInt2 = 0;
        int k = paramViewGroup.getHeight();
        int m = Ec(paramInt1);
        for (int n = locald.zRg; ; n++)
        {
          i1 = paramInt2;
          if (n >= m)
            break label244;
          paramViewGroup = d(paramInt1, n, null);
          paramViewGroup.measure(i, j);
          paramInt2 += paramViewGroup.getMeasuredHeight();
          if (paramInt2 >= k)
            break;
          localb.fp(paramViewGroup);
        }
        localb.fp(paramViewGroup);
        int i1 = paramInt2 + (m - n - 1) * (paramInt2 / (n + 1));
        label244: paramViewGroup = localb.getTag();
        if (paramViewGroup == null);
        for (paramInt2 = 0; ; paramInt2 = ((Integer)paramViewGroup).intValue())
        {
          if ((!locald.zRf) || (paramInt2 == 1))
            break label352;
          paramViewGroup = new AnimatedExpandableListView.c(localb, 0, i1, locald, (byte)0);
          paramViewGroup.setDuration(AnimatedExpandableListView.a(this.zQV));
          paramViewGroup.setAnimationListener(new AnimatedExpandableListView.a.1(this, paramInt1, localb));
          localb.startAnimation(paramViewGroup);
          localb.setTag(Integer.valueOf(1));
          paramViewGroup = paramView;
          break;
        }
        label352: paramViewGroup = paramView;
        if (!locald.zRf)
        {
          paramViewGroup = paramView;
          if (paramInt2 != 2)
          {
            if (locald.zRh == -1)
              locald.zRh = i1;
            paramViewGroup = new AnimatedExpandableListView.c(localb, locald.zRh, 0, locald, (byte)0);
            paramViewGroup.setDuration(AnimatedExpandableListView.a(this.zQV));
            paramViewGroup.setAnimationListener(new AnimatedExpandableListView.a.2(this, paramInt1, localExpandableListView, locald, localb));
            localb.startAnimation(paramViewGroup);
            localb.setTag(Integer.valueOf(2));
            paramViewGroup = paramView;
            continue;
            paramViewGroup = d(paramInt1, paramInt2, paramView);
          }
        }
      }
    }
  }

  public final int getChildrenCount(int paramInt)
  {
    AnimatedExpandableListView.d locald = Qk(paramInt);
    if (locald.mSe);
    for (paramInt = locald.zRg + 1; ; paramInt = Ec(paramInt))
      return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.listview.AnimatedExpandableListView.a
 * JD-Core Version:    0.6.2
 */