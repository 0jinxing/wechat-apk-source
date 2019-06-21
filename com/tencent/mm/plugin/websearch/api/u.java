package com.tencent.mm.plugin.websearch.api;

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
import com.tencent.mm.protocal.protobuf.cvg;
import com.tencent.mm.protocal.protobuf.cvh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class u extends m
  implements k
{
  private f ehi;
  private b fAT;
  cvg tZR;
  cvh tZS;

  public u(int paramInt)
  {
    AppMethodBeat.i(124066);
    this.tZR = new cvg();
    b.a locala = new b.a();
    locala.fsI = 1948;
    locala.uri = "/cgi-bin/mmsearch-bin/websearchconfig";
    locala.fsJ = new cvg();
    locala.fsK = new cvh();
    this.fAT = locala.acD();
    this.tZR = ((cvg)this.fAT.fsG.fsP);
    this.tZR.wDH = aa.HV(0);
    this.tZR.luQ = com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext());
    this.tZR.vKt = aa.bVP();
    this.tZR.wDI = aa.abJ();
    this.tZR.Scene = paramInt;
    this.tZR.vQd = 0L;
    AppMethodBeat.o(124066);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(124067);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(124067);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(124068);
    ab.i("MicroMsg.WebSearch.NetSceneWebSearchConfig", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(124068);
    }
    while (true)
    {
      return;
      this.tZS = ((cvh)this.fAT.fsH.fsP);
      if (this.tZS != null)
        ab.v("MicroMsg.WebSearch.NetSceneWebSearchConfig", "return data\n%s", new Object[] { this.tZS.vOy });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(124068);
    }
  }

  public final int getType()
  {
    return 1948;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.u
 * JD-Core Version:    0.6.2
 */