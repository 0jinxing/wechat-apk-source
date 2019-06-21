package com.tencent.mm.plugin.voip_cs.b.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cor;
import com.tencent.mm.protocal.protobuf.cos;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;

  public b(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(135374);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cor();
    ((b.a)localObject).fsK = new cos();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoipheartbeat";
    ((b.a)localObject).fsI = 795;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cor)this.ehh.fsG.fsP;
    ((cor)localObject).xeF = paramLong1;
    ((cor)localObject).wen = paramLong2;
    ((cor)localObject).wOP = System.currentTimeMillis();
    AppMethodBeat.o(135374);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(135376);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(135376);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135375);
    ab.i("MicroMsg.NetSceneVoipCSHeartBeat", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(135375);
  }

  public final int getType()
  {
    return 795;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.c.b
 * JD-Core Version:    0.6.2
 */