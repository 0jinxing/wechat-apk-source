package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.md;
import com.tencent.mm.protocal.protobuf.me;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends b
{
  private final String TAG;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public me pLu;

  public c(String paramString1, String paramString2)
  {
    AppMethodBeat.i(44446);
    this.TAG = "MicroMsg.NetSceneBankRemitBusinessCallback";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new md();
    ((b.a)localObject).fsK = new me();
    ((b.a)localObject).fsI = 1340;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busscb_tsbc";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (md)this.ehh.fsG.fsP;
    ((md)localObject).vPX = paramString1;
    ((md)localObject).pQe = paramString2;
    AppMethodBeat.o(44446);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44447);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44447);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44448);
    ab.i("MicroMsg.NetSceneBankRemitBusinessCallback", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pLu = ((me)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBankRemitBusinessCallback", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.pLu.kCl), this.pLu.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44448);
  }

  public final void f(q paramq)
  {
    paramq = (me)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 1340;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.a.c
 * JD-Core Version:    0.6.2
 */