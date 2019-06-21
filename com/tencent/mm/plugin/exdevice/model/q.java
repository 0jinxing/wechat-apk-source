package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.protobuf.aok;
import com.tencent.mm.protocal.protobuf.aol;
import com.tencent.mm.sdk.platformtools.ab;

public final class q extends m
  implements k
{
  public b ehh = null;
  private f ehi = null;

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19328);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new aok();
    paramf.fsK = new aol();
    paramf.uri = "/cgi-bin/mmbiz-bin/rank/getsportdevicelist";
    paramf.fsI = 1267;
    paramf.fsL = 0;
    paramf.fsM = 0;
    this.ehh = paramf.acD();
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19328);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19327);
    ab.i("MicroMsg.exdevice.NetSceneGetSportDeviceList", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19327);
  }

  public final int getType()
  {
    return 1267;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.q
 * JD-Core Version:    0.6.2
 */