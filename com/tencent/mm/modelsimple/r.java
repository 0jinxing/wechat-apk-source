package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bnx;
import com.tencent.mm.protocal.protobuf.bny;

public final class r extends m
  implements k
{
  private b ehh;
  private f ehi;
  public int fPr;
  public int fPs;

  public r(int paramInt)
  {
    AppMethodBeat.i(123457);
    this.fPr = 1;
    b.a locala = new b.a();
    locala.fsJ = new bnx();
    locala.fsK = new bny();
    locala.uri = "/cgi-bin/micromsg-bin/queryhaspasswd";
    locala.fsI = 255;
    locala.fsL = 132;
    locala.fsM = 1000000132;
    this.ehh = locala.acD();
    ((bnx)this.ehh.fsG.fsP).Scene = paramInt;
    this.fPs = paramInt;
    AppMethodBeat.o(123457);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(123458);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(123458);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(123459);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(123459);
  }

  public final int getType()
  {
    return 255;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.r
 * JD-Core Version:    0.6.2
 */