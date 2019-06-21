package com.tencent.mm.plugin.collect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.or;
import com.tencent.mm.protocal.protobuf.os;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends m
  implements k
{
  private f ehi;
  private b gme;
  public os kCi;

  public j()
  {
    AppMethodBeat.i(40970);
    b.a locala = new b.a();
    locala.fsJ = new or();
    locala.fsK = new os();
    locala.fsI = 1256;
    locala.uri = "/cgi-bin/mmpay-bin/f2fannounce";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    ab.d("MicroMsg.NetSceneF2fAnnouce", "do cgi");
    AppMethodBeat.o(40970);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(40971);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(40971);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(40972);
    ab.i("MicroMsg.NetSceneF2fAnnouce", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.kCi = ((os)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(40972);
  }

  public final int getType()
  {
    return 1256;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.j
 * JD-Core Version:    0.6.2
 */