package com.tencent.mm.plugin.order.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.protocal.protobuf.ys;
import com.tencent.mm.protocal.protobuf.yt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.u;

public final class f extends u
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;

  public f(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(43775);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ys();
    ((b.a)localObject).fsK = new yt();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/evaluateorder";
    ((b.a)localObject).fsI = 583;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ys)this.ehh.fsG.fsP;
    ((ys)localObject).wes = paramString1;
    ((ys)localObject).fKh = paramString2;
    ((ys)localObject).pXD = paramInt;
    ((ys)localObject).vRP = k.cPy();
    AppMethodBeat.o(43775);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(43777);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(43777);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(43776);
    ab.d("MicroMsg.NetSceneEvaluateOrder", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(43776);
  }

  public final int getType()
  {
    return 583;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.f
 * JD-Core Version:    0.6.2
 */