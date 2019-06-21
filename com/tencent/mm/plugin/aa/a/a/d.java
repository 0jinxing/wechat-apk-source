package com.tencent.mm.plugin.aa.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.b;
import com.tencent.mm.protocal.protobuf.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends a<c>
{
  public d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(40643);
    b.a locala = new b.a();
    b localb = new b();
    localb.vzL = paramString1;
    localb.vzM = paramString2;
    locala.fsJ = localb;
    locala.fsK = new c();
    locala.uri = "/cgi-bin/mmpay-bin/newaaclosenotify";
    locala.fsI = 1672;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ab.i("MicroMsg.CgiCloseAAUrgeNotify", "CgiCloseAAUrgeNotify, billNo: %s, chatroom: %s", new Object[] { paramString1, paramString2 });
    AppMethodBeat.o(40643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.a.d
 * JD-Core Version:    0.6.2
 */