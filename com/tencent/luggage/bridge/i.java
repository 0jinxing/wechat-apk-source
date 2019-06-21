package com.tencent.luggage.bridge;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class i
{
  String bOu;
  private JSONObject bOv;

  i(m paramm)
  {
    AppMethodBeat.i(90724);
    paramm = paramm.wK();
    this.bOu = paramm.getString("event");
    this.bOv = paramm.optJSONObject("data");
    if (this.bOv == null)
      this.bOv = new JSONObject();
    AppMethodBeat.o(90724);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.i
 * JD-Core Version:    0.6.2
 */