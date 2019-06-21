package com.tencent.mm.plugin.appbrand.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.ad;
import com.tencent.mm.plugin.appbrand.appcache.af;
import com.tencent.mm.plugin.appbrand.appcache.ah;
import com.tencent.mm.plugin.appbrand.appcache.b.e.h;
import com.tencent.mm.plugin.appbrand.appcache.f;
import com.tencent.mm.plugin.appbrand.appusage.k;
import com.tencent.mm.plugin.appbrand.appusage.n;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.launching.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;

final class a
{
  static final Map<a.a, String[]> gQL;
  private static final Map<Class, Object> gQM;

  static
  {
    AppMethodBeat.i(129191);
    gQL = new HashMap();
    a(new a.1(), l.fjY);
    a(new a.8(), ad.fjY);
    a(new a.9(), n.fjY);
    a(new a.10(), com.tencent.mm.plugin.appbrand.appcache.b.e.e.fjY);
    a(new a.11(), ah.fjY);
    a(new a.12(), k.fjY);
    a(new a.13(), h.fjY);
    a(new a.14(), com.tencent.mm.plugin.appbrand.appcache.b.e.d.fjY);
    a(new a.15(), af.fjY);
    a(new a.2(), com.tencent.mm.plugin.appbrand.appcache.b.e.b.fjY);
    a(new a.3(), com.tencent.mm.plugin.appbrand.appusage.a.b.fjY);
    a(new a.4(), s.fjY);
    a(new a.5(), com.tencent.mm.plugin.appbrand.backgroundfetch.d.fjY);
    a(new a.6(), com.tencent.mm.plugin.appbrand.appcache.b.d.a.fjY);
    a(new a.7(), f.fjY);
    gQM = new HashMap();
    AppMethodBeat.o(129191);
  }

  static <T> T E(Class<T> paramClass)
  {
    AppMethodBeat.i(129190);
    boolean bool;
    if (paramClass != null)
      bool = true;
    while (true)
    {
      Assert.assertTrue("Cant pass Null class here", bool);
      synchronized (gQM)
      {
        paramClass = gQM.get(paramClass);
        AppMethodBeat.o(129190);
        return paramClass;
        bool = false;
      }
    }
  }

  private static void a(a.a parama, String[] paramArrayOfString)
  {
    AppMethodBeat.i(129187);
    gQL.put(parama, paramArrayOfString);
    AppMethodBeat.o(129187);
  }

  static void a(com.tencent.mm.sdk.e.e parame)
  {
    AppMethodBeat.i(129188);
    synchronized (gQM)
    {
      gQM.clear();
      Iterator localIterator = gQL.keySet().iterator();
      if (localIterator.hasNext())
      {
        Object localObject = ((a.a)localIterator.next()).b(parame);
        gQM.put(localObject.getClass(), localObject);
      }
    }
    AppMethodBeat.o(129188);
  }

  static void auD()
  {
    AppMethodBeat.i(129189);
    synchronized (gQM)
    {
      gQM.clear();
      AppMethodBeat.o(129189);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.a
 * JD-Core Version:    0.6.2
 */