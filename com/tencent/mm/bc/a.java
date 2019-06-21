package com.tencent.mm.bc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.wj;
import com.tencent.mm.protocal.protobuf.wk;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public a(String paramString)
  {
    AppMethodBeat.i(136855);
    b.a locala = new b.a();
    locala.fsJ = new wj();
    locala.fsK = new wk();
    locala.uri = "/cgi-bin/micromsg-bin/deletecardimg";
    locala.fsI = 576;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((wj)this.ehh.fsG.fsP).wcP = paramString;
    AppMethodBeat.o(136855);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(136856);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(136856);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(136857);
    ab.d("MicroMsg.NetSceneDeleteCardImg", "onGYNetEnd:%s, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(136857);
  }

  public final int getType()
  {
    return 576;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bc.a
 * JD-Core Version:    0.6.2
 */