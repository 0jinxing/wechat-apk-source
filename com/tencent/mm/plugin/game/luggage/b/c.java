package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import com.tencent.luggage.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vv;
import com.tencent.mm.plugin.game.luggage.d.e;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.plugin.webview.luggage.jsapi.bd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends bd<e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    int i = 0;
    AppMethodBeat.i(135868);
    ab.i("MicroMsg.JsApiBatchUpdateWepkg", "invokeInMM");
    paramContext = i.bQ(paramString);
    if (paramContext == null)
    {
      ab.e("MicroMsg.JsApiBatchUpdateWepkg", "data is null");
      parama.d("fail", null);
      AppMethodBeat.o(135868);
    }
    while (true)
    {
      return;
      paramString = paramContext.optString("pkgIdList");
      if (!bo.isNullOrNil(paramString))
      {
        try
        {
          paramContext = new org/json/JSONArray;
          paramContext.<init>(paramString);
          if (paramContext.length() > 0)
          {
            paramString = new java/util/ArrayList;
            paramString.<init>();
            while (i < paramContext.length())
            {
              paramString.add(paramContext.optString(i));
              i++;
            }
            if (!bo.ek(paramString))
            {
              paramContext = new com/tencent/mm/g/a/vv;
              paramContext.<init>();
              paramContext.cSX.cuy = 8;
              paramContext.cSX.scene = 0;
              paramContext.cSX.cTc = paramString;
              com.tencent.mm.sdk.b.a.xxA.m(paramContext);
              parama.d(null, null);
              AppMethodBeat.o(135868);
            }
          }
        }
        catch (JSONException paramContext)
        {
          ab.e("MicroMsg.JsApiBatchUpdateWepkg", "data is not json");
        }
      }
      else
      {
        parama.d("fail", null);
        AppMethodBeat.o(135868);
      }
    }
  }

  public final void b(com.tencent.luggage.d.a<e>.a parama)
  {
  }

  public final int biG()
  {
    return 1;
  }

  public final String name()
  {
    return "batchUpdateWepkg";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.c
 * JD-Core Version:    0.6.2
 */