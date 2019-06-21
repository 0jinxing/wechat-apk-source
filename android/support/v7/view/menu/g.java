package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class g extends BaseAdapter
{
  static final int abm = 2130968602;
  boolean aaK;
  private final boolean aav;
  private int abk = -1;
  public h abn;
  private final LayoutInflater mInflater;

  public g(h paramh, LayoutInflater paramLayoutInflater, boolean paramBoolean)
  {
    this.aav = paramBoolean;
    this.mInflater = paramLayoutInflater;
    this.abn = paramh;
    gt();
  }

  private void gt()
  {
    j localj = this.abn.abJ;
    int j;
    if (localj != null)
    {
      ArrayList localArrayList = this.abn.gD();
      int i = localArrayList.size();
      j = 0;
      if (j < i)
        if ((j)localArrayList.get(j) != localj);
    }
    for (this.abk = j; ; this.abk = -1)
    {
      return;
      j++;
      break;
    }
  }

  public final j br(int paramInt)
  {
    if (this.aav);
    for (ArrayList localArrayList = this.abn.gD(); ; localArrayList = this.abn.gB())
    {
      int i = paramInt;
      if (this.abk >= 0)
      {
        i = paramInt;
        if (paramInt >= this.abk)
          i = paramInt + 1;
      }
      return (j)localArrayList.get(i);
    }
  }

  public final int getCount()
  {
    ArrayList localArrayList;
    if (this.aav)
    {
      localArrayList = this.abn.gD();
      if (this.abk >= 0)
        break label40;
    }
    label40: for (int i = localArrayList.size(); ; i = localArrayList.size() - 1)
    {
      return i;
      localArrayList = this.abn.gB();
      break;
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = this.mInflater.inflate(abm, paramViewGroup, false);
    while (true)
    {
      paramViewGroup = (p.a)paramView;
      if (this.aaK)
        ((ListMenuItemView)paramView).setForceShowIcon(true);
      paramViewGroup.a(br(paramInt));
      return paramView;
    }
  }

  public final void notifyDataSetChanged()
  {
    gt();
    super.notifyDataSetChanged();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.g
 * JD-Core Version:    0.6.2
 */