package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class d$b$c$a
{
  public long appid = 0L;
  public String fvM;
  public String fvN;
  public int fvO;
  public String fvP;
  public String fvQ;

  public static a qL(String paramString)
  {
    AppMethodBeat.i(11273);
    ab.i("MicroMsg.BizInfo", "EnterpriseBizInfo = ".concat(String.valueOf(paramString)));
    a locala = new a();
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(11273);
    while (true)
    {
      return locala;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        locala.fvM = localJSONObject.optString("belong");
        locala.fvN = localJSONObject.optString("freeze_wording");
        locala.fvO = localJSONObject.optInt("child_type");
        locala.fvP = localJSONObject.optString("home_url");
        paramString = localJSONObject.optString("exattr");
        if (bo.isNullOrNil(paramString))
          locala.fvQ = null;
        while (true)
        {
          AppMethodBeat.o(11273);
          break;
          localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(paramString);
          locala.fvQ = localJSONObject.optString("chat_extension_url");
          locala.appid = localJSONObject.optLong("app_id");
        }
      }
      catch (JSONException paramString)
      {
        while (true)
          ab.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bo.l(paramString) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.d.b.c.a
 * JD-Core Version:    0.6.2
 */