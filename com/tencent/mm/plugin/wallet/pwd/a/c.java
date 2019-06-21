package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.bog;
import com.tencent.mm.protocal.protobuf.boh;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends a<boh>
{
  public c()
  {
    AppMethodBeat.i(46168);
    b.a locala = new b.a();
    locala.fsJ = new bog();
    locala.fsK = new boh();
    locala.fsI = 2904;
    locala.uri = "/cgi-bin/mmpay-bin/queryunipayorder";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ab.i("MicroMsg.CgiQueryUniPayOrder", "query uni pay order");
    AppMethodBeat.o(46168);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.c
 * JD-Core Version:    0.6.2
 */