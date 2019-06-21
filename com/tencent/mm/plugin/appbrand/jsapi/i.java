package com.tencent.mm.plugin.appbrand.jsapi;

import a.f.b.j;
import a.l;
import android.os.Build.VERSION;
import org.json.JSONObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentWxaSharedKT;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentImpl;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentWxConfigPart;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentWithExtra;", "()V", "TAG", "", "attachCommonConfig", "", "config", "Lorg/json/JSONObject;", "generatePreloadConfig", "generateWxConfig", "getActivity", "Landroid/app/Activity;", "injectWxConfig", "__wxConfig", "callback", "Landroid/webkit/ValueCallback;", "put", "obj", "key", "val", "", "scheduleToUiThread", "runnable", "Ljava/lang/Runnable;", "luggage-wxa-app_release"})
public abstract class i extends d
  implements h
{
  private final String TAG = "AppBrandComponentWxaSharedKT";

  public final void B(Runnable paramRunnable)
  {
    com.tencent.mm.plugin.appbrand.i locali = getRuntime();
    if (locali != null)
      locali.B(paramRunnable);
  }

  public JSONObject aue()
  {
    JSONObject localJSONObject = new JSONObject();
    h(localJSONObject);
    b(localJSONObject, "preload", Boolean.TRUE);
    return localJSONObject;
  }

  public final void b(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    j.p(paramJSONObject, "obj");
    j.p(paramString, "key");
    try
    {
      paramJSONObject.put(paramString, paramObject);
      return;
    }
    catch (Exception paramJSONObject)
    {
      while (true)
        com.tencent.luggage.g.d.printErrStackTrace(this.TAG, (Throwable)paramJSONObject, "put with key(" + paramString + ')', new Object[0]);
    }
  }

  public void h(JSONObject paramJSONObject)
  {
    j.p(paramJSONObject, "config");
    b(paramJSONObject, "platform", "android");
    b(paramJSONObject, "system", "Android " + Build.VERSION.RELEASE);
  }

  public final void q(JSONObject paramJSONObject)
  {
    j.p(paramJSONObject, "__wxConfig");
    aBx().evaluateJavascript("var __wxConfig = ".concat(String.valueOf(paramJSONObject)), null);
  }

  public JSONObject xW()
  {
    JSONObject localJSONObject = new JSONObject();
    h(localJSONObject);
    return localJSONObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i
 * JD-Core Version:    0.6.2
 */