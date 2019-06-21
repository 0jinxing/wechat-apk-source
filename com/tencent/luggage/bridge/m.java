package com.tencent.luggage.bridge;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class m extends a
{
  m(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(90729);
    this.bOe = b.valueOf(paramJSONObject.getString("type"));
    this.bOf = paramJSONObject.optJSONObject("data");
    if (this.bOf == null)
      this.bOf = new JSONObject();
    AppMethodBeat.o(90729);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.m
 * JD-Core Version:    0.6.2
 */