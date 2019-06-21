package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.game.i.a;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

final class g$64
  implements i.a
{
  g$64(g paramg, i parami)
  {
  }

  public final void d(String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(9125);
    if (bo.isNullOrNil(paramString))
      g.a(this.uHd, this.uqf, "resume_download_task:ok", g.aQ(paramJSONObject));
    AppMethodBeat.o(9125);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.64
 * JD-Core Version:    0.6.2
 */