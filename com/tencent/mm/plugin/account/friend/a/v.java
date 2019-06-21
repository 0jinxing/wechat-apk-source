package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.aad;
import com.tencent.mm.protocal.protobuf.aae;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class v extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public int opType;

  public v(int paramInt, String paramString)
  {
    AppMethodBeat.i(108418);
    this.opType = paramInt;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aad();
    ((b.a)localObject).fsK = new aae();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/facebookauth";
    ((b.a)localObject).fsI = 183;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    aad localaad = (aad)this.ehh.fsG.fsP;
    localObject = paramString;
    if (bo.isNullOrNil(paramString))
      localObject = "";
    localaad.wfk = ((String)localObject);
    localaad.nbk = paramInt;
    AppMethodBeat.o(108418);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(108419);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(108419);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108420);
    ab.d("MicroMsg.NetSceneFaceBookAuth", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aae)this.ehh.fsH.fsP;
      paramInt1 = paramq.getBaseResponse().Ret;
      if (paramInt1 != 0)
      {
        ab.e("MicroMsg.NetSceneFaceBookAuth", "baseresponse.ret = ".concat(String.valueOf(paramInt1)));
        this.ehi.onSceneEnd(4, paramInt1, paramString, this);
        AppMethodBeat.o(108420);
      }
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneFaceBookAuth", "fbuserid = " + paramq.wfm + ", fbusername = " + paramq.wfn);
      if ((this.opType == 0) || (this.opType == 1))
      {
        g.RP().Ry().set(65825, paramq.wfm);
        com.tencent.mm.ah.b.pR(paramq.wfm);
        g.RP().Ry().set(65826, paramq.wfn);
        g.RP().Ry().dsb();
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(108420);
    }
  }

  public final int getType()
  {
    return 183;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.v
 * JD-Core Version:    0.6.2
 */