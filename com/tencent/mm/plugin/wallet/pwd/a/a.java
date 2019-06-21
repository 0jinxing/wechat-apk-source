package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.sx;
import com.tencent.mm.protocal.protobuf.sy;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends com.tencent.mm.ai.a<sy>
{
  public a()
  {
    AppMethodBeat.i(46166);
    b.a locala = new b.a();
    locala.fsJ = new sx();
    locala.fsK = new sy();
    locala.fsI = 2913;
    locala.uri = "/cgi-bin/mmpay-bin/closeunipayorder";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ab.i("MicroMsg.CgiCloseUniPayOrder", "close uni pay order");
    AppMethodBeat.o(46166);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.a
 * JD-Core Version:    0.6.2
 */