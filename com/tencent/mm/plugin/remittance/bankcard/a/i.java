package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bnz;
import com.tencent.mm.protocal.protobuf.boa;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends b
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public int limit;
  public boa pLA;

  public i(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(44464);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bnz();
    ((b.a)localObject).fsK = new boa();
    ((b.a)localObject).fsI = 1511;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/historylist_tsbc";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bnz)this.ehh.fsG.fsP;
    ((bnz)localObject).limit = paramInt1;
    ((bnz)localObject).offset = paramInt2;
    this.limit = paramInt1;
    ab.i("MicroMsg.NetSceneBankRemitHistoryList", "limit: %s, offset: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(44464);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44465);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44465);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44466);
    ab.i("MicroMsg.NetSceneBankRemitHistoryList", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pLA = ((boa)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBankRemitHistoryList", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.pLA.kCl), this.pLA.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44466);
  }

  public final void f(q paramq)
  {
    paramq = (boa)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 1511;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.a.i
 * JD-Core Version:    0.6.2
 */