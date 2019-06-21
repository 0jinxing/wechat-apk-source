package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicBoolean;

public final class n$c
{
  private static final n.d gSC;

  static
  {
    AppMethodBeat.i(129339);
    gSC = new n.d();
    AppMethodBeat.o(129339);
  }

  public static n avx()
  {
    AppMethodBeat.i(129337);
    Object localObject;
    if (r.avG())
    {
      localObject = gSC;
      AppMethodBeat.o(129337);
    }
    while (true)
    {
      return localObject;
      localObject = au.gUS;
      AppMethodBeat.o(129337);
    }
  }

  public static void interrupt()
  {
    AppMethodBeat.i(129338);
    n.d locald = gSC;
    try
    {
      h.pYm.k(1007L, 2L, 1L);
      locald.gSD.set(true);
      AppMethodBeat.o(129338);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.AppBrand.PkgCleanupNewLogic", localThrowable, "cleanup interrupted report", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.n.c
 * JD-Core Version:    0.6.2
 */