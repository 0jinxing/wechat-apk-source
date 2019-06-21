package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class i
{
  private static AtomicInteger ioy;
  public HashMap<String, g> hGk;

  static
  {
    AppMethodBeat.i(108185);
    ioy = new AtomicInteger(1);
    AppMethodBeat.o(108185);
  }

  private i()
  {
    AppMethodBeat.i(108181);
    this.hGk = new HashMap();
    AppMethodBeat.o(108181);
  }

  public static int aIA()
  {
    AppMethodBeat.i(108182);
    int i = ioy.incrementAndGet();
    AppMethodBeat.o(108182);
    return i;
  }

  public static i aIG()
  {
    AppMethodBeat.i(108183);
    i locali = i.a.aIH();
    AppMethodBeat.o(108183);
    return locali;
  }

  public final g CO(String paramString)
  {
    AppMethodBeat.i(108184);
    if (this.hGk.containsKey(paramString))
    {
      paramString = (g)this.hGk.get(paramString);
      AppMethodBeat.o(108184);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(108184);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.i
 * JD-Core Version:    0.6.2
 */