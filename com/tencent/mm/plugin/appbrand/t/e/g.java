package com.tencent.mm.plugin.appbrand.t.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class g
  implements c
{
  private byte[] content;
  private TreeMap<String, String> iTF;

  public g()
  {
    AppMethodBeat.i(73267);
    this.iTF = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    AppMethodBeat.o(73267);
  }

  public final String Eq(String paramString)
  {
    AppMethodBeat.i(73269);
    paramString = (String)this.iTF.get(paramString);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(73269);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(73269);
    }
  }

  public final boolean Er(String paramString)
  {
    AppMethodBeat.i(73271);
    boolean bool = this.iTF.containsKey(paramString);
    AppMethodBeat.o(73271);
    return bool;
  }

  public final Iterator<String> aOx()
  {
    AppMethodBeat.i(73268);
    Iterator localIterator = Collections.unmodifiableSet(this.iTF.keySet()).iterator();
    AppMethodBeat.o(73268);
    return localIterator;
  }

  public final byte[] aOy()
  {
    return this.content;
  }

  public final void put(String paramString1, String paramString2)
  {
    AppMethodBeat.i(73270);
    this.iTF.put(paramString1, paramString2);
    AppMethodBeat.o(73270);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.e.g
 * JD-Core Version:    0.6.2
 */