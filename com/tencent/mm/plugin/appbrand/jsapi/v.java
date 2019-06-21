package com.tencent.mm.plugin.appbrand.jsapi;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.r.g;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/EventOnKeyboardHeightChange;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandJsApiEvent;", "()V", "dispatch", "", "height", "", "service", "Lcom/tencent/mm/plugin/appbrand/AppBrandService;", "page", "Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;", "inputId", "(ILcom/tencent/mm/plugin/appbrand/AppBrandService;Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;Ljava/lang/Integer;)V", "Companion", "luggage-wxa-app_release"})
public final class v extends p
{
  public static final int CTRL_INDEX = 590;
  public static final String NAME = "onKeyboardHeightChange";
  public static final v.a hwn;

  static
  {
    AppMethodBeat.i(87573);
    hwn = new v.a((byte)0);
    AppMethodBeat.o(87573);
  }

  public final void a(int paramInt, q paramq, u paramu, Integer paramInteger)
  {
    AppMethodBeat.i(87572);
    j.p(paramq, "service");
    j.p(paramu, "page");
    n("height", Integer.valueOf(g.pZ(paramInt)));
    if (paramInteger != null)
      n("inputId", Integer.valueOf(paramInteger.intValue()));
    i((c)paramq).aCj();
    i((c)paramu).aCj();
    AppMethodBeat.o(87572);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.v
 * JD-Core Version:    0.6.2
 */