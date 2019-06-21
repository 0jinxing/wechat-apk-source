package com.tencent.mm.plugin.appbrand.appusage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.protocal.protobuf.ank;
import com.tencent.mm.protocal.protobuf.anl;
import com.tencent.mm.protocal.protobuf.oo;
import com.tencent.mm.protocal.protobuf.sq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public class h extends a<anl>
{
  public h(int paramInt1, sq paramsq, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(129750);
    ab.i("MicroMsg.Recommend.CgiGetRecommendWxa", "pageNum:%d, filterType:%d, sessionId:%d, strategy:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(5), Long.valueOf(paramLong), Integer.valueOf(paramInt2) });
    b.a locala = new b.a();
    ank localank = new ank();
    localank.wsg = paramInt1;
    localank.bNT = 5;
    localank.wsh = new oo();
    localank.bHi = paramLong;
    localank.wsi = paramsq;
    localank.wsj = paramInt2;
    locala.fsJ = localank;
    locala.fsK = new anl();
    locala.uri = "/cgi-bin/mmbiz-bin/wxabusiness/getrecommendwxa";
    locala.fsI = 2778;
    this.ehh = locala.acD();
    AppMethodBeat.o(129750);
  }

  public static void a(int paramInt1, sq paramsq, long paramLong, h.a parama, int paramInt2)
  {
    AppMethodBeat.i(129751);
    long l = System.currentTimeMillis() / 1000L;
    e.aNS().aa(new h.1(paramInt1, paramsq, paramLong, paramInt2, l, parama));
    AppMethodBeat.o(129751);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.h
 * JD-Core Version:    0.6.2
 */