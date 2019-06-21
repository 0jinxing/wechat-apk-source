package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bcw;
import com.tencent.mm.protocal.protobuf.bcx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class h extends p
{
  private final String TAG;
  public bcx nqE;
  public long nqF;

  public h(long paramLong, String paramString1, String paramString2)
  {
    AppMethodBeat.i(41731);
    this.TAG = "MicroMsg.NetSceneModifyHoneyPayerCreditLine";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bcw();
    ((b.a)localObject).fsK = new bcx();
    ((b.a)localObject).fsI = 2865;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/modifyhppayercreditline";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bcw)this.ehh.fsG.fsP;
    ((bcw)localObject).wch = paramLong;
    ((bcw)localObject).wcg = paramString1;
    ((bcw)localObject).wpp = paramString2;
    this.nqF = paramLong;
    ab.d("MicroMsg.NetSceneModifyHoneyPayerCreditLine", "cardNo: %s, authToken: %s", new Object[] { paramString2, paramString1 });
    ab.i("MicroMsg.NetSceneModifyHoneyPayerCreditLine", "credit line: %s", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(41731);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41732);
    ab.i("MicroMsg.NetSceneModifyHoneyPayerCreditLine", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqE = ((bcx)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneModifyHoneyPayerCreditLine", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqE.kdT), this.nqE.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41732);
  }

  public final void f(q paramq)
  {
    paramq = (bcx)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2865;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.h
 * JD-Core Version:    0.6.2
 */