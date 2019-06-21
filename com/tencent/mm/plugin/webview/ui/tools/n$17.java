package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.5;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class n$17
  implements Runnable
{
  n$17(n paramn, WebViewUI paramWebViewUI, d paramd, String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7729);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7729);
    d locald;
    String str;
    boolean bool;
    while (true)
    {
      return;
      if (this.uum == null)
        break label182;
      locald = this.uum;
      str = this.uuv;
      bool = this.uuA;
      if (!locald.ready)
      {
        ab.e("MicroMsg.JsApiHandler", "onWXDeviceBindStateChange fail, not ready");
        AppMethodBeat.o(7729);
      }
      else
      {
        ab.i("MicroMsg.JsApiHandler", "onWXDeviceBindStateChange: device id = %s, isBound = %s", new Object[] { str, Boolean.valueOf(bool) });
        if (!bo.isNullOrNil(str))
          break;
        ab.e("MicroMsg.JsApiHandler", "parameter error!!!");
        AppMethodBeat.o(7729);
      }
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("deviceId", str);
    if (bool)
      localHashMap.put("state", "bind");
    while (true)
    {
      al.d(new d.5(locald, i.a.b("onWXDeviceBindStateChange", localHashMap, locald.uFv, locald.uFw)));
      label182: AppMethodBeat.o(7729);
      break;
      localHashMap.put("state", "unbind");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.17
 * JD-Core Version:    0.6.2
 */