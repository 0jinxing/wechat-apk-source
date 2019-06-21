package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.websocket.d;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class l
{
  private static AtomicInteger ioy;
  public HashMap<String, d> hGk;

  static
  {
    AppMethodBeat.i(108242);
    ioy = new AtomicInteger(1);
    AppMethodBeat.o(108242);
  }

  private l()
  {
    AppMethodBeat.i(108238);
    this.hGk = new HashMap();
    AppMethodBeat.o(108238);
  }

  public static int aIA()
  {
    AppMethodBeat.i(108241);
    int i = ioy.incrementAndGet();
    AppMethodBeat.o(108241);
    return i;
  }

  public static l aII()
  {
    AppMethodBeat.i(108239);
    l locall = l.a.aIJ();
    AppMethodBeat.o(108239);
    return locall;
  }

  public final d CT(String paramString)
  {
    AppMethodBeat.i(108240);
    if (this.hGk.containsKey(paramString))
    {
      paramString = (d)this.hGk.get(paramString);
      AppMethodBeat.o(108240);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(108240);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.l
 * JD-Core Version:    0.6.2
 */