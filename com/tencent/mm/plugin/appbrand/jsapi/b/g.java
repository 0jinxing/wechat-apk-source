package com.tencent.mm.plugin.appbrand.jsapi.b;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.a;
import com.tencent.mm.plugin.appbrand.page.w;
import java.util.HashMap;
import org.json.JSONObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiInsertHTMLCanvasElement;", "Lcom/tencent/mm/plugin/appbrand/jsapi/base/BaseInsertViewJsApi;", "Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC;", "()V", "requestMap", "Ljava/util/HashMap;", "", "Lcom/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiInsertHTMLCanvasElement$Request;", "Lkotlin/collections/HashMap;", "getViewId", "data", "Lorg/json/JSONObject;", "inflateView", "Landroid/view/View;", "component", "viewId", "isAsyncCallback", "", "onInsertViewWithAsyncCallback", "", "view", "callback", "Lcom/tencent/mm/plugin/appbrand/jsapi/base/JsApiCallback;", "Companion", "Request", "SurfaceAvailableListener", "plugin-appbrand-integration_release"})
public final class g extends a<w>
{
  public static final int CTRL_INDEX = 594;
  public static final String NAME = "insertWebGLCanvas";
  public static final a hHD;
  private final HashMap<Integer, g.b> hHC;

  static
  {
    AppMethodBeat.i(134675);
    hHD = new a((byte)0);
    AppMethodBeat.o(134675);
  }

  public g()
  {
    AppMethodBeat.i(134674);
    this.hHC = new HashMap();
    AppMethodBeat.o(134674);
  }

  public final boolean aCE()
  {
    return true;
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(134672);
    j.p(paramJSONObject, "data");
    int i = paramJSONObject.getInt("canvasId");
    AppMethodBeat.o(134672);
    return i;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiInsertHTMLCanvasElement$Companion;", "", "()V", "CTRL_INDEX", "", "NAME", "", "TAG", "plugin-appbrand-integration_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.g
 * JD-Core Version:    0.6.2
 */