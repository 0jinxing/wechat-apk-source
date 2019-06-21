package com.tencent.mm.plugin.account.bind.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.jm;
import com.tencent.mm.protocal.protobuf.jn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

public final class a extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    AppMethodBeat.i(13317);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new jm();
    ((b.a)localObject).fsK = new jn();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindlinkedincontact";
    ((b.a)localObject).fsI = 549;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (jm)this.ehh.fsG.fsP;
    ((jm)localObject).vIJ = 1;
    ((jm)localObject).vLk = paramInt;
    ((jm)localObject).vLl = paramString1;
    ((jm)localObject).vLm = paramString2;
    ((jm)localObject).vLn = paramString3;
    ((jm)localObject).vLo = paramString4;
    ((jm)localObject).vLp = paramString5;
    ((jm)localObject).vLq = paramString6;
    ((jm)localObject).vLr = paramString7;
    AppMethodBeat.o(13317);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(13318);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(13318);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13319);
    ab.d("MicroMsg.NetSceneBindLinkedinContact", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (jm)this.ehh.fsG.fsP;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      g.RP().Ry().set(286722, paramq.vLm);
      g.RP().Ry().set(286721, paramq.vLl);
      g.RP().Ry().set(286723, paramq.vLn);
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(13319);
  }

  public final int getType()
  {
    return 549;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.a.a
 * JD-Core Version:    0.6.2
 */