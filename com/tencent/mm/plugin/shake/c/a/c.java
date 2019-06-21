package com.tencent.mm.plugin.shake.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.byk;
import com.tencent.mm.protocal.protobuf.byl;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends com.tencent.mm.ai.m
  implements k
{
  private final b ehh;
  private f ehi;
  e qsm;

  public c(float paramFloat1, float paramFloat2, int paramInt, String paramString)
  {
    AppMethodBeat.i(24514);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new byk();
    ((b.a)localObject).fsK = new byl();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/shakecard";
    ((b.a)localObject).fsI = 1250;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (byk)this.ehh.fsG.fsP;
    ((byk)localObject).cEB = paramFloat2;
    ((byk)localObject).cGm = paramFloat1;
    ((byk)localObject).scene = paramInt;
    ((byk)localObject).wXH = paramString;
    AppMethodBeat.o(24514);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(24515);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(24515);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24516);
    ab.i("MicroMsg.NetSceneShakeCard", "onGYNetEnd, getType = 1250 errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (byl)this.ehh.fsH.fsP;
      if (paramq != null)
      {
        this.qsm = new e();
        this.qsm.kdC = paramq.kdC;
        this.qsm.kbU = paramq.kbU;
        this.qsm.cMD = paramq.cMD;
        this.qsm.title = paramq.title;
        this.qsm.kbW = paramq.kbW;
        this.qsm.kbX = paramq.kbX;
        this.qsm.kdg = paramq.kdg;
        this.qsm.kbV = paramq.kbV;
        this.qsm.color = paramq.color;
        this.qsm.qsn = paramq.qsn;
        this.qsm.qsq = paramq.qsq;
        this.qsm.qsr = paramq.qsr;
        this.qsm.qss = paramq.qss;
        this.qsm.qst = paramq.qst;
        this.qsm.qsu = paramq.qsu;
        this.qsm.kbZ = paramq.kbZ;
        this.qsm.qsv = paramq.qsv;
        this.qsm.qsw = paramq.qsw;
        com.tencent.mm.plugin.shake.b.m.cjY().qsp = this.qsm.qsu;
      }
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(24516);
      return;
      this.qsm = new e();
      this.qsm.kdC = 3;
      this.qsm.qsu = com.tencent.mm.plugin.shake.b.m.cjY().qsp;
      continue;
      this.qsm = new e();
      this.qsm.kdC = 3;
      this.qsm.qsu = com.tencent.mm.plugin.shake.b.m.cjY().qsp;
    }
  }

  public final int getType()
  {
    return 1250;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.c.a.c
 * JD-Core Version:    0.6.2
 */