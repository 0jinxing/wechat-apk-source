package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bwn;
import com.tencent.mm.protocal.protobuf.bwo;
import com.tencent.mm.sdk.platformtools.ab;

public final class o extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private String geZ;

  public o(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(78875);
    this.geZ = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bwn();
    ((b.a)localObject).fsK = new bwo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendopenimverifyrequest";
    ((b.a)localObject).fsI = 243;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bwn)this.ehh.fsG.fsP;
    ((bwn)localObject).geZ = paramString1;
    ((bwn)localObject).wWZ = paramString2;
    ((bwn)localObject).vEP = paramString3;
    ab.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "init user:%s anti:%s", new Object[] { paramString1, paramString3 });
    AppMethodBeat.o(78875);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78876);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78876);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78877);
    ab.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.geZ });
    if ((paramInt2 != 0) || (paramInt3 != 0))
      ab.e("MicroMsg.NetSceneSendOpenIMVerifyRequest", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78877);
  }

  public final int getType()
  {
    return 243;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.o
 * JD-Core Version:    0.6.2
 */