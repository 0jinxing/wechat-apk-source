package com.tencent.mm.ui.base.sortview;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.mm.sdk.platformtools.ab;
import junit.framework.Assert;

public abstract class b extends BaseAdapter
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener
{
  protected Context mContext;
  protected SparseArray<a> yDr;
  protected Runnable yDs;

  public b(Context paramContext)
  {
    if (paramContext == null)
      throw new NullPointerException("context is null.");
    this.mContext = paramContext;
    this.yDr = new SparseArray();
    this.yDs = new b.1(this);
  }

  public int getCount()
  {
    return this.yDr.size();
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public int getItemViewType(int paramInt)
  {
    int i = 0;
    if (se(paramInt) != null)
      if (se(paramInt) == null)
        paramInt = i;
    while (true)
    {
      return paramInt;
      paramInt = se(paramInt).type;
      continue;
      ab.d("MicroMsg.BaseMutilDataItemAdapter", "getItemViewType: get data item fail, return unkown Type, totalCount(%d) , position(%d)", new Object[] { Integer.valueOf(getCount()), Integer.valueOf(paramInt) });
      paramInt = i;
    }
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    long l1 = System.currentTimeMillis();
    a locala = se(paramInt);
    if (locala == null)
      ab.e("MicroMsg.BaseMutilDataItemAdapter", "DataItem is null.");
    long l2;
    a.b localb;
    while (true)
    {
      return paramView;
      l2 = System.currentTimeMillis();
      localb = locala.aVY();
      if (localb != null)
        break;
      ab.e("MicroMsg.BaseMutilDataItemAdapter", "ViewItem is null.");
    }
    if (paramView == null)
    {
      paramView = localb.c(this.mContext, paramView);
      paramViewGroup = locala.aVZ();
      localb.a(paramView, paramViewGroup);
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      Object[] arrayOfObject = sc(paramInt);
      Assert.assertNotNull(paramViewGroup);
      if (!locala.dAG())
        locala.a(this.mContext, paramViewGroup, arrayOfObject);
      long l3 = System.currentTimeMillis();
      localb.a(this.mContext, paramViewGroup, locala);
      ab.d("MicroMsg.BaseMutilDataItemAdapter", "position %d, getItem %d, inflate %d, filling data %d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(l2 - l1), Long.valueOf(l3 - l2), Long.valueOf(System.currentTimeMillis() - l3) });
      break;
      paramViewGroup = (a.a)paramView.getTag();
    }
  }

  public int getViewTypeCount()
  {
    return 7;
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramView = se(paramInt);
    if (paramView == null);
    while (true)
    {
      return;
      paramAdapterView = paramView.aVY();
      if ((paramAdapterView == null) || (!paramAdapterView.a(this.mContext, paramView, sc(paramInt))));
    }
  }

  protected abstract a sb(int paramInt);

  protected abstract Object[] sc(int paramInt);

  public a se(int paramInt)
  {
    Object localObject;
    if ((paramInt < 0) || (paramInt > getCount()))
    {
      ab.e("MicroMsg.BaseMutilDataItemAdapter", "The given position(%d) is illegal.", new Object[] { Integer.valueOf(paramInt) });
      localObject = null;
    }
    while (true)
    {
      return localObject;
      a locala = (a)this.yDr.get(paramInt);
      localObject = locala;
      if (locala == null)
      {
        localObject = sb(paramInt);
        this.yDr.put(paramInt, localObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.sortview.b
 * JD-Core Version:    0.6.2
 */