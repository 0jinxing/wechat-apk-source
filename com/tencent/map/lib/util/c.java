package com.tencent.map.lib.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class c<T, K>
{
  private HashMap<T, K> a;
  private int b = 0;
  private int c = 1024;

  public final K a(T paramT)
  {
    try
    {
      AppMethodBeat.i(98247);
      if (this.a == null)
      {
        paramT = null;
        AppMethodBeat.o(98247);
      }
      while (true)
      {
        return paramT;
        paramT = this.a.get(paramT);
        AppMethodBeat.o(98247);
      }
    }
    finally
    {
    }
    throw paramT;
  }

  public final void a(T paramT, K paramK)
  {
    try
    {
      AppMethodBeat.i(98246);
      if (this.a == null)
      {
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        this.a = localHashMap;
      }
      this.a.put(paramT, paramK);
      AppMethodBeat.o(98246);
      return;
    }
    finally
    {
    }
    throw paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.util.c
 * JD-Core Version:    0.6.2
 */