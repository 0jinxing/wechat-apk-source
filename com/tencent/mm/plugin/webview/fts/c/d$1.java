package com.tencent.mm.plugin.webview.fts.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class d$1
  implements ap.a
{
  public d$1(d paramd)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(5951);
    try
    {
      int i = this.uhH.uhG.getCurrPosMs();
      int j = Math.abs(i - this.uhH.iat);
      if (j < 250)
        AppMethodBeat.o(5951);
      while (true)
      {
        return true;
        this.uhH.iat = i;
        d locald1 = this.uhH;
        d locald2 = this.uhH;
        d locald3 = this.uhH;
        JSONObject localJSONObject = locald3.aFV();
        localJSONObject.put("currentTime", locald3.uhG.getCurrPosSec());
        locald1.aM(locald2.a(4, localJSONObject));
        AppMethodBeat.o(5951);
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.JsApiVideoCallback", "OnVideoTimeUpdate e=%s", new Object[] { localJSONException });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.c.d.1
 * JD-Core Version:    0.6.2
 */