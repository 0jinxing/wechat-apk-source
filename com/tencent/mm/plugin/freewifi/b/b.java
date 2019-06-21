package com.tencent.mm.plugin.freewifi.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fe;
import com.tencent.mm.g.a.fe.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class b
{
  private static void a(fe paramfe, int paramInt, String paramString)
  {
    AppMethodBeat.i(20672);
    paramfe.cyB.cyE = paramInt;
    paramfe.cyB.cyF = paramString;
    paramfe.cyB.cyD = 1;
    ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "FreeWifiManufacturerConnectWifiHelper setResult. errorcode=%d, errmsg=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramfe.callback != null)
      paramfe.callback.run();
    AppMethodBeat.o(20672);
  }

  public final void a(fe paramfe)
  {
    while (true)
    {
      String str;
      Object localObject1;
      try
      {
        AppMethodBeat.i(20671);
        ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "Method connectWifi gets called");
        str = m.Mv(paramfe.cyA.ssid);
        localObject1 = paramfe.cyA.bssid;
        if (m.isEmpty(str))
        {
          a(paramfe, 1141, "Ssid is empty.");
          AppMethodBeat.o(20671);
          return;
        }
        if (m.isEmpty((String)localObject1))
        {
          a(paramfe, 1142, "Bssid is empty.");
          AppMethodBeat.o(20671);
          continue;
        }
      }
      finally
      {
      }
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("args: ssid=");
      ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", paramfe.cyA.ssid + "; bssid=" + paramfe.cyA.bssid + "; version=" + paramfe.cyA.version);
      ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "Try to get connect info from cache");
      a.b localb = a.a.byy().eq(str, (String)localObject1);
      ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "read cache done.");
      if (localb == null)
      {
        if (a.a.byy().size() == 0)
        {
          a(paramfe, 1145, "Ap connect info cache in wechat is empty. It may be wechat got killed before.");
          AppMethodBeat.o(20671);
        }
        else
        {
          a(paramfe, 1144, "Ap connect info cache in wechat is not empty but the ap tried to connect to is not contained in the cache.");
          AppMethodBeat.o(20671);
        }
      }
      else
      {
        localObject2 = localb.cuH;
        int i = localb.mue;
        if (i == 4)
        {
          ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "Ready to start up password ap connect page.");
          localObject1 = new com/tencent/mm/plugin/freewifi/b/b$1;
          ((b.1)localObject1).<init>(this, (String)localObject2);
          al.d((Runnable)localObject1);
          a(paramfe, 1, null);
          AppMethodBeat.o(20671);
        }
        else if (i == 31)
        {
          ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "Ready to connect 31 page.");
          localObject2 = new com/tencent/mm/plugin/freewifi/b/b$2;
          ((b.2)localObject2).<init>(this, str, (String)localObject1);
          al.d((Runnable)localObject2);
          a(paramfe, 1, null);
          AppMethodBeat.o(20671);
        }
        else
        {
          a(paramfe, 1143, "Wechant installed Currently doesn't support connect protocol ".concat(String.valueOf(i)));
          AppMethodBeat.o(20671);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.b.b
 * JD-Core Version:    0.6.2
 */