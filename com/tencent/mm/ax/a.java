package com.tencent.mm.ax;

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
import com.tencent.mm.protocal.protobuf.bmp;
import com.tencent.mm.protocal.protobuf.bmq;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  private b ehh;
  private f ehi;
  int fKA;
  boolean fKz;

  public a(int paramInt, String paramString)
  {
    AppMethodBeat.i(78417);
    this.fKz = false;
    this.fKA = 0;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bmp();
    ((b.a)localObject).fsK = new bmq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/pushnewtips";
    ((b.a)localObject).fsI = 597;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bmp)this.ehh.fsG.fsP;
    ((bmp)localObject).wPz = paramInt;
    ((bmp)localObject).wPA = 1;
    ((bmp)localObject).vMU = paramString;
    this.fKA = paramInt;
    AppMethodBeat.o(78417);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78419);
    ab.d("MicroMsg.NetScenePushNewTips", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78419);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78418);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetScenePushNewTips", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78418);
    }
    while (true)
    {
      return;
      this.fKz = ((bmq)((b)paramq).fsH.fsP).wPB;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78418);
    }
  }

  public final int getType()
  {
    return 597;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ax.a
 * JD-Core Version:    0.6.2
 */