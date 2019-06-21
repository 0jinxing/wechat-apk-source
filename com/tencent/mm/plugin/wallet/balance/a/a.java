package com.tencent.mm.plugin.wallet.balance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.aev;
import com.tencent.mm.protocal.protobuf.aew;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends com.tencent.mm.ai.a<aew>
{
  public a()
  {
    AppMethodBeat.i(45219);
    b.a locala = new b.a();
    locala.fsJ = new aev();
    locala.fsK = new aew();
    locala.uri = "/cgi-bin/mmpay-bin/tenpay/getbalancemenu";
    locala.fsI = 2567;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ab.i("MicroMsg.CgiGetBalanceMenu", "get balance menu");
    AppMethodBeat.o(45219);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a
 * JD-Core Version:    0.6.2
 */