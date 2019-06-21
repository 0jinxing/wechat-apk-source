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

final class j$4
  implements a.a
{
  j$4(j paramj)
  {
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(20858);
    int i = paramHttpURLConnection.getResponseCode();
    ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handle302Authentication.onSuccess, desc=it receives http response for authentication(after 302). http response status code=%d", new Object[] { m.V(this.mxd.intent), Integer.valueOf(m.W(this.mxd.intent)), Integer.valueOf(i) });
    if (i == 200)
    {
      j.a(this.mxd, 0, "");
      m.a(this.mxd.intent, this.mxd.cuH, this.mxd.mwG, this.mxd.cdf, this.mxd.mwF, "MicroMsg.FreeWifi.Protocol32");
      AppMethodBeat.o(20858);
    }
    while (true)
    {
      return;
      if (i == 302)
      {
        paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Location");
        j.b(this.mxd, paramHttpURLConnection);
        AppMethodBeat.o(20858);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handle302Authentication, desc=http response status code is not 200, so it fails to connect wifi. ", new Object[] { m.V(this.mxd.intent), Integer.valueOf(m.W(this.mxd.intent)) });
        FreeWifiFrontPageUI localFreeWifiFrontPageUI = this.mxd.mwF;
        FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mzk;
        paramHttpURLConnection = new FreeWifiFrontPageUI.a();
        paramHttpURLConnection.myI = m.a(this.mxd.mwG, k.b.muH, 32);
        localFreeWifiFrontPageUI.a(locald, paramHttpURLConnection);
        j.a(this.mxd, 32, "INVALID_HTTP_RESP_CODE");
        AppMethodBeat.o(20858);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(20859);
    ab.e("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handle302Authentication.onException, desc=exception happens during http. e.getMessage()=%s, stacktrace=%s", new Object[] { m.V(this.mxd.intent), Integer.valueOf(m.W(this.mxd.intent)), paramException.getMessage(), m.h(paramException) });
    FreeWifiFrontPageUI localFreeWifiFrontPageUI = this.mxd.mwF;
    FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mzk;
    FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
    locala.myI = m.a(this.mxd.mwG, k.b.muH, m.i(paramException));
    localFreeWifiFrontPageUI.a(locald, locala);
    j.a(this.mxd, m.i(paramException), m.g(paramException));
    AppMethodBeat.o(20859);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.j.4
 * JD-Core Version:    0.6.2
 */