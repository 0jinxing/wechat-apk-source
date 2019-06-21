package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bhn;
import com.tencent.mm.protocal.protobuf.bho;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class k extends b
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public bho pLC;

  public k()
  {
    AppMethodBeat.i(44470);
    b.a locala = new b.a();
    locala.fsJ = new bhn();
    locala.fsK = new bho();
    locala.fsI = 1280;
    locala.uri = "/cgi-bin/mmpay-bin/operation_tsbc";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(44470);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(44471);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44471);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44472);
    ab.i("MicroMsg.NetSceneBankRemitOperation", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pLC = ((bho)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBankRemitOperation", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.pLC.kCl), this.pLC.kCm });
    if ((!this.kDr) && (!this.kDs))
    {
      ab.i("MicroMsg.NetSceneBankRemitOperation", "min_poundage: %s, max_amount: %s", new Object[] { Integer.valueOf(this.pLC.wKN), Integer.valueOf(this.pLC.wKO) });
      if (this.pLC.wKN >= 0)
        g.RP().Ry().set(ac.a.xTQ, Integer.valueOf(this.pLC.wKN));
      if (this.pLC.wKO > 0)
        g.RP().Ry().set(ac.a.xTR, Integer.valueOf(this.pLC.wKO));
      if (!bo.isNullOrNil(this.pLC.wKP))
        g.RP().Ry().set(ac.a.xTS, this.pLC.wKP);
    }
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44472);
  }

  public final void f(q paramq)
  {
    paramq = (bho)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 1280;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.a.k
 * JD-Core Version:    0.6.2
 */