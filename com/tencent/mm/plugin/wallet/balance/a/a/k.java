package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.bno;
import com.tencent.mm.protocal.protobuf.bnp;

public final class k extends a<bnp>
{
  public k(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3)
  {
    AppMethodBeat.i(45237);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bno();
    ((b.a)localObject).fsK = new bnp();
    ((b.a)localObject).fsI = 1283;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/qrypurchaseresult";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    b localb = ((b.a)localObject).acD();
    localObject = (bno)localb.fsG.fsP;
    ((bno)localObject).wQm = paramString1;
    ((bno)localObject).pQe = paramString2;
    ((bno)localObject).wPw = paramInt1;
    ((bno)localObject).wao = paramInt2;
    ((bno)localObject).wOm = paramString3;
    ((bno)localObject).tgu = ab.cMM();
    this.ehh = localb;
    AppMethodBeat.o(45237);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.k
 * JD-Core Version:    0.6.2
 */