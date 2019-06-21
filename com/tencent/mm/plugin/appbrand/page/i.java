package com.tencent.mm.plugin.appbrand.page;

import com.tencent.luggage.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public class i extends p
{
  private static final int CTRL_INDEX = 50;
  private static final String NAME = "onAppEnterForeground";

  public final void a(com.tencent.mm.plugin.appbrand.i parami, boolean paramBoolean)
  {
    AppMethodBeat.i(87065);
    HashMap localHashMap = new HashMap();
    Object localObject = parami.yf().hgF.ayF();
    if (localObject != null)
      localHashMap.put("referrerInfo", localObject);
    localHashMap.put("relaunch", Boolean.valueOf(paramBoolean));
    localHashMap.put("reLaunch", Boolean.valueOf(paramBoolean));
    if (paramBoolean)
    {
      localObject = parami.atc();
      localHashMap.put("rawPath", localObject);
      localHashMap.put("path", h.bO((String)localObject));
      localHashMap.put("query", h.bP((String)localObject));
    }
    while (true)
    {
      ab.i("MicroMsg.AppBrandOnAppEnterForegroundEvent", "path: %s, query: %s, relaunch: %s, url: %s", new Object[] { localHashMap.get("path"), localHashMap.get("query"), localHashMap.get("relaunch"), localObject });
      com.tencent.luggage.g.i.d(localHashMap);
      s(localHashMap).i(parami.xT()).aCj();
      AppMethodBeat.o(87065);
      return;
      localObject = parami.asV().getCurrentUrl();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.i
 * JD-Core Version:    0.6.2
 */