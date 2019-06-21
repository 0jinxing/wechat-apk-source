package com.tencent.mm.plugin.wallet_payu.order.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bjq;
import com.tencent.mm.protocal.protobuf.bjr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.u;

public final class a extends u
{
  public b ehh;
  private f ehi;

  public a(int paramInt)
  {
    AppMethodBeat.i(48415);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bjq();
    ((b.a)localObject).fsK = new bjr();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payubatchuserroll";
    ((b.a)localObject).fsI = 1519;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bjq)this.ehh.fsG.fsP;
    ((bjq)localObject).nco = 10;
    ((bjq)localObject).vOq = paramInt;
    ab.d("MicroMsg.NetScenePayUPayQueryUserRoll", "limit:10,offset:".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(48415);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(48417);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48417);
    return i;
  }

  public final int cTg()
  {
    return ((bjr)this.ehh.fsH.fsP).wMZ;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48416);
    ab.w("MicroMsg.NetScenePayUPayQueryUserRoll", "errType = " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString);
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      ab.d("MicroMsg.NetScenePayUPayQueryUserRoll", "rr" + ((bjr)((b)paramq).fsH.fsP).wMZ);
    AppMethodBeat.o(48416);
  }

  public final int getType()
  {
    return 1519;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.order.a.a
 * JD-Core Version:    0.6.2
 */