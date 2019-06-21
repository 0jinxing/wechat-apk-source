package com.tencent.mm.plugin.appbrand.jsapi.u;

import com.tencent.mm.plugin.appbrand.e.f;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public abstract class a extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    if (paramc == null)
    {
      ab.w("MicroMsg.AppBrand.SameLayer.AppBrandPluginAsyncJsApi", "component is null");
      paramc.M(paramInt, j("fail:component is null", null));
    }
    while (true)
    {
      return;
      if ((paramJSONObject != null) && (paramJSONObject.has("viewId")))
        break;
      ab.w("MicroMsg.AppBrand.SameLayer.AppBrandPluginAsyncJsApi", "no viewId in data");
      paramc.M(paramInt, j("fail:no viewId in data", null));
    }
    Object localObject;
    if ((paramc instanceof u))
      localObject = paramc.aBx();
    while (true)
    {
      if ((localObject == null) || (!(localObject instanceof c)))
      {
        ab.w("MicroMsg.AppBrand.SameLayer.AppBrandPluginAsyncJsApi", "js runtime not appbrand webview");
        paramc.M(paramInt, j("fail:invalid runtime", null));
        break;
        if (!(paramc instanceof q))
          break label216;
        localObject = ((q)paramc).getCurrentPageView();
        if (localObject == null)
          break label216;
        localObject = ((u)localObject).aBx();
        continue;
      }
      localObject = ((c)localObject).getWebViewPluginClientProxy();
      if (localObject == null)
      {
        ab.w("MicroMsg.AppBrand.SameLayer.AppBrandPluginAsyncJsApi", "webview has no plugin client");
        paramc.M(paramInt, j("fail:webview has no plugin client", null));
        break;
      }
      int i = paramJSONObject.optInt("viewId");
      ((f)localObject).a(aGC(), i, paramc, paramJSONObject, this, paramInt);
      break;
      label216: localObject = null;
    }
  }

  public abstract String aGC();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.a
 * JD-Core Version:    0.6.2
 */