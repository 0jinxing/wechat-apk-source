package com.tencent.mm.plugin.luckymoney.f2f.a;

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
import com.tencent.mm.protocal.protobuf.zt;
import com.tencent.mm.protocal.protobuf.zu;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  private f ehi;
  private b gme;
  private zt nTX;
  private zu nTY;

  public a(String paramString)
  {
    AppMethodBeat.i(42145);
    b.a locala = new b.a();
    locala.fsJ = new zt();
    locala.fsK = new zu();
    locala.fsI = 1987;
    locala.fsL = 0;
    locala.fsM = 0;
    locala.uri = "/cgi-bin/mmpay-bin/ftfhb/ffclearwxhb";
    this.gme = locala.acD();
    this.nTX = ((zt)this.gme.fsG.fsP);
    this.nTX.nSX = paramString;
    AppMethodBeat.o(42145);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(42147);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(42147);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(42146);
    this.nTY = ((zu)((b)paramq).fsH.fsP);
    ab.i("NetSceneF2FLuckyMoneyClear", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(this.nTY.kCl), this.nTY.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, this.nTY.kCl, this.nTY.kCm, this);
    AppMethodBeat.o(42146);
  }

  public final int getType()
  {
    return 1987;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.a.a
 * JD-Core Version:    0.6.2
 */