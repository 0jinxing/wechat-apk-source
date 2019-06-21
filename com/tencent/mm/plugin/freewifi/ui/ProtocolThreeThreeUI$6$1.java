package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.HttpURLConnection;

final class ProtocolThreeThreeUI$6$1
  implements a.a
{
  ProtocolThreeThreeUI$6$1(ProtocolThreeThreeUI.6 param6)
  {
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(21152);
    int i = paramHttpURLConnection.getResponseCode();
    ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.HttpAuthentication.onSuccess, desc=it receives http response for authentication. http response status code=%d", new Object[] { m.V(this.mAB.mAA.getIntent()), Integer.valueOf(m.W(this.mAB.mAA.getIntent())), Integer.valueOf(i) });
    if (i == 200)
    {
      ProtocolThreeThreeUI.c(this.mAB.mAA);
      AppMethodBeat.o(21152);
    }
    while (true)
    {
      return;
      if (i == 302)
      {
        paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Location");
        ProtocolThreeThreeUI.a(this.mAB.mAA, paramHttpURLConnection);
        AppMethodBeat.o(21152);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.httpAuthentication, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { m.V(this.mAB.mAA.getIntent()), Integer.valueOf(m.W(this.mAB.mAA.getIntent())) });
        d.a(this.mAB.mAA.ssid, 3, this.mAB.mAA.getIntent());
        AppMethodBeat.o(21152);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(21153);
    ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.httpAuthentication, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s", new Object[] { m.V(this.mAB.mAA.getIntent()), Integer.valueOf(m.W(this.mAB.mAA.getIntent())), paramException.getMessage() });
    d.a(this.mAB.mAA.ssid, 3, this.mAB.mAA.getIntent());
    AppMethodBeat.o(21153);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeThreeUI.6.1
 * JD-Core Version:    0.6.2
 */