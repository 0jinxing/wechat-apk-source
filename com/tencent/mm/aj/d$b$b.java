package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class d$b$b
{
  public int fvH;
  public int fvI;
  public int fvJ;

  public static b qJ(String paramString)
  {
    AppMethodBeat.i(11272);
    ab.i("MicroMsg.BizInfo", "HardwareBizInfo = ".concat(String.valueOf(paramString)));
    b localb = new b();
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(11272);
    while (true)
    {
      return localb;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        localb.fvH = localJSONObject.optInt("hardware_flag");
        localb.fvI = localJSONObject.optInt("connect_status_display_mode");
        localb.fvJ = localJSONObject.optInt("special_internal_brand_type");
        AppMethodBeat.o(11272);
      }
      catch (JSONException paramString)
      {
        while (true)
          ab.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bo.l(paramString) });
      }
    }
  }

  public final boolean aes()
  {
    if ((this.fvH & 0x1) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.d.b.b
 * JD-Core Version:    0.6.2
 */