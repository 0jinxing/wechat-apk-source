package com.tencent.mm.plugin.appbrand.jsapi.profile;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.b;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/JsApiProfile;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandAsyncJsApi;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;", "()V", "invoke", "", "env", "data", "Lorg/json/JSONObject;", "callbackId", "", "Companion", "plugin-appbrand-integration_release"})
public final class c extends com.tencent.mm.plugin.appbrand.jsapi.a<com.tencent.mm.plugin.appbrand.jsapi.c>
{
  private static final int CTRL_INDEX = 508;
  private static final String NAME = "profile";
  public static final c.a hUM;

  static
  {
    AppMethodBeat.i(134695);
    hUM = new c.a((byte)0);
    NAME = "profile";
    CTRL_INDEX = 508;
    AppMethodBeat.o(134695);
  }

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(134694);
    j.p(paramc, "env");
    j.p(paramJSONObject, "data");
    Object localObject = paramJSONObject.optString("username");
    int i = paramJSONObject.optInt("scene", 122);
    String str = paramJSONObject.optString("profileReportInfo");
    if (bo.isNullOrNil((String)localObject))
    {
      paramc.M(paramInt, AK("fail:invalid data"));
      AppMethodBeat.o(134694);
    }
    while (true)
    {
      return;
      paramJSONObject = new ProfileRequest();
      paramJSONObject.username = ((String)localObject);
      paramJSONObject.scene = i;
      localObject = (AppBrandProxyUIProcessTask.b)new c.b(this, paramc, paramInt, str, i, (String)localObject);
      com.tencent.mm.plugin.appbrand.ipc.a.a(paramc.getContext(), (AppBrandProxyUIProcessTask.ProcessRequest)paramJSONObject, (AppBrandProxyUIProcessTask.b)localObject);
      AppMethodBeat.o(134694);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.profile.c
 * JD-Core Version:    0.6.2
 */