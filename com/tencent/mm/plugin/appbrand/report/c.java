package com.tencent.mm.plugin.appbrand.report;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.appusage.af.a;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.jsapi.q.d.a;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.util.List;

public final class c
{
  public static final String iAf = d.a.hXC.value;
  public static final String iAg = d.a.hXB.value;
  public static final String iAh = d.a.hXy.value;
  public static final String iAi = d.a.hXz.value;
  public static final String iAj = d.a.hXA.value;

  public static int Dw(String paramString)
  {
    AppMethodBeat.i(132562);
    if ("@LibraryAppId".equals(paramString))
    {
      AppMethodBeat.o(132562);
      i = 0;
      return i;
    }
    int j = d.Dy(paramString);
    int i = j;
    Object localObject;
    if (j < 0)
    {
      if (!ah.bqo())
        break label100;
      localObject = com.tencent.mm.plugin.appbrand.app.f.auO().e(paramString, new String[] { "appInfo" });
      if (localObject == null)
        break label88;
      i = ((WxaAttributes)localObject).ayJ().fmr;
      d.bs(paramString, i);
    }
    while (true)
    {
      i += 1000;
      AppMethodBeat.o(132562);
      break;
      label88: ab.i("MicroMsg.AppBrandReporterManager", "getServiceTypeForReport null = attrs!");
      i = j;
      continue;
      label100: localObject = a.wI(paramString);
      if (localObject == null);
      for (localObject = null; ; localObject = ((o)localObject).atI())
      {
        if (localObject == null)
          break label136;
        i = ((AppBrandInitConfigWC)localObject).bQe;
        d.bs(paramString, i);
        break;
      }
      label136: ab.i("MicroMsg.AppBrandReporterManager", "getServiceTypeForReport null = initConfig! appServiceType:%s", new Object[] { Integer.valueOf(j) });
      i = j;
    }
  }

  public static void K(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(132552);
    if ("@LibraryAppId".equals(paramString))
    {
      AppMethodBeat.o(132552);
      return;
    }
    int i = 1000;
    String str = "";
    int j = 0;
    int k = 0;
    Object localObject;
    label64: int m;
    label81: int n;
    if (!bo.isNullOrNil(paramString))
    {
      localObject = a.wK(paramString);
      if (localObject != null)
        if (((AppBrandStatObject)localObject).scene == 0)
        {
          i = 1000;
          str = bo.nullAsNil(((AppBrandStatObject)localObject).cst);
          m = ((AppBrandStatObject)localObject).iAo;
          localObject = a.wJ(paramString);
          n = k;
          if (localObject != null)
          {
            n = k;
            if (((com.tencent.mm.plugin.appbrand.config.h)localObject).hhd != null)
              n = ((com.tencent.mm.plugin.appbrand.config.h)localObject).hhd.gVu;
          }
          k = paramInt2;
          if (paramInt2 == 0)
          {
            k = paramInt2;
            if (localObject != null)
            {
              k = paramInt2;
              if (((com.tencent.mm.plugin.appbrand.config.h)localObject).hhd != null)
                k = ((com.tencent.mm.plugin.appbrand.config.h)localObject).hhd.gVt + 1;
            }
          }
          j = Dw(paramString);
          paramInt2 = k;
          k = n;
          n = m;
          m = j;
        }
    }
    while (true)
    {
      ab.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %s, sceneNote %s, appId %s, appVersion %s, appState %s, usedState %s, pagetype %s, targetAction %s, appType %s", new Object[] { Integer.valueOf(13541), Integer.valueOf(i), str, paramString, Integer.valueOf(k), Integer.valueOf(paramInt2), Integer.valueOf(n), Integer.valueOf(paramInt1), Integer.valueOf(3), Integer.valueOf(m) });
      com.tencent.mm.plugin.report.service.h.pYm.e(13541, new Object[] { Integer.valueOf(i), str, paramString, Integer.valueOf(k), Integer.valueOf(paramInt2), Integer.valueOf(n), Integer.valueOf(paramInt1), Integer.valueOf(3), "", Integer.valueOf(m) });
      if ((!TextUtils.isEmpty(str)) && (str.contains("isWidget=1")))
        com.tencent.mm.plugin.appbrand.dynamic.f.n(paramInt1, paramString, str);
      AppMethodBeat.o(132552);
      break;
      i = ((AppBrandStatObject)localObject).scene;
      break label64;
      m = 0;
      break label81;
      m = 1000;
      n = 0;
      k = j;
    }
  }

  public static void a(int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(132547);
    ab.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, appid %s, appversion %d, appidlist %snearbyAppIdCount %s, nearbyAppIdList %s", new Object[] { Integer.valueOf(13533), Integer.valueOf(paramInt1), bo.nullAsNil(paramString1), Integer.valueOf(0), paramString2, Integer.valueOf(paramInt2), paramString3 });
    com.tencent.mm.plugin.report.service.h.pYm.e(13533, new Object[] { Integer.valueOf(paramInt1), bo.nullAsNil(paramString1), Integer.valueOf(0), paramString2, Integer.valueOf(paramInt2), paramString3, Integer.valueOf(0), paramString4 });
    AppMethodBeat.o(132547);
  }

  public static void a(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(132554);
    if (paramBoolean2);
    for (int i = 775; ; i = 367)
    {
      int j;
      if (paramLong <= 2000L)
        if (paramBoolean1)
        {
          j = 8;
          com.tencent.mm.plugin.report.service.h.pYm.a(i, j, 1L, false);
          if (!paramBoolean1)
            break label343;
          com.tencent.mm.plugin.report.service.h.pYm.a(i, 7L, 1L, false);
        }
      while (true)
      {
        ab.v("MicroMsg.AppBrandReporterManager", "startApp cost %s msec(hasDownload : %b).", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(paramBoolean1) });
        AppMethodBeat.o(132554);
        return;
        j = 1;
        break;
        if (paramLong <= 3000L)
        {
          if (paramBoolean1)
          {
            j = 9;
            break;
          }
          j = 2;
          break;
        }
        if (paramLong <= 4000L)
        {
          if (paramBoolean1)
          {
            j = 10;
            break;
          }
          j = 3;
          break;
        }
        if (paramLong <= 5000L)
        {
          if (paramBoolean1)
          {
            j = 11;
            break;
          }
          j = 4;
          break;
        }
        if (paramLong <= 6000L)
        {
          if (paramBoolean1)
          {
            j = 12;
            break;
          }
          j = 5;
          break;
        }
        if (paramBoolean2)
        {
          if (paramLong <= 7000L)
          {
            if (paramBoolean1)
            {
              j = 19;
              break;
            }
            j = 14;
            break;
          }
          if (paramLong <= 8000L)
          {
            if (paramBoolean1)
            {
              j = 20;
              break;
            }
            j = 15;
            break;
          }
          if (paramLong <= 9000L)
          {
            if (paramBoolean1)
            {
              j = 21;
              break;
            }
            j = 16;
            break;
          }
          if (paramLong <= 10000L)
          {
            if (paramBoolean1)
            {
              j = 22;
              break;
            }
            j = 17;
            break;
          }
          if (paramBoolean1)
          {
            j = 23;
            break;
          }
          j = 18;
          break;
        }
        if (paramBoolean1)
        {
          j = 13;
          break;
        }
        j = 6;
        break;
        label343: com.tencent.mm.plugin.report.service.h.pYm.a(i, 0L, 1L, false);
      }
    }
  }

  public static void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(132558);
    com.tencent.mm.plugin.report.service.h.pYm.e(14369, new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2 + 1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(1) });
    AppMethodBeat.o(132558);
  }

  public static void a(String paramString, int paramInt1, int paramInt2, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(132548);
    Object localObject1 = j.cW(ah.getContext());
    Object localObject2 = localObject1;
    if (bo.isNullOrNil((String)localObject1))
      localObject2 = iAf;
    int i = Dw(paramString);
    long l = bo.anT();
    ab.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, sceneNote %s, sessionId %s, appid %s, appversion %d, appState %d, usedState %d, pagePath %s, networkType %s, eventId %d,eventRusult %d, eventPercent %d, installCostTime %s, eventTime %s, useModule %b, appType %s", new Object[] { Integer.valueOf(13537), Integer.valueOf(1000), "", "", paramString, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", localObject2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Long.valueOf(paramLong), Long.valueOf(l), Boolean.valueOf(paramBoolean), Integer.valueOf(i) });
    localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
    if (paramBoolean);
    for (int j = 1; ; j = 0)
    {
      ((com.tencent.mm.plugin.report.service.h)localObject1).e(13537, new Object[] { Integer.valueOf(1000), "", "", paramString, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", localObject2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Long.valueOf(paramLong), Long.valueOf(l), Integer.valueOf(j), Integer.valueOf(i) });
      AppMethodBeat.o(132548);
      return;
    }
  }

  public static void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4, int paramInt3, String paramString5, long paramLong, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(132550);
    int i = 3;
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(132550);
    while (true)
    {
      return;
      String str1 = "";
      String str2 = str1;
      if (!bo.isNullOrNil(paramString4))
      {
        str2 = str1;
        if (paramString4.contains(".html"))
          str2 = paramString4.substring(0, paramString4.lastIndexOf(".html") + 5);
      }
      paramString4 = "";
      try
      {
        str1 = com.tencent.mm.compatible.util.q.encode(bo.nullAsNil(str2), "UTF-8");
        paramString4 = str1;
        paramString3 = bo.nullAsNil(paramString3);
        paramString5 = bo.nullAsNil(paramString5);
        str1 = bo.nullAsNil(paramString2);
        int j = Dw(paramString2);
        if (paramInt1 > 0)
        {
          i = paramInt1 - 1;
          bool = com.tencent.mm.plugin.appbrand.app.f.auT().aI(paramString1, i);
          if (com.tencent.mm.plugin.appbrand.app.f.auU().aF(paramString1, i))
            i = 1;
        }
        else
        {
          ab.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, sceneNote %s, appid %s, appversion %d, appState %d, usedState %d, pagePath %s, action %d, actionNote %s,actionTime %s, actionResult %d, actionErrorcode %d, appType %d", new Object[] { Integer.valueOf(13540), Integer.valueOf(paramInt2), paramString3, str1, Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(i), str2, Integer.valueOf(paramInt3), paramString5, Long.valueOf(paramLong), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), Integer.valueOf(j) });
          com.tencent.mm.plugin.report.service.h.pYm.e(13540, new Object[] { Integer.valueOf(paramInt2), paramString3, str1, Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(i), paramString4, Integer.valueOf(paramInt3), paramString5, Long.valueOf(paramLong), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), Integer.valueOf(j) });
          AppMethodBeat.o(132550);
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        while (true)
        {
          boolean bool;
          ab.e("MicroMsg.AppBrandReporterManager", "encode page path error!");
          ab.printErrStackTrace("MicroMsg.AppBrandReporterManager", localUnsupportedEncodingException, "", new Object[0]);
          continue;
          if (bool)
            i = 2;
          else
            i = 3;
        }
      }
    }
  }

  public static void a(String paramString1, String paramString2, int paramInt1, String paramString3, long paramLong, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(132549);
    AppBrandStatObject localAppBrandStatObject = a.wK(paramString1);
    if (localAppBrandStatObject == null)
    {
      ab.e("MicroMsg.AppBrandReporterManager", "statObject is Null!");
      AppMethodBeat.o(132549);
    }
    while (true)
    {
      return;
      String str1 = "";
      String str2 = str1;
      if (!bo.isNullOrNil(paramString2))
      {
        str2 = str1;
        if (paramString2.contains(".html"))
          str2 = paramString2.substring(0, paramString2.lastIndexOf(".html") + 5);
      }
      str1 = "";
      try
      {
        paramString2 = com.tencent.mm.compatible.util.q.encode(bo.nullAsNil(str2), "UTF-8");
        str1 = paramString2;
        paramString2 = a.wJ(paramString1);
        if (paramString2 == null)
        {
          i = 0;
          if (paramString2 != null)
            break label581;
          j = 0;
          str3 = bo.nullAsNil(paramString3);
          paramString2 = str3;
          if (paramInt1 == 18)
          {
            paramString2 = str3;
            if (!bo.isNullOrNil(paramString3))
            {
              paramString2 = str3;
              if (paramString3.contains(".html"))
                paramString2 = paramString3.substring(0, paramString3.lastIndexOf(".html") + 5);
            }
          }
        }
      }
      catch (UnsupportedEncodingException paramString3)
      {
        try
        {
          paramString3 = com.tencent.mm.compatible.util.q.encode(bo.nullAsNil(paramString2), "UTF-8");
          paramString2 = paramString3;
          str4 = bo.nullAsNil(localAppBrandStatObject.cst);
          paramString3 = null;
        }
        catch (UnsupportedEncodingException paramString3)
        {
          try
          {
            while (true)
            {
              String str4;
              String str3 = bo.nullAsNil(a.wI(paramString1).atI().xz());
              paramString3 = str3;
              if (localAppBrandStatObject.scene == 0)
                localAppBrandStatObject.scene = 1000;
              int k = localAppBrandStatObject.cOq;
              str3 = localAppBrandStatObject.cOr;
              int m = Dw(paramString1);
              ab.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, sceneNote : %s, sessionId : %s, appid : %s, appversion : %d, appState : %d, usedState : %d, pagePath : %s, action : %d, actionNote : %s,actionTime : %s, actionResult : %d, actionErrorcode : %d, preScene : %d, preSceneNote : %s, appType : %d", new Object[] { Integer.valueOf(13539), Integer.valueOf(localAppBrandStatObject.scene), str4, paramString3, paramString1, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localAppBrandStatObject.iAo), str2, Integer.valueOf(paramInt1), paramString2, Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(k), str3, Integer.valueOf(m) });
              com.tencent.mm.plugin.report.service.h.pYm.e(13539, new Object[] { Integer.valueOf(localAppBrandStatObject.scene), str4, paramString3, paramString1, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localAppBrandStatObject.iAo), str1, Integer.valueOf(paramInt1), paramString2, Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(k), str3, Integer.valueOf(m) });
              AppMethodBeat.o(132549);
              break;
              paramString2 = paramString2;
              ab.e("MicroMsg.AppBrandReporterManager", "innerMenuClickReport, encode page path error!, appId = %s", new Object[] { paramString1 });
              ab.printErrStackTrace("MicroMsg.AppBrandReporterManager", paramString2, "", new Object[0]);
              continue;
              int i = paramString2.hhd.gVu;
              continue;
              label581: int j = paramString2.hhd.gVt + 1;
            }
            paramString3 = paramString3;
            ab.e("MicroMsg.AppBrandReporterManager", "encode actionNote error!");
            ab.printErrStackTrace("MicroMsg.AppBrandReporterManager", paramString3, "", new Object[0]);
          }
          catch (Exception localException)
          {
            while (true)
              ab.e("MicroMsg.AppBrandReporterManager", "innerMenuClickReport, get runtime by %s, e = %s", new Object[] { paramString1, localException });
          }
        }
      }
    }
  }

  public static void aLb()
  {
    AppMethodBeat.i(132555);
    int i = bo.gX(((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).cc);
    ab.i("MicroMsg.AppBrandReporterManager", "report now process mem : %d", new Object[] { Integer.valueOf(bo.gX(((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).cc)) });
    if (i <= 90)
      i = 2;
    while (true)
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(386L, 1L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.a(386L, i, 1L, false);
      AppMethodBeat.o(132555);
      return;
      if (i <= 130)
        i = 3;
      else if (i <= 170)
        i = 4;
      else if (i <= 210)
        i = 5;
      else
        i = 6;
    }
  }

  public static void aa(int paramInt, String paramString)
  {
    AppMethodBeat.i(132560);
    com.tencent.mm.plugin.report.service.h.pYm.e(15651, new Object[] { Integer.valueOf(paramInt), bo.nullAsNil(paramString) });
    AppMethodBeat.o(132560);
  }

  public static void br(String paramString, int paramInt)
  {
    AppMethodBeat.i(132551);
    K(paramString, paramInt, 0);
    AppMethodBeat.o(132551);
  }

  public static String cV(Context paramContext)
  {
    AppMethodBeat.i(132546);
    paramContext = j.cW(paramContext);
    AppMethodBeat.o(132546);
    return paramContext;
  }

  public static void eA(boolean paramBoolean)
  {
    AppMethodBeat.i(132557);
    com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
    if (paramBoolean);
    for (int i = 2; ; i = 3)
    {
      localh.a(482, 482, 1, i, 1, 1, false);
      AppMethodBeat.o(132557);
      return;
    }
  }

  public static void pG(int paramInt)
  {
    AppMethodBeat.i(132553);
    List localList = ((af)com.tencent.mm.kernel.g.K(af.class)).a(2147483647, af.a.haK);
    StringBuilder localStringBuilder = new StringBuilder();
    localList = com.tencent.luggage.g.c.C(localList);
    localList = localList.subList(0, Math.min(20, localList.size()));
    for (int i = 0; i < localList.size(); i++)
    {
      localStringBuilder.append(((LocalUsageInfo)localList.get(i)).appId);
      if (i != localList.size() - 1)
        localStringBuilder.append("#");
    }
    ab.i("MicroMsg.AppBrandReporterManager", "[reportEnterMyWxaList] scene=".concat(String.valueOf(paramInt)));
    ab.i("MicroMsg.AppBrandReporterManager", "[reportEnterMyWxaList] appIdStr=".concat(String.valueOf(localStringBuilder)));
    com.tencent.mm.plugin.report.service.h.pYm.e(13800, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(((af)com.tencent.mm.kernel.g.K(af.class)).getCount()), localStringBuilder.toString(), Long.valueOf(System.currentTimeMillis()) });
    AppMethodBeat.o(132553);
  }

  public static void pH(int paramInt)
  {
    AppMethodBeat.i(132556);
    if (paramInt == 10)
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(386L, 8L, 1L, false);
      AppMethodBeat.o(132556);
    }
    while (true)
    {
      return;
      if (paramInt == 15)
        com.tencent.mm.plugin.report.service.h.pYm.a(386L, 7L, 1L, false);
      AppMethodBeat.o(132556);
    }
  }

  public static void pI(int paramInt)
  {
    AppMethodBeat.i(132559);
    com.tencent.mm.plugin.report.service.h.pYm.k(807L, paramInt, 1L);
    AppMethodBeat.o(132559);
  }

  public static void pJ(int paramInt)
  {
    AppMethodBeat.i(132561);
    com.tencent.mm.plugin.report.service.h.pYm.k(891L, paramInt, 1L);
    AppMethodBeat.o(132561);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.c
 * JD-Core Version:    0.6.2
 */