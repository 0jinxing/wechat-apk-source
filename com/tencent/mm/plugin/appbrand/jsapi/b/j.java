package com.tencent.mm.plugin.appbrand.jsapi.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.page.w;
import org.json.JSONObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiRemoveHTMLCanvasElement;", "Lcom/tencent/mm/plugin/appbrand/jsapi/base/BaseRemoveViewJsApi;", "Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC;", "()V", "getViewId", "", "data", "Lorg/json/JSONObject;", "onRemoveView", "", "component", "viewId", "view", "Landroid/view/View;", "Companion", "plugin-appbrand-integration_release"})
public final class j extends b<w>
{
  public static final int CTRL_INDEX = 596;
  public static final String NAME = "removeWebGLCanvas";
  public static final j.a hHK;

  static
  {
    AppMethodBeat.i(134678);
    hHK = new j.a((byte)0);
    AppMethodBeat.o(134678);
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(134676);
    a.f.b.j.p(paramJSONObject, "data");
    int i = paramJSONObject.getInt("canvasId");
    AppMethodBeat.o(134676);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.j
 * JD-Core Version:    0.6.2
 */