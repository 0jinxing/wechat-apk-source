package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bsd;
import com.tencent.mm.protocal.protobuf.bse;
import com.tencent.mm.sdk.platformtools.ab;

public final class n extends b
{
  private final String TAG;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private bse pLF;

  public n(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(44479);
    this.TAG = "MicroMsg.NetSceneBankRemitReportPayRes";
    ab.i("MicroMsg.NetSceneBankRemitReportPayRes", "NetSceneBankRemitReportPayRes() transfer_bill_id:%s unique_id:%s unpay_type:%s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    b.a locala = new b.a();
    bsd localbsd = new bsd();
    localbsd.wUg = new com.tencent.mm.bt.b(String.valueOf(paramString1).getBytes());
    localbsd.wKQ = paramString2;
    localbsd.vPy = paramInt;
    locala.fsJ = localbsd;
    locala.fsK = new bse();
    locala.uri = "/cgi-bin/mmpay-bin/reportpayres_tsbc";
    locala.fsI = 2739;
    this.ehh = locala.acD();
    AppMethodBeat.o(44479);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44480);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44480);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44481);
    ab.i("MicroMsg.NetSceneBankRemitReportPayRes", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pLF = ((bse)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44481);
  }

  public final void f(q paramq)
  {
    paramq = (bse)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 2739;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.a.n
 * JD-Core Version:    0.6.2
 */