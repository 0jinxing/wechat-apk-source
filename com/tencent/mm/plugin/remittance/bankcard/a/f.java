package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.wt;
import com.tencent.mm.protocal.protobuf.wu;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends b
{
  private final String TAG;
  private com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  public String pLt;
  public wu pLx;

  public f(String paramString)
  {
    AppMethodBeat.i(44455);
    this.TAG = "MicroMsg.NetSceneBankRemitDeleteRecord";
    b.a locala = new b.a();
    locala.fsJ = new wt();
    locala.fsK = new wu();
    locala.fsI = 1395;
    locala.uri = "/cgi-bin/mmpay-bin/deleterecord_tsbc";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((wt)this.ehh.fsG.fsP).pMd = paramString;
    this.pLt = paramString;
    AppMethodBeat.o(44455);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(44456);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44456);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44457);
    ab.i("MicroMsg.NetSceneBankRemitDeleteRecord", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pLx = ((wu)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBankRemitDeleteRecord", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.pLx.kCl), this.pLx.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44457);
  }

  public final void f(q paramq)
  {
    paramq = (wu)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 1395;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.a.f
 * JD-Core Version:    0.6.2
 */