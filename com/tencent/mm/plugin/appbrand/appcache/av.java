package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.debugger.c;
import com.tencent.mm.plugin.appbrand.debugger.h;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class av
  implements bz.a
{
  public static final Map<String, av.c> gUU;

  static
  {
    AppMethodBeat.i(129438);
    HashMap localHashMap = new HashMap();
    localHashMap.put("AppBrandNotify", new av.b((byte)0));
    localHashMap.put("AppPublicLibraryNotify", new av.d((byte)0));
    localHashMap.put("mmbizwxaconfig", new av.a((byte)0));
    localHashMap.put("ForceOpenAppNotify", new com.tencent.mm.plugin.appbrand.debugger.d());
    localHashMap.put("AppBrandForceKill", new c());
    if (DebuggerShell.ayT())
      localHashMap.put("AppBrandTestUpdateWxaUsageListNotify", new h());
    gUU = Collections.unmodifiableMap(localHashMap);
    AppMethodBeat.o(129438);
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(129436);
    parama = aa.a(parama.eAB.vED);
    if (bo.isNullOrNil(parama))
    {
      ab.w("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "msg content is null");
      AppMethodBeat.o(129436);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.g.d.xDG.b(new av.1(this, parama), "MicroMsg.AppBrand.WxaPkgPushingXmlHandler");
      AppMethodBeat.o(129436);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.av
 * JD-Core Version:    0.6.2
 */