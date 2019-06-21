package com.tencent.mm.plugin.appbrand.jsapi.b;

import a.f.b.j;
import a.l;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiInsertHTMLCanvasElement$Request;", "", "id", "", "(Lcom/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiInsertHTMLCanvasElement;I)V", "value", "Lcom/tencent/mm/plugin/appbrand/jsapi/base/JsApiCallback;", "callback", "getCallback", "()Lcom/tencent/mm/plugin/appbrand/jsapi/base/JsApiCallback;", "setCallback", "(Lcom/tencent/mm/plugin/appbrand/jsapi/base/JsApiCallback;)V", "getId", "()I", "", "isViewReady", "()Z", "setViewReady", "(Z)V", "invoke", "", "plugin-appbrand-integration_release"})
final class g$b
{
  boolean hHE;
  com.tencent.mm.plugin.appbrand.jsapi.base.g hHF;
  private final int id;

  public g$b(int paramInt)
  {
    int i;
    this.id = i;
  }

  final void aDt()
  {
    AppMethodBeat.i(134664);
    if (!this.hHE)
    {
      localObject = (Throwable)new IllegalStateException("Check failed.".toString());
      AppMethodBeat.o(134664);
      throw ((Throwable)localObject);
    }
    Object localObject = this.hHF;
    if (localObject == null)
      j.dWJ();
    ((com.tencent.mm.plugin.appbrand.jsapi.base.g)localObject).AR(this.hHG.AK("ok"));
    g.a(this.hHG).remove(Integer.valueOf(this.id));
    d.i("JsApiInsertHTMLCanvasElement", "callback ok for canvasId [" + this.id + ']');
    AppMethodBeat.o(134664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.b.g.b
 * JD-Core Version:    0.6.2
 */