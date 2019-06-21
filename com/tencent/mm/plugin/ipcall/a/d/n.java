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
import com.tencent.mm.protocal.protobuf.bmh;
import com.tencent.mm.protocal.protobuf.bmi;
import com.tencent.mm.sdk.platformtools.ab;

public final class n extends m
  implements k
{
  private b ehh;
  private f ehi;
  public bmh nyG;
  private bmi nyH;

  public n(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    AppMethodBeat.i(21875);
    this.ehh = null;
    this.nyG = null;
    this.nyH = null;
    this.ehi = null;
    b.a locala = new b.a();
    locala.fsJ = new bmh();
    locala.fsK = new bmi();
    locala.fsI = 723;
    locala.uri = "/cgi-bin/micromsg-bin/pstnshutdown";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    long l = System.currentTimeMillis();
    this.nyG = ((bmh)this.ehh.fsG.fsP);
    this.nyG.ndG = r.Yz();
    this.nyG.wem = paramInt1;
    this.nyG.wen = paramLong1;
    this.nyG.wOS = paramLong2;
    this.nyG.jBT = paramInt2;
    this.nyG.wOP = l;
    ab.i("MicroMsg.NetSceneIPCallShutDown", "roomId: %d, roomKey: %d, callSeq: %d, status: %d, timestamp: %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt2), Long.valueOf(l) });
    AppMethodBeat.o(21875);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(21876);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21876);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21877);
    ab.i("MicroMsg.NetSceneIPCallShutDown", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyH = ((bmi)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(21877);
  }

  public final int getType()
  {
    return 723;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.n
 * JD-Core Version:    0.6.2
 */