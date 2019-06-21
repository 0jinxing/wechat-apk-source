package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bnv;
import com.tencent.mm.protocal.protobuf.bnw;
import com.tencent.mm.sdk.platformtools.ab;

public final class l extends b
{
  private final String TAG;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public bnw pLD;

  public l(String paramString)
  {
    AppMethodBeat.i(44473);
    this.TAG = "MicroMsg.NetSceneBankRemitQueryDetail";
    b.a locala = new b.a();
    locala.fsJ = new bnv();
    locala.fsK = new bnw();
    locala.fsI = 1579;
    locala.uri = "/cgi-bin/mmpay-bin/querydetail_tsbc";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((bnv)this.ehh.fsG.fsP).vPX = paramString;
    ab.i("MicroMsg.NetSceneBankRemitQueryDetail", "bill id: %s", new Object[] { paramString });
    AppMethodBeat.o(44473);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44474);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44474);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44475);
    ab.i("MicroMsg.NetSceneBankRemitQueryDetail", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pLD = ((bnw)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44475);
  }

  public final void f(q paramq)
  {
    paramq = (bnw)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 1579;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.a.l
 * JD-Core Version:    0.6.2
 */