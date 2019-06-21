package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d$b$e
{
  public int fvW;
  public String fvX;
  public List<String> fvY;
  public String fvZ;

  public static e qN(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(11276);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(11276);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      try
      {
        e locale = new com/tencent/mm/aj/d$b$e;
        locale.<init>();
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(paramString);
        locale.fvW = ((JSONObject)localObject2).optInt("reputation_level", -1);
        locale.fvX = ((JSONObject)localObject2).optString("scope_of_business");
        locale.fvZ = ((JSONObject)localObject2).optString("guarantee_detail_h5_url");
        paramString = ((JSONObject)localObject2).optJSONArray("guarantee_info");
        if (paramString != null)
        {
          int i = paramString.length();
          if (i > 0)
          {
            localObject2 = new java/util/ArrayList;
            ((ArrayList)localObject2).<init>();
            locale.fvY = ((List)localObject2);
            for (int j = 0; j < i; j++)
            {
              localObject2 = paramString.getString(j);
              if (!bo.isNullOrNil((String)localObject2))
                locale.fvY.add(localObject2);
            }
          }
        }
        AppMethodBeat.o(11276);
        paramString = locale;
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(11276);
        paramString = localObject1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.d.b.e
 * JD-Core Version:    0.6.2
 */