package com.tencent.mm.plugin.product.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cad;
import com.tencent.mm.protocal.protobuf.cfl;
import com.tencent.mm.protocal.protobuf.cfm;
import com.tencent.mm.sdk.platformtools.ab;

public final class k extends m
  implements com.tencent.mm.network.k
{
  private b ehh;
  private f ehi;
  public String phn;

  public k(cad paramcad)
  {
    AppMethodBeat.i(43997);
    b.a locala = new b.a();
    locala.fsJ = new cfl();
    locala.fsK = new cfm();
    locala.uri = "/cgi-bin/micromsg-bin/submitmallfreeorder";
    locala.fsI = 557;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((cfl)this.ehh.fsG.fsP).xeP = paramcad;
    AppMethodBeat.o(43997);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(43999);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(43999);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(43998);
    paramq = (cfm)((b)paramq).fsH.fsP;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      ab.d("MicroMsg.NetSceneMallSubmitMallFreeOrder", "resp.PrepareId " + paramq.xeQ);
      this.phn = paramq.xeQ;
    }
    ab.d("MicroMsg.NetSceneMallSubmitMallFreeOrder", "errCode " + paramInt3 + ", errMsg " + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(43998);
  }

  public final int getType()
  {
    return 557;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.b.k
 * JD-Core Version:    0.6.2
 */