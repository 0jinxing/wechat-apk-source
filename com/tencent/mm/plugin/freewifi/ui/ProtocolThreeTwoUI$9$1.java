package com.tencent.mm.plugin.freewifi.ui;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;

final class ProtocolThreeTwoUI$9$1
  implements a.a
{
  int mxe;
  private final int mxf;
  private int mxg;
  private a.a mxh;

  ProtocolThreeTwoUI$9$1(ProtocolThreeTwoUI.9 param9, String paramString)
  {
    AppMethodBeat.i(21183);
    this.mxe = 0;
    this.mxf = 3;
    this.mxg = 0;
    this.mxh = new ProtocolThreeTwoUI.9.1.1(this);
    AppMethodBeat.o(21183);
  }

  private void MI(String paramString)
  {
    AppMethodBeat.i(21186);
    Object localObject = Uri.parse(paramString);
    String str = ((Uri)localObject).getQueryParameter("authUrl");
    localObject = m.Mw(((Uri)localObject).getQueryParameter("extend"));
    ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=Access to blackUrl returns 302 and now trying to  get authurl and extend from location. location=%s, authUrl=%s, extend=%s", new Object[] { m.V(this.mAF.mAD.getIntent()), Integer.valueOf(m.W(this.mAF.mAD.getIntent())), paramString, str, localObject });
    if (m.isEmpty(str))
    {
      this.mxg += 1;
      if (this.mxg < 3)
      {
        a.byw();
        a.a(paramString, this.mxh);
        AppMethodBeat.o(21186);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=Connection fail. Too many 302, exceeding 3 times", new Object[] { m.V(this.mAF.mAD.getIntent()), Integer.valueOf(m.W(this.mAF.mAD.getIntent())) });
        d.a(this.mAF.mAD.ssid, 3, this.mAF.mAD.getIntent());
        ProtocolThreeTwoUI.a(this.mAF.mAD, 36, "BLACK_302_TIMES_EXCESS");
        AppMethodBeat.o(21186);
      }
    }
    paramString = new StringBuilder(str);
    if (str.indexOf("?") != -1)
      paramString.append("&extend=").append((String)localObject);
    while (true)
    {
      paramString.append("&openId=").append(m.Mw(ProtocolThreeTwoUI.j(this.mAF.mAD))).append("&tid=").append(m.Mw(ProtocolThreeTwoUI.i(this.mAF.mAD))).append("&timestamp=").append(ProtocolThreeTwoUI.h(this.mAF.mAD)).append("&sign=").append(ProtocolThreeTwoUI.g(this.mAF.mAD));
      ProtocolThreeTwoUI.a(this.mAF.mAD, paramString.toString());
      AppMethodBeat.o(21186);
      break;
      paramString.append("?extend=").append((String)localObject);
    }
  }

  public final void g(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(21184);
    int i = paramHttpURLConnection.getResponseCode();
    if (i == 200)
    {
      ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=Access to blackurl returns 200 directly, so we believe that the device is already authenticated. Authentication ended.", new Object[] { m.V(this.mAF.mAD.getIntent()), Integer.valueOf(m.W(this.mAF.mAD.getIntent())) });
      ProtocolThreeTwoUI.f(this.mAF.mAD);
      AppMethodBeat.o(21184);
    }
    while (true)
    {
      return;
      if (i == 302)
      {
        MI(paramHttpURLConnection.getHeaderField("Location"));
        AppMethodBeat.o(21184);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { m.V(this.mAF.mAD.getIntent()), Integer.valueOf(m.W(this.mAF.mAD.getIntent())) });
        d.a(this.mAF.mAD.ssid, 3, this.mAF.mAD.getIntent());
        ProtocolThreeTwoUI.a(this.mAF.mAD, 32, "INVALID_HTTP_RESP_CODE");
        AppMethodBeat.o(21184);
      }
    }
  }

  public final void j(Exception paramException)
  {
    AppMethodBeat.i(21185);
    ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.handleBlack302, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s", new Object[] { m.V(this.mAF.mAD.getIntent()), Integer.valueOf(m.W(this.mAF.mAD.getIntent())), paramException.getMessage() });
    if ((paramException instanceof UnknownHostException))
    {
      ProtocolThreeTwoUI.a(this.mAF.mAD, 102, m.g(paramException));
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
        AppMethodBeat.o(21185);
        return;
      }
      catch (InterruptedException paramException)
      {
        AppMethodBeat.o(21185);
        continue;
      }
      d.a(this.mAF.mAD.ssid, 3, this.mAF.mAD.getIntent());
      ProtocolThreeTwoUI.a(this.mAF.mAD, 101, m.g(paramException));
      AppMethodBeat.o(21185);
      continue;
      d.a(this.mAF.mAD.ssid, 3, this.mAF.mAD.getIntent());
      ProtocolThreeTwoUI.a(this.mAF.mAD, 101, m.g(paramException));
      AppMethodBeat.o(21185);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeTwoUI.9.1
 * JD-Core Version:    0.6.2
 */