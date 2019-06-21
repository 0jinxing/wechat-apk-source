package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public final class j
{
  public static void a(j.a parama)
  {
    AppMethodBeat.i(68489);
    d.post(new j.1(parama), "QQMailUnreadHelper");
    AppMethodBeat.o(68489);
  }

  public static void b(j.a parama)
  {
    AppMethodBeat.i(68490);
    ab.i("MicroMsg.QQMailUnreadHelper", "dz[getUnreadCount]");
    String str = (String)g.RP().Ry().get(-1535680990, "");
    long l = new p(bo.h((Integer)g.RP().Ry().get(9, null))).longValue();
    if ((bo.isNullOrNil(str)) || (l == 0L))
    {
      g.RP().Ry().set(ac.a.xJW, Integer.valueOf(-1));
      ab.w("MicroMsg.QQMailUnreadHelper", "dz[getUnreadEmailCountAndSet: authkey or uin is null]");
      al.d(new j.2(parama));
      AppMethodBeat.o(68490);
    }
    while (true)
    {
      return;
      Object localObject = (HttpURLConnection)new URL("https://qqmail.weixin.qq.com/cgi-bin/getunreadmailcount?f=xml&appname=qqmail_weixin&charset=utf-8&clientip=0").openConnection();
      ((HttpURLConnection)localObject).setConnectTimeout(15000);
      ((HttpURLConnection)localObject).setReadTimeout(20000);
      ((HttpURLConnection)localObject).setRequestProperty("Cookie", String.format("skey=%s;uin=o%d;", new Object[] { str, Long.valueOf(l) }));
      if (((HttpURLConnection)localObject).getResponseCode() >= 300)
      {
        ((HttpURLConnection)localObject).disconnect();
        ab.w("MicroMsg.QQMailUnreadHelper", "dz[getUnreadCount http 300]");
        al.d(new j.3(parama));
        AppMethodBeat.o(68490);
      }
      else
      {
        localObject = br.z(bo.convertStreamToString(((HttpURLConnection)localObject).getInputStream()), "Response");
        if ((localObject != null) && (bo.getInt((String)((Map)localObject).get(".Response.error.code"), -1) == 0));
        for (int i = bo.getInt((String)((Map)localObject).get(".Response.result.UnreadCount"), -1); ; i = -1)
        {
          if (i >= 0)
            break label300;
          al.d(new j.4(parama));
          AppMethodBeat.o(68490);
          break;
        }
        label300: g.RP().Ry().set(ac.a.xJW, Integer.valueOf(i));
        al.d(new j.5(parama, i));
        AppMethodBeat.o(68490);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.j
 * JD-Core Version:    0.6.2
 */