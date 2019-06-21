package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

final class t extends RecyclerView.a
{
  final SparseArray<u> iPq;
  private final ArrayList<?> iPr;
  private LayoutInflater mInflater;

  t(ArrayList<?> paramArrayList)
  {
    AppMethodBeat.i(133553);
    this.iPq = new SparseArray();
    this.iPr = paramArrayList;
    AppMethodBeat.o(133553);
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(133556);
    u localu = (u)this.iPq.get(paramInt);
    if (localu == null)
    {
      paramViewGroup = null;
      AppMethodBeat.o(133556);
    }
    while (true)
    {
      return paramViewGroup;
      Context localContext = paramViewGroup.getContext();
      if (this.mInflater == null)
        this.mInflater = LayoutInflater.from(localContext);
      paramViewGroup = localu.a(this.mInflater, paramViewGroup);
      AppMethodBeat.o(133556);
    }
  }

  public final void a(RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(133557);
    u localu = (u)this.iPq.get(getItemViewType(paramInt));
    if (localu != null)
      localu.c(paramv, pW(paramInt));
    AppMethodBeat.o(133557);
  }

  public final void a(RecyclerView.v paramv, int paramInt, List paramList)
  {
    AppMethodBeat.i(133558);
    u localu = (u)this.iPq.get(getItemViewType(paramInt));
    if (localu == null)
    {
      super.a(paramv, paramInt, paramList);
      AppMethodBeat.o(133558);
    }
    while (true)
    {
      return;
      if (paramList.size() > 0)
      {
        pW(paramInt);
        if (localu.b(paramv, paramList.get(0)))
          AppMethodBeat.o(133558);
      }
      else
      {
        localu.c(paramv, pW(paramInt));
        AppMethodBeat.o(133558);
      }
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(133561);
    int i;
    if (this.iPr == null)
    {
      i = 0;
      AppMethodBeat.o(133561);
    }
    while (true)
    {
      return i;
      i = this.iPr.size();
      AppMethodBeat.o(133561);
    }
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(133560);
    Object localObject = pW(paramInt);
    u localu = (u)this.iPq.get(getItemViewType(paramInt));
    long l;
    if ((localObject == null) || (localu == null))
    {
      l = 0L;
      AppMethodBeat.o(133560);
    }
    while (true)
    {
      return l;
      l = localu.bA(localObject);
      AppMethodBeat.o(133560);
    }
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(133559);
    Object localObject = pW(paramInt);
    if (localObject == null)
    {
      paramInt = 0;
      AppMethodBeat.o(133559);
    }
    while (true)
    {
      return paramInt;
      paramInt = localObject.getClass().hashCode();
      AppMethodBeat.o(133559);
    }
  }

  final boolean isEmpty()
  {
    AppMethodBeat.i(133554);
    boolean bool;
    if ((this.iPr == null) || (bo.ek(this.iPr)))
    {
      bool = true;
      AppMethodBeat.o(133554);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133554);
    }
  }

  final Object pW(int paramInt)
  {
    AppMethodBeat.i(133555);
    Object localObject;
    if ((paramInt < 0) || (paramInt >= getItemCount()))
    {
      localObject = null;
      AppMethodBeat.o(133555);
    }
    while (true)
    {
      return localObject;
      localObject = this.iPr.get(paramInt);
      AppMethodBeat.o(133555);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.t
 * JD-Core Version:    0.6.2
 */