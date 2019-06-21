package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.f;

public final class ai
{
  public static ModulePkgInfo a(WxaAttributes.f paramf)
  {
    AppMethodBeat.i(101712);
    ModulePkgInfo localModulePkgInfo = new ModulePkgInfo();
    localModulePkgInfo.name = paramf.name;
    localModulePkgInfo.cvZ = paramf.cvZ;
    localModulePkgInfo.cta = paramf.cta;
    localModulePkgInfo.gSQ = paramf.gSQ;
    AppMethodBeat.o(101712);
    return localModulePkgInfo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ai
 * JD-Core Version:    0.6.2
 */