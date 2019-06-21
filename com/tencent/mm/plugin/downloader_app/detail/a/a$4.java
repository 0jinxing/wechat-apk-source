package com.tencent.mm.plugin.downloader_app.detail.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.a.a.a;
import com.tencent.mm.plugin.downloader_app.a.a.b;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import org.json.JSONException;
import org.json.JSONObject;

final class a$4
  implements a.b
{
  a$4(a parama, bc.a parama1)
  {
  }

  public final void a(a.a parama, long paramLong)
  {
    AppMethodBeat.i(136067);
    if (paramLong < 0L)
    {
      this.kOw.d("fail", null);
      AppMethodBeat.o(136067);
    }
    while (true)
    {
      return;
      if (parama == a.a.kNZ)
      {
        try
        {
          parama = new org/json/JSONObject;
          parama.<init>();
          parama.put("download_id", paramLong);
          this.kOw.d(null, parama);
          AppMethodBeat.o(136067);
        }
        catch (JSONException parama)
        {
          this.kOw.d(null, null);
          AppMethodBeat.o(136067);
        }
      }
      else if (parama == a.a.kOa)
      {
        this.kOw.d("fail", null);
        AppMethodBeat.o(136067);
      }
      else if (parama == a.a.kOb)
      {
        try
        {
          parama = new org/json/JSONObject;
          parama.<init>();
          parama.put("download_id", paramLong);
          this.kOw.d("wait_for_wifi", parama);
          AppMethodBeat.o(136067);
        }
        catch (JSONException parama)
        {
          this.kOw.d(null, null);
        }
      }
      else
      {
        AppMethodBeat.o(136067);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.a.a.4
 * JD-Core Version:    0.6.2
 */