package com.tencent.mm.plugin.appbrand.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Locale;
import org.json.JSONObject;

public final class d
{
  public static void a(boolean paramBoolean, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(117340);
    b(paramJSONObject, "useXWebVideo", Boolean.valueOf(paramBoolean));
    b(paramJSONObject, "XWebVideoMinVersion", Integer.valueOf(300));
    AppMethodBeat.o(117340);
  }

  private static void b(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    AppMethodBeat.i(117342);
    try
    {
      paramJSONObject.put(paramString, paramObject);
      AppMethodBeat.o(117342);
      return;
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandExtendPluginUtil", "build json object fail", new Object[] { paramJSONObject });
        AppMethodBeat.o(117342);
      }
    }
  }

  public static void b(boolean paramBoolean, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(117341);
    b(paramJSONObject, "useXWebMap", Boolean.valueOf(paramBoolean));
    AppMethodBeat.o(117341);
  }

  public static String bc(String paramString, int paramInt)
  {
    AppMethodBeat.i(117339);
    paramString = String.format(Locale.US, "%s#%d", new Object[] { paramString, Integer.valueOf(paramInt) });
    AppMethodBeat.o(117339);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.e.d
 * JD-Core Version:    0.6.2
 */