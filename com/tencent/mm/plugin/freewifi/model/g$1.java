package com.tencent.mm.plugin.freewifi.model;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class g$1
  implements Runnable
{
  g$1(g paramg, String paramString, Intent paramIntent, g.b paramb, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20724);
    int i = this.mvU.mvS;
    String str1;
    while (true)
    {
      int j = i - 1;
      if (i <= 0)
        break label267;
      ab.i("MicroMsg.FreeWifi.FreeWifiNetwork", "now retry count = %d", new Object[] { Integer.valueOf(j) });
      g.b(this.mvg, 1, this.val$intent);
      str1 = com.tencent.mm.m.g.Nv().Nj();
      ab.i("MicroMsg.FreeWifi.FreeWifiNetwork", "get check url from cinfig : %s", new Object[] { str1 });
      String str2 = str1;
      if (bo.isNullOrNil(str1))
      {
        ab.i("MicroMsg.FreeWifi.FreeWifiNetwork", "get check url from config failed, use the default url : %s", new Object[] { "http://10.1.0.6/redirect" });
        str2 = "http://10.1.0.6/redirect";
      }
      str1 = g.MH(str2);
      ab.i("MicroMsg.FreeWifi.FreeWifiNetwork", "get location from url : %s, %s", new Object[] { str2, str1 });
      if (!bo.isNullOrNil(str1))
        break;
      ab.e("MicroMsg.FreeWifi.FreeWifiNetwork", "get location from url failed : %s, %s", new Object[] { str2, str1 });
      try
      {
        Thread.sleep(500L);
        i = j;
      }
      catch (Exception localException)
      {
        i = j;
      }
    }
    String str3 = g.er(str1, "auth=");
    ab.i("MicroMsg.FreeWifi.FreeWifiNetwork", "get apauthmessage from location : %s, %s", new Object[] { str3, str1 });
    if (bo.isNullOrNil(str3))
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiNetwork", "get apauth message from location failed : %s", new Object[] { str1 });
      g.b(this.mvg, 3, this.val$intent);
    }
    if (this.mvT != null)
      this.mvT.ci(str3, this.muW);
    AppMethodBeat.o(20724);
    while (true)
    {
      return;
      label267: if (this.mvT != null)
        this.mvT.ci(null, this.muW);
      g.b(this.mvg, 3, this.val$intent);
      AppMethodBeat.o(20724);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.g.1
 * JD-Core Version:    0.6.2
 */