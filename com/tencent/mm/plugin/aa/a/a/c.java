package com.tencent.mm.plugin.aa.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.w;
import com.tencent.mm.protocal.protobuf.x;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends a<x>
{
  public c(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(40642);
    b.a locala = new b.a();
    w localw = new w();
    localw.limit = paramInt1;
    localw.offset = paramInt2;
    localw.type = paramInt3;
    locala.fsJ = localw;
    locala.fsK = new x();
    locala.uri = "/cgi-bin/mmpay-bin/newaaquerylist";
    locala.fsI = 1676;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ab.i("MicroMsg.CgiAAQueryList", "CgiAAQueryList, limit: %s, offset: %s, type: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    AppMethodBeat.o(40642);
  }

  public c(int paramInt1, int paramInt2, int paramInt3, String paramString1, int paramInt4, int paramInt5, String paramString2)
  {
    AppMethodBeat.i(40641);
    b.a locala = new b.a();
    w localw = new w();
    localw.limit = paramInt1;
    localw.offset = paramInt2;
    localw.type = paramInt3;
    localw.vAz = paramString1;
    localw.vAA = paramInt4;
    localw.vAB = paramInt5;
    localw.vAC = paramString2;
    locala.fsJ = localw;
    locala.fsK = new x();
    locala.uri = "/cgi-bin/mmpay-bin/newaaquerylist";
    locala.fsI = 1676;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ab.i("MicroMsg.CgiAAQueryList", "CgiAAQueryList, limit: %s, offset: %s, type: %s, bill_id: %s, trans_id: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString1, paramString2 });
    AppMethodBeat.o(40641);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.a.c
 * JD-Core Version:    0.6.2
 */