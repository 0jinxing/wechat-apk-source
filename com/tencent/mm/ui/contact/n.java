package com.tencent.mm.ui.contact;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.a.a;
import com.tencent.mm.ui.contact.a.a.b;
import junit.framework.Assert;

public abstract class n extends BaseAdapter
{
  protected int scene;
  private SparseArray<a> xHR;
  public l zmV;
  private boolean zmW;
  boolean zmX;

  public n(l paraml, boolean paramBoolean, int paramInt)
  {
    this(paraml, paramBoolean, paramInt, false);
  }

  public n(l paraml, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    this.zmV = paraml;
    this.zmW = paramBoolean1;
    this.xHR = new SparseArray();
    this.scene = paramInt;
    this.zmX = paramBoolean2;
  }

  public final a Pn(int paramInt)
  {
    a locala = null;
    if (this.xHR.indexOfKey(paramInt) >= 0)
      locala = (a)this.xHR.get(paramInt);
    while (true)
    {
      return locala;
      if ((paramInt >= 0) && (paramInt < getCount()))
      {
        locala = mP(paramInt);
        if (locala != null)
        {
          locala.jLx = c(locala);
          this.xHR.put(paramInt, locala);
          ab.d("MicroMsg.MMSelectContactAdapter", "put item to cache viewType=%d|position=%d", new Object[] { Integer.valueOf(locala.klY), Integer.valueOf(paramInt) });
        }
        else
        {
          ab.e("MicroMsg.MMSelectContactAdapter", "createDataItem Occur error !!!!!!!!! position = %d", new Object[] { Integer.valueOf(paramInt) });
        }
      }
      else
      {
        ab.e("MicroMsg.MMSelectContactAdapter", "getItem Occur error !!!!!!!!! position = %d", new Object[] { Integer.valueOf(paramInt) });
      }
    }
  }

  public boolean Po(int paramInt)
  {
    return false;
  }

  protected boolean c(a parama)
  {
    return false;
  }

  public boolean clI()
  {
    return this.zmW;
  }

  public final void clearCache()
  {
    if (this.xHR != null)
      this.xHR.clear();
  }

  public void finish()
  {
    clearCache();
  }

  public long getItemId(int paramInt)
  {
    return -1L;
  }

  public int getItemViewType(int paramInt)
  {
    if (Pn(paramInt) != null);
    for (paramInt = Pn(paramInt).klY; ; paramInt = -1)
    {
      return paramInt;
      ab.e("MicroMsg.MMSelectContactAdapter", "getItemViewType: get data item fail, return unkown Type, totalCount=%d | position = %s", new Object[] { Integer.valueOf(getCount()), Integer.valueOf(paramInt) });
    }
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    a locala = Pn(paramInt);
    View localView = paramView;
    if (paramView == null)
      localView = locala.aou().a(this.zmV.getActivity(), paramViewGroup);
    paramView = (a.a)localView.getTag();
    Assert.assertNotNull(paramView);
    if (!locala.zpA)
    {
      locala.a(this.zmV.getActivity(), paramView);
      locala.zpA = true;
    }
    locala.zmW = clI();
    locala.aou().a(this.zmV.getActivity(), paramView, locala, this.zmV.b(locala), this.zmV.a(locala));
    return localView;
  }

  public int getViewTypeCount()
  {
    return 8;
  }

  protected abstract a mP(int paramInt);

  public final void qE(boolean paramBoolean)
  {
    this.zmW = paramBoolean;
    notifyDataSetChanged();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.n
 * JD-Core Version:    0.6.2
 */