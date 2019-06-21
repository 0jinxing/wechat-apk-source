package com.tencent.mm.plugin.webview.ui.tools.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.a.a.a;
import com.tencent.mm.plugin.downloader_app.a.a.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import org.json.JSONException;
import org.json.JSONObject;

final class i$7
  implements a.b
{
  i$7(boolean paramBoolean, i.a parama)
  {
  }

  public final void a(a.a parama, long paramLong)
  {
    AppMethodBeat.i(8787);
    if (parama == a.a.kNZ)
      parama = new JSONObject();
    try
    {
      parama.put("download_id", paramLong);
      if ((this.uEp) && (!at.isWifi(ah.getContext())))
        parama.put("reserve_for_wifi", 1);
      label53: this.uEo.d(null, parama);
      AppMethodBeat.o(8787);
      while (true)
      {
        return;
        if (parama == a.a.kOc)
        {
          this.uEo.d("cancel", null);
          AppMethodBeat.o(8787);
        }
        else
        {
          this.uEo.d("fail", null);
          AppMethodBeat.o(8787);
        }
      }
    }
    catch (JSONException localJSONException)
    {
      break label53;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.i.7
 * JD-Core Version:    0.6.2
 */