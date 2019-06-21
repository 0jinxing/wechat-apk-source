package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.HttpURLConnection;

final class ProtocolThreeTwoUI$9$1$1
  implements a.a
{
  ProtocolThreeTwoUI$9$1$1(ProtocolThreeTwoUI.9.1 param1)
  {
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(21181);
    int i = paramHttpURLConnection.getResponseCode();
    if (i == 200)
    {
      ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.black, desc=it still cannot get authurl and extend (now http returns 200), so it fails to connect wifi. ", new Object[] { m.V(this.mAG.mAF.mAD.getIntent()), Integer.valueOf(m.W(this.mAG.mAF.mAD.getIntent())) });
      d.a(this.mAG.mAF.mAD.ssid, 3, this.mAG.mAF.mAD.getIntent());
      ProtocolThreeTwoUI.a(this.mAG.mAF.mAD, 35, "CANNOT_GET_AUTHURL_AFTER_BLACK_URL");
      AppMethodBeat.o(21181);
    }
    while (true)
    {
      return;
      if (i == 302)
      {
        paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Location");
        ProtocolThreeTwoUI.9.1.a(this.mAG, paramHttpURLConnection);
        AppMethodBeat.o(21181);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.black, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { m.V(this.mAG.mAF.mAD.getIntent()), Integer.valueOf(m.W(this.mAG.mAF.mAD.getIntent())) });
        d.a(this.mAG.mAF.mAD.ssid, 3, this.mAG.mAF.mAD.getIntent());
        ProtocolThreeTwoUI.a(this.mAG.mAF.mAD, 32, "INVALID_HTTP_RESP_CODE");
        AppMethodBeat.o(21181);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(21182);
    ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.black, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s", new Object[] { m.V(this.mAG.mAF.mAD.getIntent()), Integer.valueOf(m.W(this.mAG.mAF.mAD.getIntent())), paramException.getMessage() });
    d.a(this.mAG.mAF.mAD.ssid, 3, this.mAG.mAF.mAD.getIntent());
    ProtocolThreeTwoUI.a(this.mAG.mAF.mAD, 101, m.g(paramException));
    AppMethodBeat.o(21182);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeTwoUI.9.1.1
 * JD-Core Version:    0.6.2
 */