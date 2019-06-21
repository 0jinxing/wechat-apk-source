package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.HttpURLConnection;

final class ProtocolThreeTwoUI$10$1
  implements a.a
{
  ProtocolThreeTwoUI$10$1(ProtocolThreeTwoUI.10 param10)
  {
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(21190);
    int i = paramHttpURLConnection.getResponseCode();
    ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.HttpAuthentication.onSuccess, desc=it receives http response for authentication. http response status code=%d", new Object[] { m.V(this.mAH.mAD.getIntent()), Integer.valueOf(m.W(this.mAH.mAD.getIntent())), Integer.valueOf(i) });
    if (i == 200)
    {
      ProtocolThreeTwoUI.f(this.mAH.mAD);
      AppMethodBeat.o(21190);
    }
    while (true)
    {
      return;
      if (i == 302)
      {
        paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Location");
        ProtocolThreeTwoUI.b(this.mAH.mAD, paramHttpURLConnection);
        AppMethodBeat.o(21190);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.httpAuthentication, desc=http response status code is neither 200 nor 302, so it fs to connect wifi. ", new Object[] { m.V(this.mAH.mAD.getIntent()), Integer.valueOf(m.W(this.mAH.mAD.getIntent())) });
        d.a(this.mAH.mAD.ssid, 3, this.mAH.mAD.getIntent());
        ProtocolThreeTwoUI.a(this.mAH.mAD, 32, "INVALID_HTTP_RESP_CODE");
        AppMethodBeat.o(21190);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(21191);
    ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.httpAuthentication, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s", new Object[] { m.V(this.mAH.mAD.getIntent()), Integer.valueOf(m.W(this.mAH.mAD.getIntent())), paramException.getMessage() });
    d.a(this.mAH.mAD.ssid, 3, this.mAH.mAD.getIntent());
    ProtocolThreeTwoUI.a(this.mAH.mAD, 101, m.g(paramException));
    AppMethodBeat.o(21191);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeTwoUI.10.1
 * JD-Core Version:    0.6.2
 */