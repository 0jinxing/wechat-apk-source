package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.bqp;
import com.tencent.mm.protocal.protobuf.bqq;
import com.tencent.mm.wallet_core.c.i;

public final class m extends a<bqq>
  implements i
{
  public m(int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3)
  {
    AppMethodBeat.i(45239);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bqp();
    ((b.a)localObject).fsK = new bqq();
    ((b.a)localObject).fsI = 1338;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/redeemfund";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    b localb = ((b.a)localObject).acD();
    localObject = (bqp)localb.fsG.fsP;
    ((bqp)localObject).wOi = paramInt1;
    ((bqp)localObject).wan = paramString1;
    ((bqp)localObject).wOn = paramString2;
    ((bqp)localObject).wao = paramInt2;
    ((bqp)localObject).wOm = paramString3;
    ((bqp)localObject).tgu = ab.cMM();
    this.ehh = localb;
    AppMethodBeat.o(45239);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.m
 * JD-Core Version:    0.6.2
 */