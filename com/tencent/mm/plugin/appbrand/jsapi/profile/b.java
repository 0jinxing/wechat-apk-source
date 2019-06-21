package com.tencent.mm.plugin.appbrand.jsapi.profile;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.b;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/JsApiOpenUserProfile;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandAsyncJsApi;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;", "()V", "invoke", "", "env", "data", "Lorg/json/JSONObject;", "callbackId", "", "Companion", "plugin-appbrand-integration_release"})
public final class b extends com.tencent.mm.plugin.appbrand.jsapi.a<c>
{
  private static final int CTRL_INDEX = 559;
  private static final String NAME = "openUserProfile";
  public static final a hUK;

  static
  {
    AppMethodBeat.i(134692);
    hUK = new a((byte)0);
    NAME = "openUserProfile";
    CTRL_INDEX = 559;
    AppMethodBeat.o(134692);
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(134691);
    j.p(paramc, "env");
    j.p(paramJSONObject, "data");
    Object localObject = paramJSONObject.optString("username");
    int i = paramJSONObject.optInt("scene", 122);
    String str = paramJSONObject.optString("profileReportInfo");
    if (bo.isNullOrNil((String)localObject))
    {
      paramc.M(paramInt, AK("fail:invalid data"));
      AppMethodBeat.o(134691);
    }
    while (true)
    {
      return;
      paramJSONObject = new ProfileRequest();
      paramJSONObject.username = ((String)localObject);
      paramJSONObject.scene = i;
      localObject = (AppBrandProxyUIProcessTask.b)new b.b(this, paramc, paramInt, str, (String)localObject);
      com.tencent.mm.plugin.appbrand.ipc.a.a(paramc.getContext(), (AppBrandProxyUIProcessTask.ProcessRequest)paramJSONObject, (AppBrandProxyUIProcessTask.b)localObject);
      AppMethodBeat.o(134691);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/JsApiOpenUserProfile$Companion;", "", "()V", "CTRL_INDEX", "", "CTRL_INDEX$annotations", "getCTRL_INDEX", "()I", "NAME", "", "NAME$annotations", "getNAME", "()Ljava/lang/String;", "TAG", "plugin-appbrand-integration_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.profile.b
 * JD-Core Version:    0.6.2
 */