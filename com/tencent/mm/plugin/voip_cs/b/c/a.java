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
import com.tencent.mm.protocal.protobuf.cop;
import com.tencent.mm.protocal.protobuf.coq;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  public b ehh;
  private f ehi;

  public a(int paramInt1, long paramLong1, long paramLong2, String paramString, int paramInt2)
  {
    AppMethodBeat.i(135371);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cop();
    ((b.a)localObject).fsK = new coq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoiphangup";
    ((b.a)localObject).fsI = 880;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cop)this.ehh.fsG.fsP;
    ((cop)localObject).wOQ = paramInt1;
    ((cop)localObject).xeF = paramLong1;
    ((cop)localObject).wen = paramLong2;
    ((cop)localObject).xmv = paramString;
    ((cop)localObject).vIw = paramInt2;
    ((cop)localObject).wOP = System.currentTimeMillis();
    AppMethodBeat.o(135371);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(135372);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(135372);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135373);
    ab.i("MicroMsg.NetSceneVoipCSHangUp", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(135373);
  }

  public final int getType()
  {
    return 880;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.c.a
 * JD-Core Version:    0.6.2
 */