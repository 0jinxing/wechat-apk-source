package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiLaunchApplication$1$1$3
  implements Runnable
{
  JsApiLaunchApplication$1$1$3(JsApiLaunchApplication.1.1 param1, JsApiLaunchApplication.LaunchApplicationTask paramLaunchApplicationTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130437);
    ab.i("MicroMsg.JsApiLaunchApplication", "callback task.success:%b", new Object[] { Boolean.valueOf(this.hxp.success) });
    this.hxp.aBW();
    if (!this.hxp.success)
    {
      this.hxm.hxl.hsD.M(this.hxm.hxl.eIl, this.hxm.hxl.hxk.j("fail:sdk launch fail", null));
      AppMethodBeat.o(130437);
    }
    while (true)
    {
      return;
      this.hxm.hxl.hsD.M(this.hxm.hxl.eIl, this.hxm.hxl.hxk.j("ok", null));
      AppMethodBeat.o(130437);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication.1.1.3
 * JD-Core Version:    0.6.2
 */