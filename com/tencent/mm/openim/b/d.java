package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.bgc;
import com.tencent.mm.protocal.protobuf.bgd;
import com.tencent.mm.protocal.protobuf.vw;
import com.tencent.mm.protocal.protobuf.vx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.u;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  private String geY;

  public d(String paramString, LinkedList<bgc> paramLinkedList)
  {
    AppMethodBeat.i(78843);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new vw();
    ((b.a)localObject).fsK = new vx();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/delopenimchatroommember";
    ((b.a)localObject).fsI = 943;
    this.ehh = ((b.a)localObject).acD();
    this.geY = paramString;
    localObject = (vw)this.ehh.fsG.fsP;
    ((vw)localObject).gfa = paramString;
    ((vw)localObject).vEN = paramLinkedList;
    ab.i("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "roomname: %s, size:%d", new Object[] { paramString, Integer.valueOf(paramLinkedList.size()) });
    AppMethodBeat.o(78843);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78845);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78845);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78844);
    ab.i("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.geY });
    Object localObject;
    if (paramq.ZS().vyl == 0)
    {
      localObject = (vx)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      paramArrayOfByte = this.geY;
      if ((paramArrayOfByte.toLowerCase().endsWith("@im.chatroom")) && (!((vx)localObject).vEN.isEmpty()))
        break label166;
      ab.e("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "DelChatroomMember: room:[" + paramArrayOfByte + "] listCnt:" + ((vx)localObject).vEN.size());
    }
    while (true)
    {
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78844);
      return;
      label166: paramq = ((c)g.K(c.class)).XV();
      paramArrayOfByte = paramq.oa(paramArrayOfByte);
      List localList = u.aor(paramArrayOfByte.field_memberlist);
      ab.d("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "DelChatroomMember before " + localList.size());
      localObject = ((vx)localObject).vEN.iterator();
      while (((Iterator)localObject).hasNext())
        localList.remove(((bgd)((Iterator)localObject).next()).userName);
      ab.d("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "DelChatroomMember after " + localList.size());
      localObject = ((com.tencent.mm.plugin.chatroom.a.b)g.K(com.tencent.mm.plugin.chatroom.a.b.class)).U(localList);
      paramArrayOfByte.ep(localList).field_displayname = ((String)localObject);
      ab.d("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "delChatroomMember ".concat(String.valueOf(paramq.a(paramArrayOfByte))));
    }
  }

  public final int getType()
  {
    return 943;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.d
 * JD-Core Version:    0.6.2
 */