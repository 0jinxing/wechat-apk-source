package com.tencent.mm.plugin.appbrand.menu;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.HashMap;
import java.util.Map;

public final class j extends com.tencent.mm.plugin.appbrand.menu.a.a<w>
{
  public j()
  {
    super(o.imO.ordinal());
    AppMethodBeat.i(132241);
    AppMethodBeat.o(132241);
  }

  static void a(w paramw, n paramn)
  {
    AppMethodBeat.i(132242);
    AppBrandSysConfigWC localAppBrandSysConfigWC = paramw.getRuntime().atH();
    j.a locala = new j.a();
    HashMap localHashMap = new HashMap();
    localHashMap.put("title", localAppBrandSysConfigWC.cwz);
    localHashMap.put("desc", "");
    localHashMap.put("path", paramw.aBm());
    Object localObject = paramw.aJS();
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.plugin.appbrand.jsapi.t.a)localObject).getWebView().getUrl();
      localHashMap.put("webViewUrl", localObject);
      localHashMap.put("imgUrl", localAppBrandSysConfigWC.hgW);
      if (!paramn.hAx.nX("enable_share_with_share_ticket"))
        break label213;
    }
    label213: for (localObject = "withShareTicket"; ; localObject = "common")
    {
      localHashMap.put("mode", localObject);
      localHashMap.put("dynamic", Boolean.valueOf(paramn.hAx.nX("enable_share_dynamic")));
      paramn.hAx.z("user_clicked_share_btn", true);
      locala.a(paramw.getRuntime().atK(), paramw.hashCode()).s(localHashMap).aCj();
      AppMethodBeat.o(132242);
      return;
      localObject = null;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.j
 * JD-Core Version:    0.6.2
 */