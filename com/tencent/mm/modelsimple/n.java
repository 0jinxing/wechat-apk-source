package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.anp;
import com.tencent.mm.protocal.protobuf.anq;

public final class n extends m
  implements k
{
  private f ehi;
  public final b fAT;

  public n()
  {
    AppMethodBeat.i(16591);
    b.a locala = new b.a();
    locala.fsJ = new anp();
    locala.fsK = new anq();
    locala.uri = "/cgi-bin/micromsg-bin/getremind";
    locala.fsI = 866;
    locala.fsL = 0;
    locala.fsM = 0;
    this.fAT = locala.acD();
    AppMethodBeat.o(16591);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16592);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(16592);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16593);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16593);
  }

  public final int getType()
  {
    return 866;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.n
 * JD-Core Version:    0.6.2
 */