package com.tencent.mm.plugin.downloader_app.detail;

import com.tencent.luggage.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

final class d$3 extends c
{
  d$3(String paramString)
  {
  }

  public final String name()
  {
    return "onDataEnvReady";
  }

  public final JSONObject wQ()
  {
    AppMethodBeat.i(136056);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("appid", this.hxh);
      label24: AppMethodBeat.o(136056);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      break label24;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.d.3
 * JD-Core Version:    0.6.2
 */