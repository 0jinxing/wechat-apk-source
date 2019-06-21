package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.model.g.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class g$35$1
  implements g.a
{
  g$35$1(g.35 param35)
  {
  }

  public final void U(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(9085);
    HashMap localHashMap = new HashMap();
    localHashMap.put("wepkg_info", paramJSONObject);
    g.a(this.uHF.uHd, this.uHF.uqf, "getLocalWePkgInfo:ok", localHashMap);
    AppMethodBeat.o(9085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.35.1
 * JD-Core Version:    0.6.2
 */