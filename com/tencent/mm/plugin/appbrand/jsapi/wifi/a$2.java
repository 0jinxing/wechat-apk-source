package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.b;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d;
import com.tencent.mm.plugin.appbrand.widget.b.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

final class a$2
  implements com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.a
{
  a$2(a parama, j paramj, com.tencent.luggage.c.a.a parama1, c paramc, int paramInt)
  {
  }

  public final void Ca(String paramString)
  {
    AppMethodBeat.i(94369);
    d.a(null);
    al.d(new a.2.1(this));
    if (paramString.equals("ok"))
    {
      localObject = d.aGy();
      ab.i("MicroMsg.JsApiConenctWifi", "[IConnectWiFiCallback]currentWifi:%s", new Object[] { localObject });
      if (localObject == null)
      {
        ab.e("MicroMsg.JsApiConenctWifi", "[onWiFiConnect]currentWIfi is null");
        paramString = new HashMap();
        paramString.put("errCode", Integer.valueOf(12006));
        this.hxc.M(this.eIl, this.idb.j("ok:can't gain current wifi may be not open GPS", paramString));
        AppMethodBeat.o(94369);
      }
      while (true)
      {
        return;
        try
        {
          paramString = new java/util/HashMap;
          paramString.<init>();
          paramString.put("wifi", ((b)localObject).toJSONObject());
          paramString.put("errCode", Integer.valueOf(0));
          this.hxc.M(this.eIl, this.idb.j("ok", paramString));
          AppMethodBeat.o(94369);
        }
        catch (JSONException paramString)
        {
          ab.e("MicroMsg.JsApiConenctWifi", "IConnectWiFiCallback is error");
          ab.printErrStackTrace("MicroMsg.JsApiConenctWifi", paramString, "", new Object[0]);
          paramString = new HashMap();
          paramString.put("errCode", Integer.valueOf(12010));
          this.hxc.M(this.eIl, this.idb.j("fail:parse json err", paramString));
          AppMethodBeat.o(94369);
        }
      }
    }
    Object localObject = new HashMap();
    if (paramString.equals("duplicated request"))
      ((HashMap)localObject).put("errCode", Integer.valueOf(12004));
    while (true)
    {
      ab.e("MicroMsg.JsApiConenctWifi", "[IConnectWiFiCallback]errMsg:%s", new Object[] { paramString });
      this.hxc.M(this.eIl, this.idb.j("fail:".concat(String.valueOf(paramString)), (Map)localObject));
      AppMethodBeat.o(94369);
      break;
      if (paramString.equals("password error"))
        ((HashMap)localObject).put("errCode", Integer.valueOf(12002));
      else if (paramString.equals("wifi config may be expired"))
        ((HashMap)localObject).put("errCode", Integer.valueOf(12013));
      else
        ((HashMap)localObject).put("errCode", Integer.valueOf(12003));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.a.2
 * JD-Core Version:    0.6.2
 */