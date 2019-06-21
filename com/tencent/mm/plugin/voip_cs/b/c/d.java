package com.tencent.mm.plugin.voip_cs.b.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cow;
import com.tencent.mm.protocal.protobuf.cox;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends m
  implements k
{
  public b ehh;
  private f ehi;

  public d(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(135380);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cow();
    ((b.a)localObject).fsK = new cox();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoipredirect";
    ((b.a)localObject).fsI = 285;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cow)this.ehh.fsG.fsP;
    ((cow)localObject).xeF = paramLong1;
    ((cow)localObject).wen = paramLong2;
    ((cow)localObject).wOP = System.currentTimeMillis();
    AppMethodBeat.o(135380);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(135382);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(135382);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135381);
    ab.i("MicroMsg.NetSceneVoipCSRedirect", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(135381);
  }

  public final int getType()
  {
    return 285;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.c.d
 * JD-Core Version:    0.6.2
 */