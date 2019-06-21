package com.tencent.mm.plugin.webview.luggage.c;

import android.content.Context;
import android.webkit.URLUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.q.a;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class b
{
  private static q.a ulv = null;

  public static JSONObject AI(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(6500);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(6500);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        AppMethodBeat.o(6500);
        paramString = localJSONObject;
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(6500);
        paramString = localObject;
      }
    }
  }

  public static boolean Ed(String paramString)
  {
    AppMethodBeat.i(6501);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && ((URLUtil.isHttpsUrl(paramString)) || (URLUtil.isHttpUrl(paramString))))
    {
      bool = true;
      AppMethodBeat.o(6501);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(6501);
    }
  }

  public static String bh(Context paramContext, String paramString)
  {
    AppMethodBeat.i(6499);
    paramContext = u.bh(paramContext, paramString);
    AppMethodBeat.o(6499);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.c.b
 * JD-Core Version:    0.6.2
 */