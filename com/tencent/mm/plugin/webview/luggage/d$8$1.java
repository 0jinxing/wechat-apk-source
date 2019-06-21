package com.tencent.mm.plugin.webview.luggage;

import com.tencent.luggage.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class d$8$1 extends c
{
  d$8$1(d.8 param8)
  {
  }

  public final String name()
  {
    return "onGetKeyboardHeight";
  }

  public final JSONObject wQ()
  {
    AppMethodBeat.i(6016);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("height", 0);
      label22: AppMethodBeat.o(6016);
      return localJSONObject;
    }
    catch (Exception localException)
    {
      break label22;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.8.1
 * JD-Core Version:    0.6.2
 */