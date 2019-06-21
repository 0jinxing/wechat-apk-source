package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.l;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends m
  implements k
{
  private f ehi;
  private final q ftU;

  public i()
  {
    AppMethodBeat.i(123430);
    this.ftU = new l();
    AppMethodBeat.o(123430);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(123431);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(123431);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(123432);
    ab.d("MicroMsg.NetSceneGetCert", "dkcert onGYNetEnd [%d,%d]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(123432);
  }

  public final boolean acM()
  {
    return false;
  }

  public final int getType()
  {
    return 381;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.i
 * JD-Core Version:    0.6.2
 */