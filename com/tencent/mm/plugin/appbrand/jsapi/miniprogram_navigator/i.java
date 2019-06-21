package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

public final class i
{
  private static void a(int paramInt, String paramString1, String paramString2, String paramString3, long paramLong)
  {
    AppMethodBeat.i(131350);
    long l = bo.anU();
    String str1 = at.gE(ah.getContext());
    String str2 = at.gF(ah.getContext());
    paramString1 = paramString3 + "," + paramString2 + "," + paramString1 + "," + l + "," + paramLong + "," + paramInt + "," + aEn() + "," + str1 + "," + str2 + ",,";
    ab.v("MicroMsg.MiniProgramNavigatorAdReportHelper", "closeType:%d stayTime:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    AdReportCgiHelper.a(16004, paramString1, null);
    AppMethodBeat.o(131350);
  }

  public static void a(String paramString1, String paramString2, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(131348);
    if (paramAppBrandStatObject == null)
      AppMethodBeat.o(131348);
    while (true)
    {
      return;
      String str = paramAppBrandStatObject.hQF;
      if (bo.isNullOrNil(str))
      {
        AppMethodBeat.o(131348);
      }
      else
      {
        g.a(paramString1, new i.1(paramString1, paramString2, str, System.currentTimeMillis(), paramAppBrandStatObject));
        AppMethodBeat.o(131348);
      }
    }
  }

  private static int aEn()
  {
    AppMethodBeat.i(131351);
    int i;
    switch (at.getNetType(ah.getContext()))
    {
    case 9:
    default:
      i = 6;
      AppMethodBeat.o(131351);
    case -1:
    case 0:
    case 3:
    case 4:
    case 2:
    case 5:
    case 7:
    case 1:
    case 6:
    case 8:
    case 10:
    }
    while (true)
    {
      return i;
      i = 255;
      AppMethodBeat.o(131351);
      continue;
      i = 1;
      AppMethodBeat.o(131351);
      continue;
      i = 4;
      AppMethodBeat.o(131351);
      continue;
      i = 2;
      AppMethodBeat.o(131351);
      continue;
      i = 3;
      AppMethodBeat.o(131351);
      continue;
      i = 5;
      AppMethodBeat.o(131351);
    }
  }

  public static void b(String paramString1, String paramString2, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(131349);
    if (paramAppBrandStatObject == null)
      AppMethodBeat.o(131349);
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramAppBrandStatObject.hQF))
      {
        AppMethodBeat.o(131349);
      }
      else
      {
        a(4, paramString1, paramString2, paramAppBrandStatObject.hQF, 0L);
        AppMethodBeat.o(131349);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i
 * JD-Core Version:    0.6.2
 */