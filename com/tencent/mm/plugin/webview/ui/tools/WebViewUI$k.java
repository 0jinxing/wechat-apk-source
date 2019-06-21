package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$k
  implements b
{
  private WebViewUI$k(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    AppMethodBeat.i(7950);
    Uri localUri = Uri.parse(paramString);
    String str1 = localUri.getQueryParameter("apKey");
    ab.i("MicroMsg.WebViewUI", "apKey value = %s", new Object[] { str1 });
    String str2 = localUri.getQueryParameter("ticket");
    if (!bo.isNullOrNil(str1))
    {
      paramString = new Intent();
      paramString.putExtra("free_wifi_schema_uri", localUri.toString());
      paramString.putExtra("free_wifi_ap_key", str1);
      paramString.putExtra("free_wifi_source", 5);
      if (!bo.isNullOrNil(str2))
        paramString.putExtra("free_wifi_schema_ticket", str2);
      paramString.addFlags(67108864);
      d.b(ah.getContext(), "freewifi", ".ui.FreeWifiEntryUI", paramString);
    }
    AppMethodBeat.o(7950);
    return true;
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7949);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7949);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://connectToFreeWifi/");
      AppMethodBeat.o(7949);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.k
 * JD-Core Version:    0.6.2
 */