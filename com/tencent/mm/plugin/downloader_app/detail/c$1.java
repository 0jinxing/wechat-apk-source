package com.tencent.mm.plugin.downloader_app.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class c$1 extends com.tencent.luggage.d.c
{
  c$1(c paramc, String paramString)
  {
  }

  public final String name()
  {
    return "activity:state_change";
  }

  public final JSONObject wQ()
  {
    AppMethodBeat.i(136043);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("state", this.kOj);
      label24: AppMethodBeat.o(136043);
      return localJSONObject;
    }
    catch (Exception localException)
    {
      break label24;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.c.1
 * JD-Core Version:    0.6.2
 */