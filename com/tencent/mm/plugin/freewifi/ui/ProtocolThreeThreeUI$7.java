package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.HttpURLConnection;

final class ProtocolThreeThreeUI$7
  implements a.a
{
  ProtocolThreeThreeUI$7(ProtocolThreeThreeUI paramProtocolThreeThreeUI)
  {
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(21155);
    int i = paramHttpURLConnection.getResponseCode();
    ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.handle302Authentication.onSuccess, desc=it receives http response for authentication(after 302). http response status code=%d", new Object[] { m.V(this.mAA.getIntent()), Integer.valueOf(m.W(this.mAA.getIntent())), Integer.valueOf(i) });
    if (i == 200)
    {
      ProtocolThreeThreeUI.c(this.mAA);
      AppMethodBeat.o(21155);
    }
    while (true)
    {
      return;
      if (i == 302)
      {
        paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Location");
        ProtocolThreeThreeUI.a(this.mAA, paramHttpURLConnection);
        AppMethodBeat.o(21155);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.handle302Authentication, desc=http response status code is not 200, so it fails to connect wifi. ", new Object[] { m.V(this.mAA.getIntent()), Integer.valueOf(m.W(this.mAA.getIntent())) });
        d.a(this.mAA.ssid, 3, this.mAA.getIntent());
        AppMethodBeat.o(21155);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(21156);
    ab.e("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.handle302Authentication.onException, desc=exception happens during http. e.getMessage()=%s", new Object[] { m.V(this.mAA.getIntent()), Integer.valueOf(m.W(this.mAA.getIntent())), paramException.getMessage() });
    AppMethodBeat.o(21156);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeThreeUI.7
 * JD-Core Version:    0.6.2
 */