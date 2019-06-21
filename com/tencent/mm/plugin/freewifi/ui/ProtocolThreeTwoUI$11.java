package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.HttpURLConnection;

final class ProtocolThreeTwoUI$11
  implements a.a
{
  ProtocolThreeTwoUI$11(ProtocolThreeTwoUI paramProtocolThreeTwoUI)
  {
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(21193);
    int i = paramHttpURLConnection.getResponseCode();
    ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.handle302Authentication.onSuccess, desc=it receives http response for authentication(after 302). http response status code=%d", new Object[] { m.V(this.mAD.getIntent()), Integer.valueOf(m.W(this.mAD.getIntent())), Integer.valueOf(i) });
    if (i == 200)
    {
      ProtocolThreeTwoUI.f(this.mAD);
      AppMethodBeat.o(21193);
    }
    while (true)
    {
      return;
      if (i == 302)
      {
        paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Location");
        ProtocolThreeTwoUI.b(this.mAD, paramHttpURLConnection);
        AppMethodBeat.o(21193);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.handle302Authentication, desc=http response status code is not 200, so it fails to connect wifi. ", new Object[] { m.V(this.mAD.getIntent()), Integer.valueOf(m.W(this.mAD.getIntent())) });
        d.a(this.mAD.ssid, 3, this.mAD.getIntent());
        ProtocolThreeTwoUI.a(this.mAD, 32, "INVALID_HTTP_RESP_CODE");
        AppMethodBeat.o(21193);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(21194);
    ab.e("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.handle302Authentication.onException, desc=exception happens during http. e.getMessage()=%s", new Object[] { m.V(this.mAD.getIntent()), Integer.valueOf(m.W(this.mAD.getIntent())), paramException.getMessage() });
    ProtocolThreeTwoUI.a(this.mAD, 101, m.g(paramException));
    AppMethodBeat.o(21194);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeTwoUI.11
 * JD-Core Version:    0.6.2
 */