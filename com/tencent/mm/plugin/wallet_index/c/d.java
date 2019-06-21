package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.adh;
import com.tencent.mm.protocal.protobuf.adi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.u;

public final class d extends u
{
  private b ehh;
  private f ehi;
  public String tRa;
  public String tRb;

  public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt1, int paramInt2, String paramString9)
  {
    AppMethodBeat.i(48178);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new adh();
    ((b.a)localObject).fsK = new adi();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/genmallprepay";
    ((b.a)localObject).fsI = 2755;
    ((b.a)localObject).fsL = 189;
    ((b.a)localObject).fsM = 1000000189;
    this.ehh = ((b.a)localObject).acD();
    localObject = (adh)this.ehh.fsG.fsP;
    ((adh)localObject).fKh = paramString1;
    ((adh)localObject).vYP = paramString4;
    ((adh)localObject).vYO = paramString3;
    ((adh)localObject).vYQ = paramString5;
    ((adh)localObject).vYR = paramString2;
    ((adh)localObject).vLo = paramString6;
    ((adh)localObject).vXP = paramString7;
    ((adh)localObject).wla = paramString8;
    ((adh)localObject).vAM = paramInt1;
    ((adh)localObject).ndT = paramString9;
    if (paramInt2 > 0)
      ((adh)localObject).Scene = paramInt2;
    ab.d("MicroMsg.NetSceneGenMallPrepay", String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,channel:%s,scene:%s", new Object[] { paramString1, paramString4, paramString3, paramString5, paramString2, paramString6, paramString7, paramString8, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
    AppMethodBeat.o(48178);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(48180);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48180);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48179);
    ab.d("MicroMsg.NetSceneGenMallPrepay", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    paramq = (adi)((b)paramq).fsH.fsP;
    ab.i("MicroMsg.NetSceneGenMallPrepay", "hy: errCode and errMsg in proto: errCode: %d, errMsg:%s", new Object[] { Integer.valueOf(paramq.luT), paramq.luU });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.d("MicroMsg.NetSceneGenMallPrepay", "rr " + paramq.wlb);
      this.tRa = paramq.wlb;
      this.tRb = paramq.wlc;
    }
    paramString = paramq.luU;
    paramInt2 = paramq.luT;
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(48179);
  }

  public final int getType()
  {
    return 2755;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.d
 * JD-Core Version:    0.6.2
 */