package com.tencent.mm.plugin.appbrand.jsapi.b;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.page.w;
import org.json.JSONObject;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiUpdateHTMLCanvasElement;", "Lcom/tencent/mm/plugin/appbrand/jsapi/base/BaseUpdateViewJsApi;", "Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC;", "()V", "getViewId", "", "data", "Lorg/json/JSONObject;", "onUpdateView", "", "component", "viewId", "view", "Landroid/view/View;", "Companion", "plugin-appbrand-integration_release"})
public final class l extends c<w>
{
  public static final int CTRL_INDEX = 595;
  public static final String NAME = "updateWebGLCanvas";
  public static final a hHL;

  static
  {
    AppMethodBeat.i(134681);
    hHL = new a((byte)0);
    AppMethodBeat.o(134681);
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(134679);
    j.p(paramJSONObject, "data");
    int i = paramJSONObject.getInt("canvasId");
    AppMethodBeat.o(134679);
    return i;
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiUpdateHTMLCanvasElement$Companion;", "", "()V", "CTRL_INDEX", "", "NAME", "", "TAG", "plugin-appbrand-integration_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.l
 * JD-Core Version:    0.6.2
 */