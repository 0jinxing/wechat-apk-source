package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.bhh;
import com.tencent.mm.protocal.protobuf.bhi;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends a<bhi>
{
  public b()
  {
    AppMethodBeat.i(46167);
    b.a locala = new b.a();
    locala.fsJ = new bhh();
    locala.fsK = new bhi();
    locala.fsI = 2513;
    locala.uri = "/cgi-bin/mmpay-bin/openunipayorder";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ab.i("MicroMsg.CgiOpenUniPayOrder", "open uni pay order");
    AppMethodBeat.o(46167);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.b
 * JD-Core Version:    0.6.2
 */