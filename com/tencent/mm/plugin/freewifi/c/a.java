package com.tencent.mm.plugin.freewifi.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class a
{
  public String bssid;
  public String mvt;
  public String mvu;
  public long mvv;
  public String mvw;
  public long mvx;
  public String ssid;
  public String type;
  public long uin;

  public static a MB(String paramString)
  {
    AppMethodBeat.i(20682);
    ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "It starts to parse msgContent for FreeWifiSchemaMsg. msgContent=%s", new Object[] { paramString });
    if (m.isEmpty(paramString))
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "msgCoentent is empty. return.");
      AppMethodBeat.o(20682);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "Shorten msgContent into one line. msgContent=%s", new Object[] { paramString });
      Map localMap = br.z(paramString, "sysmsg");
      if ((localMap == null) || (localMap.size() == 0))
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "Parsing xml failed");
        AppMethodBeat.o(20682);
        paramString = null;
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "Parsed values = " + localMap.toString());
        if (!"freewifi".equalsIgnoreCase((String)localMap.get(".sysmsg.$type")))
        {
          ab.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "sysmsg type is not freewifi. return.");
          AppMethodBeat.o(20682);
          paramString = null;
        }
        else
        {
          paramString = new a();
          paramString.type = ((String)localMap.get(".sysmsg.type"));
          ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.type=" + paramString.type);
          if (!"schemamsg".equals(paramString.type))
          {
            ab.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.type is not schemamsg. return.");
            AppMethodBeat.o(20682);
            paramString = null;
          }
          else
          {
            boolean bool = m.k(localMap, "MicroMsg.FreeWifi.FreeWifiSchemaMsg");
            ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "checkMsgPushedVersion=".concat(String.valueOf(bool)));
            if (!bool)
            {
              ab.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "version not matched. return.");
              AppMethodBeat.o(20682);
              paramString = null;
            }
            else
            {
              paramString.uin = bo.getLong((String)localMap.get(".sysmsg.uin"), 0L);
              ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.uin=" + paramString.uin);
              paramString.ssid = ((String)localMap.get(".sysmsg.schemamsg.ssid"));
              ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.ssid=" + paramString.ssid);
              if (m.isEmpty(paramString.ssid))
              {
                ab.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "scemaMsg.ssid is empty. return.");
                AppMethodBeat.o(20682);
                paramString = null;
              }
              else
              {
                paramString.bssid = m.Mw((String)localMap.get(".sysmsg.schemamsg.bssid"));
                ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.bssid=" + paramString.bssid);
                paramString.mvt = ((String)localMap.get(".sysmsg.schemamsg.mobilemac"));
                ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.mobilemac=" + paramString.mvt);
                if (m.isEmpty(paramString.mvt))
                {
                  ab.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "scemaMsg.mobilemac is empty. return.");
                  AppMethodBeat.o(20682);
                  paramString = null;
                }
                else
                {
                  paramString.mvu = ((String)localMap.get(".sysmsg.schemamsg.mpappid"));
                  ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.mpappid=" + paramString.mvu);
                  paramString.mvv = bo.getLong((String)localMap.get(".sysmsg.schemamsg.mpshopid"), 0L);
                  ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.mpshopid=" + paramString.mvv);
                  paramString.mvw = ((String)localMap.get(".sysmsg.schemamsg.schemaurl"));
                  ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.schemaurl=" + paramString.mvw);
                  if (m.isEmpty(paramString.mvw))
                  {
                    ab.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "scemaMsg.schemaurl is empty. return.");
                    AppMethodBeat.o(20682);
                    paramString = null;
                  }
                  else
                  {
                    paramString.mvx = bo.getLong((String)localMap.get(".sysmsg.schemamsg.expiredseconds"), 0L);
                    ab.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schema.expiredseconds=" + paramString.mvx);
                    AppMethodBeat.o(20682);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.c.a
 * JD-Core Version:    0.6.2
 */