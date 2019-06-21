package com.tencent.mm.plugin.appbrand.appusage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.protocal.protobuf.big;
import com.tencent.mm.protocal.protobuf.bow;
import com.tencent.mm.protocal.protobuf.box;
import com.tencent.mm.protocal.protobuf.bqc;
import com.tencent.mm.protocal.protobuf.bqe;
import com.tencent.mm.protocal.protobuf.dn;
import com.tencent.mm.protocal.protobuf.sq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;

public class i extends a<box>
{
  public i(int paramInt, long paramLong1, long paramLong2, AppBrandRecommendStatObj paramAppBrandRecommendStatObj)
  {
    AppMethodBeat.i(129755);
    this.ehh = a(paramInt, paramLong1, paramLong2, paramAppBrandRecommendStatObj).acD();
    AppMethodBeat.o(129755);
  }

  static b.a a(int paramInt, long paramLong1, long paramLong2, AppBrandRecommendStatObj paramAppBrandRecommendStatObj)
  {
    AppMethodBeat.i(129756);
    ab.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "clickType:%d, page_stay_time:%d, app_stay_time:%d, recommendStatObj:%s", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong1), Long.valueOf(paramLong2), paramAppBrandRecommendStatObj.toString() });
    b.a locala = new b.a();
    bow localbow = new bow();
    Object localObject = new bqe();
    bqc localbqc = new bqc();
    ((bqe)localObject).bHi = paramAppBrandRecommendStatObj.hbj;
    sq localsq = new sq();
    localsq.waf = at.getNetTypeString(ah.getContext());
    localsq.longitude = paramAppBrandRecommendStatObj.cGm;
    localsq.latitude = paramAppBrandRecommendStatObj.cEB;
    localbow.wRt = ((bqe)localObject);
    localbow.wRu = localbqc;
    localbqc.type = paramInt;
    if (paramInt == 1)
    {
      localObject = new big();
      ((big)localObject).username = paramAppBrandRecommendStatObj.username;
      ((big)localObject).izZ = paramAppBrandRecommendStatObj.izZ;
      ((big)localObject).fBq = System.currentTimeMillis();
      ((big)localObject).iAa = paramAppBrandRecommendStatObj.iAa;
      ((big)localObject).csB = paramAppBrandRecommendStatObj.csB;
      ((big)localObject).iAe = paramAppBrandRecommendStatObj.iAe;
      ((big)localObject).position = paramAppBrandRecommendStatObj.position;
      ((big)localObject).wLx = ((int)paramLong1);
      ((big)localObject).vFr = ((int)paramLong2);
      localbqc.wSn = ((big)localObject);
    }
    while (true)
    {
      locala.fsJ = localbow;
      locala.fsK = new box();
      locala.uri = "/cgi-bin/mmbiz-bin/wxabusiness/rtreportrecommdclick";
      locala.fsI = 2799;
      AppMethodBeat.o(129756);
      return locala;
      localObject = new dn();
      ((dn)localObject).username = paramAppBrandRecommendStatObj.username;
      ((dn)localObject).fBq = System.currentTimeMillis();
      ((dn)localObject).iAa = paramAppBrandRecommendStatObj.iAa;
      ((dn)localObject).csB = paramAppBrandRecommendStatObj.csB;
      ((dn)localObject).iAe = paramAppBrandRecommendStatObj.iAe;
      ((dn)localObject).position = paramAppBrandRecommendStatObj.position;
      ((dn)localObject).vFr = ((int)paramLong2);
      localbqc.wSo = ((dn)localObject);
    }
  }

  public static void b(int paramInt, long paramLong1, long paramLong2, AppBrandRecommendStatObj paramAppBrandRecommendStatObj)
  {
    AppMethodBeat.i(129757);
    if (paramAppBrandRecommendStatObj == null)
      AppMethodBeat.o(129757);
    while (true)
    {
      return;
      e.aNS().aa(new i.1(paramInt, paramLong1, paramLong2, paramAppBrandRecommendStatObj));
      AppMethodBeat.o(129757);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.i
 * JD-Core Version:    0.6.2
 */