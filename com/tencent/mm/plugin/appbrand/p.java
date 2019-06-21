package com.tencent.mm.plugin.appbrand;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWCAccessible;", "", "()V", "getUsername", "", "component", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;", "isGame", "", "runtime", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;", "initConfig", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfig;", "isPluginApp", "plugin-appbrand-integration_release"})
public final class p
{
  public static final p gPG;

  static
  {
    AppMethodBeat.i(134453);
    gPG = new p();
    AppMethodBeat.o(134453);
  }

  public static final String a(c paramc)
  {
    Object localObject = null;
    AppMethodBeat.i(134448);
    if (!(paramc instanceof h))
      paramc = null;
    while (true)
    {
      paramc = (h)paramc;
      if (paramc != null)
      {
        paramc = paramc.getRuntime();
        c localc = paramc;
        if (!(paramc instanceof o))
          localc = null;
        paramc = (o)localc;
        if (paramc == null)
          break label78;
        paramc = paramc.atI();
        if (paramc == null)
          break label78;
        paramc = paramc.username;
        AppMethodBeat.o(134448);
      }
      while (true)
      {
        return paramc;
        paramc = null;
        break;
        label78: AppMethodBeat.o(134448);
        paramc = localObject;
      }
    }
  }

  public static final boolean b(c paramc)
  {
    Object localObject = null;
    AppMethodBeat.i(134451);
    if (!(paramc instanceof h))
      paramc = null;
    while (true)
    {
      h localh = (h)paramc;
      paramc = localObject;
      if (localh != null)
        paramc = localh.getRuntime();
      boolean bool = k(paramc);
      AppMethodBeat.o(134451);
      return bool;
    }
  }

  public static final boolean f(AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(134450);
    j.p(paramAppBrandInitConfig, "initConfig");
    if (!(paramAppBrandInitConfig instanceof AppBrandInitConfigWC))
      paramAppBrandInitConfig = null;
    while (true)
    {
      paramAppBrandInitConfig = (AppBrandInitConfigWC)paramAppBrandInitConfig;
      boolean bool;
      if (paramAppBrandInitConfig != null)
      {
        bool = paramAppBrandInitConfig.xy();
        AppMethodBeat.o(134450);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(134450);
      }
    }
  }

  public static final boolean k(i parami)
  {
    AppMethodBeat.i(134449);
    if (!(parami instanceof o))
      parami = null;
    while (true)
    {
      parami = (o)parami;
      boolean bool;
      if (parami != null)
      {
        bool = parami.xy();
        AppMethodBeat.o(134449);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(134449);
      }
    }
  }

  public static final boolean l(i parami)
  {
    AppMethodBeat.i(134452);
    if (!(parami instanceof o))
      parami = null;
    while (true)
    {
      parami = (o)parami;
      boolean bool;
      if (parami != null)
      {
        bool = parami.atD();
        AppMethodBeat.o(134452);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(134452);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.p
 * JD-Core Version:    0.6.2
 */