package com.tencent.mm.plugin.freewifi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.HttpURLConnection;

final class h$1$1
  implements a.a
{
  h$1$1(h.1 param1)
  {
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(20824);
    int i = paramHttpURLConnection.getResponseCode();
    ab.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.HttpAuthentication.onSuccess, desc=it receives http response for authentication. http response status code=%d", new Object[] { m.V(this.mwT.mwS.intent), Integer.valueOf(m.W(this.mwT.mwS.intent)), Integer.valueOf(i) });
    if (i == 200)
    {
      h.a(this.mwT.mwS, 0, "");
      m.a(this.mwT.mwS.intent, this.mwT.mwS.cuH, this.mwT.mwS.mwG, this.mwT.mwS.cdf, this.mwT.mwS.mwF, "MicroMsg.FreeWifi.ProtocolThreeOne");
      AppMethodBeat.o(20824);
    }
    while (true)
    {
      return;
      if (i == 302)
      {
        paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Location");
        h.a(this.mwT.mwS, paramHttpURLConnection);
        AppMethodBeat.o(20824);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.httpAuthentication, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { m.V(this.mwT.mwS.intent), Integer.valueOf(m.W(this.mwT.mwS.intent)) });
        FreeWifiFrontPageUI localFreeWifiFrontPageUI = this.mwT.mwS.mwF;
        paramHttpURLConnection = FreeWifiFrontPageUI.d.mzk;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.myI = m.a(this.mwT.mwS.mwG, k.b.muG, 32);
        localFreeWifiFrontPageUI.a(paramHttpURLConnection, locala);
        h.a(this.mwT.mwS, 32, "INVALID_HTTP_RESP_CODE");
        AppMethodBeat.o(20824);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(20825);
    ab.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.httpAuthentication, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s, stackTrace=%s", new Object[] { m.V(this.mwT.mwS.intent), Integer.valueOf(m.W(this.mwT.mwS.intent)), paramException.getMessage(), m.h(paramException) });
    FreeWifiFrontPageUI localFreeWifiFrontPageUI = this.mwT.mwS.mwF;
    FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mzk;
    FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
    locala.myI = m.a(this.mwT.mwS.mwG, k.b.muG, m.i(paramException));
    localFreeWifiFrontPageUI.a(locald, locala);
    h.a(this.mwT.mwS, m.i(paramException), m.g(paramException));
    AppMethodBeat.o(20825);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.h.1.1
 * JD-Core Version:    0.6.2
 */