package com.tencent.mm.plugin.aa.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.r;
import com.tencent.mm.protocal.protobuf.s;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends a<s>
{
  public b(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(40640);
    b.a locala = new b.a();
    r localr = new r();
    localr.vzL = paramString1;
    localr.vzM = paramString2;
    localr.scene = paramInt;
    locala.fsJ = localr;
    locala.fsK = new s();
    locala.uri = "/cgi-bin/mmpay-bin/newaapayurge";
    locala.fsI = 1644;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ab.i("MicroMsg.CgiAAPayUrge", "CgiAAPayUrge, billNo: %s, chatroom: %s, scene: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    AppMethodBeat.o(40640);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.a.b
 * JD-Core Version:    0.6.2
 */