package com.tencent.mm.plugin.freewifi.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class a
{
  private Map<String, a.b> cache;
  private boolean mvc;

  private a()
  {
    AppMethodBeat.i(20663);
    this.mvc = false;
    this.cache = new LinkedHashMap()
    {
      protected final boolean removeEldestEntry(Map.Entry paramAnonymousEntry)
      {
        AppMethodBeat.i(20661);
        boolean bool;
        if (size() > 512)
        {
          bool = true;
          AppMethodBeat.o(20661);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(20661);
        }
      }
    };
    AppMethodBeat.o(20663);
  }

  private static String ep(String paramString1, String paramString2)
  {
    AppMethodBeat.i(20664);
    paramString1 = paramString1 + "-" + paramString2;
    AppMethodBeat.o(20664);
    return paramString1;
  }

  public final void e(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    try
    {
      AppMethodBeat.i(20665);
      if ((m.isEmpty(paramString1)) || (m.isEmpty(paramString2)) || (m.isEmpty(paramString3)) || ((paramInt != 4) && (paramInt != 31)))
        AppMethodBeat.o(20665);
      while (true)
      {
        return;
        a.b localb = new com/tencent/mm/plugin/freewifi/b/a$b;
        localb.<init>();
        localb.cuH = paramString3;
        localb.mue = paramInt;
        this.cache.put(ep(paramString1, paramString2), localb);
        AppMethodBeat.o(20665);
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  public final a.b eq(String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(20666);
      if ((m.isEmpty(paramString1)) || (m.isEmpty(paramString2)))
      {
        paramString1 = null;
        AppMethodBeat.o(20666);
      }
      while (true)
      {
        return paramString1;
        paramString1 = (a.b)this.cache.get(ep(paramString1, paramString2));
        AppMethodBeat.o(20666);
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  public final int size()
  {
    try
    {
      AppMethodBeat.i(20667);
      int i = this.cache.size();
      AppMethodBeat.o(20667);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.b.a
 * JD-Core Version:    0.6.2
 */