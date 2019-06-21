package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gx;
import com.tencent.mm.g.a.gx.b;
import com.tencent.mm.plugin.game.luggage.d.e;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.plugin.webview.luggage.jsapi.bd;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public class n extends bd<e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(135884);
    ab.i("MicroMsg.JsApiOperateGameCenterMsg", "invokeInMM");
    paramContext = i.bQ(paramString);
    if (paramContext == null)
    {
      ab.i("MicroMsg.JsApiOperateGameCenterMsg", "data is null");
      parama.d("invalid_data", null);
      AppMethodBeat.o(135884);
    }
    while (true)
    {
      return;
      int i = paramContext.optInt("cmd");
      paramString = paramContext.optJSONObject("param");
      paramContext = new gx();
      paramContext.cBD.Cn = i;
      paramContext.cBD.cBy = paramString.toString();
      a.xxA.m(paramContext);
      paramString = new JSONObject();
      try
      {
        paramString.put("result", bo.nullAsNil(paramContext.cBE.cBF));
        label117: parama.d(null, paramString);
        AppMethodBeat.o(135884);
      }
      catch (JSONException paramContext)
      {
        break label117;
      }
    }
  }

  public final void b(a.a parama)
  {
  }

  public final int biG()
  {
    return 1;
  }

  public final String name()
  {
    return "operateGameCenterMsg";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.n
 * JD-Core Version:    0.6.2
 */