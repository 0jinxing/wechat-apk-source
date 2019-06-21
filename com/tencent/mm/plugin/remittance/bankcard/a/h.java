package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.afb;
import com.tencent.mm.protocal.protobuf.afc;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends b
{
  private final String TAG;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public afc pLz;

  public h()
  {
    AppMethodBeat.i(44461);
    this.TAG = "MicroMsg.NetSceneBankRemitGetBankList";
    b.a locala = new b.a();
    locala.fsJ = new afb();
    locala.fsK = new afc();
    locala.fsI = 1399;
    locala.uri = "/cgi-bin/mmpay-bin/getbanklist_tsbc";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(44461);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44462);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44462);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44463);
    ab.i("MicroMsg.NetSceneBankRemitGetBankList", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pLz = ((afc)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBankRemitGetBankList", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.pLz.kCl), this.pLz.kCm });
    if ((!this.kDr) && (this.pLz.kCl != 0))
      this.kDs = true;
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44463);
  }

  public final void f(q paramq)
  {
    paramq = (afc)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 1399;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.a.h
 * JD-Core Version:    0.6.2
 */