package com.tencent.mm.plugin.account.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cgw;
import com.tencent.mm.protocal.protobuf.cgx;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class g extends m
  implements k
{
  public b ehh;
  private f ehi;

  public g(String paramString)
  {
    AppMethodBeat.i(124685);
    b.a locala = new b.a();
    locala.fsJ = new cgw();
    locala.fsK = new cgx();
    locala.uri = "/cgi-bin/micromsg-bin/thirdappverify";
    locala.fsI = 755;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((cgw)this.ehh.fsG.fsP).wfk = paramString;
    ((cgw)this.ehh.fsG.fsP).xfE = 1;
    ((cgw)this.ehh.fsG.fsP).luQ = com.tencent.mm.sdk.platformtools.aa.dor();
    paramString = bo.dpz();
    ((cgw)this.ehh.fsG.fsP).vLz = com.tencent.mm.platformtools.aa.ad(paramString);
    this.ehh.a(z.dmx());
    this.ehh.cQh = 1;
    this.ehh.acF().vyi = paramString;
    this.ehh.acF().vyf = 1;
    AppMethodBeat.o(124685);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(124686);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(124686);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(124687);
    ab.i("MicroMsg.NetSceneVerifyThirdApp", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(124687);
  }

  public final int getType()
  {
    return 755;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.g
 * JD-Core Version:    0.6.2
 */