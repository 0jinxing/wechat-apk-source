package com.tencent.mm.plugin.appbrand.j;

import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class h
  implements a
{
  private final Set<String> inP;
  final com.tencent.mm.plugin.appbrand.r.i<String, h.a> inQ;
  final b inR;
  private final Map<String, Boolean> inS;

  public h(b paramb)
  {
    AppMethodBeat.i(102157);
    this.inP = new HashSet();
    this.inQ = new com.tencent.mm.plugin.appbrand.r.i();
    this.inS = new HashMap();
    this.inR = paramb;
    AppMethodBeat.o(102157);
  }

  private void a(ModulePkgInfo arg1, boolean paramBoolean, a.b paramb, a.a parama)
  {
    AppMethodBeat.i(102163);
    String str = ???.name;
    boolean bool1;
    if ((!"__APP__".equals(str)) && (!???.cta) && (!aIz()))
    {
      bool1 = true;
      if (bool1)
        a(this.inR.xZ().hhd, false, null, null);
      ab.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule, name %s, independent %b, should ensure __APP__ %b", new Object[] { ???.name, Boolean.valueOf(???.cta), Boolean.valueOf(bool1) });
      a(str, paramb, parama);
    }
    while (true)
    {
      synchronized (this.inP)
      {
        boolean bool2 = this.inP.contains(str);
        if (!bool2)
          this.inP.add(str);
        if (!bool2)
        {
          ??? = new c();
          if (bool1)
          {
            a("__APP__", new h.1(this, ???), null);
            paramb = new j();
            if (paramBoolean)
            {
              parama = new e().a(new h.2(this, str));
              parama.x(this.inR);
              paramb.value = parama;
            }
            parama = this.inR.xZ().hhd.xL(str);
            parama = f.b.inO.i(this.inR, parama);
            parama.a(new h.3(this, str, bool1, paramb, ???));
            parama.start();
          }
        }
        else
        {
          AppMethodBeat.o(102163);
          return;
          bool1 = false;
        }
      }
      ???.K(null);
    }
  }

  private void a(String paramString, a.b paramb, a.a parama)
  {
    AppMethodBeat.i(102164);
    if ((paramb == null) && (parama == null))
      AppMethodBeat.o(102164);
    while (true)
    {
      return;
      this.inQ.f(paramString, new h.a(paramb, parama));
      AppMethodBeat.o(102164);
    }
  }

  private boolean a(ModulePkgInfo paramModulePkgInfo)
  {
    AppMethodBeat.i(102159);
    if ((!bo.isNullOrNil(paramModulePkgInfo.gSP)) && (com.tencent.mm.vfs.e.ct(paramModulePkgInfo.gSP)));
    for (boolean bool = true; ; bool = false)
    {
      if (bool)
      {
        if (!paramModulePkgInfo.cta)
          CD("__APP__");
        CD(paramModulePkgInfo.name);
      }
      AppMethodBeat.o(102159);
      return bool;
    }
  }

  public final String CC(String paramString)
  {
    AppMethodBeat.i(102165);
    paramString = CE(paramString).name;
    AppMethodBeat.o(102165);
    return paramString;
  }

  final void CD(String paramString)
  {
    AppMethodBeat.i(102160);
    synchronized (this.inS)
    {
      if (this.inS.containsKey(paramString))
      {
        AppMethodBeat.o(102160);
        return;
      }
      ((g)this.inR.xT()).xd(paramString);
      this.inS.put(paramString, Boolean.TRUE);
      ab.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "module (%s) injected", new Object[] { paramString });
      AppMethodBeat.o(102160);
    }
  }

  public final ModulePkgInfo CE(String paramString)
  {
    AppMethodBeat.i(102166);
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = this.inR.xZ().hhd;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(102166);
      paramString = localWxaPkgWrappingInfo;
    }
    while (true)
    {
      return paramString;
      String str = l.yk(paramString);
      Iterator localIterator = localWxaPkgWrappingInfo.gVx.iterator();
      label150: 
      while (true)
      {
        if (!localIterator.hasNext())
          break label152;
        paramString = (ModulePkgInfo)localIterator.next();
        if (str.startsWith(paramString.name))
        {
          AppMethodBeat.o(102166);
          break;
        }
        if ((paramString.gSQ != null) && (paramString.gSQ.length > 0))
        {
          String[] arrayOfString = paramString.gSQ;
          int i = arrayOfString.length;
          for (int j = 0; ; j++)
          {
            if (j >= i)
              break label150;
            if (str.startsWith(arrayOfString[j]))
            {
              AppMethodBeat.o(102166);
              break;
            }
          }
        }
      }
      label152: AppMethodBeat.o(102166);
      paramString = localWxaPkgWrappingInfo;
    }
  }

  public final void a(String paramString, boolean paramBoolean, a.b paramb)
  {
    AppMethodBeat.i(102162);
    a(paramString, paramBoolean, paramb, null);
    AppMethodBeat.o(102162);
  }

  public final void a(String paramString, boolean paramBoolean, a.b paramb, a.a parama)
  {
    AppMethodBeat.i(102161);
    if (this.inR.mFinished)
    {
      ab.e("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule with path(%s), but runtime(%s) finished", new Object[] { paramString, this.inR.mAppId });
      paramb.a(a.d.inI);
      AppMethodBeat.o(102161);
    }
    while (true)
    {
      return;
      j localj = new j();
      if (bo.isNullOrNil(paramString));
      for (paramString = this.inR.xZ().hhd; ; paramString = CE(paramString))
      {
        localj.value = paramString;
        if ((!a(paramString)) || (paramb == null))
          break label130;
        paramb.a(a.d.inH);
        AppMethodBeat.o(102161);
        break;
      }
      label130: a((ModulePkgInfo)localj.value, paramBoolean, paramb, parama);
      AppMethodBeat.o(102161);
    }
  }

  public final boolean aIy()
  {
    return true;
  }

  final boolean aIz()
  {
    AppMethodBeat.i(102158);
    boolean bool = a(this.inR.xZ().hhd);
    AppMethodBeat.o(102158);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.j.h
 * JD-Core Version:    0.6.2
 */