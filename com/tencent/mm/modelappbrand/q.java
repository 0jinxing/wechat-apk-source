package com.tencent.mm.modelappbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.ig;
import com.tencent.mm.g.a.ig.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.websearch.api.s;
import com.tencent.mm.protocal.protobuf.axy;
import com.tencent.mm.protocal.protobuf.csu;
import com.tencent.mm.protocal.protobuf.csv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

public final class q extends com.tencent.mm.plugin.websearch.api.a
  implements k
{
  private f eIc;
  private final com.tencent.mm.ai.b fpJ;
  private csv fpK;
  private s fpL;

  public q(s params)
  {
    AppMethodBeat.i(93736);
    this.fpL = params;
    this.tZt = params.cIv;
    this.tZu = params.ctj;
    this.Lp = params.offset;
    this.gOW = params.scene;
    this.tZv = params.tZN;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new csu();
    ((b.a)localObject).fsK = new csv();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/weappsearch";
    ((b.a)localObject).fsI = 1162;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.fpJ = ((b.a)localObject).acD();
    csu localcsu = (csu)this.fpJ.fsG.fsP;
    localObject = abJ();
    localcsu.jCt = params.businessType;
    localcsu.wol = params.ctj;
    localcsu.vOq = params.offset;
    localcsu.vQg = params.lcA;
    localcsu.wCv = params.tZC;
    ig localig = new ig();
    com.tencent.mm.sdk.b.a.xxA.m(localig);
    localcsu.wCu = localig.cDp.cDq;
    if (localObject != null)
    {
      localcsu.wCw = ((axy)localObject).vRp;
      localcsu.wCx = ((axy)localObject).vRq;
    }
    localcsu.wCy = b.fpD;
    localcsu.xqd = params.tZy;
    localcsu.xqe = params.tZD;
    localcsu.xqf = params.tZE;
    localcsu.xqb = b.fpE;
    localcsu.wOI = params.mDw;
    ab.i("MicroMsg.NetSceneWeAppSearch", "NetSceneWeAppSearch oreh SessionID : %s, KeywordID : %s, LocationX : %s, LocationY : %s", new Object[] { localcsu.wCy, localcsu.xqb, Double.valueOf(localcsu.wCw), Double.valueOf(localcsu.wCx) });
    AppMethodBeat.o(93736);
  }

  private static axy abJ()
  {
    AppMethodBeat.i(93739);
    try
    {
      Object localObject1 = (String)g.RP().Ry().get(67591, null);
      axy localaxy;
      if (localObject1 != null)
      {
        localaxy = new com/tencent/mm/protocal/protobuf/axy;
        localaxy.<init>();
        localObject1 = ((String)localObject1).split(",");
        localaxy.wfG = Integer.valueOf(localObject1[0]).intValue();
        localaxy.wfJ = Integer.valueOf(localObject1[1]).intValue();
        localaxy.vRq = (Integer.valueOf(localObject1[2]).intValue() / 1000000.0F);
        localaxy.vRp = (Integer.valueOf(localObject1[3]).intValue() / 1000000.0F);
        ab.i("MicroMsg.NetSceneWeAppSearch", "lbs location is not null, %f, %f", new Object[] { Float.valueOf(localaxy.vRq), Float.valueOf(localaxy.vRp) });
        AppMethodBeat.o(93739);
      }
      while (true)
      {
        return localaxy;
        ab.i("MicroMsg.NetSceneWeAppSearch", "lbs location is null, lbsContent is null!");
        AppMethodBeat.o(93739);
        localaxy = null;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.i("MicroMsg.NetSceneWeAppSearch", "lbs location is null, reason %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(93739);
        Object localObject2 = null;
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(93738);
    ab.i("MicroMsg.NetSceneWeAppSearch", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.fpJ, this);
    AppMethodBeat.o(93738);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93737);
    ab.i("MicroMsg.NetSceneWeAppSearch", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fpK = ((csv)this.fpJ.fsH.fsP);
    if (this.fpK != null)
      ab.v("MicroMsg.NetSceneWeAppSearch", "return data\n%s", new Object[] { this.fpK.vOy });
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(93737);
  }

  public final String abH()
  {
    if (this.fpK != null);
    for (String str = this.fpK.vOy; ; str = "")
      return str;
  }

  public final int abI()
  {
    if (this.fpK != null);
    for (int i = this.fpK.wCB; ; i = 0)
      return i;
  }

  public final int getType()
  {
    return 1162;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.q
 * JD-Core Version:    0.6.2
 */