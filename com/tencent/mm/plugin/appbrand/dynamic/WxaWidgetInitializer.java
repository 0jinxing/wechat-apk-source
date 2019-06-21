package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.j.d;
import com.tencent.mm.protocal.protobuf.cvx;
import com.tencent.mm.protocal.protobuf.rg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class WxaWidgetInitializer
{
  static WxaWidgetInitializer.WxaWidgetContextImpl a(String paramString1, String paramString2, WxaPkgWrappingInfo paramWxaPkgWrappingInfo, d paramd)
  {
    int i = 1;
    AppMethodBeat.i(10724);
    ab.i("MicroMsg.WxaWidgetInitializer", "prepare(%s)", new Object[] { paramString1 });
    u.i("MicroMsg.WxaWidgetInitializer", "prepare(%s)", new Object[] { paramString1 });
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = WxaCommLibRuntimeReader.avQ();
    if (localWxaPkgWrappingInfo == null)
    {
      ab.e("MicroMsg.WxaWidgetInitializer", "getLibPkgInfo return null.");
      paramString1 = null;
      AppMethodBeat.o(10724);
    }
    while (true)
    {
      return paramString1;
      paramWxaPkgWrappingInfo = new WxaWidgetInitializer.WxaWidgetContextImpl(localWxaPkgWrappingInfo, paramWxaPkgWrappingInfo);
      paramWxaPkgWrappingInfo.eIq = paramString1;
      paramWxaPkgWrappingInfo.mAppId = paramString2;
      paramWxaPkgWrappingInfo.hlY = paramd.hoT;
      if (paramWxaPkgWrappingInfo.hlY == null)
        paramWxaPkgWrappingInfo.hlY = new DebuggerInfo();
      paramWxaPkgWrappingInfo.hlZ = paramd.hoU;
      paramWxaPkgWrappingInfo.hma = paramd.hoV;
      try
      {
        if ((paramd.hoX != null) && (paramd.hoX.vYw != null));
        for (paramString2 = paramd.hoX.vYw.toByteArray(); ; paramString2 = new byte[0])
        {
          paramWxaPkgWrappingInfo.hlW = paramString2;
          if (!paramWxaPkgWrappingInfo.hlY.hmF)
            break label230;
          paramWxaPkgWrappingInfo.hlX = 2;
          f.azA().aZ(paramString1, 2101);
          j.azE().E(paramString1, 626, 5);
          AppMethodBeat.o(10724);
          paramString1 = paramWxaPkgWrappingInfo;
          break;
        }
      }
      catch (Exception paramString2)
      {
        while (true)
        {
          ab.e("MicroMsg.WxaWidgetInitializer", bo.l(paramString2));
          continue;
          label230: if (paramd.hoW != null)
            i = paramd.hoW.vAS;
          paramWxaPkgWrappingInfo.hlX = i;
        }
      }
    }
  }

  public static String bL(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10725);
    paramString1 = paramString1 + "#" + paramString2 + "#" + System.currentTimeMillis();
    AppMethodBeat.o(10725);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetInitializer
 * JD-Core Version:    0.6.2
 */