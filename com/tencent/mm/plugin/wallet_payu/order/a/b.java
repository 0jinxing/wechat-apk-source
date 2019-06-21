package com.tencent.mm.plugin.wallet_payu.order.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bjt;
import com.tencent.mm.protocal.protobuf.bju;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.u;

public final class b extends u
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;

  public b(String paramString)
  {
    AppMethodBeat.i(48418);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bjt();
    ((b.a)localObject).fsK = new bju();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payudeluserroll";
    ((b.a)localObject).fsI = 1544;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bjt)this.ehh.fsG.fsP;
    if (!bo.isNullOrNil(paramString))
      ((bjt)localObject).pcU = paramString;
    AppMethodBeat.o(48418);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(48420);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48420);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48419);
    ab.d("MicroMsg.NetScenePayUDelUserRoll", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(48419);
  }

  public final int getType()
  {
    return 1544;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.order.a.b
 * JD-Core Version:    0.6.2
 */