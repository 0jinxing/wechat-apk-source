package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ayw;
import com.tencent.mm.protocal.protobuf.ayx;
import com.tencent.mm.sdk.platformtools.ab;

public final class p extends m
  implements k
{
  public final b ehh;
  private f ehi;

  public p()
  {
    AppMethodBeat.i(78584);
    b.a locala = new b.a();
    locala.fsJ = new ayw();
    locala.fsK = new ayx();
    locala.uri = "/cgi-bin/micromsg-bin/logout";
    locala.fsI = 282;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((ayw)this.ehh.fsG.fsP).Scene = 0;
    AppMethodBeat.o(78584);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78585);
    ab.d("MicroMsg.NetSceneLogout", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78585);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78586);
    if ((paramInt2 != 0) || (paramInt3 != 0))
      ab.d("MicroMsg.NetSceneLogout", "logout Error. ");
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78586);
  }

  public final int getType()
  {
    return 282;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.p
 * JD-Core Version:    0.6.2
 */