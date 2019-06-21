package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bmd;
import com.tencent.mm.protocal.protobuf.bme;
import com.tencent.mm.sdk.platformtools.ab;

public final class k extends m
  implements com.tencent.mm.network.k
{
  private b ehh;
  private f ehi;
  public bmd nyA;
  public bme nyB;

  public k(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(21866);
    this.ehh = null;
    this.nyA = null;
    this.nyB = null;
    this.ehi = null;
    b.a locala = new b.a();
    locala.fsJ = new bmd();
    locala.fsK = new bme();
    locala.fsI = 726;
    locala.uri = "/cgi-bin/micromsg-bin/pstnredirect";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.nyA = ((bmd)this.ehh.fsG.fsP);
    this.nyA.wem = paramInt;
    this.nyA.wen = paramLong1;
    this.nyA.wOS = paramLong2;
    AppMethodBeat.o(21866);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(21867);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21867);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21868);
    ab.i("MicroMsg.NetSceneIPCallRedirect", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyB = ((bme)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(21868);
  }

  public final int getType()
  {
    return 726;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.k
 * JD-Core Version:    0.6.2
 */