package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.l;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class j
  implements o
{
  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(129946);
    String str1;
    String str2;
    Object localObject;
    if (paramMap != null)
    {
      paramString = (String)paramMap.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.AppID");
      parama = (String)paramMap.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.UserName");
      str1 = (String)paramMap.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.Path");
      str2 = (String)paramMap.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.URL");
      localObject = (String)paramMap.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.MD5");
      paramMap = (String)paramMap.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.ExtInfo");
      ab.i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "onNewXmlReceived appId %s, userName %s, path %s, url %s, md5 %s, extInfo %s", new Object[] { paramString, parama, str1, str2, localObject, paramMap });
      if ((bo.isNullOrNil(paramString)) || (bo.isNullOrNil(parama)) || (bo.isNullOrNil(str2)))
      {
        ab.i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "appId = %s, username = %s, codeURL = %s, invalid, return", new Object[] { paramString, parama, str2 });
        AppMethodBeat.o(129946);
      }
    }
    while (true)
    {
      return;
      if (f.auV().a(paramString, 1, str2, (String)localObject, 0L, bo.anT() + 7200L))
        h.bt(paramString, 1);
      localObject = new LaunchParamsOptional();
      ((LaunchParamsOptional)localObject).fpI = paramMap;
      ((l)f.E(l.class)).n(paramString, 1, paramMap);
      paramMap = new AppBrandStatObject();
      paramMap.scene = 1101;
      paramMap.cst = (paramString + ":" + parama);
      AppBrandLaunchProxyUI.a(ah.getContext(), parama, str1, 1, -1, paramMap, null, (LaunchParamsOptional)localObject);
      AppMethodBeat.o(129946);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.j
 * JD-Core Version:    0.6.2
 */