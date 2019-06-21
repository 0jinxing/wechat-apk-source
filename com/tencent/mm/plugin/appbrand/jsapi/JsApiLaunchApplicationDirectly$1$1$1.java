package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiLaunchApplicationDirectly$1$1$1
  implements JsApiLaunchApplicationDirectly.a.a
{
  JsApiLaunchApplicationDirectly$1$1$1(JsApiLaunchApplicationDirectly.1.1 param1)
  {
  }

  public final void r(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(130452);
    ab.i("MicroMsg.JsApiLaunchApplicationDirectly", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    JsApiLaunchApplicationDirectly.a(this.hxB.hxA.hxz, this.hxB.hxA.hsD);
    if (paramBoolean1)
    {
      this.hxB.hxA.hsD.M(this.hxB.hxA.eIl, this.hxB.hxA.hxz.j("ok", null));
      AppMethodBeat.o(130452);
    }
    while (true)
    {
      return;
      this.hxB.hxA.hsD.M(this.hxB.hxA.eIl, this.hxB.hxA.hxz.j("fail:scheme launch fail", null));
      AppMethodBeat.o(130452);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly.1.1.1
 * JD-Core Version:    0.6.2
 */