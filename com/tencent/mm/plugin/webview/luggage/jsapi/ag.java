package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class ag extends bd<com.tencent.mm.plugin.webview.luggage.d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<com.tencent.mm.plugin.webview.luggage.d>.a parama)
  {
    AppMethodBeat.i(6342);
    ab.i("MicroMsg.JsApiOpenUrlWithExtraWebview", "invokeInOwn");
    String str = parama.bPa.bOf.optString("url");
    ab.i("MicroMsg.JsApiOpenUrlWithExtraWebview", "url: %s", new Object[] { str });
    if (bo.isNullOrNil(str))
    {
      parama.a("fail", null);
      AppMethodBeat.o(6342);
    }
    while (true)
    {
      return;
      Object localObject = Uri.parse(str);
      if ((((Uri)localObject).getHost() != null) && (!((Uri)localObject).getHost().equals("game.weixin.qq.com")))
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("rawUrl", str);
        com.tencent.mm.bp.d.b(((com.tencent.mm.plugin.webview.luggage.d)parama.bOZ).mContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
        parama.a("", null);
        AppMethodBeat.o(6342);
      }
      else
      {
        al.d(new ag.1(this, str, parama));
        parama.a("", null);
        AppMethodBeat.o(6342);
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "openUrlWithExtraWebview";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ag
 * JD-Core Version:    0.6.2
 */