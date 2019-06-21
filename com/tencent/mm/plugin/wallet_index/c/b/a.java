package com.tencent.mm.plugin.wallet_index.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bjv;
import com.tencent.mm.protocal.protobuf.bjw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.u;

public final class a extends u
{
  private b ehh;
  private f ehi;
  public String tRa;
  public String tRb;

  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
    AppMethodBeat.i(48215);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bjv();
    ((b.a)localObject).fsK = new bjw();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payugenprepay";
    ((b.a)localObject).fsI = 1521;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bjv)this.ehh.fsG.fsP;
    ((bjv)localObject).fKh = paramString1;
    ((bjv)localObject).vYP = paramString4;
    ((bjv)localObject).vYO = paramString3;
    ((bjv)localObject).vYQ = paramString5;
    ((bjv)localObject).vYR = paramString2;
    ((bjv)localObject).vLo = paramString6;
    ((bjv)localObject).vXP = paramString7;
    ((bjv)localObject).wla = paramString8;
    ((bjv)localObject).vAM = paramInt;
    ab.d("MicroMsg.NetScenePayUGenPrepay", String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,", new Object[] { paramString1, paramString4, paramString3, paramString5, paramString2, paramString6, paramString7, paramString8 }));
    AppMethodBeat.o(48215);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(48217);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48217);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48216);
    ab.d("MicroMsg.NetScenePayUGenPrepay", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    paramString = (bjw)((b)paramq).fsH.fsP;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.d("MicroMsg.NetScenePayUGenPrepay", "rr " + paramString.wlb);
      this.tRa = paramString.wlb;
      this.tRb = paramString.wlc;
    }
    paramString = paramString.luU;
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(48216);
  }

  public final int getType()
  {
    return 1521;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.b.a
 * JD-Core Version:    0.6.2
 */