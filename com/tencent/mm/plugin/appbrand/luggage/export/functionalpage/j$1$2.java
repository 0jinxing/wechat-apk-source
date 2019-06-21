package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.jsapi.file.al;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.s.s;
import com.tencent.mm.vending.c.a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class j$1$2
  implements a<Void, Void>
{
  j$1$2(j.1 param1)
  {
  }

  private Void asR()
  {
    AppMethodBeat.i(132143);
    j.c(this.ikC.ikB);
    j localj = this.ikC.ikB;
    AppBrandInitConfigWC localAppBrandInitConfigWC = localj.atI();
    if ((localAppBrandInitConfigWC == null) || (localAppBrandInitConfigWC.hgF == null) || (localAppBrandInitConfigWC.hgF.hgQ != 7))
      d.i("MicroMsg.OpenSdkJsApiProcessor", "initConfig is null or lanunchScene is err, return");
    while (true)
    {
      Object localObject = zXH;
      AppMethodBeat.o(132143);
      return localObject;
      localObject = localAppBrandInitConfigWC.hgF.hgT;
      d.d("MicroMsg.OpenSdkJsApiProcessor", "openapiInvokeData:%s", new Object[] { localObject });
      JSONObject localJSONObject1;
      JSONObject localJSONObject2;
      while (true)
      {
        String str1;
        com.tencent.mm.plugin.appbrand.r.j localj1;
        String str2;
        try
        {
          localJSONObject1 = new org/json/JSONObject;
          localJSONObject1.<init>((String)localObject);
          str1 = localJSONObject1.getString("args");
          localJSONObject2 = new org/json/JSONObject;
          localJSONObject2.<init>(str1);
          localj1 = new com/tencent/mm/plugin/appbrand/r/j;
          localj1.<init>();
          if (localj.atG().a(localj1) != com.tencent.mm.plugin.appbrand.appstorage.j.gXA)
            break;
          Iterator localIterator = localJSONObject2.keys();
          if (!localIterator.hasNext())
            break label352;
          str1 = (String)localIterator.next();
          str2 = localJSONObject2.getString(str1);
          if (!s.Ek(str2))
            break label239;
          localJSONObject2.put(str1, s.a(localj, (String)localj1.value, str2));
          continue;
        }
        catch (JSONException localJSONException)
        {
          d.c("MicroMsg.OpenSdkJsApiProcessor", "", new Object[] { localJSONException });
        }
        break;
        label239: if (s.El(str2))
        {
          JSONArray localJSONArray1 = new org/json/JSONArray;
          localJSONArray1.<init>(str2);
          JSONArray localJSONArray2 = new org/json/JSONArray;
          localJSONArray2.<init>();
          int i = 0;
          if (i < localJSONArray1.length())
          {
            str2 = localJSONArray1.getString(i);
            if (s.Ek(str2))
              localJSONArray2.put(s.a(localj, (String)localj1.value, str2));
            while (true)
            {
              i++;
              break;
              localJSONArray2.put(str2);
            }
          }
          localJSONObject2.put(str1, localJSONArray2.toString());
        }
      }
      label352: localJSONObject1.put("args", localJSONObject2.toString());
      localAppBrandInitConfigWC.hgF.hgT = localJSONObject1.toString();
      d.d("MicroMsg.OpenSdkJsApiProcessor", "transfer finish, openapiInvokeData:%s", new Object[] { localJSONException });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j.1.2
 * JD-Core Version:    0.6.2
 */