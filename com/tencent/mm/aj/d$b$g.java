package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class d$b$g
{
  public String fwb;
  public String fwc;
  public boolean fwd;

  public static g qO(String paramString)
  {
    AppMethodBeat.i(11278);
    ab.i("MicroMsg.BizInfo", "RegisterSource = %s", new Object[] { paramString });
    g localg = new g();
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(11278);
    while (true)
    {
      return localg;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        localg.fwb = localJSONObject.optString("RegisterBody");
        localg.fwc = localJSONObject.optString("IntroUrl");
        if (localJSONObject.optInt("IsClose", 0) == 1);
        for (boolean bool = true; ; bool = false)
        {
          localg.fwd = bool;
          AppMethodBeat.o(11278);
          break;
        }
      }
      catch (JSONException paramString)
      {
        while (true)
          ab.e("MicroMsg.BizInfo", "exception in RegisterSource:%s", new Object[] { bo.l(paramString) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.d.b.g
 * JD-Core Version:    0.6.2
 */