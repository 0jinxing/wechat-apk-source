package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

abstract class m
  implements o, s, AdapterView.OnItemClickListener
{
  Rect ach;

  protected static int a(ListAdapter paramListAdapter, ViewGroup paramViewGroup, Context paramContext, int paramInt)
  {
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = paramListAdapter.getCount();
    int m = 0;
    int n = 0;
    Object localObject = null;
    int i1 = 0;
    ViewGroup localViewGroup = paramViewGroup;
    paramViewGroup = (ViewGroup)localObject;
    int i3;
    if (m < k)
    {
      int i2 = paramListAdapter.getItemViewType(m);
      i3 = n;
      localObject = paramViewGroup;
      if (i2 != n)
      {
        i3 = i2;
        localObject = null;
      }
      paramViewGroup = localViewGroup;
      if (localViewGroup == null)
        paramViewGroup = new FrameLayout(paramContext);
      localObject = paramListAdapter.getView(m, (View)localObject, paramViewGroup);
      ((View)localObject).measure(i, j);
      n = ((View)localObject).getMeasuredWidth();
      if (n >= paramInt)
        label130: return paramInt;
      if (n <= i1)
        break label165;
      i1 = n;
    }
    label165: 
    while (true)
    {
      m++;
      localViewGroup = paramViewGroup;
      n = i3;
      paramViewGroup = (ViewGroup)localObject;
      break;
      paramInt = i1;
      break label130;
    }
  }

  protected static g a(ListAdapter paramListAdapter)
  {
    if ((paramListAdapter instanceof HeaderViewListAdapter));
    for (paramListAdapter = (g)((HeaderViewListAdapter)paramListAdapter).getWrappedAdapter(); ; paramListAdapter = (g)paramListAdapter)
      return paramListAdapter;
  }

  protected static boolean h(h paramh)
  {
    boolean bool1 = false;
    int i = paramh.size();
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        MenuItem localMenuItem = paramh.getItem(j);
        if ((localMenuItem.isVisible()) && (localMenuItem.getIcon() != null))
          bool2 = true;
      }
      else
      {
        return bool2;
      }
    }
  }

  public final void a(Context paramContext, h paramh)
  {
  }

  public final boolean b(j paramj)
  {
    return false;
  }

  public final boolean c(j paramj)
  {
    return false;
  }

  public abstract void f(h paramh);

  public final int getId()
  {
    return 0;
  }

  protected boolean gq()
  {
    return true;
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramView = (ListAdapter)paramAdapterView.getAdapter();
    paramAdapterView = a(paramView).abn;
    paramView = (MenuItem)paramView.getItem(paramInt);
    if (gq());
    for (paramInt = 0; ; paramInt = 4)
    {
      paramAdapterView.a(paramView, this, paramInt);
      return;
    }
  }

  public abstract void setAnchorView(View paramView);

  public abstract void setForceShowIcon(boolean paramBoolean);

  public abstract void setGravity(int paramInt);

  public abstract void setHorizontalOffset(int paramInt);

  public abstract void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener);

  public abstract void setShowTitle(boolean paramBoolean);

  public abstract void setVerticalOffset(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.m
 * JD-Core Version:    0.6.2
 */