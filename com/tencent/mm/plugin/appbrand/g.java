package com.tencent.mm.plugin.appbrand;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class g
{
  private static final Iterator<g.c> gNa;
  private static final Map<String, g.b> gNb;
  private static final Map<String, g.d> gNc;
  private static final i<String, g.c> gNd;
  private static final i<String, g.a> gNe;

  static
  {
    AppMethodBeat.i(90971);
    gNa = new g.1();
    gNb = new HashMap();
    gNc = new HashMap();
    gNd = new i();
    gNe = new i();
    AppMethodBeat.o(90971);
  }

  public static void a(String paramString, g.b paramb)
  {
    AppMethodBeat.i(90969);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(90969);
    while (true)
    {
      return;
      gNb.put(paramString, paramb);
      AppMethodBeat.o(90969);
    }
  }

  public static void a(String paramString, g.c paramc)
  {
    AppMethodBeat.i(90956);
    if ((TextUtils.isEmpty(paramString)) || (paramc == null))
      AppMethodBeat.o(90956);
    while (true)
    {
      return;
      gNd.f(paramString, paramc);
      AppMethodBeat.o(90956);
    }
  }

  public static void a(String paramString, g.d paramd)
  {
    AppMethodBeat.i(90968);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(90968);
    while (true)
    {
      return;
      gNc.put(paramString, paramd);
      AppMethodBeat.o(90968);
    }
  }

  public static void b(String paramString, g.c paramc)
  {
    AppMethodBeat.i(90963);
    if ((paramc == null) || (TextUtils.isEmpty(paramString)))
      AppMethodBeat.o(90963);
    while (true)
    {
      return;
      i locali = gNd;
      if (paramc == null)
      {
        AppMethodBeat.o(90963);
      }
      else
      {
        paramString = locali.b(paramString, false);
        if (paramString != null)
          try
          {
            paramString.remove(paramc);
            AppMethodBeat.o(90963);
            continue;
          }
          finally
          {
            AppMethodBeat.o(90963);
          }
        else
          AppMethodBeat.o(90963);
      }
    }
  }

  private static Iterator<g.c> wM(String paramString)
  {
    AppMethodBeat.i(90957);
    paramString = gNd.bC(paramString);
    if (paramString != null)
    {
      paramString = paramString.iterator();
      AppMethodBeat.o(90957);
    }
    while (true)
    {
      return paramString;
      paramString = gNa;
      AppMethodBeat.o(90957);
    }
  }

  public static void wN(String paramString)
  {
    AppMethodBeat.i(90958);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(90958);
    while (true)
    {
      return;
      paramString = wM(paramString);
      while (paramString.hasNext())
        ((g.c)paramString.next()).onCreate();
      AppMethodBeat.o(90958);
    }
  }

  public static void wO(String paramString)
  {
    AppMethodBeat.i(90959);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(90959);
    while (true)
    {
      return;
      paramString = wM(paramString);
      while (paramString.hasNext())
        ((g.c)paramString.next()).onDestroy();
      AppMethodBeat.o(90959);
    }
  }

  public static void wP(String paramString)
  {
    AppMethodBeat.i(90960);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(90960);
    while (true)
    {
      return;
      Iterator localIterator = wM(paramString);
      while (localIterator.hasNext())
        ((g.c)localIterator.next()).a(wV(paramString));
      AppMethodBeat.o(90960);
    }
  }

  public static void wQ(String paramString)
  {
    AppMethodBeat.i(90961);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(90961);
    while (true)
    {
      return;
      paramString = wM(paramString);
      while (paramString.hasNext())
        ((g.c)paramString.next()).onResume();
      AppMethodBeat.o(90961);
    }
  }

  public static void wR(String paramString)
  {
    AppMethodBeat.i(90962);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(90962);
    while (true)
    {
      return;
      paramString = wM(paramString);
      while (paramString.hasNext())
        paramString.next();
      AppMethodBeat.o(90962);
    }
  }

  public static boolean wS(String paramString)
  {
    AppMethodBeat.i(90964);
    paramString = gNe.bC(paramString);
    boolean bool;
    if (paramString != null)
    {
      paramString = paramString.iterator();
      while (paramString.hasNext())
        if (((g.a)paramString.next()).asO())
        {
          bool = true;
          AppMethodBeat.o(90964);
        }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90964);
    }
  }

  public static void wT(String paramString)
  {
    AppMethodBeat.i(90965);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(90965);
    while (true)
    {
      return;
      gNd.bD(paramString);
      gNe.bD(paramString);
      AppMethodBeat.o(90965);
    }
  }

  public static void wU(String paramString)
  {
    AppMethodBeat.i(90966);
    a(paramString, g.d.gNo);
    AppMethodBeat.o(90966);
  }

  public static g.d wV(String paramString)
  {
    AppMethodBeat.i(90967);
    paramString = (g.d)gNc.get(paramString);
    if (paramString == null)
    {
      paramString = g.d.gNo;
      AppMethodBeat.o(90967);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(90967);
    }
  }

  public static g.b wW(String paramString)
  {
    AppMethodBeat.i(90970);
    g.b localb = (g.b)gNb.get(paramString);
    paramString = localb;
    if (localb == null)
      paramString = g.b.gNf;
    AppMethodBeat.o(90970);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.g
 * JD-Core Version:    0.6.2
 */