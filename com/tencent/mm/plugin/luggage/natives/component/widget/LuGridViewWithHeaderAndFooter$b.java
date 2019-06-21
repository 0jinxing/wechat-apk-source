package com.tencent.mm.plugin.luggage.natives.component.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

final class LuGridViewWithHeaderAndFooter$b
  implements Filterable, WrapperListAdapter
{
  static final ArrayList<LuGridViewWithHeaderAndFooter.a> oiW;
  private final ListAdapter Ei;
  int enT;
  private final DataSetObservable mDataSetObservable;
  private int mNumColumns;
  ArrayList<LuGridViewWithHeaderAndFooter.a> oiP;
  ArrayList<LuGridViewWithHeaderAndFooter.a> oiS;
  boolean oiX;
  private final boolean oiY;
  private boolean oiZ;
  private boolean oja;

  static
  {
    AppMethodBeat.i(116868);
    oiW = new ArrayList();
    AppMethodBeat.o(116868);
  }

  public LuGridViewWithHeaderAndFooter$b(ArrayList<LuGridViewWithHeaderAndFooter.a> paramArrayList1, ArrayList<LuGridViewWithHeaderAndFooter.a> paramArrayList2, ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(116851);
    this.mDataSetObservable = new DataSetObservable();
    this.mNumColumns = 1;
    this.enT = -1;
    this.oiZ = true;
    this.oja = false;
    this.Ei = paramListAdapter;
    this.oiY = (paramListAdapter instanceof WrapperListAdapter);
    if (paramArrayList1 == null)
    {
      this.oiP = oiW;
      if (paramArrayList2 != null)
        break label118;
      this.oiS = oiW;
      label78: if ((!I(this.oiP)) || (!I(this.oiS)))
        break label126;
    }
    while (true)
    {
      this.oiX = bool;
      AppMethodBeat.o(116851);
      return;
      this.oiP = paramArrayList1;
      break;
      label118: this.oiS = paramArrayList2;
      break label78;
      label126: bool = false;
    }
  }

  private static boolean I(ArrayList<LuGridViewWithHeaderAndFooter.a> paramArrayList)
  {
    AppMethodBeat.i(116854);
    boolean bool;
    if (paramArrayList != null)
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
        if (!((LuGridViewWithHeaderAndFooter.a)paramArrayList.next()).isSelectable)
        {
          bool = false;
          AppMethodBeat.o(116854);
        }
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(116854);
    }
  }

  private int bMT()
  {
    AppMethodBeat.i(116857);
    int i = (int)(Math.ceil(1.0F * this.Ei.getCount() / this.mNumColumns) * this.mNumColumns);
    AppMethodBeat.o(116857);
    return i;
  }

  public final boolean areAllItemsEnabled()
  {
    AppMethodBeat.i(116856);
    boolean bool;
    if ((this.Ei == null) || ((this.oiX) && (this.Ei.areAllItemsEnabled())))
    {
      bool = true;
      AppMethodBeat.o(116856);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(116856);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(116855);
    int i;
    if (this.Ei != null)
    {
      i = (this.oiS.size() + this.oiP.size()) * this.mNumColumns + bMT();
      AppMethodBeat.o(116855);
    }
    while (true)
    {
      return i;
      i = (this.oiS.size() + this.oiP.size()) * this.mNumColumns;
      AppMethodBeat.o(116855);
    }
  }

  public final Filter getFilter()
  {
    AppMethodBeat.i(116867);
    Filter localFilter;
    if (this.oiY)
    {
      localFilter = ((WrapperListAdapter)this.Ei).getFilter();
      AppMethodBeat.o(116867);
    }
    while (true)
    {
      return localFilter;
      localFilter = null;
      AppMethodBeat.o(116867);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(116859);
    int i = this.oiP.size() * this.mNumColumns;
    Object localObject;
    if (paramInt < i)
      if (paramInt % this.mNumColumns == 0)
      {
        localObject = ((LuGridViewWithHeaderAndFooter.a)this.oiP.get(paramInt / this.mNumColumns)).data;
        AppMethodBeat.o(116859);
      }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(116859);
      localObject = null;
      continue;
      int j = paramInt - i;
      paramInt = 0;
      if (this.Ei != null)
      {
        i = bMT();
        paramInt = i;
        if (j < i)
        {
          if (j < this.Ei.getCount())
          {
            localObject = this.Ei.getItem(j);
            AppMethodBeat.o(116859);
            continue;
          }
          AppMethodBeat.o(116859);
          localObject = null;
        }
      }
      else
      {
        paramInt = j - paramInt;
        if (paramInt % this.mNumColumns == 0)
        {
          localObject = ((LuGridViewWithHeaderAndFooter.a)this.oiS.get(paramInt)).data;
          AppMethodBeat.o(116859);
        }
        else
        {
          AppMethodBeat.o(116859);
          localObject = null;
        }
      }
    }
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(116860);
    int i = this.oiP.size() * this.mNumColumns;
    long l;
    if ((this.Ei != null) && (paramInt >= i))
    {
      paramInt -= i;
      if (paramInt < this.Ei.getCount())
      {
        l = this.Ei.getItemId(paramInt);
        AppMethodBeat.o(116860);
      }
    }
    while (true)
    {
      return l;
      l = -1L;
      AppMethodBeat.o(116860);
    }
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(116863);
    int i = this.oiP.size() * this.mNumColumns;
    int j;
    int k;
    int m;
    int n;
    int i1;
    if (this.Ei == null)
    {
      j = 0;
      k = -2;
      m = k;
      if (this.oiZ)
      {
        m = k;
        if (paramInt < i)
        {
          m = k;
          if (paramInt == 0)
          {
            m = k;
            if (this.oja)
              m = this.oiP.size() + j + this.oiS.size() + 1 + 1;
          }
          if (paramInt % this.mNumColumns != 0)
            m = paramInt / this.mNumColumns + 1 + j;
        }
      }
      n = paramInt - i;
      if (this.Ei == null)
        break label370;
      i1 = bMT();
      k = m;
      i = i1;
      if (n >= 0)
      {
        k = m;
        i = i1;
        if (n < i1)
        {
          if (n >= this.Ei.getCount())
            break label337;
          k = this.Ei.getItemViewType(n);
          i = i1;
        }
      }
    }
    while (true)
    {
      m = k;
      if (this.oiZ)
      {
        i = n - i;
        m = k;
        if (i >= 0)
        {
          m = k;
          if (i < getCount())
          {
            m = k;
            if (i % this.mNumColumns != 0)
            {
              m = this.oiP.size();
              m = i / this.mNumColumns + 1 + (j + m + 1);
            }
          }
        }
      }
      if (LuGridViewWithHeaderAndFooter.DEBUG)
        String.format("getItemViewType: pos: %s, result: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(m), Boolean.valueOf(this.oiZ), Boolean.valueOf(this.oja) });
      AppMethodBeat.o(116863);
      return m;
      j = this.Ei.getViewTypeCount() - 1;
      break;
      label337: k = m;
      i = i1;
      if (this.oiZ)
      {
        k = this.oiP.size() + j + 1;
        i = i1;
        continue;
        label370: i = 0;
        k = m;
      }
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 0;
    AppMethodBeat.i(116862);
    boolean bool;
    int j;
    ViewGroup localViewGroup;
    if (LuGridViewWithHeaderAndFooter.DEBUG)
    {
      if (paramView == null)
      {
        bool = true;
        String.format("getView: %s, reused: %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      }
    }
    else
    {
      j = this.oiP.size() * this.mNumColumns;
      if (paramInt >= j)
        break label159;
      localViewGroup = ((LuGridViewWithHeaderAndFooter.a)this.oiP.get(paramInt / this.mNumColumns)).oiV;
      if (paramInt % this.mNumColumns != 0)
        break label112;
      AppMethodBeat.o(116862);
      paramView = localViewGroup;
    }
    while (true)
    {
      return paramView;
      bool = false;
      break;
      label112: View localView = paramView;
      if (paramView == null)
        localView = new View(paramViewGroup.getContext());
      localView.setVisibility(4);
      localView.setMinimumHeight(localViewGroup.getHeight());
      AppMethodBeat.o(116862);
      paramView = localView;
      continue;
      label159: int k = paramInt - j;
      if (this.Ei != null)
      {
        j = bMT();
        i = j;
        if (k < j)
        {
          if (k < this.Ei.getCount())
          {
            paramView = this.Ei.getView(k, paramView, paramViewGroup);
            AppMethodBeat.o(116862);
            continue;
          }
          localView = paramView;
          if (paramView == null)
            localView = new View(paramViewGroup.getContext());
          localView.setVisibility(4);
          localView.setMinimumHeight(this.enT);
          AppMethodBeat.o(116862);
          paramView = localView;
        }
      }
      else
      {
        i = k - i;
        if (i >= getCount())
          break label376;
        localViewGroup = ((LuGridViewWithHeaderAndFooter.a)this.oiS.get(i / this.mNumColumns)).oiV;
        if (paramInt % this.mNumColumns == 0)
        {
          AppMethodBeat.o(116862);
          paramView = localViewGroup;
        }
        else
        {
          localView = paramView;
          if (paramView == null)
            localView = new View(paramViewGroup.getContext());
          localView.setVisibility(4);
          localView.setMinimumHeight(localViewGroup.getHeight());
          AppMethodBeat.o(116862);
          paramView = localView;
        }
      }
    }
    label376: paramView = new ArrayIndexOutOfBoundsException(paramInt);
    AppMethodBeat.o(116862);
    throw paramView;
  }

  public final int getViewTypeCount()
  {
    AppMethodBeat.i(116864);
    if (this.Ei == null);
    for (int i = 1; ; i = this.Ei.getViewTypeCount())
    {
      int j = i;
      if (this.oiZ)
      {
        int k = this.oiP.size() + 1 + this.oiS.size();
        j = k;
        if (this.oja)
          j = k + 1;
        j = i + j;
      }
      if (LuGridViewWithHeaderAndFooter.DEBUG)
        String.format("getViewTypeCount: %s", new Object[] { Integer.valueOf(j) });
      AppMethodBeat.o(116864);
      return j;
    }
  }

  public final ListAdapter getWrappedAdapter()
  {
    return this.Ei;
  }

  public final boolean hasStableIds()
  {
    AppMethodBeat.i(116861);
    boolean bool;
    if ((this.Ei != null) && (this.Ei.hasStableIds()))
    {
      bool = true;
      AppMethodBeat.o(116861);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(116861);
    }
  }

  public final boolean isEmpty()
  {
    AppMethodBeat.i(116853);
    boolean bool;
    if ((this.Ei == null) || (this.Ei.isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(116853);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(116853);
    }
  }

  public final boolean isEnabled(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(116858);
    int i = this.oiP.size() * this.mNumColumns;
    if (paramInt < i)
      if ((paramInt % this.mNumColumns == 0) && (((LuGridViewWithHeaderAndFooter.a)this.oiP.get(paramInt / this.mNumColumns)).isSelectable))
      {
        AppMethodBeat.o(116858);
        bool = true;
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(116858);
      continue;
      int j = paramInt - i;
      if (this.Ei != null)
      {
        i = bMT();
        paramInt = i;
        if (j < i)
        {
          if ((j < this.Ei.getCount()) && (this.Ei.isEnabled(j)))
          {
            AppMethodBeat.o(116858);
            bool = true;
            continue;
          }
          AppMethodBeat.o(116858);
        }
      }
      else
      {
        paramInt = 0;
        paramInt = j - paramInt;
        if ((paramInt % this.mNumColumns == 0) && (((LuGridViewWithHeaderAndFooter.a)this.oiS.get(paramInt / this.mNumColumns)).isSelectable))
        {
          AppMethodBeat.o(116858);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(116858);
        }
      }
    }
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    AppMethodBeat.i(116865);
    this.mDataSetObservable.registerObserver(paramDataSetObserver);
    if (this.Ei != null)
      this.Ei.registerDataSetObserver(paramDataSetObserver);
    AppMethodBeat.o(116865);
  }

  public final void setNumColumns(int paramInt)
  {
    AppMethodBeat.i(116852);
    if (paramInt <= 0)
      AppMethodBeat.o(116852);
    while (true)
    {
      return;
      if (this.mNumColumns != paramInt)
      {
        this.mNumColumns = paramInt;
        this.mDataSetObservable.notifyChanged();
      }
      AppMethodBeat.o(116852);
    }
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    AppMethodBeat.i(116866);
    this.mDataSetObservable.unregisterObserver(paramDataSetObserver);
    if (this.Ei != null)
      this.Ei.unregisterDataSetObserver(paramDataSetObserver);
    AppMethodBeat.o(116866);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luggage.natives.component.widget.LuGridViewWithHeaderAndFooter.b
 * JD-Core Version:    0.6.2
 */