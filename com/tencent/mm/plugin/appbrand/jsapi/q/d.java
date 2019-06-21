package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class d extends a
{
  public static final int CTRL_INDEX = 39;
  public static final String NAME = "getNetworkType";

  public static d.a cK(Context paramContext)
  {
    AppMethodBeat.i(126412);
    try
    {
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null)
      {
        paramContext = d.a.hXC;
        AppMethodBeat.o(126412);
      }
      while (true)
      {
        return paramContext;
        paramContext = paramContext.getActiveNetworkInfo();
        if ((paramContext == null) || (!paramContext.isConnected()))
        {
          paramContext = d.a.hXx;
          AppMethodBeat.o(126412);
        }
        else if (paramContext.getType() == 1)
        {
          paramContext = d.a.hXB;
          AppMethodBeat.o(126412);
        }
        else if ((paramContext.getSubtype() == 2) || (paramContext.getSubtype() == 1) || (paramContext.getSubtype() == 4))
        {
          paramContext = d.a.hXy;
          AppMethodBeat.o(126412);
        }
        else if ((paramContext.getSubtype() >= 5) && (paramContext.getSubtype() < 13))
        {
          paramContext = d.a.hXz;
          AppMethodBeat.o(126412);
        }
        else
        {
          if (paramContext.getSubtype() < 13)
            break;
          paramContext = d.a.hXA;
          AppMethodBeat.o(126412);
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        com.tencent.luggage.g.d.printErrStackTrace("MicroMsg.JsApiGetNetworkType", paramContext, "", new Object[0]);
        paramContext = d.a.hXC;
        AppMethodBeat.o(126412);
      }
    }
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126410);
    paramJSONObject = new HashMap();
    paramJSONObject.put("networkType", v(paramc).value);
    paramc.M(paramInt, j("ok", paramJSONObject));
    AppMethodBeat.o(126410);
  }

  protected d.a v(c paramc)
  {
    AppMethodBeat.i(126411);
    paramc = cK(paramc.getContext());
    AppMethodBeat.o(126411);
    return paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.d
 * JD-Core Version:    0.6.2
 */