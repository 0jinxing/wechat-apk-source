package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class d$b$c
{
  public int fvK;
  public List<j> fvL = null;
  public int type;

  public static c qK(String paramString)
  {
    AppMethodBeat.i(11274);
    ab.i("MicroMsg.BizInfo", "MenuInfo = ".concat(String.valueOf(paramString)));
    c localc = new c();
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(11274);
    while (true)
    {
      return localc;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        localc.fvK = localJSONObject.optInt("update_time");
        localc.type = localJSONObject.optInt("type", 0);
        localc.fvL = j.e(localJSONObject.optJSONArray("button_list"));
        AppMethodBeat.o(11274);
      }
      catch (JSONException paramString)
      {
        while (true)
          ab.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bo.l(paramString) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.d.b.c
 * JD-Core Version:    0.6.2
 */