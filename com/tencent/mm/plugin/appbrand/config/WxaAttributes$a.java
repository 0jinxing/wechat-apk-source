package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import org.json.JSONObject;

public final class WxaAttributes$a
{
  public int fmr;
  public long haQ = 0L;
  public long haR = 0L;
  public int hgD;
  public String hgE;
  public String hhR;
  public int hhS;
  public List<String> hhT;
  public List<String> hhU;
  public List<String> hhV;
  public List<String> hhW;
  public List<String> hhX;
  public String hhY;

  public static a zx(String paramString)
  {
    a locala = null;
    AppMethodBeat.i(96159);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.AppBrand.WxaAttributes", "getAppInfo, json is EMPTY");
      AppMethodBeat.o(96159);
      paramString = locala;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>(paramString);
        locala = new com/tencent/mm/plugin/appbrand/config/WxaAttributes$a;
        locala.<init>();
        JSONObject localJSONObject2 = localJSONObject1.optJSONObject("RunningFlagInfo");
        if (localJSONObject2 != null)
        {
          locala.haQ = localJSONObject2.optLong("RunningFlag");
          locala.hhR = localJSONObject2.optString("AppOpenForbiddenUrl");
          locala.haR = localJSONObject2.optLong("CanNotStarWxaBeforeTime", 0L);
        }
        localJSONObject2 = localJSONObject1.optJSONObject("Network");
        if (localJSONObject2 != null)
        {
          locala.hhT = t.l(localJSONObject2.optJSONArray("RequestDomain"));
          locala.hhU = t.l(localJSONObject2.optJSONArray("WsRequestDomain"));
          locala.hhV = t.l(localJSONObject2.optJSONArray("UploadDomain"));
          locala.hhW = t.l(localJSONObject2.optJSONArray("DownloadDomain"));
          locala.hhX = t.l(localJSONObject2.optJSONArray("UDPDomain"));
        }
        locala.hhS = localJSONObject1.optInt("WechatPluginApp", 0);
        locala.fmr = localJSONObject1.optInt("AppServiceType", 0);
        locala.hhY = localJSONObject1.optString("fromBusinessUsername");
        locala.hgD = localJSONObject1.optInt("OriginalFlag", 0);
        locala.hgE = localJSONObject1.optString("OriginalRedirectUrl");
        paramString = locala;
        AppMethodBeat.o(96159);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.AppBrand.WxaAttributes", "getAppInfo, json(%s) parse failed ex = %s", new Object[] { paramString, localException });
          paramString = null;
        }
      }
    }
  }

  public final boolean xy()
  {
    if (this.fmr == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.WxaAttributes.a
 * JD-Core Version:    0.6.2
 */