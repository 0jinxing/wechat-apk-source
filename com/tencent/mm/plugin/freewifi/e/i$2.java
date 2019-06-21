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

final class i$2
  implements a.a
{
  i$2(i parami)
  {
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(20837);
    int i = paramHttpURLConnection.getResponseCode();
    ab.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.handle302Authentication.onSuccess, desc=it receives http response for authentication(after 302). http response status code=%d", new Object[] { m.V(this.mwZ.intent), Integer.valueOf(m.W(this.mwZ.intent)), Integer.valueOf(i) });
    if (i == 200)
    {
      this.mwZ.bzv();
      AppMethodBeat.o(20837);
    }
    while (true)
    {
      return;
      if (i == 302)
      {
        paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Location");
        i.a(this.mwZ, paramHttpURLConnection);
        AppMethodBeat.o(20837);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.handle302Authentication, desc=http response status code is not 200, so it fails to connect wifi. ", new Object[] { m.V(this.mwZ.intent), Integer.valueOf(m.W(this.mwZ.intent)) });
        FreeWifiFrontPageUI localFreeWifiFrontPageUI = this.mwZ.mwF;
        FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mzk;
        paramHttpURLConnection = new FreeWifiFrontPageUI.a();
        paramHttpURLConnection.myI = m.a(this.mwZ.mwG, k.b.muJ, 32);
        localFreeWifiFrontPageUI.a(locald, paramHttpURLConnection);
        AppMethodBeat.o(20837);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(20838);
    ab.e("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.handle302Authentication.onException, desc=exception happens during http. e.getMessage()=%s, stacktrace=%s", new Object[] { m.V(this.mwZ.intent), Integer.valueOf(m.W(this.mwZ.intent)), paramException.getMessage(), m.h(paramException) });
    FreeWifiFrontPageUI localFreeWifiFrontPageUI = this.mwZ.mwF;
    FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mzk;
    FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
    locala.myI = m.a(this.mwZ.mwG, k.b.muJ, m.i(paramException));
    localFreeWifiFrontPageUI.a(locald, locala);
    AppMethodBeat.o(20838);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.i.2
 * JD-Core Version:    0.6.2
 */