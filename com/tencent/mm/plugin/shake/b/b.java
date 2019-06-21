package com.tencent.mm.plugin.shake.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.byr;
import com.tencent.mm.protocal.protobuf.bys;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class b extends m
  implements k
{
  byte[] cQr;
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  int ret;

  public b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(24414);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new byr();
    ((b.a)localObject).fsK = new bys();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/shakereport";
    ((b.a)localObject).fsI = 161;
    ((b.a)localObject).fsL = 56;
    ((b.a)localObject).fsM = 1000000056;
    this.ehh = ((b.a)localObject).acD();
    localObject = (byr)this.ehh.fsG.fsP;
    ab.i("MicroMsg.NetSceneShakeReport", "share reprot %f %f", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1) });
    ((byr)localObject).OpCode = 0;
    ((byr)localObject).vRp = paramFloat1;
    ((byr)localObject).vRq = paramFloat2;
    ((byr)localObject).wfG = paramInt1;
    ((byr)localObject).wfH = paramString1;
    ((byr)localObject).wfI = paramString2;
    ((byr)localObject).wfJ = paramInt2;
    aw.ZK();
    ((byr)localObject).wYa = bo.a((Integer)c.Ry().get(4107, null), 0);
    aw.ZK();
    paramInt2 = bo.h((Integer)c.Ry().get(4106, null));
    ((byr)localObject).wYb = paramInt2;
    aw.ZK();
    c.Ry().set(4106, Integer.valueOf(paramInt2 + 1));
    ((byr)localObject).vIl = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.bVS());
    o.a(2002, paramFloat1, paramFloat2, paramInt1);
    AppMethodBeat.o(24414);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(24415);
    ab.d("MicroMsg.NetSceneShakeReport", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(24415);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24416);
    ab.d("MicroMsg.NetSceneShakeReport", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (bys)this.ehh.fsH.fsP;
    this.ret = paramq.ZS().vyl;
    if ((paramInt2 == 0) && (paramInt3 == 0))
      this.cQr = aa.a(paramArrayOfByte.vJd);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(24416);
  }

  public final int cju()
  {
    return ((byr)this.ehh.fsG.fsP).wfJ;
  }

  public final int getType()
  {
    return 161;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.b
 * JD-Core Version:    0.6.2
 */