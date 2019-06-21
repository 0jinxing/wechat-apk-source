package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.bgc;
import com.tencent.mm.protocal.protobuf.bgd;
import com.tencent.mm.protocal.protobuf.co;
import com.tencent.mm.protocal.protobuf.cp;
import com.tencent.mm.roomsdk.a.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a extends com.tencent.mm.roomsdk.a.a
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  private String geY;

  public a(String paramString1, LinkedList<bgc> paramLinkedList, String paramString2)
  {
    AppMethodBeat.i(78832);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new co();
    ((b.a)localObject).fsK = new cp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addopenimchatroommember";
    ((b.a)localObject).fsI = 814;
    this.ehh = ((b.a)localObject).acD();
    this.geY = paramString1;
    localObject = (co)this.ehh.fsG.fsP;
    ((co)localObject).gfa = paramString1;
    ((co)localObject).vEN = paramLinkedList;
    ((co)localObject).desc = paramString2;
    ab.i("MicroMsg.Openim.NetSceneAddOpenIMChatRoomMember", "roomname: %s, size:%s, desc:%s", new Object[] { paramString1, Integer.valueOf(paramLinkedList.size()), paramString2 });
    AppMethodBeat.o(78832);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78834);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78834);
    return i;
  }

  public final com.tencent.mm.roomsdk.a.b.a a(com.tencent.mm.roomsdk.a.b.a parama)
  {
    AppMethodBeat.i(78835);
    if ((parama != null) && ((parama instanceof c)))
    {
      cp localcp = (cp)this.ehh.fsH.fsP;
      if (localcp != null)
      {
        com.tencent.mm.openim.room.a.b.b localb = new com.tencent.mm.openim.room.a.b.b();
        localb.q(localcp.vEN);
        parama = (c)parama;
        parama.chatroomName = this.geY;
        parama.cEX = localb.ehj.size();
        parama.cFX = localb.ehj;
        parama.ehj = localb.ehj;
        parama.cGa = localb.cGa;
        parama.ehk = localb.ehk;
        parama.cGc = localb.cGc;
        parama.ehl = localb.ehl;
        parama.cGd = localb.cGd;
        parama.vEO = localcp.vEO;
        AppMethodBeat.o(78835);
      }
    }
    while (true)
    {
      return parama;
      AppMethodBeat.o(78835);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78833);
    ab.i("MicroMsg.Openim.NetSceneAddOpenIMChatRoomMember", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.geY });
    if (paramq.ZS().vyl == 0)
    {
      paramq = (cp)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      paramArrayOfByte = this.geY;
      if ((paramArrayOfByte.toLowerCase().endsWith("@im.chatroom")) && (!paramq.vEN.isEmpty()))
        break label166;
      ab.e("MicroMsg.Openim.NetSceneAddOpenIMChatRoomMember", "AddChatroomMember: bad room:[" + paramArrayOfByte + "] listCnt:" + paramq.vEN.size());
    }
    while (true)
    {
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78833);
      return;
      label166: ArrayList localArrayList = new ArrayList();
      bd localbd = ((j)g.K(j.class)).XM();
      Iterator localIterator = paramq.vEN.iterator();
      while (localIterator.hasNext())
      {
        bgd localbgd = (bgd)localIterator.next();
        if (localbgd.status == 0)
        {
          paramq = localbd.aoO(localbgd.userName);
          if ((int)paramq.ewQ != 0)
          {
            paramq.NA();
            localbd.b(paramq.field_username, paramq);
          }
          while (true)
          {
            localArrayList.add(paramq.field_username);
            break;
            paramq = com.tencent.mm.openim.room.a.b.c.a(paramq, localbgd);
            localbd.Z(paramq);
          }
        }
      }
      if (!localArrayList.isEmpty())
        ((com.tencent.mm.plugin.chatroom.a.b)g.K(com.tencent.mm.plugin.chatroom.a.b.class)).a(paramArrayOfByte, localArrayList, null);
    }
  }

  public final int getType()
  {
    return 814;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.a
 * JD-Core Version:    0.6.2
 */