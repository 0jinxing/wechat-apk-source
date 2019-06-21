package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bfq;
import com.tencent.mm.protocal.protobuf.bfr;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  private b ehh;
  private f ehi;

  public c(int paramInt, String paramString)
  {
    AppMethodBeat.i(24607);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bfq();
    ((b.a)localObject).fsK = new bfr();
    ((b.a)localObject).uri = "/cgi-bin/mmoctv/optvhist";
    ((b.a)localObject).fsI = 1740;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bfq)this.ehh.fsG.fsP;
    ((bfq)localObject).nbk = paramInt;
    ((bfq)localObject).wJx = paramString;
    AppMethodBeat.o(24607);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(24609);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(24609);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24608);
    ab.i("MicroMsg.NetSceneOpTvHist", "onGYNetEnd [%d,%d]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(24608);
  }

  public final int getType()
  {
    return 1740;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.c
 * JD-Core Version:    0.6.2
 */