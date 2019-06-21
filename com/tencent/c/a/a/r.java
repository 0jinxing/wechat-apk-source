package com.tencent.c.a.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class r
{
  private static r cbL = null;
  private Map<Integer, q> cbJ;
  private int cbK;

  private r(Context paramContext)
  {
    AppMethodBeat.i(125724);
    this.cbJ = null;
    this.cbK = 0;
    this.cbJ = new HashMap(3);
    this.cbJ.put(Integer.valueOf(1), new o(paramContext));
    this.cbJ.put(Integer.valueOf(2), new d(paramContext));
    this.cbJ.put(Integer.valueOf(4), new k(paramContext));
    AppMethodBeat.o(125724);
  }

  private a G(List<Integer> paramList)
  {
    AppMethodBeat.i(125729);
    Iterator localIterator;
    if (paramList.size() > 0)
    {
      localIterator = paramList.iterator();
      if (localIterator.hasNext());
    }
    else
    {
      paramList = new a();
      AppMethodBeat.o(125729);
    }
    while (true)
    {
      return paramList;
      paramList = (Integer)localIterator.next();
      paramList = (q)this.cbJ.get(paramList);
      if (paramList == null)
        break;
      paramList = paramList.zW();
      if (paramList == null)
        break;
      AppMethodBeat.o(125729);
    }
  }

  static r aI(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(125725);
      if (cbL == null)
      {
        r localr = new com/tencent/c/a/a/r;
        localr.<init>(paramContext);
        cbL = localr;
      }
      paramContext = cbL;
      AppMethodBeat.o(125725);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  final g F(List<Integer> paramList)
  {
    AppMethodBeat.i(125727);
    Iterator localIterator;
    if (paramList.size() >= 0)
    {
      localIterator = paramList.iterator();
      if (localIterator.hasNext());
    }
    else
    {
      paramList = new g();
      AppMethodBeat.o(125727);
    }
    while (true)
    {
      return paramList;
      paramList = (Integer)localIterator.next();
      paramList = (q)this.cbJ.get(paramList);
      if (paramList == null)
        break;
      paramList = paramList.zV();
      if ((paramList == null) || (!s.cp(paramList.cbr)))
        break;
      AppMethodBeat.o(125727);
    }
  }

  final void b(a parama)
  {
    AppMethodBeat.i(125730);
    Iterator localIterator = this.cbJ.entrySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        AppMethodBeat.o(125730);
        return;
      }
      ((q)((Map.Entry)localIterator.next()).getValue()).b(parama);
    }
  }

  final void b(g paramg)
  {
    AppMethodBeat.i(125731);
    Iterator localIterator = this.cbJ.entrySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        AppMethodBeat.o(125731);
        return;
      }
      ((q)((Map.Entry)localIterator.next()).getValue()).b(paramg);
    }
  }

  final g zV()
  {
    AppMethodBeat.i(125726);
    g localg = F(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4) })));
    AppMethodBeat.o(125726);
    return localg;
  }

  final a zW()
  {
    AppMethodBeat.i(125728);
    a locala = G(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(4) })));
    AppMethodBeat.o(125728);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.r
 * JD-Core Version:    0.6.2
 */