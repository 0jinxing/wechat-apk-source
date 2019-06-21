package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class WxaAttributes$f
{
  public boolean cta;
  public String cvZ;
  public String[] gSQ;
  public List<WxaAttributes.c> hir;
  public String hit;
  public String name;
  public int size;

  private static String[] n(JSONObject paramJSONObject)
  {
    int i = 0;
    AppMethodBeat.i(96168);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("alias");
    if ((localJSONArray == null) || (localJSONArray.length() <= 0))
    {
      paramJSONObject = new String[0];
      AppMethodBeat.o(96168);
    }
    while (true)
    {
      return paramJSONObject;
      paramJSONObject = new String[localJSONArray.length()];
      while (i < localJSONArray.length())
      {
        paramJSONObject[i] = localJSONArray.optString(i);
        i++;
      }
      AppMethodBeat.o(96168);
    }
  }

  public static List<f> zA(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(96167);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(96167);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString);
        int i = localJSONArray.length();
        if (i <= 0)
        {
          AppMethodBeat.o(96167);
          paramString = localObject;
        }
        else
        {
          paramString = new java/util/LinkedList;
          paramString.<init>();
          for (i = 0; i < localJSONArray.length(); i++)
          {
            JSONObject localJSONObject = localJSONArray.getJSONObject(i);
            if (localJSONObject != null)
            {
              f localf = new com/tencent/mm/plugin/appbrand/config/WxaAttributes$f;
              localf.<init>();
              localf.name = localJSONObject.getString("name");
              localf.cvZ = localJSONObject.getString("md5");
              localf.size = localJSONObject.optInt("size", 0);
              localf.cta = localJSONObject.optBoolean("independent", false);
              localf.gSQ = n(localJSONObject);
              localf.hir = WxaAttributes.c.zy(localJSONObject.optString("wxacode_lib_info_list"));
              localf.hit = localJSONObject.optString("without_lib_md5");
              paramString.add(localf);
            }
          }
          AppMethodBeat.o(96167);
        }
      }
      catch (JSONException paramString)
      {
        ab.e("MicroMsg.AppBrand.WxaAttributes.WxaVersionModuleInfo", "parse json array, e = %s", new Object[] { paramString });
        AppMethodBeat.o(96167);
        paramString = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.WxaAttributes.f
 * JD-Core Version:    0.6.2
 */