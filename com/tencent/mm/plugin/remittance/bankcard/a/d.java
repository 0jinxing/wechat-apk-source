package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.qi;
import com.tencent.mm.protocal.protobuf.qj;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends b
{
  private final String TAG;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public qj pLv;

  public d(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(44449);
    this.TAG = "MicroMsg.NetSceneBankRemitCheckBankBind";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new qi();
    ((b.a)localObject).fsK = new qj();
    ((b.a)localObject).fsI = 1349;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/checkbankbind_tsbc";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (qi)this.ehh.fsG.fsP;
    ((qi)localObject).vXt = paramString1;
    ((qi)localObject).vXu = paramString2;
    ((qi)localObject).nuL = paramString3;
    ((qi)localObject).pbn = paramString4;
    AppMethodBeat.o(44449);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44450);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44450);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44451);
    ab.i("MicroMsg.NetSceneBankRemitCheckBankBind", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pLv = ((qj)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBankRemitCheckBankBind", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.pLv.kCl), this.pLv.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44451);
  }

  public final void f(q paramq)
  {
    paramq = (qj)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 1349;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.a.d
 * JD-Core Version:    0.6.2
 */