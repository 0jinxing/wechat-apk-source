package com.tencent.mm.plugin.websearch.api;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class z
{
  private static final Map<String, Integer> tZW;

  static
  {
    AppMethodBeat.i(124088);
    tZW = new HashMap();
    AppMethodBeat.o(124088);
  }

  private static int HO(int paramInt)
  {
    AppMethodBeat.i(124085);
    switch (paramInt)
    {
    default:
      paramInt = aa.HV(0);
      AppMethodBeat.o(124085);
    case 201:
    case 21:
    }
    while (true)
    {
      return paramInt;
      paramInt = aa.cVc();
      AppMethodBeat.o(124085);
      continue;
      paramInt = aa.HV(1);
      AppMethodBeat.o(124085);
    }
  }

  private static void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, int paramInt4)
  {
    AppMethodBeat.i(124083);
    a(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramInt3, paramBoolean1, paramString4, paramBoolean2, paramString5, paramString6, paramInt4, false);
    AppMethodBeat.o(124083);
  }

  private static void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, int paramInt4, boolean paramBoolean3)
  {
    AppMethodBeat.i(124084);
    int i;
    String str1;
    Object localObject;
    label61: int j;
    label69: long l;
    String str6;
    label109: int k;
    if (paramBoolean2)
    {
      i = 1;
      if ((paramInt1 == 1) || (paramInt1 == 10) || (paramInt1 == 12))
        i = 0;
      str1 = bo.bc(paramString1, "");
      String str2 = bo.bc(paramString2, "");
      if (!TextUtils.isEmpty(paramString3))
        break label497;
      localObject = "";
      if (!paramBoolean1)
        break label504;
      j = 1;
      String str3 = bo.bc(paramString4, "");
      l = System.currentTimeMillis();
      String str4 = cUY();
      String str5 = bo.bc(paramString5, "");
      if (!TextUtils.isEmpty(paramString6))
        break label510;
      str6 = "";
      k = HO(paramInt2);
      if (!paramBoolean3)
        break label517;
      m = 1;
      label123: ab.i("MicroMsg.WebSearch.WebSearchActionTracer", "reporting 14904 %s ", new Object[] { s(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str1, str2, localObject, Integer.valueOf(paramInt3), Integer.valueOf(j), str3, Long.valueOf(l), str4, Integer.valueOf(i), str5, str6, Integer.valueOf(paramInt4), Integer.valueOf(k), Integer.valueOf(m) }) });
      localObject = e.pXa;
      str6 = bo.bc(paramString1, "");
      str1 = bo.bc(paramString2, "");
      paramString1 = paramString3;
      if (TextUtils.isEmpty(paramString3))
        paramString1 = "";
      if (!paramBoolean1)
        break label523;
      j = 1;
      label303: paramString3 = bo.bc(paramString4, "");
      l = System.currentTimeMillis();
      paramString4 = cUY();
      paramString5 = bo.bc(paramString5, "");
      paramString2 = paramString6;
      if (TextUtils.isEmpty(paramString6))
        paramString2 = "";
      k = HO(paramInt2);
      if (!paramBoolean3)
        break label529;
    }
    label517: label523: label529: for (int m = 1; ; m = 0)
    {
      ((e)localObject).e(14904, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str6, str1, paramString1, Integer.valueOf(paramInt3), Integer.valueOf(j), paramString3, Long.valueOf(l), paramString4, Integer.valueOf(i), paramString5, paramString2, Integer.valueOf(paramInt4), Integer.valueOf(k), Integer.valueOf(m) });
      AppMethodBeat.o(124084);
      return;
      i = 2;
      break;
      label497: localObject = paramString3;
      break label61;
      label504: j = 0;
      break label69;
      label510: str6 = paramString6;
      break label109;
      m = 0;
      break label123;
      j = 0;
      break label303;
    }
  }

  public static void a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, boolean paramBoolean, String paramString4, String paramString5, int paramInt3)
  {
    AppMethodBeat.i(124075);
    a(paramInt1, paramString1, paramString2, paramString3, paramInt2, paramBoolean, paramString4, paramString5, paramInt3, "");
    AppMethodBeat.o(124075);
  }

  public static void a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, boolean paramBoolean, String paramString4, String paramString5, int paramInt3, String paramString6)
  {
    AppMethodBeat.i(124076);
    a(4, paramInt1, paramString1, paramString2, paramString3, paramInt2, paramBoolean, paramString4, true, paramString5, paramString6, paramInt3);
    AppMethodBeat.o(124076);
  }

  public static void a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, boolean paramBoolean1, String paramString4, boolean paramBoolean2, String paramString5, int paramInt3)
  {
    AppMethodBeat.i(124077);
    a(paramInt1, paramString1, paramString2, paramString3, paramInt2, paramBoolean1, paramString4, paramBoolean2, paramString5, paramInt3, "");
    AppMethodBeat.o(124077);
  }

  public static void a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, boolean paramBoolean1, String paramString4, boolean paramBoolean2, String paramString5, int paramInt3, String paramString6)
  {
    AppMethodBeat.i(124078);
    a(7, paramInt1, paramString1, paramString2, paramString3, paramInt2, paramBoolean1, paramString4, paramBoolean2, paramString5, paramString6, paramInt3);
    AppMethodBeat.o(124078);
  }

  public static void a(int paramInt1, String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(124081);
    a(10, paramInt1, paramString1, paramString2, "", 0, paramBoolean, "", true, paramString3, "", paramInt2);
    AppMethodBeat.o(124081);
  }

  public static void a(int paramInt1, String paramString1, String paramString2, boolean paramBoolean1, String paramString3, int paramInt2, String paramString4, boolean paramBoolean2)
  {
    AppMethodBeat.i(124080);
    a(12, paramInt1, paramString1, paramString2, "", 0, paramBoolean1, "", true, paramString3, paramString4, paramInt2, paramBoolean2);
    AppMethodBeat.o(124080);
  }

  public static void a(int paramInt1, String paramString1, String paramString2, boolean paramBoolean1, String paramString3, int paramInt2, String paramString4, boolean paramBoolean2, String paramString5)
  {
    AppMethodBeat.i(124079);
    a(1, paramInt1, paramString1, paramString2, paramString5, 0, paramBoolean1, "", true, paramString3, paramString4, paramInt2, paramBoolean2);
    AppMethodBeat.o(124079);
  }

  public static void a(int paramInt1, String paramString1, String paramString2, boolean paramBoolean1, String paramString3, int paramInt2, boolean paramBoolean2)
  {
    AppMethodBeat.i(124082);
    a(14, paramInt1, paramString1, paramString2, "", 0, paramBoolean1, "", true, paramString3, "", paramInt2, paramBoolean2);
    AppMethodBeat.o(124082);
  }

  public static void cUX()
  {
  }

  private static String cUY()
  {
    AppMethodBeat.i(124086);
    Object localObject = ah.getContext();
    if (!at.isConnected((Context)localObject))
    {
      ab.v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, not connected");
      localObject = "fail";
      AppMethodBeat.o(124086);
    }
    while (true)
    {
      return localObject;
      ab.v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, type = ".concat(String.valueOf(at.getNetType((Context)localObject))));
      if (at.is2G((Context)localObject))
      {
        ab.v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, 2g");
        localObject = "2g";
        AppMethodBeat.o(124086);
      }
      else if (at.is3G((Context)localObject))
      {
        ab.v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, 3g");
        localObject = "3g";
        AppMethodBeat.o(124086);
      }
      else if (at.is4G((Context)localObject))
      {
        ab.v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, 4g");
        localObject = "4g";
        AppMethodBeat.o(124086);
      }
      else if (at.isWifi((Context)localObject))
      {
        ab.v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, wifi");
        localObject = "wifi";
        AppMethodBeat.o(124086);
      }
      else
      {
        localObject = "fail";
        AppMethodBeat.o(124086);
      }
    }
  }

  private static String s(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124087);
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < 15; i++)
      localStringBuilder.append(String.valueOf(paramArrayOfObject[i]).replace(',', ' ')).append(',');
    localStringBuilder.append(String.valueOf(paramArrayOfObject[15]));
    paramArrayOfObject = localStringBuilder.toString();
    AppMethodBeat.o(124087);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.z
 * JD-Core Version:    0.6.2
 */