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
import com.tencent.mm.protocal.protobuf.azx;
import com.tencent.mm.protocal.protobuf.azy;
import com.tencent.mm.sdk.platformtools.ab;

public final class v extends m
  implements k
{
  public int businessType;
  public int cIv;
  private f ehi;
  private b fAT;
  public String nQB;
  public int scene;
  public azy tZT;
  private int tZU;

  public v(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, long paramLong, String paramString2)
  {
    AppMethodBeat.i(124069);
    this.scene = paramInt1;
    this.tZU = paramInt3;
    this.cIv = paramInt4;
    this.businessType = paramInt2;
    this.nQB = paramString2;
    ab.i("MicroMsg.FTS.NetSceneWebSearchGuide", "scene %d, h5Version=%d type=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt2) });
    paramString2 = new b.a();
    paramString2.fsI = 1048;
    paramString2.uri = "/cgi-bin/mmsearch-bin/searchguide";
    paramString2.fsJ = new azx();
    paramString2.fsK = new azy();
    this.fAT = paramString2.acD();
    paramString2 = (azx)this.fAT.fsG.fsP;
    paramString2.Scene = paramInt1;
    paramString2.wDH = paramInt3;
    paramString2.wDI = aa.abJ();
    paramString2.wDJ = paramInt2;
    paramString2.luQ = paramString1;
    paramString2.wDK = paramLong;
    AppMethodBeat.o(124069);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(124070);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(124070);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(124071);
    ab.i("MicroMsg.FTS.NetSceneWebSearchGuide", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(124071);
    }
    while (true)
    {
      return;
      this.tZT = ((azy)this.fAT.fsH.fsP);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(124071);
    }
  }

  public final int getType()
  {
    return 1048;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.v
 * JD-Core Version:    0.6.2
 */