package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.sv;
import com.tencent.mm.protocal.protobuf.sw;

public final class b extends a<sw>
{
  public b(String paramString, int paramInt)
  {
    AppMethodBeat.i(45228);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new sv();
    ((b.a)localObject).fsK = new sw();
    ((b.a)localObject).fsI = 1386;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/closefundaccount";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    com.tencent.mm.ai.b localb = ((b.a)localObject).acD();
    localObject = (sv)localb.fsG.fsP;
    ((sv)localObject).wan = paramString;
    ((sv)localObject).wao = paramInt;
    ((sv)localObject).tgu = ab.cMM();
    this.ehh = localb;
    AppMethodBeat.o(45228);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.b
 * JD-Core Version:    0.6.2
 */