package com.tencent.mm.plugin.nfc_open.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.uj;
import com.tencent.mm.protocal.protobuf.uk;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  public com.tencent.mm.ai.b ehh;
  private f ehi;

  public b(int paramInt)
  {
    AppMethodBeat.i(23060);
    b.a locala = new b.a();
    locala.fsJ = new uj();
    locala.fsK = new uk();
    locala.uri = "/cgi-bin/mmpay-bin/cpucardgetconfig2";
    locala.fsI = 1561;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((uj)this.ehh.fsG.fsP).version = paramInt;
    AppMethodBeat.o(23060);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(23061);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(23061);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(23062);
    ab.d("MicroMsg.NetSceneCpuCardGetConfig", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(23062);
  }

  public final int getType()
  {
    return 1561;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc_open.a.b
 * JD-Core Version:    0.6.2
 */