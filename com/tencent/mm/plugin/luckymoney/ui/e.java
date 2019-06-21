package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import com.tencent.mm.plugin.luckymoney.model.r;
import java.util.LinkedList;
import java.util.List;

public abstract class e extends BaseAdapter
{
  protected Context mContext;
  protected LayoutInflater mInflater;
  protected List<r> nSx = new LinkedList();

  public e(Context paramContext)
  {
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
  }

  public final void a(r paramr)
  {
    this.nSx.remove(paramr);
  }

  public final void ck(List<r> paramList)
  {
    if (paramList == null);
    for (this.nSx = new LinkedList(); ; this.nSx = paramList)
    {
      notifyDataSetChanged();
      return;
    }
  }

  public int getCount()
  {
    return this.nSx.size();
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final r yb(int paramInt)
  {
    return (r)this.nSx.get(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.e
 * JD-Core Version:    0.6.2
 */