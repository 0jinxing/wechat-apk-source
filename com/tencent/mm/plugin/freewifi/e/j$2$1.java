package com.tencent.mm.plugin.freewifi.e;

import android.net.Uri;
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
import java.net.UnknownHostException;

final class j$2$1
  implements a.a
{
  int mxe;
  private final int mxf;
  private int mxg;
  private a.a mxh;

  j$2$1(j.2 param2, String paramString)
  {
    AppMethodBeat.i(20848);
    this.mxe = 0;
    this.mxf = 3;
    this.mxg = 0;
    this.mxh = new a.a()
    {
      public final void g(HttpURLConnection paramAnonymousHttpURLConnection)
      {
        AppMethodBeat.i(20846);
        int i = paramAnonymousHttpURLConnection.getResponseCode();
        FreeWifiFrontPageUI.d locald;
        FreeWifiFrontPageUI.a locala;
        if (i == 200)
        {
          ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.black, desc=it still cannot get authurl and extend (now http returns 200), so it fails to connect wifi. ", new Object[] { m.V(j.2.1.this.mxj.mxd.intent), Integer.valueOf(m.W(j.2.1.this.mxj.mxd.intent)) });
          paramAnonymousHttpURLConnection = j.2.1.this.mxj.mxd.mwF;
          locald = FreeWifiFrontPageUI.d.mzk;
          locala = new FreeWifiFrontPageUI.a();
          locala.myI = m.a(j.2.1.this.mxj.mxd.mwG, k.b.muI, 35);
          paramAnonymousHttpURLConnection.a(locald, locala);
          j.a(j.2.1.this.mxj.mxd, 35, "CANNOT_GET_AUTHURL_AFTER_BLACK_URL");
          AppMethodBeat.o(20846);
        }
        while (true)
        {
          return;
          if (i == 302)
          {
            paramAnonymousHttpURLConnection = paramAnonymousHttpURLConnection.getHeaderField("Location");
            j.2.1.a(j.2.1.this, paramAnonymousHttpURLConnection);
            AppMethodBeat.o(20846);
          }
          else
          {
            ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.black, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { m.V(j.2.1.this.mxj.mxd.intent), Integer.valueOf(m.W(j.2.1.this.mxj.mxd.intent)) });
            paramAnonymousHttpURLConnection = j.2.1.this.mxj.mxd.mwF;
            locald = FreeWifiFrontPageUI.d.mzk;
            locala = new FreeWifiFrontPageUI.a();
            locala.myI = m.a(j.2.1.this.mxj.mxd.mwG, k.b.muI, 32);
            paramAnonymousHttpURLConnection.a(locald, locala);
            j.a(j.2.1.this.mxj.mxd, 32, "INVALID_HTTP_RESP_CODE");
            AppMethodBeat.o(20846);
          }
        }
      }

      public final void j(Exception paramAnonymousException)
      {
        AppMethodBeat.i(20847);
        ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.black, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s,stacktrace=%s", new Object[] { m.V(j.2.1.this.mxj.mxd.intent), Integer.valueOf(m.W(j.2.1.this.mxj.mxd.intent)), paramAnonymousException.getMessage(), m.h(paramAnonymousException) });
        FreeWifiFrontPageUI localFreeWifiFrontPageUI = j.2.1.this.mxj.mxd.mwF;
        FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mzk;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.myI = m.a(j.2.1.this.mxj.mxd.mwG, k.b.muI, m.i(paramAnonymousException));
        localFreeWifiFrontPageUI.a(locald, locala);
        j.a(j.2.1.this.mxj.mxd, m.i(paramAnonymousException), m.g(paramAnonymousException));
        AppMethodBeat.o(20847);
      }
    };
    AppMethodBeat.o(20848);
  }

  private void MI(String paramString)
  {
    AppMethodBeat.i(20851);
    Object localObject1 = Uri.parse(paramString);
    Object localObject2 = ((Uri)localObject1).getQueryParameter("authUrl");
    localObject1 = m.Mw(((Uri)localObject1).getQueryParameter("extend"));
    ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=Access to blackUrl returns 302 and now trying to  get authurl and extend from location. location=%s, authUrl=%s, extend=%s", new Object[] { m.V(this.mxj.mxd.intent), Integer.valueOf(m.W(this.mxj.mxd.intent)), paramString, localObject2, localObject1 });
    if (m.isEmpty((String)localObject2))
    {
      this.mxg += 1;
      if (this.mxg < 3)
      {
        a.byw();
        a.a(paramString, this.mxh);
        AppMethodBeat.o(20851);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=Connection fail. Too many 302, exceeding 3 times", new Object[] { m.V(this.mxj.mxd.intent), Integer.valueOf(m.W(this.mxj.mxd.intent)) });
        paramString = this.mxj.mxd.mwF;
        localObject1 = FreeWifiFrontPageUI.d.mzk;
        localObject2 = new FreeWifiFrontPageUI.a();
        ((FreeWifiFrontPageUI.a)localObject2).myI = m.a(this.mxj.mxd.mwG, k.b.muI, 36);
        paramString.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
        j.a(this.mxj.mxd, 36, "BLACK_302_TIMES_EXCESS");
        AppMethodBeat.o(20851);
      }
    }
    paramString = new StringBuilder((String)localObject2);
    if (((String)localObject2).indexOf("?") != -1)
      paramString.append("&extend=").append((String)localObject1);
    while (true)
    {
      paramString.append("&openId=").append(m.Mw(this.mxj.mxd.openId)).append("&tid=").append(m.Mw(this.mxj.mxd.mxc)).append("&timestamp=").append(this.mxj.mxd.cvO).append("&sign=").append(this.mxj.mxd.sign);
      j.a(this.mxj.mxd, paramString.toString());
      ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, desc=Data retrieved. http authentication url = %s", new Object[] { m.V(this.mxj.mxd.intent), Integer.valueOf(m.W(this.mxj.mxd.intent)), paramString.toString() });
      AppMethodBeat.o(20851);
      break;
      paramString.append("?extend=").append((String)localObject1);
    }
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(20849);
    int i = paramHttpURLConnection.getResponseCode();
    if (i == 200)
    {
      ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=Access to blackurl returns 200 directly, so we believe that the device is already authenticated. Authentication ended.", new Object[] { m.V(this.mxj.mxd.intent), Integer.valueOf(m.W(this.mxj.mxd.intent)) });
      j.a(this.mxj.mxd, 0, "");
      m.a(this.mxj.mxd.intent, this.mxj.mxd.cuH, this.mxj.mxd.mwG, this.mxj.mxd.cdf, this.mxj.mxd.mwF, "MicroMsg.FreeWifi.Protocol32");
      AppMethodBeat.o(20849);
    }
    while (true)
    {
      return;
      if (i == 302)
      {
        MI(paramHttpURLConnection.getHeaderField("Location"));
        AppMethodBeat.o(20849);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { m.V(this.mxj.mxd.intent), Integer.valueOf(m.W(this.mxj.mxd.intent)) });
        paramHttpURLConnection = this.mxj.mxd.mwF;
        FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mzk;
        FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
        locala.myI = m.a(this.mxj.mxd.mwG, k.b.muI, 32);
        paramHttpURLConnection.a(locald, locala);
        j.b(this.mxj.mxd, 32, "INVALID_HTTP_RESP_CODE");
        AppMethodBeat.o(20849);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(20850);
    ab.i("MicroMsg.FreeWifi.Protocol32", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s, stacktrace=%s", new Object[] { m.V(this.mxj.mxd.intent), Integer.valueOf(m.W(this.mxj.mxd.intent)), paramException.getMessage(), m.h(paramException) });
    if ((paramException instanceof UnknownHostException))
    {
      j.b(this.mxj.mxd, 102, m.g(paramException));
      ab.i("MicroMsg.FreeWifi.Protocol32", "countBlackHttpRequest=" + this.mxe);
      int i = this.mxe + 1;
      this.mxe = i;
      if (i > 3);
    }
    while (true)
    {
      try
      {
        Thread.sleep(3000L);
        a.byw();
        a.a(this.mxi, this);
        AppMethodBeat.o(20850);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        ab.e("MicroMsg.FreeWifi.Protocol32", "InterruptedException e stacktrace=%s", new Object[] { m.h(paramException) });
        j.b(this.mxj.mxd, 103, m.g(paramException));
        localObject1 = this.mxj.mxd.mwF;
        paramException = FreeWifiFrontPageUI.d.mzk;
        localObject2 = new FreeWifiFrontPageUI.a();
        ((FreeWifiFrontPageUI.a)localObject2).myI = m.a(this.mxj.mxd.mwG, k.b.muI, 103);
        ((FreeWifiFrontPageUI)localObject1).a(paramException, localObject2);
        AppMethodBeat.o(20850);
        continue;
      }
      Object localObject1 = this.mxj.mxd.mwF;
      FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mzk;
      Object localObject2 = new FreeWifiFrontPageUI.a();
      ((FreeWifiFrontPageUI.a)localObject2).myI = m.a(this.mxj.mxd.mwG, k.b.muI, m.i(paramException));
      ((FreeWifiFrontPageUI)localObject1).a(locald, localObject2);
      j.b(this.mxj.mxd, m.i(paramException), m.g(paramException));
      AppMethodBeat.o(20850);
      continue;
      localObject2 = this.mxj.mxd.mwF;
      locald = FreeWifiFrontPageUI.d.mzk;
      localObject1 = new FreeWifiFrontPageUI.a();
      ((FreeWifiFrontPageUI.a)localObject1).myI = m.a(this.mxj.mxd.mwG, k.b.muI, m.i(paramException));
      ((FreeWifiFrontPageUI)localObject2).a(locald, localObject1);
      j.b(this.mxj.mxd, m.i(paramException), m.g(paramException));
      AppMethodBeat.o(20850);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.j.2.1
 * JD-Core Version:    0.6.2
 */