package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.bkk;
import com.tencent.mm.protocal.protobuf.bkl;
import com.tencent.mm.sdk.platformtools.ab;

public final class g extends a<bkl>
{
  public g()
  {
    AppMethodBeat.i(45233);
    b.a locala = new b.a();
    locala.fsJ = new bkk();
    locala.fsK = new bkl();
    locala.fsI = 2796;
    locala.uri = "/cgi-bin/mmpay-bin/planindex";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ab.i("MicroMsg.CgiLqtPlanIndex", "isfirstclick: %s");
    AppMethodBeat.o(45233);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.g
 * JD-Core Version:    0.6.2
 */