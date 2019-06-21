package com.tencent.mm.ui.base;

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

final class HeaderGridView$c
  implements Filterable, WrapperListAdapter
{
  private final ListAdapter Ei;
  final DataSetObservable mDataSetObservable;
  int mNumColumns;
  ArrayList<HeaderGridView.a> oiP;
  boolean oiX;
  private final boolean oiY;

  public HeaderGridView$c(ArrayList<HeaderGridView.a> paramArrayList, ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(106288);
    this.mDataSetObservable = new DataSetObservable();
    this.mNumColumns = 1;
    this.Ei = paramListAdapter;
    this.oiY = (paramListAdapter instanceof WrapperListAdapter);
    if (paramArrayList == null)
    {
      paramArrayList = new IllegalArgumentException("headerViewInfos cannot be null");
      AppMethodBeat.o(106288);
      throw paramArrayList;
    }
    this.oiP = paramArrayList;
    this.oiX = I(this.oiP);
    AppMethodBeat.o(106288);
  }

  private static boolean I(ArrayList<HeaderGridView.a> paramArrayList)
  {
    AppMethodBeat.i(106290);
    boolean bool;
    if (paramArrayList != null)
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
        if (!((HeaderGridView.a)paramArrayList.next()).isSelectable)
        {
          bool = false;
          AppMethodBeat.o(106290);
        }
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(106290);
    }
  }

  public final boolean areAllItemsEnabled()
  {
    boolean bool = true;
    AppMethodBeat.i(106292);
    if (this.Ei != null)
      if ((this.oiX) && (this.Ei.areAllItemsEnabled()))
        AppMethodBeat.o(106292);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106292);
      continue;
      AppMethodBeat.o(106292);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(106291);
    int i;
    if (this.Ei != null)
    {
      i = this.oiP.size() * this.mNumColumns + this.Ei.getCount();
      AppMethodBeat.o(106291);
    }
    while (true)
    {
      return i;
      i = this.oiP.size() * this.mNumColumns;
      AppMethodBeat.o(106291);
    }
  }

  public final Filter getFilter()
  {
    AppMethodBeat.i(106302);
    Filter localFilter;
    if (this.oiY)
    {
      localFilter = ((WrapperListAdapter)this.Ei).getFilter();
      AppMethodBeat.o(106302);
    }
    while (true)
    {
      return localFilter;
      localFilter = null;
      AppMethodBeat.o(106302);
    }
  }

  public final Object getItem(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(106294);
    int i = this.oiP.size() * this.mNumColumns;
    if (paramInt < i)
      if (paramInt % this.mNumColumns == 0)
      {
        localObject = ((HeaderGridView.a)this.oiP.get(paramInt / this.mNumColumns)).data;
        AppMethodBeat.o(106294);
      }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(106294);
      continue;
      paramInt -= i;
      if ((this.Ei != null) && (paramInt < this.Ei.getCount()))
      {
        localObject = this.Ei.getItem(paramInt);
        AppMethodBeat.o(106294);
      }
      else
      {
        AppMethodBeat.o(106294);
      }
    }
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(106295);
    int i = this.oiP.size() * this.mNumColumns;
    long l;
    if ((this.Ei != null) && (paramInt >= i))
    {
      paramInt -= i;
      if (paramInt < this.Ei.getCount())
      {
        l = this.Ei.getItemId(paramInt);
        AppMethodBeat.o(106295);
      }
    }
    while (true)
    {
      return l;
      l = -1L;
      AppMethodBeat.o(106295);
    }
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(106298);
    int i = this.oiP.size() * this.mNumColumns;
    if ((paramInt < i) && (paramInt % this.mNumColumns != 0))
      if (this.Ei != null)
      {
        paramInt = this.Ei.getViewTypeCount();
        AppMethodBeat.o(106298);
      }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      AppMethodBeat.o(106298);
      continue;
      if ((this.Ei != null) && (paramInt >= i))
      {
        paramInt -= i;
        if (paramInt < this.Ei.getCount())
        {
          paramInt = this.Ei.getItemViewType(paramInt);
          AppMethodBeat.o(106298);
        }
      }
      else
      {
        paramInt = -2;
        AppMethodBeat.o(106298);
      }
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(106297);
    int i = this.oiP.size() * this.mNumColumns;
    ViewGroup localViewGroup;
    if (paramInt < i)
    {
      localViewGroup = ((HeaderGridView.a)this.oiP.get(paramInt / this.mNumColumns)).oiV;
      if (paramInt % this.mNumColumns == 0)
      {
        AppMethodBeat.o(106297);
        paramView = localViewGroup;
      }
    }
    while (true)
    {
      return paramView;
      View localView = paramView;
      if (paramView == null)
        localView = new View(paramViewGroup.getContext());
      localView.setVisibility(4);
      localView.setMinimumHeight(localViewGroup.getHeight());
      AppMethodBeat.o(106297);
      paramView = localView;
      continue;
      paramInt -= i;
      if ((this.Ei != null) && (paramInt < this.Ei.getCount()))
      {
        paramView = this.Ei.getView(paramInt, paramView, paramViewGroup);
        AppMethodBeat.o(106297);
      }
      else
      {
        localView = paramView;
        if (paramView == null)
          localView = new View(paramViewGroup.getContext());
        localView.setVisibility(4);
        AppMethodBeat.o(106297);
        paramView = localView;
      }
    }
  }

  public final int getViewTypeCount()
  {
    AppMethodBeat.i(106299);
    int i;
    if (this.Ei != null)
    {
      i = this.Ei.getViewTypeCount() + 1;
      AppMethodBeat.o(106299);
    }
    while (true)
    {
      return i;
      i = 2;
      AppMethodBeat.o(106299);
    }
  }

  public final ListAdapter getWrappedAdapter()
  {
    return this.Ei;
  }

  public final boolean hasStableIds()
  {
    AppMethodBeat.i(106296);
    boolean bool;
    if (this.Ei != null)
    {
      bool = this.Ei.hasStableIds();
      AppMethodBeat.o(106296);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106296);
    }
  }

  public final boolean isEmpty()
  {
    AppMethodBeat.i(106289);
    boolean bool;
    if (((this.Ei == null) || (this.Ei.isEmpty())) && (this.oiP.size() == 0))
    {
      bool = true;
      AppMethodBeat.o(106289);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106289);
    }
  }

  public final boolean isEnabled(int paramInt)
  {
    AppMethodBeat.i(106293);
    int i = this.oiP.size() * this.mNumColumns;
    boolean bool;
    if (paramInt < i)
      if ((paramInt % this.mNumColumns == 0) && (((HeaderGridView.a)this.oiP.get(paramInt / this.mNumColumns)).isSelectable))
      {
        bool = true;
        AppMethodBeat.o(106293);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(106293);
      bool = false;
      continue;
      paramInt -= i;
      if ((this.Ei != null) && (paramInt < this.Ei.getCount()))
      {
        bool = this.Ei.isEnabled(paramInt);
        AppMethodBeat.o(106293);
      }
      else
      {
        AppMethodBeat.o(106293);
        bool = false;
      }
    }
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    AppMethodBeat.i(106300);
    this.mDataSetObservable.registerObserver(paramDataSetObserver);
    if (this.Ei != null)
      this.Ei.registerDataSetObserver(paramDataSetObserver);
    AppMethodBeat.o(106300);
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    AppMethodBeat.i(106301);
    this.mDataSetObservable.unregisterObserver(paramDataSetObserver);
    if (this.Ei != null)
      this.Ei.unregisterDataSetObserver(paramDataSetObserver);
    AppMethodBeat.o(106301);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.HeaderGridView.c
 * JD-Core Version:    0.6.2
 */