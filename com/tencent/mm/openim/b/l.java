package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bgt;
import com.tencent.mm.protocal.protobuf.bgu;
import com.tencent.mm.sdk.platformtools.ab;

public final class l extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  public j.b gfe;
  private int opType;

  public l(j.b paramb)
  {
    AppMethodBeat.i(1008);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bgt();
    ((b.a)localObject).fsK = new bgu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/openimoplog";
    ((b.a)localObject).fsI = 806;
    this.ehh = ((b.a)localObject).acD();
    this.opType = paramb.oqP;
    this.gfe = paramb;
    ab.i("MicroMsg.Openim.NetSceneOpenIMOPLog", "type: %d", new Object[] { Integer.valueOf(this.opType) });
    localObject = (bgt)this.ehh.fsG.fsP;
    ((bgt)localObject).type = this.opType;
    ((bgt)localObject).wKq = new com.tencent.mm.bt.b(paramb.getBuffer());
    AppMethodBeat.o(1008);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(1009);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(1009);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(1010);
    ab.i("MicroMsg.Openim.NetSceneOpenIMOPLog", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, opType:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(this.opType) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(1010);
  }

  public final int getType()
  {
    return 806;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.l
 * JD-Core Version:    0.6.2
 */