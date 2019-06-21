package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bcu;
import com.tencent.mm.protocal.protobuf.bcv;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends b
{
  private final String TAG;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public String hHV;
  public bcv pLB;
  public String pLt;

  public j(String paramString1, String paramString2)
  {
    AppMethodBeat.i(44467);
    this.TAG = "MicroMsg.NetSceneBankRemitModifyExplain";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bcu();
    ((b.a)localObject).fsK = new bcv();
    ((b.a)localObject).fsI = 1590;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/modifyexplain_tsbc";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bcu)this.ehh.fsG.fsP;
    ((bcu)localObject).pMd = paramString1;
    ((bcu)localObject).pMg = paramString2;
    this.pLt = paramString1;
    this.hHV = paramString2;
    AppMethodBeat.o(44467);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44468);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44468);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44469);
    ab.i("MicroMsg.NetSceneBankRemitModifyExplain", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pLB = ((bcv)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBankRemitModifyExplain", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.pLB.kCl), this.pLB.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44469);
  }

  public final void f(q paramq)
  {
    paramq = (bcv)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 1590;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.a.j
 * JD-Core Version:    0.6.2
 */