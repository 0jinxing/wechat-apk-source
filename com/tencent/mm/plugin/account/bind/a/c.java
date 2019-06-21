package com.tencent.mm.plugin.account.bind.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ciy;
import com.tencent.mm.protocal.protobuf.ciz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

public final class c extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public c()
  {
    AppMethodBeat.i(13324);
    b.a locala = new b.a();
    locala.fsJ = new ciy();
    locala.fsK = new ciz();
    locala.uri = "/cgi-bin/micromsg-bin/unbindlinkedincontact";
    locala.fsI = 550;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((ciy)this.ehh.fsG.fsP).vIJ = 1;
    AppMethodBeat.o(13324);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(13325);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(13325);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13326);
    ab.d("MicroMsg.NetSceneUnBindLinkedinContact", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      g.RP().Ry().set(286722, "");
      g.RP().Ry().set(286721, "");
      g.RP().Ry().set(286723, "");
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(13326);
  }

  public final int getType()
  {
    return 550;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.a.c
 * JD-Core Version:    0.6.2
 */