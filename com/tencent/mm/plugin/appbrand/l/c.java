package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class c
{
  private static AtomicInteger ioy;
  public HashMap<String, b> hGk;

  static
  {
    AppMethodBeat.i(108147);
    ioy = new AtomicInteger(1);
    AppMethodBeat.o(108147);
  }

  private c()
  {
    AppMethodBeat.i(108143);
    this.hGk = new HashMap();
    AppMethodBeat.o(108143);
  }

  public static int aIA()
  {
    AppMethodBeat.i(108144);
    int i = ioy.incrementAndGet();
    AppMethodBeat.o(108144);
    return i;
  }

  public static c aIB()
  {
    AppMethodBeat.i(108145);
    c localc = c.a.aIC();
    AppMethodBeat.o(108145);
    return localc;
  }

  public final b CJ(String paramString)
  {
    AppMethodBeat.i(108146);
    if (this.hGk.containsKey(paramString))
    {
      paramString = (b)this.hGk.get(paramString);
      AppMethodBeat.o(108146);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(108146);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.c
 * JD-Core Version:    0.6.2
 */