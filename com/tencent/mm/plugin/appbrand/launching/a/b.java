package com.tencent.mm.plugin.appbrand.launching.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.protocal.protobuf.cxj;
import com.tencent.mm.protocal.protobuf.cyb;

public final class b
{
  public static cyb b(AppBrandLaunchReferrer paramAppBrandLaunchReferrer)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(102110);
    if (paramAppBrandLaunchReferrer == null)
      AppMethodBeat.o(102110);
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (2 == paramAppBrandLaunchReferrer.hgQ)
      {
        localObject2 = new cyb();
        ((cyb)localObject2).vEn = paramAppBrandLaunchReferrer.appId;
        ((cyb)localObject2).Url = paramAppBrandLaunchReferrer.url;
      }
      AppMethodBeat.o(102110);
    }
  }

  public static cxj c(AppBrandLaunchReferrer paramAppBrandLaunchReferrer)
  {
    cxj localcxj1 = null;
    cxj localcxj2 = null;
    AppMethodBeat.i(102111);
    if (paramAppBrandLaunchReferrer == null)
      AppMethodBeat.o(102111);
    while (true)
    {
      return localcxj2;
      if (1 == paramAppBrandLaunchReferrer.hgQ)
      {
        localcxj1 = new cxj();
        localcxj1.wzy = paramAppBrandLaunchReferrer.appId;
        localcxj1.wzp = paramAppBrandLaunchReferrer.cvp;
        localcxj1.xsK = paramAppBrandLaunchReferrer.hgS;
      }
      localcxj2 = localcxj1;
      if (paramAppBrandLaunchReferrer.cvp != 0)
      {
        localcxj2 = localcxj1;
        if (localcxj1 == null)
          localcxj2 = new cxj();
        localcxj2.wzp = paramAppBrandLaunchReferrer.cvp;
      }
      AppMethodBeat.o(102111);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.a.b
 * JD-Core Version:    0.6.2
 */