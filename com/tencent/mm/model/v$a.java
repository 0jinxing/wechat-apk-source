package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ConcurrentHashMap;

final class v$a<K, V> extends ConcurrentHashMap<K, V>
{
  public final boolean containsValue(Object paramObject)
  {
    AppMethodBeat.i(115075);
    boolean bool;
    if (paramObject == null)
    {
      bool = false;
      AppMethodBeat.o(115075);
    }
    while (true)
    {
      return bool;
      bool = super.containsValue(paramObject);
      AppMethodBeat.o(115075);
    }
  }

  public final V get(Object paramObject)
  {
    AppMethodBeat.i(115072);
    if (paramObject == null)
    {
      paramObject = null;
      AppMethodBeat.o(115072);
    }
    while (true)
    {
      return paramObject;
      paramObject = super.get(paramObject);
      AppMethodBeat.o(115072);
    }
  }

  public final V put(K paramK, V paramV)
  {
    AppMethodBeat.i(115073);
    if (paramK == null)
    {
      paramK = null;
      AppMethodBeat.o(115073);
    }
    while (true)
    {
      return paramK;
      if (paramV == null)
      {
        paramK = super.remove(paramK);
        AppMethodBeat.o(115073);
      }
      else
      {
        paramK = super.put(paramK, paramV);
        AppMethodBeat.o(115073);
      }
    }
  }

  public final V remove(Object paramObject)
  {
    AppMethodBeat.i(115074);
    if (paramObject == null)
    {
      paramObject = null;
      AppMethodBeat.o(115074);
    }
    while (true)
    {
      return paramObject;
      paramObject = super.remove(paramObject);
      AppMethodBeat.o(115074);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.v.a
 * JD-Core Version:    0.6.2
 */