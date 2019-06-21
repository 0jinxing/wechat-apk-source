package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class as extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6373);
    ab.i("MicroMsg.JsApiSetNavigationBarButtons", "invokeInOwn");
    String str1 = parama.bPa.bOf.optString("left");
    String str2 = parama.bPa.bOf.optString("right");
    if ((bo.isNullOrNil(str1)) && (bo.isNullOrNil(str2)))
    {
      parama.a("fail", null);
      AppMethodBeat.o(6373);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(str1);
        localObject = ((JSONObject)localObject).optString("color", "");
        if (!bo.isNullOrNil((String)localObject))
          localBundle.putString("set_navigation_bar_buttons_left_text_color", (String)localObject);
      }
      catch (Exception localException2)
      {
        try
        {
          label115: Object localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(str2);
          boolean bool1 = ((JSONObject)localObject).optBoolean("hidden", false);
          str1 = ((JSONObject)localObject).optString("text", "");
          String str3 = bo.nullAsNil(u.akm(((JSONObject)localObject).optString("iconData", "")));
          str2 = ((JSONObject)localObject).optString("color", "");
          boolean bool2 = ((JSONObject)localObject).optBoolean("needClickEvent", false);
          if (!bool1)
          {
            localBundle.putString("set_navigation_bar_buttons_text", str1);
            localBundle.putString("set_navigation_bar_buttons_icon_data", str3);
            localBundle.putString("set_navigation_bar_buttons_text_color", str2);
            localBundle.putBoolean("set_navigation_bar_buttons_need_click_event", bool2);
          }
          while (true)
          {
            if (localBundle.size() >= 0)
              break label291;
            parama.a("fail", null);
            AppMethodBeat.o(6373);
            break;
            localException2 = localException2;
            ab.printErrStackTrace("MicroMsg.JsApiSetNavigationBarButtons", localException2, "setNavigationBarButtons opt left ", new Object[0]);
            break label115;
            localBundle.putBoolean("set_navigation_bar_buttons_hide_right_button", true);
          }
        }
        catch (Exception localException1)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.JsApiSetNavigationBarButtons", localException1, "setNavigationBarButtons opt right ", new Object[0]);
          label291: com.tencent.mm.plugin.webview.luggage.k localk = ((d)parama.bOZ).cWH();
          if (localk == null)
          {
            parama.a("fail", null);
            AppMethodBeat.o(6373);
          }
          else
          {
            localk.setNavigationBarButtons(localBundle);
            parama.a("", null);
            AppMethodBeat.o(6373);
          }
        }
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "setNavigationBarButtons";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.as
 * JD-Core Version:    0.6.2
 */