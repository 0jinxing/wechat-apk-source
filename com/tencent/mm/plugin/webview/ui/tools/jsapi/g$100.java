package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class g$100
  implements Runnable
{
  g$100(g paramg, String paramString1, String paramString2, String paramString3, String paramString4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9168);
    Intent localIntent = new Intent();
    localIntent.putExtra("free_wifi_jsapi_param_type", this.uIh);
    localIntent.putExtra("free_wifi_ap_key", this.uIi);
    localIntent.putExtra("free_wifi_jsapi_param_username", this.fwC);
    localIntent.putExtra("free_wifi_sessionkey", this.uIj);
    localIntent.putExtra("free_wifi_source", 4);
    localIntent.addFlags(67108864);
    if ((!bo.isNullOrNil(this.uIh)) && (this.uIh.equalsIgnoreCase("2")) && (!bo.isNullOrNil(this.uIi)))
    {
      Uri localUri = Uri.parse(this.uIi);
      String str1 = localUri.getHost();
      String str2 = localUri.getQuery();
      if ((!bo.isNullOrNil(str1)) && ("connectToFreeWifi".equals(str1)) && (!bo.isNullOrNil(str2)) && (str2.startsWith("apKey=")))
      {
        str1 = localUri.getQueryParameter("apKey");
        ab.i("[MicroMsg.FreeWifi.MsgHandler]", "apKey value = %s", new Object[] { str1 });
        str2 = localUri.getQueryParameter("ticket");
        if ((!bo.isNullOrNil(str1)) && (str1.length() < 1024))
        {
          localIntent.putExtra("free_wifi_schema_uri", localUri.toString());
          localIntent.putExtra("free_wifi_ap_key", str1);
          localIntent.putExtra("free_wifi_source", 5);
          localIntent.putExtra("free_wifi_threeone_startup_type", 4);
          if (!bo.isNullOrNil(str2))
            localIntent.putExtra("free_wifi_schema_ticket", str2);
        }
      }
    }
    d.b(g.i(this.uHd), "freewifi", ".ui.FreeWifiEntryUI", localIntent);
    AppMethodBeat.o(9168);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.100
 * JD-Core Version:    0.6.2
 */