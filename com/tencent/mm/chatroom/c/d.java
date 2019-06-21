package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.vh;
import com.tencent.mm.protocal.protobuf.vi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class d extends a<vi>
{
  public d(String paramString, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(103909);
    ab.d("MicroMsg.CgiAddChatRoomAdmin", "roomName:%s,username:%s", new Object[] { paramString, bo.c(paramLinkedList, ";") });
    vh localvh = new vh();
    localvh.vEf = paramString;
    localvh.vEg = paramLinkedList;
    paramString = new b.a();
    paramString.fsJ = localvh;
    paramString.fsK = new vi();
    paramString.uri = "/cgi-bin/micromsg-bin/delchatroomadmin";
    paramString.fsI = 259;
    this.ehh = paramString.acD();
    AppMethodBeat.o(103909);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.d
 * JD-Core Version:    0.6.2
 */