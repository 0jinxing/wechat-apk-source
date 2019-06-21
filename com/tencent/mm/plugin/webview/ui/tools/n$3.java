package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.18;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Map;

final class n$3
  implements Runnable
{
  n$3(n paramn, WebViewUI paramWebViewUI, d paramd, String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7715);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7715);
    while (true)
    {
      return;
      if (this.uum != null)
      {
        d locald = this.uum;
        String str1 = this.kOj;
        int i = this.hVj;
        String str2 = this.uur;
        int j = this.crd;
        String str3 = this.ftO;
        String str4 = this.uus;
        if (!locald.ready)
        {
          ab.e("MicroMsg.JsApiHandler", "onBackgroundAudioStateChange fail, not ready");
          AppMethodBeat.o(7715);
        }
        else
        {
          ab.i("MicroMsg.JsApiHandler", "onBackgroundAudioStateChange, state : %s, duration : %d, src:%s, errCode:%d, errMsg:%s, srcId:%s", new Object[] { str1, Integer.valueOf(i), str2, Integer.valueOf(j), str3, str4 });
          HashMap localHashMap = new HashMap();
          localHashMap.put("state", str1);
          localHashMap.put("duration", Integer.valueOf(i));
          localHashMap.put("src", str2);
          localHashMap.put("errCode", Integer.valueOf(j));
          localHashMap.put("errMsg", str3);
          localHashMap.put("srcId ", str4);
          al.d(new d.18(locald, i.a.b("onBackgroundAudioStateChange", localHashMap, locald.uFv, locald.uFw)));
        }
      }
      else
      {
        AppMethodBeat.o(7715);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.3
 * JD-Core Version:    0.6.2
 */