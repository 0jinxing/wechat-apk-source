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
import com.tencent.mm.protocal.protobuf.ayy;
import com.tencent.mm.protocal.protobuf.ayz;

public final class ab extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public ab(int paramInt)
  {
    AppMethodBeat.i(78612);
    b.a locala = new b.a();
    locala.fsJ = new ayy();
    locala.fsK = new ayz();
    locala.uri = "/cgi-bin/micromsg-bin/logoutwebwx";
    locala.fsI = 281;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((ayy)this.ehh.fsG.fsP).OpCode = paramInt;
    AppMethodBeat.o(78612);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78613);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneWebWXLogout", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78613);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78614);
    if ((paramInt2 != 0) || (paramInt3 != 0))
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneWebWXLogout", "logout Error. ");
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78614);
  }

  public final int getType()
  {
    return 281;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ab
 * JD-Core Version:    0.6.2
 */