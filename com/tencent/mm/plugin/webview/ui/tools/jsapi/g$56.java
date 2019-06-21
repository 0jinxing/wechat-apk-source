package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.game.i.a;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

final class g$56
  implements i.a
{
  g$56(g paramg, i parami)
  {
  }

  public final void d(String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(9116);
    if (!bo.isNullOrNil(paramString))
    {
      g.a(this.uHd, this.uqf, this.uqf.uIJ + ":fail_" + paramString, null);
      AppMethodBeat.o(9116);
    }
    while (true)
    {
      return;
      g.a(this.uHd, this.uqf, this.uqf.uIJ + ":ok", g.aQ(paramJSONObject));
      AppMethodBeat.o(9116);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.56
 * JD-Core Version:    0.6.2
 */