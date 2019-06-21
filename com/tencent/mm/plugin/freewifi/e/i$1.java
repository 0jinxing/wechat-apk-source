package com.tencent.mm.plugin.freewifi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.HttpURLConnection;

final class i$1
  implements Runnable
{
  i$1(i parami, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20836);
    ab.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.httpAuthentication, desc=it sends http request for authentication. http url=%s", new Object[] { m.V(this.mwZ.intent), Integer.valueOf(m.W(this.mwZ.intent)), this.val$url });
    a.byw();
    a.a(this.val$url, new a.a()
    {
      public final void g(HttpURLConnection paramAnonymousHttpURLConnection)
      {
        AppMethodBeat.i(20834);
        int i = paramAnonymousHttpURLConnection.getResponseCode();
        ab.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.HttpAuthentication.onSuccess, desc=it receives http response for authentication. http response status code=%d", new Object[] { m.V(i.1.this.mwZ.intent), Integer.valueOf(m.W(i.1.this.mwZ.intent)), Integer.valueOf(i) });
        if (i == 200)
        {
          i.1.this.mwZ.bzv();
          AppMethodBeat.o(20834);
        }
        while (true)
        {
          return;
          if (i == 302)
          {
            paramAnonymousHttpURLConnection = paramAnonymousHttpURLConnection.getHeaderField("Location");
            i.a(i.1.this.mwZ, paramAnonymousHttpURLConnection);
            AppMethodBeat.o(20834);
          }
          else
          {
            ab.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.httpAuthentication, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { m.V(i.1.this.mwZ.intent), Integer.valueOf(m.W(i.1.this.mwZ.intent)) });
            FreeWifiFrontPageUI localFreeWifiFrontPageUI = i.1.this.mwZ.mwF;
            paramAnonymousHttpURLConnection = FreeWifiFrontPageUI.d.mzk;
            FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
            locala.myI = m.a(i.1.this.mwZ.mwG, k.b.muJ, 32);
            localFreeWifiFrontPageUI.a(paramAnonymousHttpURLConnection, locala);
            AppMethodBeat.o(20834);
          }
        }
      }

      public final void j(Exception paramAnonymousException)
      {
        AppMethodBeat.i(20835);
        ab.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.httpAuthentication, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s, stacktrace=%s", new Object[] { m.V(i.1.this.mwZ.intent), Integer.valueOf(m.W(i.1.this.mwZ.intent)), paramAnonymousException.getMessage(), m.h(paramAnonymousException) });
        FreeWifiFrontPageUI localFreeWifiFrontPageUI = i.1.this.mwZ.mwF;
        FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mzk;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.myI = m.a(i.1.this.mwZ.mwG, k.b.muJ, m.i(paramAnonymousException));
        localFreeWifiFrontPageUI.a(locald, locala);
        AppMethodBeat.o(20835);
      }
    });
    AppMethodBeat.o(20836);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.i.1
 * JD-Core Version:    0.6.2
 */