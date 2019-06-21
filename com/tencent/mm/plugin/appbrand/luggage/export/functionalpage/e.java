package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.a;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalConfigAssembler;", "", "()V", "assembleAppConfig", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandAppConfig;", "runtime", "Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalRuntime;", "assembleSysConfig", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandSysConfigWC;", "plugin-appbrand-integration_release"})
public final class e
{
  public static final e iks;

  static
  {
    AppMethodBeat.i(134737);
    iks = new e();
    AppMethodBeat.o(134737);
  }

  public static final AppBrandSysConfigWC a(j paramj)
  {
    AppMethodBeat.i(134735);
    a.f.b.j.p(paramj, "runtime");
    AppBrandSysConfigWC localAppBrandSysConfigWC = (AppBrandSysConfigWC)XIPCInvoker.a("com.tencent.mm", new IPCString(paramj.getAppId()), l.class);
    if (localAppBrandSysConfigWC != null)
    {
      localAppBrandSysConfigWC.hhd.gVt = paramj.atI().gVs;
      localAppBrandSysConfigWC.hhd.gVu = paramj.atI().axy;
      localAppBrandSysConfigWC.hhd.gVw = true;
      AppMethodBeat.o(134735);
      paramj = localAppBrandSysConfigWC;
    }
    while (true)
    {
      return paramj;
      paramj = null;
      AppMethodBeat.o(134735);
    }
  }

  public static final a b(j paramj)
  {
    AppMethodBeat.i(134736);
    a.f.b.j.p(paramj, "runtime");
    a locala = a.yT("{}");
    locala.hfg = paramj.atI().hgC;
    a.f.b.j.o(locala, "AppBrandAppConfig.parse(…onfig.enterPath\n        }");
    AppMethodBeat.o(134736);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.e
 * JD-Core Version:    0.6.2
 */