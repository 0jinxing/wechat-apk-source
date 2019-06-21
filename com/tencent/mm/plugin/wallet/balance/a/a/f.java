package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.bfh;
import com.tencent.mm.protocal.protobuf.bfi;

public final class f extends a<bfi>
{
  public f(int paramInt)
  {
    AppMethodBeat.i(45232);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bfh();
    ((b.a)localObject).fsK = new bfi();
    ((b.a)localObject).fsI = 1830;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/onclickredeem";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    localObject = ((b.a)localObject).acD();
    bfh localbfh = (bfh)((b)localObject).fsG.fsP;
    localbfh.wao = paramInt;
    localbfh.tgu = ab.cMM();
    this.ehh = ((b)localObject);
    AppMethodBeat.o(45232);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.f
 * JD-Core Version:    0.6.2
 */