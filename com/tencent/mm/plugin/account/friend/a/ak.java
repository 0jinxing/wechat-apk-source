package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bxv;
import com.tencent.mm.protocal.protobuf.bxw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class ak extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public ak(String paramString)
  {
    AppMethodBeat.i(108484);
    b.a locala = new b.a();
    locala.fsJ = new bxv();
    locala.fsK = new bxw();
    locala.uri = "/cgi-bin/micromsg-bin/newsetemailpwd";
    locala.fsI = 382;
    locala.fsL = 181;
    locala.fsM = 1000000181;
    this.ehh = locala.acD();
    ((bxv)this.ehh.fsG.fsP).vLJ = bo.and(paramString);
    ab.d("MicroMsg.NetSceneSetEmailPwd", "md5 ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(108484);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108485);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(108485);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108486);
    ab.d("MicroMsg.NetSceneSetEmailPwd", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(108486);
  }

  public final int getType()
  {
    return 382;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ak
 * JD-Core Version:    0.6.2
 */