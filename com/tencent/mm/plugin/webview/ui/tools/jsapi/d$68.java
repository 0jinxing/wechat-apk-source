package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

final class d$68
  implements Runnable
{
  d$68(d paramd, Bundle paramBundle, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8932);
    i locali = new i();
    locali.puc = new HashMap();
    locali.puc.put("link", this.cgJ.getString("link"));
    locali.puc.put("title", this.cgJ.getString("title"));
    locali.puc.put("desc", this.cgJ.getString("desc"));
    locali.uIH = new JSONObject();
    locali.puc.put("img_url", this.cgJ.getString("img_url"));
    locali.puc.put("use_update_jsapi_data", Boolean.valueOf(this.cgJ.getBoolean("use_update_jsapi_data")));
    locali.type = "call";
    locali.uIG = "";
    locali.uIJ = this.uFR;
    d.e(this.uFI).add(locali);
    d.f(this.uFI);
    AppMethodBeat.o(8932);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.d.68
 * JD-Core Version:    0.6.2
 */