package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class af extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    int i = 0;
    AppMethodBeat.i(6340);
    ab.i("MicroMsg.JsApiOpenCustomWebView", "invokeInOwn");
    String str1 = parama.bPa.bOf.optString("url");
    if (bo.isNullOrNil(str1))
    {
      parama.a("invalid_url", null);
      AppMethodBeat.o(6340);
      return;
    }
    ab.i("MicroMsg.JsApiOpenCustomWebView", "url: %s", new Object[] { str1 });
    Object localObject = parama.bPa.bOf.optString("orientation");
    if (!bo.isNullOrNil((String)localObject))
      if (!((String)localObject).equals("horizontal"));
    while (true)
    {
      boolean bool1 = parama.bPa.bOf.optBoolean("fullscreen");
      boolean bool2 = parama.bPa.bOf.optString("finish_recent_webview").equals("1");
      boolean bool3 = parama.bPa.bOf.optString("disable_swipe_back").equals("1");
      String str2 = parama.bPa.bOf.optString("username");
      localObject = new Bundle();
      ((Bundle)localObject).putString("rawUrl", str1);
      ((Bundle)localObject).putInt("screen_orientation", i);
      ((Bundle)localObject).putBoolean("show_full_screen", bool1);
      ((Bundle)localObject).putBoolean("disable_swipe_back", bool3);
      ((Bundle)localObject).putString("shortcut_user_name", str2);
      ((Bundle)localObject).putString("game_hv_menu_appid", bo.nullAsNil(parama.bPa.bOf.optString("gameAppid")));
      al.d(new af.1(this, bool2, parama, str1, (Bundle)localObject));
      parama.a("", null);
      AppMethodBeat.o(6340);
      break;
      if (((String)localObject).equals("vertical"))
        i = 1;
      else
        i = -1;
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "openCustomWebview";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.af
 * JD-Core Version:    0.6.2
 */