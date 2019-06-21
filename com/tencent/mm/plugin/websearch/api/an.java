package com.tencent.mm.plugin.websearch.api;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.b.d;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.protobuf.bsj;
import com.tencent.mm.protocal.protobuf.cht;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class an
{
  private static an.a uaY;

  static
  {
    AppMethodBeat.i(124241);
    uaY = new an.a();
    AppMethodBeat.o(124241);
  }

  public static void F(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(124226);
    com.tencent.mm.plugin.report.e.pXa.e(13809, new Object[] { Integer.valueOf(paramInt), paramString1, paramString2, Integer.valueOf(0) });
    AppMethodBeat.o(124226);
  }

  public static void Ij(int paramInt)
  {
    AppMethodBeat.i(124215);
    uaY.scene = paramInt;
    uaY.tZU = 1;
    uaY.uaZ = System.currentTimeMillis();
    uaY.uba = 0L;
    uaY.oGj = System.currentTimeMillis();
    uaY.ckF = 0L;
    uaY.pZZ = false;
    ab.v("MicroMsg.WebSearch.WebSearchReportLogic", "initReport %d %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1) });
    AppMethodBeat.o(124215);
  }

  public static void Ik(int paramInt)
  {
    AppMethodBeat.i(124220);
    ab.v("MicroMsg.WebSearch.WebSearchReportLogic", "kvReportWebSearchVisit %d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.report.e.pXa.e(12041, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(aa.HV(0)) });
    AppMethodBeat.o(124220);
  }

  public static final void Il(int paramInt)
  {
    AppMethodBeat.i(124231);
    ab.v("MicroMsg.WebSearch.WebSearchReportLogic", "reportIdKey649 %d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.report.e.pXa.a(649L, paramInt, 1L, true);
    AppMethodBeat.o(124231);
  }

  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    AppMethodBeat.i(124236);
    if (paramInt1 == 21);
    for (int i = aa.HV(1); ; i = aa.HV(0))
    {
      com.tencent.mm.plugin.report.e.pXa.e(14457, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString });
      AppMethodBeat.o(124236);
      return;
    }
  }

  public static void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, int paramInt4, String paramString2, int paramInt5)
  {
    AppMethodBeat.i(124221);
    ab.v("MicroMsg.WebSearch.WebSearchReportLogic", "kvReportWebSearchGuideDisplay %d %d %s %d %d %s %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString2, Integer.valueOf(paramInt5) });
    com.tencent.mm.plugin.report.e.pXa.e(12098, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(aa.HV(0)), Integer.valueOf(paramInt2), paramString1, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString2, Integer.valueOf(paramInt5) });
    AppMethodBeat.o(124221);
  }

  public static void a(int paramInt1, String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    AppMethodBeat.i(124214);
    int i;
    if (paramBoolean1)
      i = 3;
    while (true)
    {
      com.tencent.mm.plugin.report.e.pXa.e(12042, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(paramInt2), bo.bc(paramString, "").replace(",", " ") });
      AppMethodBeat.o(124214);
      return;
      if (paramBoolean2)
        i = 2;
      else
        i = 1;
    }
  }

  public static void a(cht paramcht, int paramInt1, int paramInt2, int paramInt3, long paramLong, String paramString)
  {
    AppMethodBeat.i(124238);
    cht localcht = paramcht;
    if (paramcht == null)
    {
      localcht = new cht();
      localcht.cJb = "";
      localcht.xgz = 0L;
    }
    paramcht = new StringBuffer();
    paramcht.append("reddotreport=1");
    paramcht.append("&reddotid=");
    paramcht.append(bo.nullAsNil(localcht.cJb));
    paramcht.append("&reddotts=");
    paramcht.append(localcht.xgz);
    paramcht.append("&nettype=");
    paramcht.append(aa.bVP());
    paramcht.append("&optype=");
    paramcht.append(paramInt1);
    paramcht.append("&reddottype=");
    paramcht.append(paramInt2);
    paramcht.append("&reddotcnt=");
    paramcht.append(paramInt3);
    paramcht.append("&reddotconsumets=");
    paramcht.append(paramLong);
    paramcht.append("&notshowreason=");
    paramcht.append(paramString);
    paramcht.append("&reddotseq=");
    paramcht.append(localcht.fQi);
    if ((paramInt1 == 100) || (paramInt1 == 101) || (paramInt1 == 102) || (paramInt1 == 108))
      if (bo.isNullOrNil((String)g.RP().Ry().get(68377, null)))
        break label354;
    label354: for (paramInt1 = 1; ; paramInt1 = 0)
    {
      if (n.qFz != null);
      for (paramInt2 = n.qFz.baS(); ; paramInt2 = 0)
      {
        if (paramInt2 > 0)
          paramcht.append("&snsreddottype=2&snsreddotcnt=").append(paramInt2);
        while (true)
        {
          ab.i("MicroMsg.TopStory", "reportTopStoryRedDot 16399 %s", new Object[] { paramcht.toString() });
          paramString = new bsj();
          paramString.wUu = paramcht.toString();
          paramcht = new w(paramString);
          g.Rg().a(paramcht, 0);
          AppMethodBeat.o(124238);
          return;
          if (paramInt1 > 0)
            paramcht.append("&snsreddottype=1&snsreddotcnt=0");
          else
            paramcht.append("&snsreddottype=0&snsreddotcnt=0");
        }
      }
    }
  }

  public static void a(String paramString1, long paramLong, int paramInt1, int paramInt2, String paramString2, int paramInt3)
  {
    AppMethodBeat.i(124240);
    if (!bo.isNullOrNil((String)g.RP().Ry().get(68377, null)));
    for (int i = 1; ; i = 0)
    {
      if (n.qFz != null);
      for (int j = n.qFz.baS(); ; j = 0)
      {
        if (j > 0)
          i = 2;
        while (true)
        {
          paramString1 = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { paramString1, Long.valueOf(paramLong), aa.bVP(), Integer.valueOf(201), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(0L), paramString2, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt3) });
          ab.i("MicroMsg.WebSearch.WebSearchReportLogic", "reportTopStoryRedDotKv 16654: ".concat(String.valueOf(paramString1)));
          com.tencent.mm.plugin.report.e.pXa.X(16654, paramString1);
          AppMethodBeat.o(124240);
          return;
          if (i > 0)
          {
            j = 0;
            i = 1;
          }
          else
          {
            j = 0;
            i = 0;
          }
        }
      }
    }
  }

  public static void a(String paramString1, String paramString2, long paramLong, String paramString3)
  {
    AppMethodBeat.i(124228);
    ab.v("MicroMsg.WebSearch.WebSearchReportLogic", "kvReportWebSearchLocalPageExposure:");
    com.tencent.mm.plugin.report.e.pXa.e(14663, new Object[] { Uri.encode(paramString1), paramString2, Long.valueOf(paramLong), paramString3, Integer.valueOf(3) });
    AppMethodBeat.o(124228);
  }

  public static final void adP(String paramString)
  {
    AppMethodBeat.i(124230);
    ab.v("MicroMsg.WebSearch.WebSearchReportLogic", "reportWebSuggestClick %s", new Object[] { paramString });
    com.tencent.mm.plugin.report.e.pXa.X(12721, paramString);
    AppMethodBeat.o(124230);
  }

  public static void an(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(124235);
    a(paramInt1, 3, paramInt2, paramInt3, "");
    AppMethodBeat.o(124235);
  }

  public static void as(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(124237);
    com.tencent.mm.plugin.report.e.pXa.e(14752, new Object[] { Integer.valueOf(1), paramString1, paramString2, paramString3 });
    AppMethodBeat.o(124237);
  }

  public static void b(int paramInt1, int paramInt2, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(124239);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("recnondocreport=1");
    localStringBuffer.append("&type=51");
    localStringBuffer.append("&content=");
    paramString1 = localStringBuffer.append(paramInt1).append("|").append(paramInt2).append("|").append(bo.nullAsNil(paramString1)).append("|");
    if (paramBoolean);
    for (paramInt1 = 1; ; paramInt1 = 0)
    {
      paramString1.append(paramInt1);
      localStringBuffer.append("&searchid=");
      localStringBuffer.append(bo.nullAsNil(paramString2));
      ab.i("MicroMsg.TopStory", "reportTopStoryRedDot 14791 %s", new Object[] { localStringBuffer.toString() });
      paramString1 = new bsj();
      paramString1.wUu = localStringBuffer.toString();
      paramString1 = new w(paramString1);
      g.Rg().a(paramString1, 0);
      AppMethodBeat.o(124239);
      return;
    }
  }

  public static void b(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(124229);
    com.tencent.mm.plugin.report.e.pXa.e(13810, new Object[] { Integer.valueOf(paramInt1), paramString1, paramString2, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(0) });
    AppMethodBeat.o(124229);
  }

  public static void by(int paramInt, String paramString)
  {
    AppMethodBeat.i(124213);
    com.tencent.mm.plugin.report.e.pXa.X(paramInt, paramString);
    AppMethodBeat.o(124213);
  }

  public static void bz(int paramInt, String paramString)
  {
    AppMethodBeat.i(124225);
    com.tencent.mm.plugin.report.e.pXa.e(12070, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(aa.HV(0)), paramString, Integer.valueOf(4), Integer.valueOf(0), "", Integer.valueOf(1), Integer.valueOf(0) });
    AppMethodBeat.o(124225);
  }

  public static void cVv()
  {
    AppMethodBeat.i(124216);
    uaY.uaZ = System.currentTimeMillis();
    ab.v("MicroMsg.WebSearch.WebSearchReportLogic", "startH5Report %s", new Object[] { Long.valueOf(uaY.uaZ) });
    AppMethodBeat.o(124216);
  }

  public static void cVw()
  {
    AppMethodBeat.i(124217);
    an.a locala = uaY;
    locala.uba += System.currentTimeMillis() - uaY.uaZ;
    ab.v("MicroMsg.WebSearch.WebSearchReportLogic", "stopH5Report %s", new Object[] { Long.valueOf(uaY.uba) });
    AppMethodBeat.o(124217);
  }

  public static void cVx()
  {
    AppMethodBeat.i(124218);
    an.a locala = uaY;
    locala.ckF += System.currentTimeMillis() - uaY.oGj;
    ab.v("MicroMsg.WebSearch.WebSearchReportLogic", "stopTotalReport %s", new Object[] { Long.valueOf(uaY.ckF) });
    AppMethodBeat.o(124218);
  }

  public static void cVy()
  {
    AppMethodBeat.i(124219);
    an.a locala = uaY;
    if (!locala.pZZ)
    {
      com.tencent.mm.plugin.report.e.pXa.e(12044, new Object[] { Integer.valueOf(locala.scene), Integer.valueOf(locala.tZU), Long.valueOf(locala.uba / 1000L), Long.valueOf(locala.ckF / 1000L) });
      locala.pZZ = true;
    }
    ab.v("MicroMsg.WebSearch.WebSearchReportLogic", "reportTime");
    AppMethodBeat.o(124219);
  }

  public static void e(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(124224);
    com.tencent.mm.plugin.report.e locale = com.tencent.mm.plugin.report.e.pXa;
    if (paramBoolean);
    while (true)
    {
      locale.e(12845, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(0), Integer.valueOf(paramInt2), paramString, Integer.valueOf(i) });
      AppMethodBeat.o(124224);
      return;
      i = 0;
    }
  }

  public static void e(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    AppMethodBeat.i(124227);
    ab.v("MicroMsg.WebSearch.WebSearchReportLogic", "kvReportWebSearchLocalPageClick %s %s %d %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), paramString3 });
    com.tencent.mm.plugin.report.e.pXa.e(14657, new Object[] { Uri.encode(paramString1), paramString2, Integer.valueOf(paramInt), paramString3, Integer.valueOf(3) });
    AppMethodBeat.o(124227);
  }

  public static void gp(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(124233);
    y(paramInt1, paramInt2, "");
    AppMethodBeat.o(124233);
  }

  public static void l(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(124222);
    com.tencent.mm.plugin.report.e.pXa.e(12639, new Object[] { bo.bc(paramString, "").replace(",", " "), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(paramInt3) });
    AppMethodBeat.o(124222);
  }

  public static final void reportIdKey649ForLook(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(124232);
    if (paramInt1 == 21)
      com.tencent.mm.plugin.report.e.pXa.a(649L, paramInt2, 1L, true);
    AppMethodBeat.o(124232);
  }

  public static void x(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(124223);
    e(paramInt1, paramInt2, paramString, false);
    AppMethodBeat.o(124223);
  }

  public static void y(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(124234);
    a(paramInt1, paramInt2, 0, 0, paramString);
    AppMethodBeat.o(124234);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.an
 * JD-Core Version:    0.6.2
 */