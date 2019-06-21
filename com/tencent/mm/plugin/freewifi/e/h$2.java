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

final class h$2
  implements a.a
{
  h$2(h paramh)
  {
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(20827);
    int i = paramHttpURLConnection.getResponseCode();
    ab.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.handle302Authentication.onSuccess, desc=it receives http response for authentication(after 302). http response status code=%d", new Object[] { m.V(this.mwS.intent), Integer.valueOf(m.W(this.mwS.intent)), Integer.valueOf(i) });
    if (i == 200)
    {
      h.a(this.mwS, 0, "");
      m.a(this.mwS.intent, this.mwS.cuH, this.mwS.mwG, this.mwS.cdf, this.mwS.mwF, "MicroMsg.FreeWifi.ProtocolThreeOne");
      AppMethodBeat.o(20827);
    }
    while (true)
    {
      return;
      if (i == 302)
      {
        paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Location");
        h.a(this.mwS, paramHttpURLConnection);
        AppMethodBeat.o(20827);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.handle302Authentication, desc=http response status code is not 200, so it fails to connect wifi. ", new Object[] { m.V(this.mwS.intent), Integer.valueOf(m.W(this.mwS.intent)) });
        FreeWifiFrontPageUI localFreeWifiFrontPageUI = this.mwS.mwF;
        paramHttpURLConnection = FreeWifiFrontPageUI.d.mzk;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.myI = m.a(this.mwS.mwG, k.b.muG, 32);
        localFreeWifiFrontPageUI.a(paramHttpURLConnection, locala);
        h.a(this.mwS, 32, "INVALID_HTTP_RESP_CODE");
        AppMethodBeat.o(20827);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(20828);
    ab.e("MicroMsg.FreeWifi.ProtocolThreeOne", "sessionKey=%s, step=%d, method=Protocol31.handle302Authentication.onException, desc=exception happens during http. e.getMessage()=%s, stacktrace=%s", new Object[] { m.V(this.mwS.intent), Integer.valueOf(m.W(this.mwS.intent)), paramException.getMessage(), m.h(paramException) });
    FreeWifiFrontPageUI localFreeWifiFrontPageUI = this.mwS.mwF;
    FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mzk;
    FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
    locala.myI = m.a(this.mwS.mwG, k.b.muG, m.i(paramException));
    localFreeWifiFrontPageUI.a(locald, locala);
    h.a(this.mwS, m.i(paramException), m.g(paramException));
    AppMethodBeat.o(20828);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.h.2
 * JD-Core Version:    0.6.2
 */