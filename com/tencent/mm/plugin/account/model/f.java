package com.tencent.mm.plugin.account.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bwp;
import com.tencent.mm.protocal.protobuf.bwq;

public final class f extends m
  implements k
{
  private final b ehh;
  private com.tencent.mm.ai.f ehi;

  public f(bwp parambwp)
  {
    AppMethodBeat.i(124682);
    this.ehi = null;
    b.a locala = new b.a();
    locala.fsJ = parambwp;
    locala.fsK = new bwq();
    locala.uri = "/cgi-bin/micromsg-bin/sendphoto2fbwall";
    locala.fsI = 433;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(124682);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(124683);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(124683);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(124684);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(124684);
  }

  public final int getType()
  {
    return 433;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.f
 * JD-Core Version:    0.6.2
 */