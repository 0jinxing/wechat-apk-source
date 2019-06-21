package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class t
{
  public static ArrayList<od> Hz(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(88950);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(88950);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      Object localObject2;
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(paramString);
        JSONArray localJSONArray = ((JSONObject)localObject2).getJSONArray("used_store_list");
        if (localJSONArray != null)
        {
          i = localJSONArray.length();
          if (i != 0);
        }
        else
        {
          AppMethodBeat.o(88950);
          paramString = localObject1;
          continue;
        }
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        int i = 0;
        if (i >= localJSONArray.length())
          break label295;
        JSONObject localJSONObject = localJSONArray.getJSONObject(i);
        if (localJSONObject == null)
          paramString = null;
        while (true)
        {
          if (paramString != null)
            ((ArrayList)localObject2).add(paramString);
          i++;
          break;
          paramString = new com/tencent/mm/protocal/protobuf/od;
          paramString.<init>();
          paramString.name = localJSONObject.optString("name");
          paramString.descriptor = localJSONObject.optString("descriptor");
          paramString.kck = localJSONObject.optString("phone");
          paramString.country = localJSONObject.optString("country");
          paramString.duc = localJSONObject.optString("province");
          paramString.dud = localJSONObject.optString("city");
          paramString.fBg = localJSONObject.optString("address");
          paramString.qVo = ((float)localJSONObject.optDouble("distance"));
          paramString.cGm = ((float)localJSONObject.optDouble("longitude"));
          paramString.cEB = ((float)localJSONObject.optDouble("latitude"));
          paramString.kdF = localJSONObject.optString("jump_url");
          paramString.vTL = localJSONObject.optString("app_brand_user_name");
          paramString.vTM = localJSONObject.optString("app_brand_pass");
        }
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.ShopInfoItemParser", paramString, "", new Object[0]);
        AppMethodBeat.o(88950);
        paramString = localObject1;
      }
      continue;
      label295: AppMethodBeat.o(88950);
      paramString = (String)localObject2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.t
 * JD-Core Version:    0.6.2
 */