package com.tencent.mm.plugin.freewifi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.f.b;
import com.tencent.mm.plugin.freewifi.g.f;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
{
  public static Map<String, String> mua;
  private String bssid;
  private int cIb;
  private String cuH;
  private String cuI;
  private String ehr;
  private String kBq;
  private int mub;
  private String muc;
  private String mud;
  private int mue;
  private long muf;
  private String mug;
  private String muh;
  private long mui;
  private int result;
  private String ssid;

  static
  {
    AppMethodBeat.i(20616);
    mua = new k.1();
    AppMethodBeat.o(20616);
  }

  public static String Mu(String paramString)
  {
    AppMethodBeat.i(20612);
    paramString = m.Mw((String)mua.get(paramString));
    AppMethodBeat.o(20612);
    return paramString;
  }

  public static k.a byo()
  {
    AppMethodBeat.i(20613);
    k.a locala = new k.a((byte)0);
    AppMethodBeat.o(20613);
    return locala;
  }

  public final k b(Intent paramIntent, boolean paramBoolean)
  {
    AppMethodBeat.i(20615);
    try
    {
      int i = m.X(paramIntent);
      if (i != 31)
        AppMethodBeat.o(20615);
      while (true)
      {
        return this;
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>();
        try
        {
          ((JSONObject)localObject1).put("ssid", this.ssid);
          ((JSONObject)localObject1).put("bssid", this.bssid);
          ((JSONObject)localObject1).put("clientMac", this.cuI);
          ((JSONObject)localObject1).put("apKey", this.cuH);
          ((JSONObject)localObject1).put("qrtype", this.mub);
          ((JSONObject)localObject1).put("mpShopId", this.muc);
          ((JSONObject)localObject1).put("mpAppId", this.mud);
          ((JSONObject)localObject1).put("sessionKey", this.kBq);
          ((JSONObject)localObject1).put("protocolType", this.mue);
          ((JSONObject)localObject1).put("stageCode", this.muf);
          ((JSONObject)localObject1).put("stageName", this.mug);
          ((JSONObject)localObject1).put("result", this.result);
          ((JSONObject)localObject1).put("channel", this.cIb);
          ((JSONObject)localObject1).put("mpUserName", this.muh);
          ((JSONObject)localObject1).put("timeCost", this.mui);
          ((JSONObject)localObject1).put("resultMsg", this.ehr);
          ((JSONObject)localObject1).put("logCurrentTimeMillis", System.currentTimeMillis());
          localObject2 = ((JSONObject)localObject1).toString();
          String str = paramIntent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_JSON");
          if (m.isEmpty(str))
          {
            paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_JSON", (String)localObject2);
            long l = System.currentTimeMillis();
            str = paramIntent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_ID");
            localObject1 = paramIntent.getStringExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_JSON");
            if (paramBoolean)
            {
              paramIntent = j.bza().byI();
              localObject2 = new com/tencent/mm/plugin/freewifi/k$2;
              ((2)localObject2).<init>(this, str, i, (String)localObject1, l);
              paramIntent.post((Runnable)localObject2);
            }
            AppMethodBeat.o(20615);
          }
        }
        catch (JSONException localJSONException)
        {
          while (true)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("JSONException e. ");
            ab.e("MicroMsg.FreeWifi.FreeWifiQualityReporter", m.h(localJSONException));
          }
        }
      }
    }
    catch (Exception paramIntent)
    {
      while (true)
      {
        Object localObject2;
        ab.e("MicroMsg.FreeWifi.FreeWifiQualityReporter", "reportWifiServer() write to local file exception. " + m.h(paramIntent));
        continue;
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_JSON", localJSONException + "," + (String)localObject2);
      }
    }
  }

  public final k byp()
  {
    AppMethodBeat.i(20614);
    h.pYm.e(12804, new Object[] { m.Mw(this.ssid), m.Mw(this.bssid), m.Mw(this.cuI), m.Mw(this.cuH), Integer.valueOf(this.mub), m.Mw(this.muc), m.Mw(this.mud), m.Mw(this.kBq), Integer.valueOf(this.mue), Long.valueOf(this.muf), m.Mw(this.mug), Integer.valueOf(this.result), Integer.valueOf(this.cIb), m.Mw(this.muh), Long.valueOf(this.mui), m.Mw(this.ehr) });
    AppMethodBeat.o(20614);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.k
 * JD-Core Version:    0.6.2
 */