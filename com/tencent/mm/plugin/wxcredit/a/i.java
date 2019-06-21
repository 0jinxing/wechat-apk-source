package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.protocal.protobuf.brg;
import com.tencent.mm.protocal.protobuf.brh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.u;

public final class i extends u
{
  private b ehh;
  private f ehi;

  public i(String paramString1, String paramString2)
  {
    AppMethodBeat.i(48668);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new brg();
    ((b.a)localObject).fsK = new brh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/removevirtualbankcard";
    ((b.a)localObject).fsI = 600;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (brg)this.ehh.fsG.fsP;
    ((brg)localObject).wTF = paramString1;
    ((brg)localObject).wTE = bo.getInt(paramString2, 0);
    ((brg)localObject).vRP = k.cPy();
    AppMethodBeat.o(48668);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(48670);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48670);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48669);
    ab.d("MicroMsg.NetSceneRemoveVirtualBankCard", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(48669);
  }

  public final int getType()
  {
    return 600;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.a.i
 * JD-Core Version:    0.6.2
 */