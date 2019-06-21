package com.tencent.mm.plugin.webview.luggage;

import com.tencent.luggage.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class d$21 extends c
{
  d$21(d paramd, String paramString)
  {
  }

  public final String name()
  {
    return "activity:state_change";
  }

  public final JSONObject wQ()
  {
    AppMethodBeat.i(6043);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("state", this.kOj);
      label25: AppMethodBeat.o(6043);
      return localJSONObject;
    }
    catch (Exception localException)
    {
      break label25;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.21
 * JD-Core Version:    0.6.2
 */