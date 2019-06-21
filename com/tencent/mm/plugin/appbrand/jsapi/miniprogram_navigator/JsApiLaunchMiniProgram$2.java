package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.luggage.sdk.a.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.launching.LaunchBroadCast;

final class JsApiLaunchMiniProgram$2
  implements MMToClientEvent.c
{
  JsApiLaunchMiniProgram$2(JsApiLaunchMiniProgram paramJsApiLaunchMiniProgram, String paramString, int paramInt1, b paramb, int paramInt2)
  {
  }

  public final void bk(Object paramObject)
  {
    AppMethodBeat.i(131324);
    b localb;
    int i;
    JsApiLaunchMiniProgram localJsApiLaunchMiniProgram;
    if ((paramObject instanceof LaunchBroadCast))
    {
      paramObject = (LaunchBroadCast)paramObject;
      if ((this.hQJ.equals(paramObject.appId)) && (this.hQK == paramObject.har))
      {
        MMToClientEvent.b(this.hQG.getAppId(), this);
        localb = this.hQG;
        i = this.eIl;
        localJsApiLaunchMiniProgram = this.hQI;
        if (!paramObject.cQe)
          break label97;
      }
    }
    label97: for (paramObject = "ok"; ; paramObject = "fail")
    {
      localb.M(i, localJsApiLaunchMiniProgram.j(paramObject, null));
      AppMethodBeat.o(131324);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiLaunchMiniProgram.2
 * JD-Core Version:    0.6.2
 */