package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class ai$1
  implements Runnable
{
  ai$1(ai paramai, int paramInt1, JsApiGetAppConfigTask paramJsApiGetAppConfigTask, s params, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130423);
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", this.bVv);
    localHashMap.put("data", this.hwQ.value);
    ab.i("MicroMsg.JsApiGetAppConfig", "getAppConfig type:%d,data:\n%s", new Object[] { Integer.valueOf(this.bVv), this.hwQ.value });
    if (bo.isNullOrNil(this.hwQ.value))
      this.hsj.M(this.eIl, this.hwR.j("fail", null));
    while (true)
    {
      this.hwQ.aBW();
      AppMethodBeat.o(130423);
      return;
      this.hsj.M(this.eIl, this.hwR.j("ok", localHashMap));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ai.1
 * JD-Core Version:    0.6.2
 */