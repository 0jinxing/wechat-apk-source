package com.tencent.mm.plugin.appbrand.jsapi.auth;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "api", "Lcom/tencent/mm/plugin/appbrand/jsapi/auth/BaseAuthJsApi;", "component", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentWithExtra;", "data", "Lorg/json/JSONObject;", "callbackId", "", "execute"})
final class a$b
  implements b
{
  public static final b hBx;

  static
  {
    AppMethodBeat.i(134644);
    hBx = new b();
    AppMethodBeat.o(134644);
  }

  public final void a(f paramf, h paramh, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(134643);
    j.p(paramf, "api");
    j.p(paramh, "component");
    j.p(paramJSONObject, "data");
    a.aCA();
    ab.e("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "dummy execute name[" + paramf.getName() + "], callbackId[" + paramInt + "], appId[" + paramh.getAppId() + ']');
    AppMethodBeat.o(134643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.a.b
 * JD-Core Version:    0.6.2
 */