package com.tencent.mm.plugin.voip_cs.b.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cpb;
import com.tencent.mm.protocal.protobuf.cpc;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends m
  implements k
{
  public b ehh;
  private com.tencent.mm.ai.f ehi;

  public f(long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(135386);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cpb();
    ((b.a)localObject).fsK = new cpc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoipsync";
    ((b.a)localObject).fsI = 818;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cpb)this.ehh.fsG.fsP;
    ((cpb)localObject).xeF = paramLong1;
    ((cpb)localObject).wen = paramLong2;
    ((cpb)localObject).xmD = paramInt;
    ((cpb)localObject).wOP = System.currentTimeMillis();
    AppMethodBeat.o(135386);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(135388);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(135388);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135387);
    ab.i("MicroMsg.NetSceneVoipCSSync", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(135387);
  }

  public final int getType()
  {
    return 818;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.c.f
 * JD-Core Version:    0.6.2
 */