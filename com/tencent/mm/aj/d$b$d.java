package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class d$b$d
{
  public int fvR = 0;
  public String fvS;
  public String fvT;
  public String fvU;
  public String fvV;

  public static d qM(String paramString)
  {
    AppMethodBeat.i(11275);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(11275);
    }
    while (true)
    {
      return paramString;
      ab.i("MicroMsg.BizInfo", "biz verify info is [%s]", new Object[] { paramString });
      d locald = new d();
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        locald.fvR = localJSONObject.optInt("Type");
        locald.fvS = localJSONObject.optString("Description");
        locald.fvT = localJSONObject.optString("Name");
        locald.fvU = localJSONObject.optString("IntroUrl");
        locald.fvV = localJSONObject.optString("VerifySubTitle");
        ab.i("MicroMsg.BizInfo", "type[%d],desc[%s],name[%s],url[%s]", new Object[] { Integer.valueOf(locald.fvR), locald.fvS, locald.fvT, locald.fvU });
        AppMethodBeat.o(11275);
        paramString = locald;
      }
      catch (Exception paramString)
      {
        while (true)
          ab.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bo.l(paramString) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.d.b.d
 * JD-Core Version:    0.6.2
 */