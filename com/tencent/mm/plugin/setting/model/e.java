package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.apc;
import com.tencent.mm.protocal.protobuf.apd;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends m
  implements k
{
  private f ehi;

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(126848);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new apc();
    paramf.fsK = new apd();
    paramf.uri = "/cgi-bin/micromsg-bin/gettrustedfriends";
    paramf.fsI = 869;
    paramf.fsL = 0;
    paramf.fsM = 0;
    int i = a(parame, paramf.acD(), this);
    AppMethodBeat.o(126848);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(126847);
    this.fth = paramInt1;
    if ((paramInt2 != 0) || (paramInt3 != 0))
      ab.e("MicroMsg.NetSceneGetTrustedFriends", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(126847);
  }

  public final int getType()
  {
    return 869;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.e
 * JD-Core Version:    0.6.2
 */