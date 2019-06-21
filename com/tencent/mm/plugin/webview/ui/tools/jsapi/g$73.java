package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class g$73
  implements Runnable
{
  g$73(g paramg, String paramString1, String paramString2, boolean paramBoolean, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9136);
    Intent localIntent = new Intent();
    localIntent.putExtra("free_wifi_ssid", this.mvg);
    localIntent.putExtra("free_wifi_source", 3);
    localIntent.putExtra("free_wifi_passowrd", this.uHS);
    localIntent.putExtra("free_wifi_hide_ssid", this.uHT);
    localIntent.putExtra("free_wifi_encrypt_type", this.uHU);
    localIntent.addFlags(67108864);
    d.b(g.i(this.uHd), "freewifi", ".ui.FreeWifiEntryUI", localIntent);
    AppMethodBeat.o(9136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.73
 * JD-Core Version:    0.6.2
 */