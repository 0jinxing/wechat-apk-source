package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.bff;
import com.tencent.mm.protocal.protobuf.bfg;

public final class e extends a<bfg>
{
  public e(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(45231);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bff();
    ((b.a)localObject).fsK = new bfg();
    ((b.a)localObject).fsI = 2585;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/onclickpurchase";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    b localb = ((b.a)localObject).acD();
    localObject = (bff)localb.fsG.fsP;
    ((bff)localObject).wao = paramInt1;
    ((bff)localObject).tyc = paramInt2;
    ((bff)localObject).tgu = ab.cMM();
    this.ehh = localb;
    AppMethodBeat.o(45231);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.e
 * JD-Core Version:    0.6.2
 */