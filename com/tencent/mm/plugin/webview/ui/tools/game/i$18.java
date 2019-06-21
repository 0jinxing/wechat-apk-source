package com.tencent.mm.plugin.webview.ui.tools.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelstat.d;
import com.tencent.mm.plugin.downloader_app.a.a.a;
import com.tencent.mm.plugin.downloader_app.a.a.b;
import org.json.JSONException;
import org.json.JSONObject;

final class i$18
  implements a.b
{
  i$18(i.a parama)
  {
  }

  public final void a(a.a parama, long paramLong)
  {
    AppMethodBeat.i(8798);
    JSONObject localJSONObject = new JSONObject();
    if (parama == a.a.kNZ)
      d.b(10, "LuggageGameWebViewUI_addGameDownloadTask", "JsApiGameDownloadManager".hashCode());
    while (true)
    {
      try
      {
        localJSONObject.put("download_id", paramLong);
        this.uEo.d(null, localJSONObject);
        AppMethodBeat.o(8798);
        return;
      }
      catch (JSONException parama)
      {
        this.uEo.d(null, null);
        AppMethodBeat.o(8798);
        continue;
      }
      if (parama == a.a.kOb)
      {
        try
        {
          localJSONObject.put("download_id", paramLong);
          localJSONObject.put("reserve_for_wifi", 1);
          this.uEo.d(null, localJSONObject);
          AppMethodBeat.o(8798);
        }
        catch (JSONException parama)
        {
          this.uEo.d(null, null);
          AppMethodBeat.o(8798);
        }
      }
      else if (parama == a.a.kOc)
      {
        this.uEo.d("cancel", null);
        AppMethodBeat.o(8798);
      }
      else
      {
        if (parama == a.a.kOa)
          this.uEo.d("fail", null);
        AppMethodBeat.o(8798);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.i.18
 * JD-Core Version:    0.6.2
 */