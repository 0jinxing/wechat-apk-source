package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.blw;
import com.tencent.mm.protocal.protobuf.blx;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private blw nyh;
  public blx nyi;

  public b(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    AppMethodBeat.i(21839);
    this.ehh = null;
    this.nyh = null;
    this.nyi = null;
    b.a locala = new b.a();
    locala.fsJ = new blw();
    locala.fsK = new blx();
    locala.fsI = 807;
    locala.uri = "/cgi-bin/micromsg-bin/pstnchecknumber";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.nyh = ((blw)this.ehh.fsG.fsP);
    this.nyh.wOT = paramString1;
    this.nyh.wOV = paramString2;
    this.nyh.wOX = paramString3;
    this.nyh.wOW = paramString4;
    this.nyh.wOY = paramInt;
    ab.i("MicroMsg.NetSceneIPCallCheckNumber", "NetSceneIPCallCheckNumber pureNumber:%s,lastCountry:%s,osCountry:%s,simCountry:%s,dialScene:%d", new Object[] { paramString1, paramString2, paramString3, paramString4, Integer.valueOf(paramInt) });
    AppMethodBeat.o(21839);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(21840);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21840);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21841);
    ab.i("MicroMsg.NetSceneIPCallCheckNumber", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyi = ((blx)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(21841);
  }

  public final int getType()
  {
    return 807;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.b
 * JD-Core Version:    0.6.2
 */