package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.webview.luggage.c.c;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class ab extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    int i = 1;
    AppMethodBeat.i(6330);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.JsApiLaunchMiniProgram", "invoke");
    JSONObject localJSONObject = c.AI(paramString);
    if (localJSONObject == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.JsApiLaunchMiniProgram", "data is null");
      parama.d("fail_null_data", null);
      AppMethodBeat.o(6330);
    }
    String str1;
    String str2;
    while (true)
    {
      return;
      str1 = localJSONObject.optString("targetAppId");
      str2 = localJSONObject.optString("currentUrl");
      str3 = localJSONObject.optString("preVerifyAppId");
      paramString = str3;
      if (bo.isNullOrNil(str3))
        paramString = localJSONObject.optString("referrerAppId");
      if (bo.isNullOrNil(str1))
      {
        parama.d("invalid_targetAppId", null);
        AppMethodBeat.o(6330);
      }
      else
      {
        if (!bo.isNullOrNil(paramString))
          break;
        parama.d("invalid_referrerAppId", null);
        AppMethodBeat.o(6330);
      }
    }
    String str3 = bo.nullAsNil(localJSONObject.optString("envVersion"));
    int j = -1;
    switch (str3.hashCode())
    {
    default:
      label188: switch (j)
      {
      default:
      case 0:
      case 1:
      }
      break;
    case 1559690845:
    case 110628630:
    }
    for (i = 0; ; i = 2)
    {
      str3 = localJSONObject.optString("path");
      ((e)g.K(e.class)).b(paramContext, str2, paramString, str1, i, str3, 0);
      parama.d(null, null);
      AppMethodBeat.o(6330);
      break;
      if (!str3.equals("develop"))
        break label188;
      j = 0;
      break label188;
      if (!str3.equals("trial"))
        break label188;
      j = 1;
      break label188;
    }
  }

  public final void b(a<d>.a parama)
  {
  }

  public final int biG()
  {
    return 2;
  }

  public final String name()
  {
    return "launchMiniProgram";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ab
 * JD-Core Version:    0.6.2
 */