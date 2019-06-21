package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.bgc;
import com.tencent.mm.protocal.protobuf.bgd;
import com.tencent.mm.protocal.protobuf.ut;
import com.tencent.mm.protocal.protobuf.uu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c extends com.tencent.mm.roomsdk.a.a
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;

  public c(LinkedList<bgc> paramLinkedList)
  {
    AppMethodBeat.i(78839);
    b.a locala = new b.a();
    locala.fsJ = new ut();
    locala.fsK = new uu();
    locala.uri = "/cgi-bin/micromsg-bin/createopenimchatroom";
    locala.fsI = 371;
    this.ehh = locala.acD();
    ((ut)this.ehh.fsG.fsP).vEN = paramLinkedList;
    ab.i("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "create size:%d", new Object[] { Integer.valueOf(paramLinkedList.size()) });
    AppMethodBeat.o(78839);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78841);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78841);
    return i;
  }

  public final com.tencent.mm.roomsdk.a.b.a a(com.tencent.mm.roomsdk.a.b.a parama)
  {
    AppMethodBeat.i(78842);
    if ((parama != null) && ((parama instanceof com.tencent.mm.roomsdk.a.b.c)))
    {
      uu localuu = (uu)this.ehh.fsH.fsP;
      if (localuu != null)
      {
        com.tencent.mm.openim.room.a.b.b localb = new com.tencent.mm.openim.room.a.b.b();
        localb.q(localuu.vEN);
        parama = (com.tencent.mm.roomsdk.a.b.c)parama;
        parama.chatroomName = localuu.gfa;
        parama.cEX = localb.ehj.size();
        parama.cFX = localb.ehj;
        parama.ehj = localb.ehj;
        parama.cGa = localb.cGa;
        parama.ehk = localb.ehk;
        parama.cGc = localb.cGc;
        parama.ehl = localb.ehl;
        parama.cGd = localb.cGd;
        AppMethodBeat.o(78842);
      }
    }
    while (true)
    {
      return parama;
      AppMethodBeat.o(78842);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78840);
    ab.i("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (paramq.ZS().vyl == 0)
    {
      paramq = (uu)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      if (!bo.isNullOrNil(paramq.gfa))
      {
        if (paramq.gfa.toLowerCase().endsWith("@im.chatroom"))
          break label148;
        ab.e("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "createChatroom: bad room:[" + paramq.gfa + "]");
      }
    }
    while (true)
    {
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78840);
      return;
      label148: ad localad = new ad();
      localad.setUsername(paramq.gfa);
      paramArrayOfByte = ((j)g.K(j.class)).XM();
      if (!paramArrayOfByte.aoQ(localad.field_username))
        paramArrayOfByte.Z(localad);
      if ((!bo.isNullOrNil(localad.field_username)) && (!bo.isNullOrNil(paramq.wck)))
      {
        localObject = new h();
        ((h)localObject).username = localad.field_username;
        ((h)localObject).frW = paramq.wcj;
        ((h)localObject).frV = paramq.wck;
        ((h)localObject).dtR = 3;
        ((h)localObject).cB(false);
        ((h)localObject).bJt = -1;
        o.act().b((h)localObject);
      }
      Object localObject = new ArrayList();
      Iterator localIterator = paramq.vEN.iterator();
      while (localIterator.hasNext())
      {
        bgd localbgd = (bgd)localIterator.next();
        if (localbgd.status == 0)
        {
          paramq = paramArrayOfByte.aoO(localbgd.userName);
          if ((int)paramq.ewQ != 0)
          {
            paramq.NA();
            paramArrayOfByte.b(paramq.field_username, paramq);
          }
          while (true)
          {
            ((ArrayList)localObject).add(paramq.field_username);
            break;
            paramq = com.tencent.mm.openim.room.a.b.c.a(paramq, localbgd);
            paramArrayOfByte.Z(paramq);
          }
        }
      }
      if (!((ArrayList)localObject).contains(r.Yz()))
      {
        ((ArrayList)localObject).add(r.Yz());
        ab.d("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "respon has not self add one " + ((ArrayList)localObject).contains(r.Yz()));
      }
      ((com.tencent.mm.plugin.chatroom.a.b)g.K(com.tencent.mm.plugin.chatroom.a.b.class)).a(localad.field_username, (ArrayList)localObject, r.Yz());
    }
  }

  public final int getType()
  {
    return 371;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.c
 * JD-Core Version:    0.6.2
 */