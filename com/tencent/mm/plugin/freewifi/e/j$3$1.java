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

final class j$3$1
  implements a.a
{
  j$3$1(j.3 param3)
  {
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(20855);
    int i = paramHttpURLConnection.getResponseCode();
    ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.HttpAuthentication.onSuccess, desc=it receives http response for authentication. http response status code=%d", new Object[] { m.V(this.mxl.mxd.intent), Integer.valueOf(m.W(this.mxl.mxd.intent)), Integer.valueOf(i) });
    if (i == 200)
    {
      j.a(this.mxl.mxd, 0, "");
      m.a(this.mxl.mxd.intent, this.mxl.mxd.cuH, this.mxl.mxd.mwG, this.mxl.mxd.cdf, this.mxl.mxd.mwF, "MicroMsg.FreeWifi.Protocol32");
      AppMethodBeat.o(20855);
    }
    while (true)
    {
      return;
      if (i == 302)
      {
        paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Location");
        j.b(this.mxl.mxd, paramHttpURLConnection);
        AppMethodBeat.o(20855);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.httpAuthentication, desc=http response status code is neither 200 nor 302, so it fs to connect wifi. ", new Object[] { m.V(this.mxl.mxd.intent), Integer.valueOf(m.W(this.mxl.mxd.intent)) });
        FreeWifiFrontPageUI localFreeWifiFrontPageUI = this.mxl.mxd.mwF;
        paramHttpURLConnection = FreeWifiFrontPageUI.d.mzk;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.myI = m.a(this.mxl.mxd.mwG, k.b.muH, 32);
        localFreeWifiFrontPageUI.a(paramHttpURLConnection, locala);
        j.a(this.mxl.mxd, 32, "INVALID_HTTP_RESP_CODE");
        AppMethodBeat.o(20855);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(20856);
    ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.httpAuthentication, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s, stacktrace=%s", new Object[] { m.V(this.mxl.mxd.intent), Integer.valueOf(m.W(this.mxl.mxd.intent)), paramException.getMessage(), m.h(paramException) });
    FreeWifiFrontPageUI localFreeWifiFrontPageUI = this.mxl.mxd.mwF;
    FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mzk;
    FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
    locala.myI = m.a(this.mxl.mxd.mwG, k.b.muH, m.i(paramException));
    localFreeWifiFrontPageUI.a(locald, locala);
    j.a(this.mxl.mxd, m.i(paramException), m.g(paramException));
    AppMethodBeat.o(20856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.j.3.1
 * JD-Core Version:    0.6.2
 */