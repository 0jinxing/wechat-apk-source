package com.tencent.mm.plugin.appbrand.appusage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.bsf;
import com.tencent.mm.protocal.protobuf.bsg;
import com.tencent.mm.protocal.protobuf.sp;
import com.tencent.mm.protocal.protobuf.sq;
import com.tencent.mm.protocal.protobuf.zd;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public class j extends a<bsg>
{
  public j(long paramLong, LinkedList<zd> paramLinkedList, LinkedList<sp> paramLinkedList1, int paramInt1, int paramInt2, int paramInt3, sq paramsq)
  {
    AppMethodBeat.i(129758);
    ab.i("MicroMsg.Recommend.CgiReportRecommendWxa", "sessionId:%d, action_scene:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1) });
    b.a locala = new b.a();
    bsf localbsf = new bsf();
    localbsf.bHi = paramLong;
    localbsf.wUh = paramLinkedList;
    localbsf.wUk = paramLinkedList1;
    localbsf.wUi = paramInt1;
    localbsf.wUj = paramInt2;
    localbsf.wUl = paramInt3;
    localbsf.wsi = paramsq;
    locala.fsJ = localbsf;
    locala.fsK = new bsg();
    locala.uri = "/cgi-bin/mmbiz-bin/wxabusiness/reportrecommendwxa";
    locala.fsI = 2564;
    this.ehh = locala.acD();
    AppMethodBeat.o(129758);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.j
 * JD-Core Version:    0.6.2
 */