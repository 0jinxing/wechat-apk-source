package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.61;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

final class n$22
  implements Runnable
{
  n$22(n paramn, WebViewUI paramWebViewUI, d paramd, JSONArray paramJSONArray)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7734);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7734);
    while (true)
    {
      return;
      if (this.uum != null)
      {
        d locald = this.uum;
        JSONArray localJSONArray = this.val$jsonArray;
        if (localJSONArray == null)
        {
          ab.e("MicroMsg.JsApiHandler", "onGetMsgProofItems fail, not ready");
          AppMethodBeat.o(7734);
        }
        else
        {
          ab.i("MicroMsg.JsApiHandler", "onGetMsgProofItems success, ready");
          HashMap localHashMap = new HashMap();
          localHashMap.put("msgs", localJSONArray);
          al.d(new d.61(locald, i.a.b("onGetMsgProofItems", localHashMap, locald.uFv, locald.uFw)));
        }
      }
      else
      {
        AppMethodBeat.o(7734);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.22
 * JD-Core Version:    0.6.2
 */