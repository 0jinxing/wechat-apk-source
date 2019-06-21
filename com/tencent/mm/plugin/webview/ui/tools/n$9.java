package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.20;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Map;

final class n$9
  implements Runnable
{
  n$9(n paramn, WebViewUI paramWebViewUI, d paramd, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7721);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7721);
    while (true)
    {
      return;
      if (this.uum != null)
      {
        d locald = this.uum;
        int i = this.crd;
        if (!locald.ready)
        {
          ab.e("MicroMsg.JsApiHandler", "onNfcTouch fail, not ready");
          AppMethodBeat.o(7721);
        }
        else
        {
          HashMap localHashMap = new HashMap();
          localHashMap.put("errCode", Integer.valueOf(i));
          al.d(new d.20(locald, i.a.b("onNfcTouch", localHashMap, locald.uFv, locald.uFw)));
        }
      }
      else
      {
        AppMethodBeat.o(7721);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.9
 * JD-Core Version:    0.6.2
 */