package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class n
{
  private static String DA(String paramString)
  {
    AppMethodBeat.i(9858);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(9858);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = bo.nullAsNil(q.encode(paramString));
        AppMethodBeat.o(9858);
      }
      catch (Exception paramString)
      {
        paramString = "";
        AppMethodBeat.o(9858);
      }
    }
  }

  private static String a(i parami, String paramString)
  {
    AppMethodBeat.i(9857);
    if ((parami.uII == null) || (!parami.uII.containsKey(paramString)))
    {
      parami = "";
      AppMethodBeat.o(9857);
    }
    while (true)
    {
      return parami;
      parami = String.valueOf(parami.uII.get(paramString));
      AppMethodBeat.o(9857);
    }
  }

  public static void a(e parame, String paramString, i parami)
  {
    AppMethodBeat.i(9855);
    if (parame == null)
      AppMethodBeat.o(9855);
    label60: String[] arrayOfString;
    while (true)
    {
      return;
      try
      {
        parame = parame.g(145, null);
        if (parame != null)
          break label60;
        AppMethodBeat.o(9855);
      }
      catch (Exception parame)
      {
        ab.e("kv_14993", String.valueOf(parame));
        AppMethodBeat.o(9855);
      }
      continue;
      arrayOfString = parame.getStringArray("key_webview_apbrand_jsapi_report_args");
      if ((arrayOfString != null) && (arrayOfString.length == 19))
        break;
      AppMethodBeat.o(9855);
    }
    arrayOfString[10] = paramString;
    arrayOfString[11] = b(paramString, parami);
    if ("true".equals(a(parami, "isSuccess")));
    for (parame = "1"; ; parame = "2")
    {
      arrayOfString[12] = parame;
      arrayOfString[13] = a(parami, "permissionValue");
      arrayOfString[14] = a(parami, "jsapiErrorCode");
      h.pYm.e(14993, k(arrayOfString));
      AppMethodBeat.o(9855);
      break;
    }
  }

  private static String b(String paramString, i parami)
  {
    AppMethodBeat.i(9856);
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (i)
      {
      default:
        paramString = "";
        AppMethodBeat.o(9856);
      case 0:
      }
      break;
    case -1008737020:
    }
    while (true)
    {
      return paramString;
      if (!paramString.equals("getBrandWCPayRequest"))
        break;
      i = 0;
      break;
      paramString = parami.puc.get("package").toString();
      AppMethodBeat.o(9856);
    }
  }

  private static Object[] k(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(9859);
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0))
    {
      paramArrayOfObject = new Object[0];
      AppMethodBeat.o(9859);
    }
    while (true)
    {
      return paramArrayOfObject;
      Object[] arrayOfObject = new Object[paramArrayOfObject.length];
      int i = paramArrayOfObject.length;
      int j = 0;
      int k = 0;
      if (j < i)
      {
        Object localObject1 = paramArrayOfObject[j];
        Object localObject2;
        if (localObject1 == null)
          localObject2 = "";
        while (true)
        {
          arrayOfObject[k] = String.valueOf(localObject2);
          j++;
          k++;
          break;
          localObject2 = localObject1;
          if ((localObject1 instanceof String))
            if (!((String)localObject1).contains(","))
            {
              localObject2 = localObject1;
              if (!((String)localObject1).contains("/"));
            }
            else
            {
              localObject2 = DA((String)localObject1);
            }
        }
      }
      AppMethodBeat.o(9859);
      paramArrayOfObject = arrayOfObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.n
 * JD-Core Version:    0.6.2
 */