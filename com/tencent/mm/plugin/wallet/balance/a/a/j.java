package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.bmn;
import com.tencent.mm.protocal.protobuf.bmo;
import com.tencent.mm.wallet_core.c.i;

public final class j extends a<bmo>
  implements i
{
  public j(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3)
  {
    AppMethodBeat.i(45236);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bmn();
    ((b.a)localObject).fsK = new bmo();
    ((b.a)localObject).fsI = 1276;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/purchasefund";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    localObject = ((b.a)localObject).acD();
    bmn localbmn = (bmn)((b)localObject).fsG.fsP;
    localbmn.wPv = paramString1;
    localbmn.wPw = paramInt1;
    localbmn.wao = paramInt2;
    localbmn.wPx = paramString2;
    localbmn.wOm = paramString3;
    localbmn.tgu = ab.cMM();
    this.ehh = ((b)localObject);
    AppMethodBeat.o(45236);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.j
 * JD-Core Version:    0.6.2
 */