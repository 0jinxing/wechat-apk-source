package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class c
{
  public String Afl;
  public String Afm;
  public String Afn;
  public String cBF;
  public String title;

  public c()
  {
    this.title = "";
    this.Afl = "";
    this.Afm = "";
    this.Afn = "";
    this.cBF = "";
  }

  public c(String paramString)
  {
    AppMethodBeat.i(49036);
    this.title = "";
    this.Afl = "";
    this.Afm = "";
    this.Afn = "";
    this.cBF = "";
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(49036);
    while (true)
    {
      return;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        this.title = localJSONObject.optString("title");
        this.Afl = localJSONObject.optString("body1");
        this.Afm = localJSONObject.optString("body2");
        this.Afn = localJSONObject.optString("button");
        AppMethodBeat.o(49036);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.CrtRtnWoding", "crtwoding error %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(49036);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.c
 * JD-Core Version:    0.6.2
 */