package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.akn;
import com.tencent.mm.protocal.protobuf.ako;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class g extends p
{
  private final String TAG;
  public ako nqD;

  public g(String paramString, long paramLong)
  {
    AppMethodBeat.i(41729);
    this.TAG = "MicroMsg.NetSceneMCreditLineTokenSign";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new akn();
    ((b.a)localObject).fsK = new ako();
    ((b.a)localObject).fsI = 2815;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/gmcreditlinetoken";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (akn)this.ehh.fsG.fsP;
    ((akn)localObject).wpp = paramString;
    ((akn)localObject).wch = paramLong;
    ab.i("MicroMsg.NetSceneMCreditLineTokenSign", "card_no: %s, credit_line: %s", new Object[] { paramString, Long.valueOf(paramLong) });
    AppMethodBeat.o(41729);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41730);
    ab.i("MicroMsg.NetSceneMCreditLineTokenSign", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqD = ((ako)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneMCreditLineTokenSign", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqD.kdT), this.nqD.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41730);
  }

  public final void f(q paramq)
  {
    paramq = (ako)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2815;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.g
 * JD-Core Version:    0.6.2
 */