package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.bad;
import com.tencent.mm.protocal.protobuf.bae;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends a<bae>
{
  public c(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(45229);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bad();
    ((b.a)localObject).fsK = new bae();
    ((b.a)localObject).fsI = 2507;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/manageplan";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    localObject = ((b.a)localObject).acD();
    bad localbad = (bad)((b)localObject).fsG.fsP;
    localbad.type = paramInt1;
    localbad.vES = paramInt2;
    localbad.vER = paramString;
    this.ehh = ((b)localObject);
    ab.i("MicroMsg.CgiLqtManagePlan", "type: %s, planId: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(45229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.c
 * JD-Core Version:    0.6.2
 */