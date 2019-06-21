package com.tencent.mm.plugin.appbrand.r;

import android.support.v4.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class i<K, V>
{
  private final Map<K, Set<V>> iQZ;

  public i()
  {
    AppMethodBeat.i(91165);
    this.iQZ = new a();
    AppMethodBeat.o(91165);
  }

  public final Set<V> b(K paramK, boolean paramBoolean)
  {
    AppMethodBeat.i(91167);
    synchronized (this.iQZ)
    {
      Set localSet = (Set)this.iQZ.get(paramK);
      Object localObject = localSet;
      if (localSet == null)
      {
        localObject = localSet;
        if (paramBoolean)
        {
          localObject = new java/util/HashSet;
          ((HashSet)localObject).<init>();
          this.iQZ.put(paramK, localObject);
        }
      }
      AppMethodBeat.o(91167);
      return localObject;
    }
  }

  public final Set<V> bC(K paramK)
  {
    AppMethodBeat.i(91168);
    if (paramK == null)
    {
      paramK = null;
      AppMethodBeat.o(91168);
    }
    while (true)
    {
      return paramK;
      Set localSet = b(paramK, false);
      if (localSet == null)
      {
        paramK = Collections.emptySet();
        AppMethodBeat.o(91168);
      }
      else
      {
        try
        {
          paramK = new java/util/HashSet;
          paramK.<init>(localSet);
          AppMethodBeat.o(91168);
        }
        finally
        {
          AppMethodBeat.o(91168);
        }
      }
    }
    throw paramK;
  }

  public final Set<V> bD(K paramK)
  {
    AppMethodBeat.i(91169);
    if (paramK == null)
    {
      paramK = null;
      AppMethodBeat.o(91169);
    }
    while (true)
    {
      return paramK;
      synchronized (this.iQZ)
      {
        paramK = (Set)this.iQZ.remove(paramK);
        AppMethodBeat.o(91169);
      }
    }
  }

  public final void f(K arg1, V paramV)
  {
    AppMethodBeat.i(91166);
    if ((??? == null) || (paramV == null))
      AppMethodBeat.o(91166);
    while (true)
    {
      return;
      synchronized (b(???, true))
      {
        ???.add(paramV);
        AppMethodBeat.o(91166);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.i
 * JD-Core Version:    0.6.2
 */