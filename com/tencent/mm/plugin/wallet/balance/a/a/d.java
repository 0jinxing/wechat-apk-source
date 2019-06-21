package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.bdc;
import com.tencent.mm.protocal.protobuf.bdd;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends a<bdd>
{
  public d(int paramInt1, String paramString1, String paramString2, String paramString3, long paramLong, int paramInt2, String paramString4)
  {
    AppMethodBeat.i(45230);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bdc();
    ((b.a)localObject).fsK = new bdd();
    ((b.a)localObject).fsI = 2614;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/modifyplan";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    b localb = ((b.a)localObject).acD();
    localObject = (bdc)localb.fsG.fsP;
    ((bdc)localObject).vES = paramInt1;
    ((bdc)localObject).pbn = paramString1;
    ((bdc)localObject).pck = paramString2;
    ((bdc)localObject).vEQ = paramString3;
    ((bdc)localObject).cSh = paramLong;
    ((bdc)localObject).ehf = paramInt2;
    ((bdc)localObject).vER = paramString4;
    this.ehh = localb;
    ab.i("MicroMsg.CgiLqtModifyPlan", "plan_id: %s, card_tail: %s, amount: %s, day: %s", new Object[] { Integer.valueOf(paramInt1), paramString2, Long.valueOf(paramLong), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(45230);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.d
 * JD-Core Version:    0.6.2
 */