package com.tencent.mm.game.report;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.game.report.api.d;
import com.tencent.mm.game.report.b.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class b extends com.tencent.mm.game.report.api.c
{
  static void b(GameWebPerformanceInfo paramGameWebPerformanceInfo)
  {
    AppMethodBeat.i(59583);
    ab.i("MicroMsg.GameReportImpl", "reportWebPerformanceInMM, %s", new Object[] { paramGameWebPerformanceInfo.toString() });
    long l1;
    if (paramGameWebPerformanceInfo.eBT - paramGameWebPerformanceInfo.startTime > 0L)
      l1 = paramGameWebPerformanceInfo.eBT - paramGameWebPerformanceInfo.startTime;
    while (true)
    {
      long l2 = paramGameWebPerformanceInfo.eBU - paramGameWebPerformanceInfo.startTime;
      int i;
      label69: long l3;
      long l4;
      long l5;
      long l6;
      long l7;
      long l8;
      long l9;
      long l10;
      long l11;
      long l12;
      long l13;
      long l14;
      label277: int j;
      label289: long l15;
      label327: long l16;
      long l17;
      Object localObject;
      if (paramGameWebPerformanceInfo.eBV > 0L)
      {
        i = 1;
        l3 = 0L;
        l4 = 0L;
        if (i == 1)
        {
          l3 = paramGameWebPerformanceInfo.eBV - paramGameWebPerformanceInfo.startTime;
          l4 = paramGameWebPerformanceInfo.eBW - paramGameWebPerformanceInfo.startTime;
        }
        l5 = 0L;
        l6 = 0L;
        if (paramGameWebPerformanceInfo.eBM == 1)
        {
          l5 = paramGameWebPerformanceInfo.eBX - paramGameWebPerformanceInfo.startTime;
          l6 = paramGameWebPerformanceInfo.eBY - paramGameWebPerformanceInfo.startTime;
        }
        l7 = paramGameWebPerformanceInfo.eBZ - paramGameWebPerformanceInfo.startTime;
        l8 = paramGameWebPerformanceInfo.eCa - paramGameWebPerformanceInfo.startTime;
        l9 = paramGameWebPerformanceInfo.eCb - paramGameWebPerformanceInfo.startTime;
        l10 = paramGameWebPerformanceInfo.eCc - paramGameWebPerformanceInfo.startTime;
        l11 = 0L;
        if (paramGameWebPerformanceInfo.eCd != 0L)
        {
          l12 = paramGameWebPerformanceInfo.eCd - paramGameWebPerformanceInfo.startTime;
          l11 = l12;
          if (paramGameWebPerformanceInfo.eBM == 0)
          {
            l11 = l12;
            if (l12 < 0L)
              l11 = -1L;
          }
        }
        l13 = paramGameWebPerformanceInfo.eCe - paramGameWebPerformanceInfo.startTime;
        l12 = paramGameWebPerformanceInfo.eCf - paramGameWebPerformanceInfo.startTime;
        l14 = l12;
        if (paramGameWebPerformanceInfo.eBM == 0)
        {
          if (l12 <= 0L)
            break label1047;
          l14 = l12;
        }
        if (paramGameWebPerformanceInfo.eCg <= 0L)
          break label1055;
        j = 1;
        l12 = paramGameWebPerformanceInfo.eCg - paramGameWebPerformanceInfo.startTime;
        if (j == 0)
          break label1061;
        l15 = l12;
        if (paramGameWebPerformanceInfo.eBM == 0)
        {
          if (l12 <= 0L)
            break label1061;
          l15 = l12;
        }
        l16 = 0L;
        l17 = 0L;
        if (paramGameWebPerformanceInfo.eBO == 0)
        {
          l17 = paramGameWebPerformanceInfo.eCh - paramGameWebPerformanceInfo.startTime;
          l12 = l17;
          if (l17 <= 0L)
            l12 = -1L;
          long l18 = paramGameWebPerformanceInfo.eCi - paramGameWebPerformanceInfo.startTime;
          l16 = l12;
          l17 = l18;
          if (l18 <= 0L)
          {
            l17 = -1L;
            l16 = l12;
          }
        }
        l12 = paramGameWebPerformanceInfo.eCk - paramGameWebPerformanceInfo.startTime;
        ab.i("MicroMsg.GameReportImpl", "url : %s, pkgId: %s, isLuggage : %d, isWePkg: %d, isPreloadWePkg: %d, isPreloadWebCore: %d, hasLoadFinished: %d, gameCenterUICreate: %d, startWebUI: %d,preloadWePkgBgn: %d, preloadWePkgEnd: %d, preloadWebCoreBgn: %d, preloadWebCoreEnd: %d,webUICreate: %d, webUIOnshowBgn: %d, createViewBgn: %d, createViewEnd: %d, jsbridgeInject: %d, loadUrlBgn: %d, onPageStarted: %d, onPageFinished: %d, getA8keyBgn: %d, getA8keyEnd: %d, webUIInfront: %d,webUIDestroy: %d", new Object[] { paramGameWebPerformanceInfo.url, paramGameWebPerformanceInfo.eBS, Integer.valueOf(paramGameWebPerformanceInfo.eBK), Integer.valueOf(paramGameWebPerformanceInfo.eBL), Integer.valueOf(i), Integer.valueOf(paramGameWebPerformanceInfo.eBM), Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l5), Long.valueOf(l6), Long.valueOf(l7), Long.valueOf(l8), Long.valueOf(l9), Long.valueOf(l10), Long.valueOf(l11), Long.valueOf(l13), Long.valueOf(l14), Long.valueOf(l15), Long.valueOf(l16), Long.valueOf(l17), Long.valueOf(paramGameWebPerformanceInfo.eCj), Long.valueOf(l12) });
        localObject = "";
      }
      try
      {
        String str = URLEncoder.encode(paramGameWebPerformanceInfo.url, "utf-8");
        localObject = str;
        label667: h.pYm.e(16141, new Object[] { localObject, Integer.valueOf(paramGameWebPerformanceInfo.eBK), Integer.valueOf(paramGameWebPerformanceInfo.eBL), Integer.valueOf(i), Integer.valueOf(paramGameWebPerformanceInfo.eBM), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l5), Long.valueOf(l6), Long.valueOf(l7), Long.valueOf(l8), Long.valueOf(l9), Long.valueOf(l10), Long.valueOf(l11), Long.valueOf(l13), Long.valueOf(l14), Long.valueOf(l15), Long.valueOf(l16), Long.valueOf(l17), Long.valueOf(paramGameWebPerformanceInfo.eCj), Long.valueOf(l12), Integer.valueOf(j), paramGameWebPerformanceInfo.eBS, Integer.valueOf(paramGameWebPerformanceInfo.eBN), paramGameWebPerformanceInfo.eBJ, at.gB(ah.getContext()), Integer.valueOf(paramGameWebPerformanceInfo.eBQ), Integer.valueOf(paramGameWebPerformanceInfo.eBO), Integer.valueOf(paramGameWebPerformanceInfo.eBR), paramGameWebPerformanceInfo.eCn, paramGameWebPerformanceInfo.eCo });
        if (j == 1)
        {
          if (paramGameWebPerformanceInfo.eBQ == 0)
            h.pYm.k(949L, 4L, 1L);
          if (paramGameWebPerformanceInfo.eCi != -1L)
            break label1111;
          h.pYm.k(949L, 7L, 1L);
          AppMethodBeat.o(59583);
        }
        while (true)
        {
          return;
          l1 = 0L;
          break;
          i = 0;
          break label69;
          label1047: l14 = -1L;
          break label277;
          label1055: j = 0;
          break label289;
          label1061: l15 = -1L;
          break label327;
          if (paramGameWebPerformanceInfo.eBL == 1)
          {
            h.pYm.k(949L, 5L, 1L);
            AppMethodBeat.o(59583);
          }
          else
          {
            h.pYm.k(949L, 6L, 1L);
            label1111: AppMethodBeat.o(59583);
          }
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label667;
      }
    }
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, long paramLong, String paramString5, String paramString6)
  {
    AppMethodBeat.i(59580);
    ab.d("MicroMsg.GameReportImpl", "reportMsgClick 10531, appId = %s, pkgName = %s, msgSvrId:%d, snsOgjId:%s", new Object[] { paramString1, paramString2, Long.valueOf(paramLong), paramString5 });
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.GameReportImpl", "reportMsgClick fail, appId is null");
      AppMethodBeat.o(59580);
    }
    while (true)
    {
      return;
      localObject = paramContext;
      if (paramContext == null)
        localObject = ah.getContext();
      paramContext = g.bT(paramString1, false);
      if (paramContext != null)
        break;
      ab.e("MicroMsg.GameReportImpl", "reportMsgClick fail, appinfo is null");
      AppMethodBeat.o(59580);
    }
    int i = a.F((Context)localObject, paramString2);
    paramString2 = a.Pv();
    int j = a.getNetworkType((Context)localObject);
    Object localObject = bo.nullAsNil(paramContext.field_packageName);
    String str1 = bo.nullAsNil(paramContext.field_signature);
    String str2 = Long.toString(paramLong);
    if (paramContext.xy());
    for (int k = 1; ; k = 0)
    {
      paramContext = d.b(10531, new Object[] { paramString1, Integer.valueOf(i), paramString2, paramString3, Integer.valueOf(paramInt1), paramString4, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(j), localObject, str1, str2, "", paramString5, "", Integer.valueOf(k), paramString6 });
      ab.i("MicroMsg.reportMsgClick", paramContext.eBI);
      c.a(paramContext);
      AppMethodBeat.o(59580);
      break;
    }
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, int paramInt2)
  {
    AppMethodBeat.i(59575);
    ab.d("MicroMsg.GameReportImpl", "reportMsgClick, appId = " + paramString1 + ", pkgName = " + paramString2);
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.GameReportImpl", "reportDelGameMsg fail, appId is null");
      AppMethodBeat.o(59575);
    }
    while (true)
    {
      return;
      Context localContext = paramContext;
      if (paramContext == null)
        localContext = ah.getContext();
      c.a(d.b(10583, new Object[] { paramString1, Integer.valueOf(a.F(localContext, paramString2)), a.Pv(), paramString3, Integer.valueOf(paramInt1), paramString4, Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(a.getNetworkType(localContext)) }));
      AppMethodBeat.o(59575);
    }
  }

  public final void a(GameWebPerformanceInfo paramGameWebPerformanceInfo)
  {
    AppMethodBeat.i(59581);
    if ((paramGameWebPerformanceInfo == null) || (bo.isNullOrNil(paramGameWebPerformanceInfo.url)))
    {
      ab.e("MicroMsg.GameReportImpl", "info is null");
      AppMethodBeat.o(59581);
    }
    while (true)
    {
      return;
      if (ah.bqo())
      {
        b(paramGameWebPerformanceInfo);
        AppMethodBeat.o(59581);
      }
      else
      {
        com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", paramGameWebPerformanceInfo, b.a.class, null);
        AppMethodBeat.o(59581);
      }
    }
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(59573);
    c.a(paramd);
    AppMethodBeat.o(59573);
  }

  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, int paramInt3)
  {
    AppMethodBeat.i(59574);
    ab.d("MicroMsg.GameReportImpl", "rejectGameMsg, fromUserName = " + paramString1 + ", appId = " + paramString2 + ", msgType = " + paramInt1 + ", scene = " + paramInt2 + ", actionName = " + paramString3);
    if (bo.isNullOrNil(paramString2))
    {
      ab.e("MicroMsg.GameReportImpl", "rejectGameMsg fail, appId is null");
      AppMethodBeat.o(59574);
    }
    while (true)
    {
      return;
      h.pYm.e(10546, new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), a.Pv(), Integer.valueOf(paramInt2), paramString3, Integer.valueOf(paramInt3) });
      AppMethodBeat.o(59574);
    }
  }

  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, long paramLong, boolean paramBoolean, String paramString4)
  {
    AppMethodBeat.i(59576);
    ab.d("MicroMsg.GameReportImpl", "reportReadMsg, appId = ".concat(String.valueOf(paramString1)));
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.GameReportImpl", "reportReadMsg fail, appId is null");
      AppMethodBeat.o(59576);
      return;
    }
    String str = a.fa(paramLong);
    label58: h localh;
    if (paramBoolean)
    {
      i = 1;
      ab.i("MicroMsg.reportReadMsg", "%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { paramString1, str, paramString2, Integer.valueOf(paramInt1), paramString3, Integer.valueOf(paramInt2), Integer.valueOf(i), paramString4 });
      localh = h.pYm;
      if (!paramBoolean)
        break label209;
    }
    label209: for (int i = 1; ; i = 0)
    {
      localh.e(10532, new Object[] { paramString1, str, paramString2, Integer.valueOf(paramInt1), paramString3, Integer.valueOf(paramInt2), Integer.valueOf(i), paramString4 });
      AppMethodBeat.o(59576);
      break;
      i = 0;
      break label58;
    }
  }

  public final void g(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(59582);
    h.pYm.e(16171, new Object[] { Integer.valueOf(0), Integer.valueOf(paramInt), paramString1, paramString2, Long.valueOf(0L) });
    AppMethodBeat.o(59582);
  }

  public final void i(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(59577);
    ab.d("MicroMsg.GameReportImpl", "reportGameDetail, appId = " + paramString + ", scene = " + paramInt1);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.GameReportImpl", "reportGameDetail fail, appId is null");
      AppMethodBeat.o(59577);
    }
    while (true)
    {
      return;
      h.pYm.e(10700, new Object[] { paramString, Integer.valueOf(1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(59577);
    }
  }

  public final void j(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(59579);
    ab.d("MicroMsg.GameReportImpl", "reportRegToWx, appId = " + paramString1 + ", pkgName = " + paramString2);
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.GameReportImpl", "reportRegToWx fail, appId is null");
      AppMethodBeat.o(59579);
    }
    while (true)
    {
      return;
      h.pYm.e(10534, new Object[] { paramString1, Integer.valueOf(a.F(paramContext, paramString2)), a.Pv(), Long.valueOf(System.currentTimeMillis() / 1000L) });
      AppMethodBeat.o(59579);
    }
  }

  public final void m(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(59578);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.e("MicroMsg.GameReportImpl", "null open or null username");
      AppMethodBeat.o(59578);
    }
    while (true)
    {
      return;
      h.pYm.e(10738, new Object[] { paramString1, paramString2, paramString1, paramString3 });
      AppMethodBeat.o(59578);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.game.report.b
 * JD-Core Version:    0.6.2
 */