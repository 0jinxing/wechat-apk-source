package com.tencent.mm.plugin.appbrand.widget.input;

import android.support.v4.f.a;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.r.m;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public enum o
{
  public static final Map<String, Integer> jeS;
  public static final Set<String> jeT;
  private static final a<u, ab> jeU;

  static
  {
    AppMethodBeat.i(123693);
    jeV = new o[0];
    Object localObject = new HashSet();
    ((Set)localObject).add("text");
    ((Set)localObject).add("emoji");
    ((Set)localObject).add("number");
    ((Set)localObject).add("digit");
    ((Set)localObject).add("idcard");
    jeT = Collections.unmodifiableSet((Set)localObject);
    localObject = new HashMap(3);
    ((Map)localObject).put("digit", Integer.valueOf(2));
    ((Map)localObject).put("number", Integer.valueOf(0));
    ((Map)localObject).put("idcard", Integer.valueOf(1));
    jeS = Collections.unmodifiableMap((Map)localObject);
    jeU = new a();
    AppMethodBeat.o(123693);
  }

  public static aa a(u paramu, int paramInt)
  {
    AppMethodBeat.i(123684);
    paramu = e.a(paramu, new e.a()
    {
      public final boolean a(aa paramAnonymousaa)
      {
        AppMethodBeat.i(123677);
        boolean bool;
        if ((paramAnonymousaa.aQo() != null) && (((ab)paramAnonymousaa.aQo()).getInputId() == this.hKt))
        {
          bool = true;
          AppMethodBeat.o(123677);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(123677);
        }
      }
    });
    AppMethodBeat.o(123684);
    return paramu;
  }

  static void a(u paramu, ab paramab)
  {
    AppMethodBeat.i(123690);
    if (paramu == null)
      AppMethodBeat.o(123690);
    while (true)
    {
      return;
      m.runOnUiThread(new o.3(paramu, paramab));
      AppMethodBeat.o(123690);
    }
  }

  public static void a(u paramu, String paramString, Integer paramInteger)
  {
    AppMethodBeat.i(123685);
    if (paramu == null)
      AppMethodBeat.o(123685);
    while (true)
    {
      return;
      m.runOnUiThread(new o.2(paramu, paramString, paramInteger));
      AppMethodBeat.o(123685);
    }
  }

  public static boolean a(u paramu, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(123688);
    aa localaa = a(paramu, paramInt1);
    boolean bool;
    if ((localaa != null) && (localaa.s(paramu)) && (localaa.dr(paramInt2, paramInt3)))
    {
      bool = true;
      AppMethodBeat.o(123688);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123688);
    }
  }

  public static boolean a(u paramu, Integer paramInteger)
  {
    AppMethodBeat.i(123687);
    Integer localInteger = paramInteger;
    if (paramInteger == null);
    try
    {
      paramInteger = (ab)jeU.get(paramu);
      if (paramInteger == null)
      {
        AppMethodBeat.o(123687);
        bool = false;
      }
      while (true)
      {
        return bool;
        localInteger = Integer.valueOf(paramInteger.getInputId());
        paramu = a(paramu, localInteger.intValue());
        if ((paramu == null) || (!paramu.aQt()))
          break;
        bool = true;
        AppMethodBeat.o(123687);
      }
    }
    catch (Throwable paramu)
    {
      while (true)
      {
        d.printErrStackTrace("MicroMsg.AppBrandInputService", paramu, "[NOT CRASH]", new Object[0]);
        AppMethodBeat.o(123687);
        boolean bool = false;
        continue;
        AppMethodBeat.o(123687);
        bool = false;
      }
    }
  }

  static void b(u paramu, aa paramaa)
  {
    AppMethodBeat.i(123683);
    e.a(paramu, paramaa);
    AppMethodBeat.o(123683);
  }

  public static boolean b(u paramu, int paramInt)
  {
    AppMethodBeat.i(123689);
    paramu = a(paramu, paramInt);
    boolean bool;
    if ((paramu != null) && (paramu.aQn()))
    {
      bool = true;
      AppMethodBeat.o(123689);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123689);
    }
  }

  public static boolean v(u paramu)
  {
    AppMethodBeat.i(123686);
    boolean bool = a(paramu, null);
    AppMethodBeat.o(123686);
    return bool;
  }

  static void w(u paramu)
  {
    AppMethodBeat.i(123691);
    if (paramu == null)
      AppMethodBeat.o(123691);
    while (true)
    {
      return;
      m.runOnUiThread(new o.4(paramu));
      AppMethodBeat.o(123691);
    }
  }

  public static aa x(u paramu)
  {
    AppMethodBeat.i(123692);
    if (paramu == null)
    {
      AppMethodBeat.o(123692);
      paramu = null;
    }
    while (true)
    {
      return paramu;
      ab localab = (ab)jeU.get(paramu);
      if (localab == null)
      {
        AppMethodBeat.o(123692);
        paramu = null;
      }
      else
      {
        paramu = a(paramu, localab.getInputId());
        AppMethodBeat.o(123692);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.o
 * JD-Core Version:    0.6.2
 */