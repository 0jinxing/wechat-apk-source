package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class f
{
  private static AtomicInteger ioy;
  public HashMap<String, d> hGk;

  static
  {
    AppMethodBeat.i(108166);
    ioy = new AtomicInteger(1);
    AppMethodBeat.o(108166);
  }

  private f()
  {
    AppMethodBeat.i(108162);
    this.hGk = new HashMap();
    AppMethodBeat.o(108162);
  }

  public static int aIA()
  {
    AppMethodBeat.i(108163);
    int i = ioy.incrementAndGet();
    AppMethodBeat.o(108163);
    return i;
  }

  public static f aIE()
  {
    AppMethodBeat.i(108164);
    f localf = f.a.aIF();
    AppMethodBeat.o(108164);
    return localf;
  }

  public final d CM(String paramString)
  {
    AppMethodBeat.i(108165);
    if (this.hGk.containsKey(paramString))
    {
      paramString = (d)this.hGk.get(paramString);
      AppMethodBeat.o(108165);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(108165);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.f
 * JD-Core Version:    0.6.2
 */