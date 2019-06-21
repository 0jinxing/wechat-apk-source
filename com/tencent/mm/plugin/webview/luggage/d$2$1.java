package com.tencent.mm.plugin.webview.luggage;

import com.tencent.luggage.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

final class d$2$1 extends c
{
  d$2$1(d.2 param2, String paramString)
  {
  }

  public final String name()
  {
    return "onGetSmiley";
  }

  public final JSONObject wQ()
  {
    AppMethodBeat.i(6003);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("smiley", this.uiz);
      label25: AppMethodBeat.o(6003);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      break label25;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.2.1
 * JD-Core Version:    0.6.2
 */