package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiLaunchApplicationDirectly$1$1$3
  implements Runnable
{
  JsApiLaunchApplicationDirectly$1$1$3(JsApiLaunchApplicationDirectly.1.1 param1, JsApiLaunchApplicationDirectly.LaunchApplicationTask paramLaunchApplicationTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130454);
    ab.i("MicroMsg.JsApiLaunchApplicationDirectly", "callback task.success:%b", new Object[] { Boolean.valueOf(this.hxD.success) });
    this.hxD.aBW();
    if (!this.hxD.success)
    {
      this.hxB.hxA.hsD.M(this.hxB.hxA.eIl, this.hxB.hxA.hxz.j("fail:sdk launch fail", null));
      AppMethodBeat.o(130454);
    }
    while (true)
    {
      return;
      this.hxB.hxA.hsD.M(this.hxB.hxA.eIl, this.hxB.hxA.hxz.j("ok", null));
      AppMethodBeat.o(130454);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly.1.1.3
 * JD-Core Version:    0.6.2
 */