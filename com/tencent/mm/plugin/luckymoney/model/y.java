package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ab;

public final class y extends m
  implements k
{
  private b ehh;
  private f ehi;

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(42387);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(42387);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(42388);
    ab.d("MicroMsg.NetSceneAsyncBizSubscribe", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(42388);
  }

  public final int getType()
  {
    return 980;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.y
 * JD-Core Version:    0.6.2
 */