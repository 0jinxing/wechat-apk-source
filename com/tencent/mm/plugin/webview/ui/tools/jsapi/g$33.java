package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.game.i.a;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

final class g$33
  implements i.a
{
  g$33(g paramg, i parami)
  {
  }

  public final void d(String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(9083);
    if (!bo.isNullOrNil(paramString))
    {
      g.a(this.uHd, this.uqf, this.uqf.uIJ + ":fail_" + paramString, null);
      AppMethodBeat.o(9083);
    }
    while (true)
    {
      return;
      g.a(this.uHd, this.uqf, this.uqf.uIJ + ":ok", g.aQ(paramJSONObject));
      AppMethodBeat.o(9083);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.33
 * JD-Core Version:    0.6.2
 */