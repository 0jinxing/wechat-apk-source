package com.tencent.mm.plugin.account.security.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.anv;
import com.tencent.mm.protocal.protobuf.anw;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public anw gzh;

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(69830);
    b.a locala = new b.a();
    locala.fsJ = new anv();
    locala.fsK = new anw();
    locala.uri = "/cgi-bin/micromsg-bin/getsafetyinfo";
    locala.fsI = 850;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(69830);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(69829);
    if ((paramInt2 != 0) || (paramInt3 != 0))
      ab.e("MicroMsg.NetSceneGetSafetyInfo", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.gzh = ((anw)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(69829);
  }

  public final int getType()
  {
    return 850;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.a.b
 * JD-Core Version:    0.6.2
 */