package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class WxaAttributes$c
{
  public String bIy;
  public String cvZ;
  public String path;
  public int version;

  public static List<c> zy(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(96160);
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(paramString);
      int i = localJSONArray.length();
      if (i <= 0)
      {
        AppMethodBeat.o(96160);
        paramString = localObject;
      }
      while (true)
      {
        return paramString;
        paramString = new java/util/LinkedList;
        paramString.<init>();
        for (i = 0; i < localJSONArray.length(); i++)
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i);
          if (localJSONObject != null)
          {
            c localc = new com/tencent/mm/plugin/appbrand/config/WxaAttributes$c;
            localc.<init>();
            localc.bIy = localJSONObject.optString("provider");
            localc.version = localJSONObject.optInt("version");
            localc.path = localJSONObject.optString("path");
            localc.cvZ = localJSONObject.optString("md5");
            paramString.add(localc);
          }
        }
        AppMethodBeat.o(96160);
      }
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.WxaAttributes.WxaCodeLibInfo", "parse json array, e = %s", new Object[] { paramString });
        AppMethodBeat.o(96160);
        paramString = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.WxaAttributes.c
 * JD-Core Version:    0.6.2
 */