package com.tencent.mm.plugin.exdevice.model;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.List;

public final class j
{
  private static j ltw;
  private SparseArray<List<a>> ltx;

  private j()
  {
    AppMethodBeat.i(19306);
    this.ltx = new SparseArray();
    AppMethodBeat.o(19306);
  }

  public static j boN()
  {
    AppMethodBeat.i(19307);
    if (ltw == null)
      ltw = new j();
    j localj = ltw;
    AppMethodBeat.o(19307);
    return localj;
  }

  public final boolean a(int paramInt, a parama)
  {
    AppMethodBeat.i(19308);
    boolean bool;
    if (parama == null)
    {
      AppMethodBeat.o(19308);
      bool = false;
    }
    while (true)
    {
      return bool;
      List localList = (List)this.ltx.get(paramInt);
      Object localObject;
      if (localList == null)
      {
        localObject = new LinkedList();
        this.ltx.put(paramInt, localObject);
      }
      do
      {
        bool = ((List)localObject).add(parama);
        AppMethodBeat.o(19308);
        break;
        localObject = localList;
      }
      while (!localList.contains(parama));
      AppMethodBeat.o(19308);
      bool = false;
    }
  }

  public final boolean b(int paramInt, a parama)
  {
    AppMethodBeat.i(19309);
    List localList = (List)this.ltx.get(paramInt);
    if (localList != null)
    {
      localList.remove(parama);
      if (localList.size() == 0)
        this.ltx.remove(paramInt);
    }
    AppMethodBeat.o(19309);
    return false;
  }

  public final void h(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(19310);
    List localList = (List)this.ltx.get(paramInt);
    if ((localList == null) || (localList.size() == 0))
      AppMethodBeat.o(19310);
    while (true)
    {
      return;
      for (int i = 0; i < localList.size(); i++)
        ((a)localList.get(i)).g(paramInt, paramArrayOfObject);
      AppMethodBeat.o(19310);
    }
  }

  public static abstract interface a
  {
    public abstract void g(int paramInt, Object[] paramArrayOfObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.j
 * JD-Core Version:    0.6.2
 */