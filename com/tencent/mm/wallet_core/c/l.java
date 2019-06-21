package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.protocal.protobuf.nh;
import com.tencent.mm.protocal.protobuf.ni;
import com.tencent.mm.sdk.platformtools.ab;

public final class l extends u
{
  private b ehh;
  private f ehi;

  public l(String paramString1, String paramString2)
  {
    AppMethodBeat.i(49058);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new nh();
    ((b.a)localObject).fsK = new ni();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/cancelqrpay";
    ((b.a)localObject).fsI = 410;
    ((b.a)localObject).fsL = 198;
    ((b.a)localObject).fsM = 1000000198;
    ((b.a)localObject).fsO = com.tencent.mm.wallet_core.ui.e.atB(paramString2);
    this.ehh = ((b.a)localObject).acD();
    localObject = (nh)this.ehh.fsG.fsP;
    ((nh)localObject).vRO = paramString1;
    ((nh)localObject).vHD = paramString2;
    ((nh)localObject).vRP = k.cPy();
    AppMethodBeat.o(49058);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(49060);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(49060);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(49059);
    ab.d("MicroMsg.NetSceneCancelQRPay", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(49059);
  }

  public final int getType()
  {
    return 410;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.l
 * JD-Core Version:    0.6.2
 */