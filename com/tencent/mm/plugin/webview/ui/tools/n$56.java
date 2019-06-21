package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.11;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Map;

final class n$56
  implements Runnable
{
  n$56(n paramn, WebViewUI paramWebViewUI, d paramd, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7773);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7773);
    while (true)
    {
      return;
      if (this.uum != null)
      {
        d locald = this.uum;
        String str = this.uuS;
        int i = this.uuq;
        if (!locald.ready)
        {
          ab.e("MicroMsg.JsApiHandler", "onMediaFileUploadProgress fail, not ready");
          AppMethodBeat.o(7773);
        }
        else
        {
          ab.i("MicroMsg.JsApiHandler", "onMediaFileUploadProgress, local id : %s, percent : %d", new Object[] { str, Integer.valueOf(i) });
          HashMap localHashMap = new HashMap();
          localHashMap.put("localId", str);
          localHashMap.put("percent", Integer.valueOf(i));
          al.d(new d.11(locald, i.a.b("onMediaFileUploadProgress", localHashMap, locald.uFv, locald.uFw)));
        }
      }
      else
      {
        AppMethodBeat.o(7773);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.56
 * JD-Core Version:    0.6.2
 */