package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import org.json.JSONObject;

public final class WxaAttributes$e
{
  public int axy;
  public String bQk;
  public int bQl;
  public String hii;
  public String hij;
  public JSONObject hik;
  public List<WxaAttributes.c> hil;
  public int him;
  public List<WxaAttributes.f> hin;
  public boolean hio;
  public String hip;
  public String hiq;

  public static e zz(String paramString)
  {
    JSONObject localJSONObject = null;
    AppMethodBeat.i(96166);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(96166);
      paramString = localJSONObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = new com/tencent/mm/plugin/appbrand/config/WxaAttributes$e;
        paramString.<init>();
        paramString.axy = localJSONObject.optInt("AppVersion", 0);
        paramString.bQl = localJSONObject.optInt("VersionState", -1);
        paramString.hii = localJSONObject.optString("VersionMD5");
        paramString.hij = localJSONObject.optString("device_orientation");
        paramString.bQk = localJSONObject.optString("client_js_ext_info");
        paramString.him = localJSONObject.optInt("code_size");
        paramString.hik = localJSONObject.optJSONObject("loading_image_info");
        paramString.hin = WxaAttributes.f.zA(localJSONObject.optString("module_list"));
        paramString.hil = WxaAttributes.c.zy(localJSONObject.optString("wxacode_lib_info_list"));
        paramString.hio = localJSONObject.optBoolean("UseModule", false);
        paramString.hip = localJSONObject.optString("EntranceModule");
        paramString.hiq = localJSONObject.optString("without_lib_md5");
        AppMethodBeat.o(96166);
      }
      catch (Exception paramString)
      {
        while (true)
          paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.WxaAttributes.e
 * JD-Core Version:    0.6.2
 */