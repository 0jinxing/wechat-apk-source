package com.tencent.mm.plugin.game.e;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.c;
import com.tencent.mm.game.report.api.d;
import com.tencent.mm.game.report.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
  {
    AppMethodBeat.i(111691);
    a(paramContext, paramInt1, paramInt2, paramInt3, paramInt4, 0, null, paramInt5, 0, null, null, paramString);
    AppMethodBeat.o(111691);
  }

  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString1, int paramInt6, int paramInt7, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(111694);
    paramContext = d.b(12909, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), paramString1, Integer.valueOf(paramInt6), Integer.valueOf(paramInt7), paramString2, Integer.valueOf(bo.getInt(paramString3, 0)), Integer.valueOf(a.getNetworkType(paramContext)), paramString4 });
    c.eBG.a(paramContext);
    AppMethodBeat.o(111694);
  }

  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, int paramInt5, String paramString2)
  {
    AppMethodBeat.i(111692);
    a(paramContext, paramInt1, paramInt2, paramInt3, paramInt4, 0, paramString1, paramInt5, 0, null, null, paramString2);
    AppMethodBeat.o(111692);
  }

  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, int paramInt5, String paramString2, String paramString3)
  {
    AppMethodBeat.i(111693);
    a(paramContext, paramInt1, paramInt2, paramInt3, paramInt4, 0, paramString1, paramInt5, 0, null, paramString2, paramString3);
    AppMethodBeat.o(111693);
  }

  public static String eA(String paramString1, String paramString2)
  {
    AppMethodBeat.i(111695);
    if (paramString2 == null)
    {
      paramString1 = null;
      AppMethodBeat.o(111695);
    }
    while (true)
    {
      return paramString1;
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("function_type", paramString1);
        localJSONObject.put("function_value", paramString2);
        label42: paramString1 = a.kY(localJSONObject.toString());
        AppMethodBeat.o(111695);
      }
      catch (JSONException paramString1)
      {
        break label42;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.e.b
 * JD-Core Version:    0.6.2
 */