package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.webview.luggage.c.c;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public class r extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6313);
    ab.i("MicroMsg.JsApiGetOpenDeviceId", "invokeInMM");
    paramContext = c.AI(paramString);
    if (paramContext == null)
    {
      ab.e("MicroMsg.JsApiGetOpenDeviceId", "data is null");
      parama.d("fail", null);
      AppMethodBeat.o(6313);
    }
    while (true)
    {
      return;
      String str = paramContext.optString("preVerifyAppId");
      paramContext = q.LK();
      paramString = q.LM();
      if ((!bo.isNullOrNil(paramContext)) && (!bo.isNullOrNil(paramString)) && (!bo.isNullOrNil(str)))
      {
        paramContext = ag.ck(ag.ck(str + paramContext));
        str = ag.ck(ag.ck(str + paramString));
        paramString = new JSONObject();
      }
      try
      {
        paramString.put("deviceid", paramContext);
        paramString.put("newDeviceId", str);
        label159: parama.d(null, paramString);
        AppMethodBeat.o(6313);
        continue;
        parama.d("fail", null);
        AppMethodBeat.o(6313);
      }
      catch (JSONException paramContext)
      {
        break label159;
      }
    }
  }

  public final void b(a<d>.a parama)
  {
  }

  public final int biG()
  {
    return 1;
  }

  public final String name()
  {
    return "getOpenDeviceId";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.r
 * JD-Core Version:    0.6.2
 */