package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.sdk.platformtools.ab;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/GetSycConfigTask;", "Lcom/tencent/mm/ipcinvoker/IPCSyncInvokeTask;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandSysConfigWC;", "()V", "invoke", "data", "plugin-appbrand-integration_release"})
final class l
  implements i<IPCString, AppBrandSysConfigWC>
{
  private static AppBrandSysConfigWC a(IPCString paramIPCString)
  {
    Object localObject = null;
    AppMethodBeat.i(134749);
    ab.i("MicroMsg.AppBrand.FunctionalConfigAssembler", "invoke GetSycConfigTask with ".concat(String.valueOf(paramIPCString)));
    if (paramIPCString == null);
    try
    {
      j.dWJ();
      if (g.RN().QY())
      {
        paramIPCString = p.zj(paramIPCString.value);
        if (paramIPCString != null)
        {
          paramIPCString.bQO = AppBrandGlobalSystemConfig.ayC();
          AppMethodBeat.o(134749);
          return paramIPCString;
        }
      }
    }
    catch (Exception paramIPCString)
    {
      while (true)
      {
        AppMethodBeat.o(134749);
        paramIPCString = localObject;
        continue;
        AppMethodBeat.o(134749);
        paramIPCString = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.l
 * JD-Core Version:    0.6.2
 */