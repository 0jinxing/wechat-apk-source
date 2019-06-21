package com.tencent.mm.plugin.wallet.balance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.pb;
import com.tencent.mm.protocal.protobuf.pc;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends a<pc>
{
  public b(long paramLong, String paramString1, String paramString2)
  {
    AppMethodBeat.i(45220);
    b.a locala = new b.a();
    pb localpb = new pb();
    localpb.vWl = paramLong;
    localpb.vWm = paramString1;
    localpb.vWn = paramString2;
    locala.fsJ = localpb;
    locala.fsK = new pc();
    locala.uri = "/cgi-bin/mmpay-bin/tenpay/getfreefeedetail";
    locala.fsI = 1236;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ab.i("MicroMsg.CgiGetFreeFeeDetail", "get free fee detail: %s, %s, %s", new Object[] { Long.valueOf(paramLong), paramString1, paramString2 });
    AppMethodBeat.o(45220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.b
 * JD-Core Version:    0.6.2
 */