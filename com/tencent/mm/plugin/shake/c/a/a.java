package com.tencent.mm.plugin.shake.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.nj;
import com.tencent.mm.protocal.protobuf.nk;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(24508);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new nj();
    ((b.a)localObject).fsK = new nk();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/cancelshakecard";
    ((b.a)localObject).fsI = 1252;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (nj)this.ehh.fsG.fsP;
    ((nj)localObject).kbU = paramString1;
    ((nj)localObject).cMD = paramString2;
    AppMethodBeat.o(24508);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(24509);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(24509);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24510);
    ab.i("MicroMsg.NetSceneCancelShakeCard", "onGYNetEnd, getType = 1252 errType = " + paramInt2 + " errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(24510);
  }

  public final int getType()
  {
    return 1252;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.c.a.a
 * JD-Core Version:    0.6.2
 */