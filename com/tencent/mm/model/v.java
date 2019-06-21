package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class v
{
  private static volatile v fla;
  private Map<String, v.c> flb;

  private v()
  {
    AppMethodBeat.i(115091);
    this.flb = new v.a((byte)0);
    AppMethodBeat.o(115091);
  }

  public static v Zp()
  {
    AppMethodBeat.i(115090);
    if (fla == null);
    try
    {
      if (fla == null)
      {
        localv = new com/tencent/mm/model/v;
        localv.<init>();
        fla = localv;
      }
      v localv = fla;
      AppMethodBeat.o(115090);
      return localv;
    }
    finally
    {
      AppMethodBeat.o(115090);
    }
  }

  private v.c nT(String paramString)
  {
    AppMethodBeat.i(115092);
    v.c localc = new v.c();
    this.flb.put(paramString, localc);
    AppMethodBeat.o(115092);
    return localc;
  }

  public static String nW(String paramString)
  {
    AppMethodBeat.i(115096);
    paramString = "SessionId@" + paramString + "#" + System.nanoTime();
    AppMethodBeat.o(115096);
    return paramString;
  }

  public final v.b nU(String paramString)
  {
    AppMethodBeat.i(115093);
    paramString = (v.c)this.flb.get(paramString);
    if (paramString != null)
    {
      paramString = paramString.fld;
      AppMethodBeat.o(115093);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(115093);
    }
  }

  public final v.b nV(String paramString)
  {
    AppMethodBeat.i(115095);
    paramString = (v.c)this.flb.remove(paramString);
    if (paramString != null)
    {
      paramString = paramString.fld;
      AppMethodBeat.o(115095);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(115095);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(115097);
    long l = System.currentTimeMillis();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("DataCenter \nDataStore size : ").append(this.flb.size());
    LinkedHashSet localLinkedHashSet = new LinkedHashSet(this.flb.entrySet());
    Iterator localIterator = localLinkedHashSet.iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localEntry != null)
      {
        v.c localc = (v.c)localEntry.getValue();
        if (localc != null)
        {
          ((StringBuilder)localObject).append("\nDataStore id : ").append((String)localEntry.getKey());
          ((StringBuilder)localObject).append(", CT : ").append(localc.fle).append("ms");
          ((StringBuilder)localObject).append(", TTL : ").append((l - localc.fle) / 1000L).append("s");
        }
      }
    }
    localLinkedHashSet.clear();
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(115097);
    return localObject;
  }

  public final v.b y(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(115094);
    v.c localc1 = (v.c)this.flb.get(paramString);
    v.c localc2 = localc1;
    if (localc1 == null)
      if (!paramBoolean)
      {
        paramString = null;
        AppMethodBeat.o(115094);
      }
    while (true)
    {
      return paramString;
      localc2 = nT(paramString);
      paramString = localc2.fld;
      AppMethodBeat.o(115094);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.v
 * JD-Core Version:    0.6.2
 */