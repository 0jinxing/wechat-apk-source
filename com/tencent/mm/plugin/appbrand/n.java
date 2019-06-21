package com.tencent.mm.plugin.appbrand;

import android.support.v4.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.a.c.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class n
{
  private static final Map<String, n> eGg;
  private static final n gPb;
  public volatile String gPc;
  public final AtomicInteger gPd;
  public final AtomicBoolean gPe;
  public c.a gPf;
  public volatile String gPg;
  public volatile String gPh;
  public volatile boolean gPi;
  public volatile boolean gPj;
  public volatile boolean gPk;
  public volatile boolean gPl;
  public volatile boolean gPm;
  public volatile boolean gPn;

  static
  {
    AppMethodBeat.i(86746);
    eGg = new a();
    gPb = new n();
    AppMethodBeat.o(86746);
  }

  private n()
  {
    AppMethodBeat.i(86739);
    this.gPd = new AtomicInteger();
    this.gPe = new AtomicBoolean(false);
    this.gPf = null;
    this.gPl = false;
    this.gPm = false;
    this.gPn = false;
    AppMethodBeat.o(86739);
  }

  static void remove(String paramString)
  {
    AppMethodBeat.i(86743);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(86743);
    while (true)
    {
      return;
      synchronized (eGg)
      {
        eGg.remove(paramString);
        AppMethodBeat.o(86743);
      }
    }
  }

  public static n wX(String paramString)
  {
    AppMethodBeat.i(86740);
    paramString = wY(paramString);
    AppMethodBeat.o(86740);
    return paramString;
  }

  private static n wY(String paramString)
  {
    AppMethodBeat.i(86741);
    Object localObject;
    if (bo.isNullOrNil(paramString))
    {
      localObject = null;
      AppMethodBeat.o(86741);
    }
    while (true)
    {
      return localObject;
      synchronized (eGg)
      {
        n localn = (n)eGg.get(paramString);
        localObject = localn;
        if (localn == null)
        {
          localObject = new com/tencent/mm/plugin/appbrand/n;
          ((n)localObject).<init>();
          eGg.put(paramString, localObject);
        }
        AppMethodBeat.o(86741);
      }
    }
  }

  private static n wZ(String paramString)
  {
    AppMethodBeat.i(86742);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(86742);
    }
    while (true)
    {
      return paramString;
      synchronized (eGg)
      {
        paramString = (n)eGg.get(paramString);
        AppMethodBeat.o(86742);
      }
    }
  }

  public static n xa(String paramString)
  {
    AppMethodBeat.i(86744);
    paramString = wZ(paramString);
    if (paramString == null)
    {
      paramString = gPb;
      AppMethodBeat.o(86744);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(86744);
    }
  }

  public static n xb(String paramString)
  {
    AppMethodBeat.i(86745);
    paramString = wY(paramString);
    AppMethodBeat.o(86745);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.n
 * JD-Core Version:    0.6.2
 */