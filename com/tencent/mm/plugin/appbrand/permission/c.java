package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
{
  private static Set<String> iwi;

  static
  {
    AppMethodBeat.i(102245);
    HashSet localHashSet = new HashSet();
    iwi = localHashSet;
    localHashSet.add("operateLivePlayer");
    iwi.add("operateLivePusher");
    AppMethodBeat.o(102245);
  }

  static int c(com.tencent.mm.plugin.appbrand.jsapi.c paramc, String paramString1, String paramString2)
  {
    int i = -2147483648;
    AppMethodBeat.i(102244);
    boolean bool;
    if ((paramc instanceof u))
    {
      bool = true;
      if (bool)
        break label44;
      AppMethodBeat.o(102244);
    }
    while (true)
    {
      return i;
      bool = iwi.contains(paramString1);
      break;
      label44: if (bo.isNullOrNil(paramString2))
        AppMethodBeat.o(102244);
      else
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(paramString2);
          bool = localJSONObject.has("permissionBytes");
          if (!bool)
          {
            AppMethodBeat.o(102244);
          }
          else
          {
            paramString2 = localJSONObject.getJSONArray("permissionBytes");
            if (paramString2.length() >= 3)
              break label164;
            ab.w("MicroMsg.AppRuntimeApiPermissionController", "permissionBytes length:%d invalid", new Object[] { Integer.valueOf(paramString2.length()) });
            AppMethodBeat.o(102244);
          }
        }
        catch (Exception paramc)
        {
          ab.e("MicroMsg.AppRuntimeApiPermissionController", "checkWithSkipStrategy exp:%s", new Object[] { paramc.getMessage() });
          AppMethodBeat.o(102244);
        }
    }
    label164: if ((paramc instanceof q))
      switch (c.1.gWN[((q)paramc).getRuntime().gNN.gWy.awz().ordinal()])
      {
      default:
        i = paramString2.optInt(0, -2147483648);
      case 1:
      case 2:
      case 3:
      }
    while (true)
    {
      ab.i("MicroMsg.AppRuntimeApiPermissionController", "checkWithSkipStrategy api:%s checkRet:%d", new Object[] { paramString1, Integer.valueOf(i) });
      AppMethodBeat.o(102244);
      break;
      i = paramString2.optInt(2, -2147483648);
      continue;
      i = paramString2.optInt(1, -2147483648);
      continue;
      i = paramString2.optInt(0, -2147483648);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.c
 * JD-Core Version:    0.6.2
 */