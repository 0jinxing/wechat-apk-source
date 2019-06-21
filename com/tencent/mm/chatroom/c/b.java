package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.by;
import com.tencent.mm.protocal.protobuf.bz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class b extends a<bz>
{
  public b(String paramString, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(103907);
    ab.d("MicroMsg.CgiAddChatRoomAdmin", "roomName:%s,username:%s", new Object[] { paramString, bo.c(paramLinkedList, ";") });
    by localby = new by();
    localby.vEf = paramString;
    localby.vEg = paramLinkedList;
    paramString = new b.a();
    paramString.fsJ = localby;
    paramString.fsK = new bz();
    paramString.uri = "/cgi-bin/micromsg-bin/addchatroomadmin";
    paramString.fsI = 889;
    this.ehh = paramString.acD();
    AppMethodBeat.o(103907);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.b
 * JD-Core Version:    0.6.2
 */