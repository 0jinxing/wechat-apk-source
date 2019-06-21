package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bly;
import com.tencent.mm.protocal.protobuf.blz;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends m
  implements k
{
  private b ehh;
  private f ehi;
  public bly nyu;
  private blz nyv;

  public h(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(21857);
    this.ehh = null;
    this.nyu = null;
    this.nyv = null;
    this.ehi = null;
    b.a locala = new b.a();
    locala.fsJ = new bly();
    locala.fsK = new blz();
    locala.fsI = 824;
    locala.uri = "/cgi-bin/micromsg-bin/pstnheartbeat";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    long l = System.currentTimeMillis();
    this.nyu = ((bly)this.ehh.fsG.fsP);
    this.nyu.wem = paramInt;
    this.nyu.wen = paramLong1;
    this.nyu.wOS = paramLong2;
    this.nyu.wOP = l;
    ab.d("MicroMsg.NetSceneIPCallHeartBeat", "heartbeat, roomId: %d, roomKey: %d, callSeq: %d, timestamp: %d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(l) });
    AppMethodBeat.o(21857);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(21858);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21858);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21859);
    ab.i("MicroMsg.NetSceneIPCallHeartBeat", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyv = ((blz)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(21859);
  }

  public final int getType()
  {
    return 824;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.h
 * JD-Core Version:    0.6.2
 */