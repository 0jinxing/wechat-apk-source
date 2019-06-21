package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask.a;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiLaunchApplicationDirectly$LaunchApplicationTask$1
  implements JsApiLaunchApplicationDirectly.a.a
{
  JsApiLaunchApplicationDirectly$LaunchApplicationTask$1(JsApiLaunchApplicationDirectly.LaunchApplicationTask paramLaunchApplicationTask, AppBrandProxyTransparentUIProcessTask.a parama)
  {
  }

  public final void r(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(130468);
    ab.i("MicroMsg.JsApiLaunchApplicationDirectly", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (paramBoolean1)
    {
      this.hxP.success = true;
      this.hxr.aBT();
      AppMethodBeat.o(130468);
    }
    while (true)
    {
      return;
      this.hxP.success = false;
      this.hxr.aBT();
      AppMethodBeat.o(130468);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly.LaunchApplicationTask.1
 * JD-Core Version:    0.6.2
 */