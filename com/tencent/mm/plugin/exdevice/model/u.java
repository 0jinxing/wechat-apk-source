package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bvc;
import com.tencent.mm.protocal.protobuf.bvd;
import com.tencent.mm.sdk.platformtools.ab;

public final class u extends m
  implements k
{
  b ehh;
  private f ehi;

  public u(String paramString)
  {
    AppMethodBeat.i(19341);
    this.ehi = null;
    this.ehh = null;
    b.a locala = new b.a();
    locala.fsJ = new bvc();
    locala.fsK = new bvd();
    locala.uri = "/cgi-bin/micromsg-bin/searchharddevice";
    locala.fsI = 540;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((bvc)this.ehh.fsG.fsP).wWs = paramString;
    AppMethodBeat.o(19341);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19343);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19343);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19342);
    ab.i("MicroMsg.exdevice.NetSceneSearchHardDevice", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19342);
  }

  public final int getType()
  {
    return 540;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.u
 * JD-Core Version:    0.6.2
 */