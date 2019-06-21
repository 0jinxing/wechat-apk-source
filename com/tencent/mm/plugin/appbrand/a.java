package com.tencent.mm.plugin.appbrand;

import android.support.v4.app.a.a;
import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.d;
import com.tencent.mm.plugin.appbrand.ui.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a
{
  private static final Map<String, o> gMD;
  private static Map<String, a.a> gME;
  private static Map<String, k> gMF;

  static
  {
    AppMethodBeat.i(128924);
    gMD = new HashMap();
    gME = new HashMap();
    gMF = new HashMap();
    AppMethodBeat.o(128924);
  }

  static void a(o paramo)
  {
    AppMethodBeat.i(128919);
    if (bo.isNullOrNil(paramo.mAppId))
    {
      ab.e("MicroMsg.AppBrandBridge", "clearRuntime with nil appId");
      AppMethodBeat.o(128919);
    }
    while (true)
    {
      return;
      synchronized (gMD)
      {
        o localo = (o)gMD.get(paramo.mAppId);
        if ((localo == null) || (localo == paramo))
        {
          gMD.put(paramo.mAppId, null);
          AppMethodBeat.o(128919);
          continue;
        }
        paramo = new java/lang/Throwable;
        paramo.<init>();
        ab.e("MicroMsg.AppBrandBridge", "clearRuntime with mismatch instance, stack %s", new Object[] { bo.l(paramo) });
      }
    }
  }

  public static void asC()
  {
    AppMethodBeat.i(128918);
    LinkedList localLinkedList = new LinkedList();
    synchronized (gMD)
    {
      Iterator localIterator = gMD.values().iterator();
      while (localIterator.hasNext())
      {
        o localo = (o)localIterator.next();
        if ((localo != null) && (localo.xy()))
          localLinkedList.add(localo);
      }
    }
    ??? = localLinkedList.iterator();
    while (((Iterator)???).hasNext())
      ((o)((Iterator)???).next()).atP();
    AppMethodBeat.o(128918);
  }

  static void b(o paramo)
  {
    AppMethodBeat.i(128920);
    if (bo.isNullOrNil(paramo.mAppId))
    {
      ab.e("MicroMsg.AppBrandBridge", "setRuntime with nil appId");
      AppMethodBeat.o(128920);
    }
    while (true)
    {
      return;
      synchronized (gMD)
      {
        gMD.put(paramo.mAppId, paramo);
        if (paramo.atI() != null)
          d.bs(paramo.mAppId, paramo.atI().bQe);
        AppMethodBeat.o(128920);
      }
    }
  }

  public static o wI(String paramString)
  {
    AppMethodBeat.i(128921);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(128921);
    }
    while (true)
    {
      return paramString;
      synchronized (gMD)
      {
        paramString = (o)gMD.get(paramString);
        AppMethodBeat.o(128921);
      }
    }
  }

  @Deprecated
  public static AppBrandSysConfigWC wJ(String paramString)
  {
    AppMethodBeat.i(128922);
    paramString = wI(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(128922);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.atH();
      AppMethodBeat.o(128922);
    }
  }

  @Deprecated
  public static AppBrandStatObject wK(String paramString)
  {
    AppMethodBeat.i(128923);
    paramString = wI(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(128923);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.ya().bQn;
      AppMethodBeat.o(128923);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.a
 * JD-Core Version:    0.6.2
 */