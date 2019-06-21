package com.tencent.mm.plugin.sport.model;

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
import com.tencent.mm.plugin.sport.a.c;
import com.tencent.mm.protocal.protobuf.aom;
import com.tencent.mm.protocal.protobuf.aon;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

public final class d extends m
  implements k
{
  private f ehi;
  private b fAT;
  aom rPr;
  aon rPs;
  private WeakReference<c> rPt;

  public d(long paramLong1, long paramLong2, c paramc)
  {
    AppMethodBeat.i(93657);
    this.rPt = new WeakReference(paramc);
    paramc = new b.a();
    paramc.fsI = 1734;
    paramc.uri = "/cgi-bin/mmoc-bin/hardware/getsteplist";
    paramc.fsJ = new aom();
    paramc.fsK = new aon();
    this.fAT = paramc.acD();
    this.rPr = ((aom)this.fAT.fsG.fsP);
    this.rPr.wdb = ((int)(paramLong1 / 1000L));
    this.rPr.wdc = ((int)(paramLong2 / 1000L));
    AppMethodBeat.o(93657);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(93658);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(93658);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93659);
    ab.i("MicroMsg.Sport.NetSceneGetStepList", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.rPs = ((aon)this.fAT.fsH.fsP);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(93659);
  }

  public final c cwm()
  {
    AppMethodBeat.i(138291);
    c localc = (c)this.rPt.get();
    AppMethodBeat.o(138291);
    return localc;
  }

  public final int getType()
  {
    return 1734;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.d
 * JD-Core Version:    0.6.2
 */