package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bmj;
import com.tencent.mm.protocal.protobuf.bmk;
import com.tencent.mm.sdk.platformtools.ab;

public final class o extends m
  implements k
{
  private b ehh;
  private f ehi;
  public bmj nyI;
  public bmk nyJ;

  public o(int paramInt1, long paramLong1, int paramInt2, long paramLong2, boolean paramBoolean)
  {
    AppMethodBeat.i(21878);
    this.ehh = null;
    this.nyI = null;
    this.nyJ = null;
    b.a locala = new b.a();
    locala.fsJ = new bmj();
    locala.fsK = new bmk();
    locala.fsI = 819;
    locala.uri = "/cgi-bin/micromsg-bin/pstnsync";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    long l = System.currentTimeMillis();
    this.nyI = ((bmj)this.ehh.fsG.fsP);
    this.nyI.wPm = r.Yz();
    this.nyI.wem = paramInt1;
    this.nyI.wen = paramLong1;
    this.nyI.wOP = l;
    this.nyI.wPn = paramInt2;
    this.nyI.wOS = paramLong2;
    if (!paramBoolean);
    for (this.nyI.wPo = 0; ; this.nyI.wPo = 1)
    {
      ab.i("MicroMsg.NetSceneIPCallSync", "roomId: %d, roomKey: %d, syncKey: %d, callSeq: %d,dataFlag: %d, timestamp: %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Integer.valueOf(paramInt2), Long.valueOf(paramLong2), Integer.valueOf(this.nyI.wPo), Long.valueOf(l) });
      AppMethodBeat.o(21878);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(21879);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21879);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21880);
    ab.i("MicroMsg.NetSceneIPCallSync", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyJ = ((bmk)((b)paramq).fsH.fsP);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(21880);
  }

  public final int getType()
  {
    return 819;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.o
 * JD-Core Version:    0.6.2
 */