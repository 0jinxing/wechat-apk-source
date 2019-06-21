package com.tencent.luggage.bridge;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class g
{
  private JSONObject bOf;
  private String bOr;
  int bOs;
  boolean bOt;

  g(m paramm)
  {
    AppMethodBeat.i(90723);
    paramm = paramm.wK();
    this.bOr = paramm.getString("method");
    this.bOf = paramm.optJSONObject("data");
    if (this.bOf == null)
      this.bOf = new JSONObject();
    this.bOs = paramm.optInt("callbackId", 0);
    this.bOt = paramm.optBoolean("keepCallback", false);
    AppMethodBeat.o(90723);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.g
 * JD-Core Version:    0.6.2
 */