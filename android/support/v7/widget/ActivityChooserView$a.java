package android.support.v7.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

final class ActivityChooserView$a extends BaseAdapter
{
  e aeR;
  private int aeS = 4;
  boolean aeT;
  private boolean aeU;
  private boolean aeV;

  ActivityChooserView$a(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void bx(int paramInt)
  {
    if (this.aeS != paramInt)
    {
      this.aeS = paramInt;
      notifyDataSetChanged();
    }
  }

  public final void g(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.aeT != paramBoolean1) || (this.aeU != paramBoolean2))
    {
      this.aeT = paramBoolean1;
      this.aeU = paramBoolean2;
      notifyDataSetChanged();
    }
  }

  public final int getCount()
  {
    int i = this.aeR.hg();
    int j = i;
    if (!this.aeT)
    {
      j = i;
      if (this.aeR.hh() != null)
        j = i - 1;
    }
    i = Math.min(j, this.aeS);
    j = i;
    if (this.aeV)
      j = i + 1;
    return j;
  }

  public final Object getItem(int paramInt)
  {
    switch (getItemViewType(paramInt))
    {
    default:
      throw new IllegalArgumentException();
    case 1:
    case 0:
    }
    int i;
    for (Object localObject = null; ; localObject = this.aeR.bu(i))
    {
      return localObject;
      i = paramInt;
      if (!this.aeT)
      {
        i = paramInt;
        if (this.aeR.hh() != null)
          i = paramInt + 1;
      }
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    if ((this.aeV) && (paramInt == getCount() - 1));
    for (paramInt = 1; ; paramInt = 0)
      return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    switch (getItemViewType(paramInt))
    {
    default:
      throw new IllegalArgumentException();
    case 1:
      if (paramView != null)
      {
        localView = paramView;
        if (paramView.getId() == 1)
          break;
      }
      else
      {
        localView = LayoutInflater.from(this.aeQ.getContext()).inflate(2130968591, paramViewGroup, false);
        localView.setId(1);
        ((TextView)localView.findViewById(2131820678)).setText(this.aeQ.getContext().getString(2131296261));
      }
      break;
    case 0:
    }
    while (true)
    {
      return localView;
      if (paramView != null)
      {
        localView = paramView;
        if (paramView.getId() == 2131820914);
      }
      else
      {
        localView = LayoutInflater.from(this.aeQ.getContext()).inflate(2130968591, paramViewGroup, false);
      }
      paramViewGroup = this.aeQ.getContext().getPackageManager();
      ImageView localImageView = (ImageView)localView.findViewById(2131820915);
      paramView = (ResolveInfo)getItem(paramInt);
      localImageView.setImageDrawable(paramView.loadIcon(paramViewGroup));
      ((TextView)localView.findViewById(2131820678)).setText(paramView.loadLabel(paramViewGroup));
      if ((this.aeT) && (paramInt == 0) && (this.aeU))
        localView.setActivated(true);
      else
        localView.setActivated(false);
    }
  }

  public final int getViewTypeCount()
  {
    return 3;
  }

  public final int ht()
  {
    int i = this.aeS;
    this.aeS = 2147483647;
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = getCount();
    int n = 0;
    View localView = null;
    int i1 = 0;
    while (n < m)
    {
      localView = getView(n, localView, null);
      localView.measure(j, k);
      i1 = Math.max(i1, localView.getMeasuredWidth());
      n++;
    }
    this.aeS = i;
    return i1;
  }

  public final void setShowFooterView(boolean paramBoolean)
  {
    if (this.aeV != paramBoolean)
    {
      this.aeV = paramBoolean;
      notifyDataSetChanged();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActivityChooserView.a
 * JD-Core Version:    0.6.2
 */