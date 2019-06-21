package com.tencent.mm.plugin.websearch.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bsj;
import com.tencent.mm.protocal.protobuf.bsk;
import com.tencent.mm.sdk.platformtools.ab;

public final class w extends m
  implements k
{
  private f ehi;
  public b fAT;
  private int scene;
  private String tZV;

  public w(bsj parambsj)
  {
    AppMethodBeat.i(124072);
    b.a locala = new b.a();
    locala.fsI = 1134;
    locala.uri = "/cgi-bin/mmsearch-bin/searchreport";
    locala.fsJ = parambsj;
    locala.fsK = new bsk();
    this.fAT = locala.acD();
    this.scene = parambsj.Scene;
    this.tZV = parambsj.wUu;
    AppMethodBeat.o(124072);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(124074);
    ab.i("MicroMsg.FTS.NetSceneWebSearchReport", "doScene %d", new Object[] { Integer.valueOf(this.scene) });
    an.Il(5);
    an.y(this.scene, 4, this.tZV);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(124074);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(124073);
    ab.i("MicroMsg.FTS.NetSceneWebSearchReport", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      an.Il(7);
      AppMethodBeat.o(124073);
    }
    while (true)
    {
      return;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      an.Il(6);
      an.a(this.scene, 5, paramInt2, paramInt3, this.tZV);
      AppMethodBeat.o(124073);
    }
  }

  public final int getType()
  {
    return 1134;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.w
 * JD-Core Version:    0.6.2
 */