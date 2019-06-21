package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ka;
import com.tencent.mm.protocal.protobuf.kb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class p extends m
  implements k
{
  private String edV;
  com.tencent.mm.ai.b ehh;
  private f ehi;
  private p.a<p> fwN;

  private p(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11432);
    this.edV = paramString1;
    ab.i("MicroMsg.NetSceneBizAttrSync", "[BizAttr] NetSceneBizAttrSync (%s)", new Object[] { paramString1 });
    paramString1 = new b.a();
    paramString1.fsI = 1075;
    paramString1.uri = "/cgi-bin/mmbiz-bin/bizattr/bizattrsync";
    paramString1.fsJ = new ka();
    paramString1.fsK = new kb();
    paramString1.fsL = 0;
    paramString1.fsM = 0;
    this.ehh = paramString1.acD();
    paramString1 = (ka)this.ehh.fsG.fsP;
    paramString1.vMR = this.edV;
    paramString1.vMS = new com.tencent.mm.bt.b(bo.anf(bo.nullAsNil(paramString2)));
    AppMethodBeat.o(11432);
  }

  public p(String paramString1, String paramString2, p.a<p> parama)
  {
    this(paramString1, paramString2);
    this.fwN = parama;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11434);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11434);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11433);
    ab.i("MicroMsg.NetSceneBizAttrSync", "[BizAttr] onGYNetEnd netId %d, errType %d, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (this.fwN != null)
      this.fwN.a(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11433);
  }

  public final int getType()
  {
    return 1075;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.p
 * JD-Core Version:    0.6.2
 */