package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aez;
import com.tencent.mm.protocal.protobuf.afa;
import com.tencent.mm.sdk.platformtools.ab;

public final class g extends b
{
  private final String TAG;
  public String cvZ;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public afa pLy;

  public g(String paramString1, String paramString2)
  {
    AppMethodBeat.i(44458);
    this.TAG = "MicroMsg.NetSceneBankRemitGetBankInfo";
    b.a locala = new b.a();
    locala.fsJ = new aez();
    locala.fsK = new afa();
    locala.fsI = 1542;
    locala.uri = "/cgi-bin/mmpay-bin/getbankinfo_tsbc";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((aez)this.ehh.fsG.fsP).vXu = paramString1;
    this.cvZ = paramString2;
    AppMethodBeat.o(44458);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44459);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44459);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44460);
    ab.i("MicroMsg.NetSceneBankRemitGetBankInfo", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pLy = ((afa)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBankRemitGetBankInfo", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.pLy.kCl), this.pLy.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44460);
  }

  public final void f(q paramq)
  {
    paramq = (afa)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 1542;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.a.g
 * JD-Core Version:    0.6.2
 */