package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.protocal.protobuf.bjo;
import com.tencent.mm.protocal.protobuf.bjp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class r extends u
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;

  public r(String paramString)
  {
    this(paramString, null, null, -1, -1, -1);
  }

  public r(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(49074);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bjo();
    ((b.a)localObject).fsK = new bjp();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/paysubscribe";
    ((b.a)localObject).fsI = 421;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    ((b.a)localObject).fsO = com.tencent.mm.wallet_core.ui.e.atB(paramString2);
    this.ehh = ((b.a)localObject).acD();
    localObject = (bjo)this.ehh.fsG.fsP;
    ((bjo)localObject).wMV = paramString1;
    ((bjo)localObject).vRP = k.cPy();
    ((bjo)localObject).wMW = paramString3;
    if (!bo.isNullOrNil(paramString2))
      ((bjo)localObject).wMX = new com.tencent.mm.bt.b(paramString2.getBytes());
    if (paramInt1 >= 0)
      ((bjo)localObject).vRK = paramInt1;
    if (paramInt2 >= 0)
      ((bjo)localObject).vAM = paramInt2;
    if (paramInt3 >= 0)
      ((bjo)localObject).wMY = paramInt3;
    AppMethodBeat.o(49074);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(49075);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(49075);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(49076);
    ab.d("MicroMsg.NetScenePaySubscribe", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(49076);
  }

  public final int getType()
  {
    return 421;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.r
 * JD-Core Version:    0.6.2
 */