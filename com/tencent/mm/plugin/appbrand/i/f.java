package com.tencent.mm.plugin.appbrand.i;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.plugin.appbrand.config.c;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

public enum f
  implements n
{
  static
  {
    AppMethodBeat.i(132305);
    inF = new f("INSTANCE");
    inG = new f[] { inF };
    AppMethodBeat.o(132305);
  }

  public static Long cF(String paramString1, String paramString2)
  {
    AppMethodBeat.i(132303);
    String str = com.tencent.mm.plugin.appbrand.app.f.xH().get(cG(paramString1, paramString2), "");
    if (TextUtils.isEmpty(str))
    {
      paramString1 = null;
      AppMethodBeat.o(132303);
    }
    while (true)
    {
      return paramString1;
      if (Long.valueOf(str).longValue() < System.currentTimeMillis())
      {
        com.tencent.mm.plugin.appbrand.app.f.xH().pI(cG(paramString1, paramString2));
        ab.i("MicroMsg.WxaWeAppPushCommandMgr", "delete data app id=".concat(String.valueOf(paramString1)));
      }
      paramString1 = Long.valueOf(str);
      AppMethodBeat.o(132303);
    }
  }

  private static String cG(String paramString1, String paramString2)
  {
    AppMethodBeat.i(132304);
    paramString1 = paramString1 + "#WxaWeAppPushCommandMgr#" + paramString2;
    AppMethodBeat.o(132304);
    return paramString1;
  }

  public final e.b a(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(132302);
    int i;
    if ("WeAppPushCommand".equals(paramString))
    {
      paramString = ".sysmsg.WeAppPushCommand.weapp";
      i = 0;
    }
    label172: label192: label336: 
    while (true)
    {
      parama = (String)paramMap.get(paramString + ".$cmdtype");
      String str = (String)paramMap.get(paramString + ".$appid");
      paramString = (String)paramMap.get(paramString + ".expireSeconds");
      int j;
      if ((!TextUtils.isEmpty(parama)) && (!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(paramString)) && (TextUtils.isDigitsOnly(paramString)))
      {
        j = 1;
        if (j != 0)
          j = -1;
        switch (parama.hashCode())
        {
        default:
          switch (j)
          {
          default:
            ab.i("MicroMsg.WxaWeAppPushCommandMgr", "[consumeNewXml] index = %d, appId =%s, cmdType=%s, expireSeconds = %s", new Object[] { Integer.valueOf(i), str, parama, paramString });
            i++;
            if (i != 0);
            break;
          case 0:
          }
          break;
        case -505130726:
        }
      }
      for (paramString = ".sysmsg.WeAppPushCommand.weapp"; ; paramString = ".sysmsg.WeAppPushCommand.weapp" + i)
      {
        if (paramMap.containsKey(paramString))
          break label336;
        AppMethodBeat.o(132302);
        return null;
        j = 0;
        break;
        if (!parama.equals("copypath"))
          break label172;
        j = 0;
        break label172;
        long l = Long.valueOf(paramString).longValue();
        com.tencent.mm.plugin.appbrand.app.f.xH().bG(cG(str, "copypath"), String.valueOf(l * 1000L + System.currentTimeMillis()));
        break label192;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.f
 * JD-Core Version:    0.6.2
 */