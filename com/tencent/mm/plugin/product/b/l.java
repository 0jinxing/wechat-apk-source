package com.tencent.mm.plugin.product.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cad;
import com.tencent.mm.protocal.protobuf.cfn;
import com.tencent.mm.protocal.protobuf.cfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.u;

public final class l extends u
  implements k
{
  private b ehh;
  private f ehi;
  public String phn;

  public l(cad paramcad, String paramString)
  {
    AppMethodBeat.i(44000);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cfn();
    ((b.a)localObject).fsK = new cfo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/submitmallorder";
    ((b.a)localObject).fsI = 556;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cfn)this.ehh.fsG.fsP;
    ((cfn)localObject).xeP = paramcad;
    ((cfn)localObject).xeR = paramString;
    AppMethodBeat.o(44000);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44001);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44001);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44002);
    paramq = (cfo)((b)paramq).fsH.fsP;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.d("MicroMsg.NetSceneMallSubmitMallOrder", "resp.ReqKey " + paramq.xeQ);
      this.phn = paramq.xeQ;
    }
    ab.d("MicroMsg.NetSceneMallSubmitMallOrder", "errCode " + paramInt2 + ", errMsg " + paramString);
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44002);
  }

  public final int getType()
  {
    return 556;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.b.l
 * JD-Core Version:    0.6.2
 */