package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.luggage.d.e;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.plugin.webview.luggage.jsapi.bd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class m extends bd<e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<e>.a parama)
  {
    int i = 0;
    AppMethodBeat.i(135883);
    ab.i("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "invokeInOwn");
    String str1 = parama.bPa.bOf.optString("url");
    if (bo.isNullOrNil(str1))
    {
      ab.e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "url is null");
      parama.a("fail", null);
      AppMethodBeat.o(135883);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "url: %s", new Object[] { str1 });
      Object localObject = parama.bPa.bOf.optString("statusBarColor");
      if (!bo.isNullOrNil((String)localObject));
      try
      {
        i = Color.parseColor((String)localObject);
        String str2 = parama.bPa.bOf.optString("statusBarStyle");
        localObject = new Bundle();
        ((Bundle)localObject).putString("rawUrl", str1);
        ((Bundle)localObject).putInt("customize_status_bar_color", i);
        ((Bundle)localObject).putString("status_bar_style", str2);
        al.d(new m.1(this, parama, str1, (Bundle)localObject));
        parama.a("", null);
        AppMethodBeat.o(135883);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        ab.e("MicroMsg.JsApiOpenGameUrlWithExtraWebView", localIllegalArgumentException.getMessage());
        parama.a("invalid_color", null);
        AppMethodBeat.o(135883);
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "openGameUrlWithExtraWebView";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.m
 * JD-Core Version:    0.6.2
 */