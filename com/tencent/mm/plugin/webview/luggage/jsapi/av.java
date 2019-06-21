package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class av extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    int i = 1;
    AppMethodBeat.i(6376);
    ab.i("MicroMsg.JsApiSetScreenOrientation", "invoke");
    String str = parama.bPa.bOf.optString("orientation");
    if (bo.isNullOrNil(str))
    {
      ab.e("MicroMsg.JsApiSetScreenOrientation", "data is null");
      parama.a("invalid_data", null);
      AppMethodBeat.o(6376);
      return;
    }
    int j;
    if (str.equals("horizontal"))
      j = 0;
    while (true)
    {
      ((d)parama.bOZ).setPageOrientation(j);
      parama.a("", null);
      AppMethodBeat.o(6376);
      break;
      j = i;
      if (!str.equals("vertical"))
        if (str.equals("sensor"))
        {
          j = 4;
        }
        else if (str.equals("horizontal_unforced"))
        {
          j = 0;
        }
        else
        {
          j = i;
          if (!str.equals("vertical_unforced"))
            j = -1;
        }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "setScreenOrientation";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.av
 * JD-Core Version:    0.6.2
 */