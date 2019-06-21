package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cq;
import com.tencent.mm.protocal.protobuf.cr;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  public String geZ;

  public b(String paramString1, String paramString2)
  {
    AppMethodBeat.i(78836);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cq();
    ((b.a)localObject).fsK = new cr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addopenimcontact";
    ((b.a)localObject).fsI = 667;
    this.ehh = ((b.a)localObject).acD();
    this.geZ = paramString1;
    localObject = (cq)this.ehh.fsG.fsP;
    ((cq)localObject).geZ = paramString1;
    ((cq)localObject).vEP = paramString2;
    ab.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "tp_username: %s, antispam_ticket:%s", new Object[] { paramString1, paramString2 });
    AppMethodBeat.o(78836);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78838);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78838);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78837);
    ab.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.geZ });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78837);
  }

  public final int getType()
  {
    return 667;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.b
 * JD-Core Version:    0.6.2
 */