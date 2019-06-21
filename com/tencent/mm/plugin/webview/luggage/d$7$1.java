package com.tencent.mm.plugin.webview.luggage;

import com.tencent.luggage.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class d$7$1 extends c
{
  d$7$1(d.7 param7)
  {
  }

  public final String name()
  {
    return "onGetKeyboardHeight";
  }

  public final JSONObject wQ()
  {
    AppMethodBeat.i(6014);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("height", this.uiC.uiB);
      label28: AppMethodBeat.o(6014);
      return localJSONObject;
    }
    catch (Exception localException)
    {
      break label28;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.7.1
 * JD-Core Version:    0.6.2
 */