package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.fm;
import com.tencent.mm.protocal.protobuf.fn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class c extends a<fn>
{
  public c(long paramLong, String paramString1, String paramString2, String paramString3, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(103908);
    ab.d("MicroMsg.CgiApproveAddChatRoomMember", "inviterusername%s,roomname:%s,ticket:%s,username:%s approvenewmsgid:%s", new Object[] { paramString1, paramString2, bo.anv(paramString3), paramLinkedList, Long.valueOf(paramLong) });
    fm localfm = new fm();
    localfm.fLi = paramString1;
    localfm.geY = paramString2;
    localfm.cxb = paramString3;
    localfm.vHv = paramLinkedList;
    localfm.vHw = paramLong;
    paramString1 = new b.a();
    paramString1.fsJ = localfm;
    paramString1.fsK = new fn();
    paramString1.uri = "/cgi-bin/micromsg-bin/approveaddchatroommember";
    paramString1.fsI = 774;
    this.ehh = paramString1.acD();
    AppMethodBeat.o(103908);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.c
 * JD-Core Version:    0.6.2
 */