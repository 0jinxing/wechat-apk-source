package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.cs;
import com.tencent.mm.protocal.protobuf.ct;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends com.tencent.mm.ai.a<ct>
{
  public a(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(45227);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cs();
    ((b.a)localObject).fsK = new ct();
    ((b.a)localObject).fsI = 2780;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/addplan";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    localObject = ((b.a)localObject).acD();
    cs localcs = (cs)((b)localObject).fsG.fsP;
    localcs.vER = paramString1;
    localcs.pbn = paramString2;
    localcs.pck = paramString3;
    localcs.vEQ = paramString4;
    localcs.cSh = paramLong;
    localcs.ehf = paramInt1;
    localcs.vES = paramInt2;
    this.ehh = ((b)localObject);
    ab.i("MicroMsg.CgiLqtAddPlan", "card_tail: %s, amount: %s, day: %s, planId: %s", new Object[] { paramString3, Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(45227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.a
 * JD-Core Version:    0.6.2
 */