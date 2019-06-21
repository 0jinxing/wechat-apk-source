package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class b extends a
{
  protected Context mContext;
  ArrayList<Object> mItems = new ArrayList();
  int rKK;

  protected b(Context paramContext)
  {
    this.mContext = paramContext;
    this.rKK = 3;
  }

  public boolean Es(int paramInt)
  {
    return true;
  }

  public boolean Et(int paramInt)
  {
    return true;
  }

  public final void add(int paramInt, Object paramObject)
  {
    cq(paramObject);
    this.mItems.add(paramInt, paramObject);
    notifyDataSetChanged();
  }

  public final void add(Object paramObject)
  {
    cq(paramObject);
    this.mItems.add(paramObject);
    notifyDataSetChanged();
  }

  public void clear()
  {
    this.rKJ.clear();
    this.mItems.clear();
    notifyDataSetChanged();
  }

  public void dy(List<?> paramList)
  {
    clear();
    dx(paramList);
    this.mItems.addAll(paramList);
    notifyDataSetChanged();
  }

  public void fB(int paramInt1, int paramInt2)
  {
    if (paramInt2 < getCount())
    {
      ArrayList localArrayList = this.mItems;
      localArrayList.add(paramInt2, localArrayList.remove(paramInt1));
      notifyDataSetChanged();
    }
  }

  public final int getColumnCount()
  {
    return this.rKK;
  }

  protected final Context getContext()
  {
    return this.mContext;
  }

  public int getCount()
  {
    return this.mItems.size();
  }

  public Object getItem(int paramInt)
  {
    return this.mItems.get(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.b
 * JD-Core Version:    0.6.2
 */