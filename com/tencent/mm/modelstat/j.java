package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ain;
import com.tencent.mm.protocal.protobuf.aio;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends m
  implements k
{
  private f eIc;
  final com.tencent.mm.ai.b fSY;

  public j(com.tencent.mm.bt.b paramb)
  {
    AppMethodBeat.i(78737);
    b.a locala = new b.a();
    ain localain = new ain();
    localain.vBd = 0;
    localain.woy = paramb;
    locala.fsJ = localain;
    locala.fsK = new aio();
    locala.uri = "/cgi-bin/mmbiz-bin/geteventsampleconf";
    locala.fsI = 1126;
    locala.fsL = 0;
    locala.fsM = 0;
    this.fSY = locala.acD();
    AppMethodBeat.o(78737);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78738);
    ab.i("MicroMsg.NetSceneUpdateEventConfig", "start update event config");
    this.ftk = true;
    this.eIc = paramf;
    int i = a(parame, this.fSY, this);
    AppMethodBeat.o(78738);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78739);
    ab.i("MicroMsg.NetSceneUpdateEventConfig", "onGYNetEnd errType: %d, errCode: %d, errMsg %s, IReqResp %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, paramq.toString() });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78739);
  }

  public final int getType()
  {
    return 1126;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.j
 * JD-Core Version:    0.6.2
 */