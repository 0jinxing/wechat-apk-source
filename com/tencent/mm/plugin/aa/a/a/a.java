package com.tencent.mm.plugin.aa.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.p;
import com.tencent.mm.protocal.protobuf.q;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends com.tencent.mm.ai.a<q>
{
  public a(String paramString1, long paramLong, int paramInt, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(40639);
    p localp = new p();
    localp.vzL = paramString1;
    localp.vAe = paramLong;
    localp.scene = paramInt;
    localp.vzM = paramString2;
    localp.vAg = paramString3;
    localp.pQe = paramString4;
    paramString1 = new b.a();
    paramString1.fsJ = localp;
    paramString1.fsK = new q();
    paramString1.fsI = 1344;
    paramString1.uri = "/cgi-bin/mmpay-bin/newaapaysucc";
    paramString1.fsL = 0;
    paramString1.fsM = 0;
    this.ehh = paramString1.acD();
    ab.i("MicroMsg.CgiAAPaySucc", "CgiAAPaySucc, bill_no: %s, pay_amount: %s, scene: %s, groupid: %s, out_trade_no: %s, trans_id: %s", new Object[] { localp.vzL, Long.valueOf(localp.vAe), Integer.valueOf(localp.scene), localp.vzM, localp.vAg, localp.pQe });
    AppMethodBeat.o(40639);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.a.a
 * JD-Core Version:    0.6.2
 */