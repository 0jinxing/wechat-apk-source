package com.tencent.luggage.bridge;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import org.json.JSONObject;

class e extends a
{
  protected e(b paramb)
  {
    AppMethodBeat.i(90717);
    this.bOe = paramb;
    this.bOf = new JSONObject();
    AppMethodBeat.o(90717);
  }

  final void c(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(90718);
    this.bOf = new JSONObject(paramMap);
    AppMethodBeat.o(90718);
  }

  final void c(JSONObject paramJSONObject)
  {
    this.bOf = paramJSONObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.e
 * JD-Core Version:    0.6.2
 */