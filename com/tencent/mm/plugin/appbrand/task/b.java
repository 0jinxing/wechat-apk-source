package com.tencent.mm.plugin.appbrand.task;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/task/AppBrandForcePreloadConfig;", "", "()V", "FORCE_PRELOAD_TAG", "", "TAG", "sShouldForcePreload", "", "disableForcePreload", "", "enableForcePreload", "shouldForcePreload", "plugin-appbrand-integration_release"})
public final class b
{
  private static boolean iEf;
  public static final b iEg;

  static
  {
    AppMethodBeat.i(134962);
    iEg = new b();
    long l = bo.yz();
    int i = as.amF("appbrand_process_force_preload").decodeInt("appbrand_process_force_preload", 0);
    if (i == 1)
    {
      ab.i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] storage config = [%d] == 1, accepted (mmkv cost [%d]ms)", new Object[] { Integer.valueOf(i), Long.valueOf(bo.az(l)) });
      iEf = true;
      AppMethodBeat.o(134962);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] storage config = [%d] != 1, buildConfig = [%b] reject (mmkv cost [%d]ms)", new Object[] { Integer.valueOf(i), Boolean.FALSE, Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(134962);
    }
  }

  public static final boolean aLG()
  {
    AppMethodBeat.i(134959);
    ab.i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] forcePreload = [%b]", new Object[] { Boolean.valueOf(iEf) });
    boolean bool = iEf;
    AppMethodBeat.o(134959);
    return bool;
  }

  public static final void aLH()
  {
    AppMethodBeat.i(134960);
    ab.i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] enableForcePreload");
    iEf = true;
    as localas = as.amF("appbrand_process_force_preload");
    localas.encode("appbrand_process_force_preload", 1);
    localas.apply();
    AppMethodBeat.o(134960);
  }

  public static final void aLI()
  {
    AppMethodBeat.i(134961);
    ab.i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] disableForcePreload");
    iEf = false;
    as localas = as.amF("appbrand_process_force_preload");
    localas.encode("appbrand_process_force_preload", -1);
    localas.apply();
    AppMethodBeat.o(134961);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.b
 * JD-Core Version:    0.6.2
 */