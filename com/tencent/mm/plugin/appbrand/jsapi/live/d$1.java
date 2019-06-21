package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

final class d$1
  implements b.a
{
  d$1(d paramd, AppBrandLivePusherView paramAppBrandLivePusherView, String paramString)
  {
  }

  public final void AN(String paramString)
  {
    AppMethodBeat.i(96112);
    JSONObject localJSONObject;
    if (!bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, local file path:%s", new Object[] { paramString });
      localJSONObject = new JSONObject();
    }
    while (true)
    {
      try
      {
        localJSONObject.put("BGMFilePath", paramString);
        if (!this.hLx.b("playBGM", localJSONObject))
        {
          ab.e("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, play bgm fail, url:%s", new Object[] { this.val$url });
          paramString = new HashMap();
          paramString.put("url", this.val$url);
          this.hLx.a(10003, "download file fail", paramString);
        }
        AppMethodBeat.o(96112);
        return;
      }
      catch (JSONException paramString)
      {
        ab.e("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, set param fail", new Object[] { paramString });
        continue;
      }
      ab.e("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, download file fail, url:%s", new Object[] { this.val$url });
      paramString = new HashMap();
      paramString.put("url", this.val$url);
      this.hLx.a(10003, "download file fail", paramString);
      AppMethodBeat.o(96112);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.d.1
 * JD-Core Version:    0.6.2
 */