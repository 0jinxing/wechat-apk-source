package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.cjg;
import com.tencent.mm.protocal.protobuf.cke;
import com.tencent.mm.protocal.protobuf.ckf;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class d extends a<ckf>
{
  public d(LinkedList<cjg> paramLinkedList)
  {
    AppMethodBeat.i(46169);
    cke localcke = new cke();
    localcke.vBz = paramLinkedList;
    paramLinkedList = new b.a();
    paramLinkedList.fsJ = localcke;
    paramLinkedList.fsK = new ckf();
    paramLinkedList.fsI = 2638;
    paramLinkedList.uri = "/cgi-bin/mmpay-bin/updateunipayorder";
    paramLinkedList.fsL = 0;
    paramLinkedList.fsM = 0;
    this.ehh = paramLinkedList.acD();
    ab.i("MicroMsg.CgiUpdateUniPayOrder", "update uni pay order");
    AppMethodBeat.o(46169);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.d
 * JD-Core Version:    0.6.2
 */