package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.22;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter.a;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Map;

final class WebViewUI$14
  implements WebViewInputFooter.a
{
  WebViewUI$14(WebViewUI paramWebViewUI)
  {
  }

  public final boolean EH(String paramString)
  {
    AppMethodBeat.i(7827);
    if (this.uxp.uhz != null)
    {
      d locald = this.uxp.uhz;
      HashMap localHashMap = new HashMap();
      localHashMap.put("smiley", paramString);
      al.d(new d.22(locald, i.a.b("onGetSmiley", localHashMap, locald.uFv, locald.uFw)));
    }
    AppMethodBeat.o(7827);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.14
 * JD-Core Version:    0.6.2
 */