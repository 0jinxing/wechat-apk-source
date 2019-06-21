package com.tencent.mm.plugin.order.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.protocal.protobuf.bis;
import com.tencent.mm.protocal.protobuf.bit;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.u;

public final class g extends u
{
  private b ehh;
  private f ehi;

  public g(String paramString1, String paramString2)
  {
    AppMethodBeat.i(43778);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bis();
    ((b.a)localObject).fsK = new bit();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/paydeluserroll";
    ((b.a)localObject).fsI = 389;
    ((b.a)localObject).fsL = 187;
    ((b.a)localObject).fsM = 1000000187;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bis)this.ehh.fsG.fsP;
    ((bis)localObject).wMd = 1;
    if (!bo.isNullOrNil(paramString1))
      ((bis)localObject).pcU = paramString1;
    if (!bo.isNullOrNil(paramString2))
      ((bis)localObject).pdn = paramString2;
    ((bis)localObject).vRP = k.cPy();
    AppMethodBeat.o(43778);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(43780);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(43780);
    return i;
  }

  public final int bZa()
  {
    return ((bis)this.ehh.fsG.fsP).wMd;
  }

  public final String bZb()
  {
    return ((bis)this.ehh.fsG.fsP).pcU;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(43779);
    ab.d("MicroMsg.NetScenePayDelUserRoll", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(43779);
  }

  public final int getType()
  {
    return 389;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.g
 * JD-Core Version:    0.6.2
 */