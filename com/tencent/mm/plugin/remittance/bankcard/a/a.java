package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.fk;
import com.tencent.mm.protocal.protobuf.fl;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends b
{
  private final String TAG;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public fl pLs;
  public String pLt;

  public a(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(44443);
    this.TAG = "MicroMsg.NetSceneBankRemitAppointBank";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new fk();
    ((b.a)localObject).fsK = new fl();
    ((b.a)localObject).fsI = 1348;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/appointbank_tsbc";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (fk)this.ehh.fsG.fsP;
    ((fk)localObject).pMd = paramString1;
    ((fk)localObject).vHs = paramString2;
    ((fk)localObject).pbn = paramString3;
    this.pLt = paramString1;
    ab.i("MicroMsg.NetSceneBankRemitAppointBank", "seqno: %s, timing_id: %s, bankType: %s", new Object[] { paramString1, paramString2, paramString3 });
    AppMethodBeat.o(44443);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44444);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44444);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44445);
    ab.i("MicroMsg.NetSceneBankRemitAppointBank", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pLs = ((fl)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBankRemitAppointBank", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.pLs.kCl), this.pLs.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44445);
  }

  public final void f(q paramq)
  {
    paramq = (fl)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 1348;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.a.a
 * JD-Core Version:    0.6.2
 */