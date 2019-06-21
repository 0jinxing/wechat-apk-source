package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends h
{
  private SparseArray<View> yBo;

  public a(Context paramContext, ListView paramListView, SharedPreferences paramSharedPreferences)
  {
    super(paramContext, paramListView, paramSharedPreferences);
    AppMethodBeat.i(107131);
    this.yBo = new SparseArray();
    AppMethodBeat.o(107131);
  }

  public final View a(int paramInt, ListView paramListView)
  {
    AppMethodBeat.i(107133);
    if ((paramInt > paramListView.getLastVisiblePosition()) || (paramInt < paramListView.getFirstVisiblePosition()))
    {
      paramListView = null;
      AppMethodBeat.o(107133);
    }
    while (true)
    {
      return paramListView;
      paramListView = (View)this.yBo.get(paramInt);
      AppMethodBeat.o(107133);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107132);
    paramView = super.getView(paramInt, paramView, paramViewGroup);
    this.yBo.put(paramInt, paramView);
    AppMethodBeat.o(107132);
    return paramView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.a
 * JD-Core Version:    0.6.2
 */