package com.tencent.mm.plugin.fts.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class d extends BaseAdapter
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener
{
  private int count;
  private AbsListView.OnScrollListener kxp;
  private e mIj;
  private SparseArray<a> mIk;
  long mIl;
  d.a mIm;
  String query;

  public d(e parame)
  {
    ab.i("MicroMsg.FTS.FTSBaseAdapter", "Create FTSBaseAdapter");
    this.mIj = parame;
    this.mIk = new SparseArray();
  }

  private a wb(int paramInt)
  {
    Object localObject1;
    if (this.mIk.indexOfKey(paramInt) >= 0)
      localObject1 = (a)this.mIk.get(paramInt);
    while (true)
    {
      return localObject1;
      Object localObject2 = null;
      localObject1 = localObject2;
      if (paramInt >= 0)
      {
        localObject1 = localObject2;
        if (paramInt < getCount())
          localObject1 = vZ(paramInt);
      }
      if (localObject1 == null)
        localObject1 = (a)this.mIk.get(0);
      else
        this.mIk.put(paramInt, localObject1);
    }
  }

  public final void Nu(String paramString)
  {
    stopSearch();
    this.mIl = System.currentTimeMillis();
    this.query = paramString;
    ab.i("MicroMsg.FTS.FTSBaseAdapter", "start search query=%s", new Object[] { paramString });
    bAL();
  }

  protected final void T(int paramInt, boolean paramBoolean)
  {
    if (this.mIm != null)
      this.mIm.U(paramInt, paramBoolean);
  }

  protected abstract boolean a(View paramView, a parama, boolean paramBoolean);

  protected abstract void bAL();

  protected int bAt()
  {
    return getCount();
  }

  protected void clearCache()
  {
    this.mIk.clear();
  }

  public void finish()
  {
    stopSearch();
  }

  public final Context getContext()
  {
    return this.mIj.getContext();
  }

  public int getCount()
  {
    return this.count;
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public int getItemViewType(int paramInt)
  {
    if (wb(paramInt) != null);
    for (paramInt = wb(paramInt).klY; ; paramInt = -1)
    {
      return paramInt;
      ab.e("MicroMsg.FTS.FTSBaseAdapter", "getItemViewType: get data item fail, return unknown Type, count=%d | position = %s", new Object[] { Integer.valueOf(getCount()), Integer.valueOf(paramInt) });
    }
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    a locala = wb(paramInt);
    View localView = paramView;
    if (paramView == null)
      localView = locala.Ps().a(getContext(), paramViewGroup);
    paramView = (a.a)localView.getTag();
    if (!locala.mFj)
    {
      locala.a(getContext(), paramView, new Object[0]);
      locala.mFj = true;
    }
    locala.Ps().a(getContext(), paramView, locala, new Object[0]);
    return localView;
  }

  public int getViewTypeCount()
  {
    return 21;
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.mIj.aqX();
    if (paramInt >= getCount());
    while (true)
    {
      return;
      paramAdapterView = wb(paramInt);
      a(paramView, paramAdapterView, paramAdapterView.Ps().a(getContext(), paramAdapterView));
      this.mIj.a(paramAdapterView);
    }
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.kxp != null)
      this.kxp.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (this.kxp != null)
      this.kxp.onScrollStateChanged(paramAbsListView, paramInt);
  }

  protected final void setCount(int paramInt)
  {
    ab.i("MicroMsg.FTS.FTSBaseAdapter", "setCount %d", new Object[] { Integer.valueOf(paramInt) });
    this.count = paramInt;
  }

  public void stopSearch()
  {
    this.count = 0;
    this.query = "";
    clearCache();
    notifyDataSetChanged();
  }

  protected abstract a vZ(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d
 * JD-Core Version:    0.6.2
 */