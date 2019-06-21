package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.HttpURLConnection;

final class ProtocolThreeOneUI$6$1
  implements a.a
{
  ProtocolThreeOneUI$6$1(ProtocolThreeOneUI.6 param6)
  {
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(21126);
    int i = paramHttpURLConnection.getResponseCode();
    ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.HttpAuthentication.onSuccess, desc=it receives http response for authentication. http response status code=%d", new Object[] { m.V(this.mAy.mAx.getIntent()), Integer.valueOf(m.W(this.mAy.mAx.getIntent())), Integer.valueOf(i) });
    if (ProtocolThreeOneUI.d(this.mAy.mAx))
      AppMethodBeat.o(21126);
    while (true)
    {
      return;
      if (i == 200)
      {
        ProtocolThreeOneUI.e(this.mAy.mAx);
        AppMethodBeat.o(21126);
      }
      else if (i == 302)
      {
        paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Location");
        ProtocolThreeOneUI.a(this.mAy.mAx, paramHttpURLConnection);
        AppMethodBeat.o(21126);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.httpAuthentication, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { m.V(this.mAy.mAx.getIntent()), Integer.valueOf(m.W(this.mAy.mAx.getIntent())) });
        d.a(this.mAy.mAx.ssid, 3, this.mAy.mAx.getIntent());
        ProtocolThreeOneUI.a(this.mAy.mAx, 32, "INVALID_HTTP_RESP_CODE");
        AppMethodBeat.o(21126);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(21127);
    ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.httpAuthentication, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s", new Object[] { m.V(this.mAy.mAx.getIntent()), Integer.valueOf(m.W(this.mAy.mAx.getIntent())), paramException.getMessage() });
    d.a(this.mAy.mAx.ssid, 3, this.mAy.mAx.getIntent());
    ProtocolThreeOneUI.a(this.mAy.mAx, 101, m.g(paramException));
    AppMethodBeat.o(21127);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeOneUI.6.1
 * JD-Core Version:    0.6.2
 */