package com.tencent.mm.plugin.wallet.bind.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.u;

public final class b extends u
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private String tlg;

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(45727);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(45727);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(45726);
    ab.d("MicroMsg.NetSceneSetMainBankCard", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      s.cNC();
      s.cND();
      ak.acD(this.tlg);
    }
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(45726);
  }

  public final int getType()
  {
    return 621;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.a.b
 * JD-Core Version:    0.6.2
 */