package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiLaunchApplication$1$1$1
  implements JsApiLaunchApplication.a.a
{
  JsApiLaunchApplication$1$1$1(JsApiLaunchApplication.1.1 param1)
  {
  }

  public final void r(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(130435);
    ab.i("MicroMsg.JsApiLaunchApplication", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (paramBoolean1)
    {
      this.hxm.hxl.hsD.M(this.hxm.hxl.eIl, this.hxm.hxl.hxk.j("ok", null));
      AppMethodBeat.o(130435);
    }
    while (true)
    {
      return;
      this.hxm.hxl.hsD.M(this.hxm.hxl.eIl, this.hxm.hxl.hxk.j("fail:scheme launch fail", null));
      AppMethodBeat.o(130435);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication.1.1.1
 * JD-Core Version:    0.6.2
 */