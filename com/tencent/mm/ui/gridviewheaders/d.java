package com.tencent.mm.ui.gridviewheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends BaseAdapter
  implements b
{
  private DataSetObserver PL;
  private ListAdapter zyV;

  public d(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(107407);
    this.PL = new d.1(this);
    this.zyV = paramListAdapter;
    paramListAdapter.registerDataSetObserver(this.PL);
    AppMethodBeat.o(107407);
  }

  public final int PA(int paramInt)
  {
    return 0;
  }

  public final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return null;
  }

  public final int dJh()
  {
    return 0;
  }

  public final int getCount()
  {
    AppMethodBeat.i(107408);
    int i = this.zyV.getCount();
    AppMethodBeat.o(107408);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(107409);
    Object localObject = this.zyV.getItem(paramInt);
    AppMethodBeat.o(107409);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(107410);
    long l = this.zyV.getItemId(paramInt);
    AppMethodBeat.o(107410);
    return l;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107411);
    paramView = this.zyV.getView(paramInt, paramView, paramViewGroup);
    AppMethodBeat.o(107411);
    return paramView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.d
 * JD-Core Version:    0.6.2
 */