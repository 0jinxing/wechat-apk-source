package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.6;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Map;

final class n$18
  implements Runnable
{
  n$18(n paramn, WebViewUI paramWebViewUI, d paramd, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7730);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7730);
    d locald;
    boolean bool;
    while (true)
    {
      return;
      if (this.uum == null)
        break label136;
      locald = this.uum;
      bool = this.uuB;
      if (locald.ready)
        break;
      ab.e("MicroMsg.JsApiHandler", "onWXDeviceBTStateChange fail, not ready");
      AppMethodBeat.o(7730);
    }
    ab.i("MicroMsg.JsApiHandler", "onWXDeviceBTStateChange: state = %s", new Object[] { Boolean.valueOf(bool) });
    HashMap localHashMap = new HashMap();
    if (bool)
      localHashMap.put("state", "on");
    while (true)
    {
      al.d(new d.6(locald, i.a.b("onWXDeviceBluetoothStateChange", localHashMap, locald.uFv, locald.uFw)));
      label136: AppMethodBeat.o(7730);
      break;
      localHashMap.put("state", "off");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.18
 * JD-Core Version:    0.6.2
 */