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
import com.tencent.mm.protocal.protobuf.afz;
import com.tencent.mm.protocal.protobuf.aga;
import com.tencent.mm.sdk.platformtools.ab;

public final class o extends m
  implements k
{
  b ehh;
  private f ehi;

  public o()
  {
    AppMethodBeat.i(19322);
    this.ehi = null;
    this.ehh = null;
    b.a locala = new b.a();
    locala.fsJ = new afz();
    locala.fsK = new aga();
    locala.uri = "/cgi-bin/micromsg-bin/getboundharddevices";
    locala.fsI = 539;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((afz)this.ehh.fsG.fsP).Version = 1;
    AppMethodBeat.o(19322);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19324);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19324);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19323);
    ab.i("MicroMsg.exdevice.NetSceneGetBoundHardDevices", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19323);
  }

  public final int getType()
  {
    return 539;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.o
 * JD-Core Version:    0.6.2
 */