package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.j.f.b;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.vending.e.b;

public final class ModularizingPkgRetrieverWC$1 extends f.b
{
  public final com.tencent.mm.plugin.appbrand.j.f i(i parami, String paramString)
  {
    AppMethodBeat.i(131925);
    paramString = new ModularizingPkgRetrieverWC(parami.mAppId, parami.ye().hhd.gVt, parami.ye().hhd.gVu, paramString, (byte)0);
    try
    {
      if ((parami instanceof b))
        parami.keep(paramString);
      AppMethodBeat.o(131925);
      return paramString;
    }
    catch (ClassCastException parami)
    {
      while ((!bp.dpL()) && (!com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED));
      AppMethodBeat.o(131925);
    }
    throw parami;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverWC.1
 * JD-Core Version:    0.6.2
 */