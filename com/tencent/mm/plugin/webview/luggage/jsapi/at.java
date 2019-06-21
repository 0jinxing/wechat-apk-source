package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.graphics.Color;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class at extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6374);
    ab.i("MicroMsg.JsApiSetNavigationBarColor", "invoke");
    int i;
    if (parama.bPa.bOf.optInt("actionCode") == 1)
      i = 1;
    while (true)
    {
      int j = -1;
      try
      {
        int k = Color.parseColor(parama.bPa.bOf.optString("color"));
        j = k | 0xFF000000;
      }
      catch (Exception localException1)
      {
        try
        {
          while (true)
          {
            bo.getFloat(parama.bPa.bOf.optString("alpha"), 1.0F);
            if (i == 0)
              break label138;
            ((d)parama.bOZ).aBj();
            parama.a("", null);
            AppMethodBeat.o(6374);
            return;
            i = 0;
            break;
            localException1 = localException1;
            ab.e("MicroMsg.JsApiSetNavigationBarColor", localException1.getMessage());
            i = 1;
          }
        }
        catch (Exception localException2)
        {
          while (true)
          {
            ab.e("MicroMsg.JsApiSetNavigationBarColor", localException2.getMessage());
            continue;
            label138: ((d)parama.bOZ).setStatusBarColor(j);
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
    return "setNavigationBarColor";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.at
 * JD-Core Version:    0.6.2
 */