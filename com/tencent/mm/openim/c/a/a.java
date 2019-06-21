package com.tencent.mm.openim.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.bgc;
import com.tencent.mm.protocal.protobuf.fo;
import com.tencent.mm.protocal.protobuf.fp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class a extends com.tencent.mm.ai.a<fp>
{
  public a(String paramString1, String paramString2, String paramString3, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(78917);
    ab.d("MicroMsg.CgiOpenImApproveAddRoomMember", "CgiOpenImApproveAddRoomMember() inviterusername%s, roomname:%s, ticket:%s, username:%s", new Object[] { paramString1, paramString2, bo.anv(paramString3), paramLinkedList });
    fo localfo = new fo();
    localfo.cxb = paramString3;
    localfo.geY = paramString2;
    paramString2 = new bgc();
    paramString2.userName = paramString1;
    localfo.vHx = paramString2;
    paramString1 = new LinkedList();
    paramString3 = paramLinkedList.iterator();
    while (paramString3.hasNext())
    {
      paramLinkedList = (String)paramString3.next();
      paramString2 = new bgc();
      paramString2.userName = paramLinkedList;
      paramString1.add(paramString2);
    }
    localfo.vHy = paramString1;
    paramString1 = new b.a();
    paramString1.fsJ = localfo;
    paramString1.fsK = new fp();
    paramString1.uri = "/cgi-bin/micromsg-bin/approveaddopenimchatroommember";
    paramString1.fsI = 941;
    this.ehh = paramString1.acD();
    AppMethodBeat.o(78917);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.c.a.a
 * JD-Core Version:    0.6.2
 */