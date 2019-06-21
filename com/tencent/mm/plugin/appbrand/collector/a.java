package com.tencent.mm.plugin.appbrand.collector;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ConcurrentHashMap;

final class a<K, V> extends ConcurrentHashMap<K, V>
{
  public final boolean containsValue(Object paramObject)
  {
    AppMethodBeat.i(57023);
    boolean bool;
    if (paramObject == null)
    {
      bool = false;
      AppMethodBeat.o(57023);
    }
    while (true)
    {
      return bool;
      bool = super.containsValue(paramObject);
      AppMethodBeat.o(57023);
    }
  }

  public final V get(Object paramObject)
  {
    AppMethodBeat.i(57020);
    if (paramObject == null)
    {
      paramObject = null;
      AppMethodBeat.o(57020);
    }
    while (true)
    {
      return paramObject;
      paramObject = super.get(paramObject);
      AppMethodBeat.o(57020);
    }
  }

  public final V put(K paramK, V paramV)
  {
    AppMethodBeat.i(57021);
    if (paramK == null)
    {
      paramK = null;
      AppMethodBeat.o(57021);
    }
    while (true)
    {
      return paramK;
      if (paramV == null)
      {
        paramK = super.remove(paramK);
        AppMethodBeat.o(57021);
      }
      else
      {
        paramK = super.put(paramK, paramV);
        AppMethodBeat.o(57021);
      }
    }
  }

  public final V remove(Object paramObject)
  {
    AppMethodBeat.i(57022);
    if (paramObject == null)
    {
      paramObject = null;
      AppMethodBeat.o(57022);
    }
    while (true)
    {
      return paramObject;
      paramObject = super.remove(paramObject);
      AppMethodBeat.o(57022);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.collector.a
 * JD-Core Version:    0.6.2
 */