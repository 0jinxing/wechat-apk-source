package com.tencent.luggage.bridge;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class k
{
  public JSONObject bOf;
  String bOr;
  public int bOs;
  private boolean bOt;
  private f bOw;
  boolean bOx;
  public String bOy;
  public JSONObject bOz;

  k(f paramf, m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(90725);
    this.bOw = paramf;
    paramf = paramm.wK();
    this.bOr = paramf.getString("method");
    this.bOf = paramf.optJSONObject("data");
    if (this.bOf == null)
      this.bOf = new JSONObject("{}");
    this.bOx = paramBoolean;
    this.bOs = paramf.optInt("callbackId", 0);
    this.bOt = false;
    this.bOz = new JSONObject();
    AppMethodBeat.o(90725);
  }

  public final void a(String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(90726);
    String str = paramString;
    if (paramString == null)
      str = "";
    this.bOy = str;
    if (paramJSONObject != null);
    while (true)
    {
      this.bOz = paramJSONObject;
      if (this.bOs != 0)
        wM();
      AppMethodBeat.o(90726);
      return;
      paramJSONObject = new JSONObject();
    }
  }

  public final void wM()
  {
    AppMethodBeat.i(90727);
    this.bOw.a(wN());
    AppMethodBeat.o(90727);
  }

  final e wN()
  {
    AppMethodBeat.i(90728);
    c localc = new c(this.bOs, this.bOy, this.bOz, this.bOt);
    AppMethodBeat.o(90728);
    return localc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.k
 * JD-Core Version:    0.6.2
 */