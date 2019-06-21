package com.tencent.mm.plugin.wallet_payu.pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bjs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.u;

public final class a extends u
{
  private b ehh;
  private f ehi;

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(48438);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48438);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48439);
    ab.d("MicroMsg.NetScenePayUCheckJsApi", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    paramString = (bjs)((b)paramq).fsH.fsP;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      ab.d("MicroMsg.NetScenePayUCheckJsApi", "rr " + paramString.luT);
    paramString = paramString.luU;
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(48439);
  }

  public final int getType()
  {
    return 1554;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.a.a
 * JD-Core Version:    0.6.2
 */