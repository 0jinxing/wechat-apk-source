package com.tencent.mm.plugin.mall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class d
{
  public String okK;
  public int okL;
  public String okM;

  public d(String paramString)
  {
    AppMethodBeat.i(43095);
    this.okK = "";
    this.okL = 0;
    this.okM = "";
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      this.okK = localJSONObject.optString("eu_protocol_url");
      this.okL = localJSONObject.optInt("0");
      this.okM = localJSONObject.optString("wxpay_protocol_url");
      AppMethodBeat.o(43095);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MciroMsg.EUInfo", paramString, "", new Object[0]);
        AppMethodBeat.o(43095);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.d
 * JD-Core Version:    0.6.2
 */