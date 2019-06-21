package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.bay;
import com.tencent.mm.protocal.protobuf.baz;
import com.tencent.mm.protocal.protobuf.up;
import com.tencent.mm.protocal.protobuf.uq;
import com.tencent.mm.roomsdk.a.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g extends com.tencent.mm.roomsdk.a.a
  implements k
{
  public int cFY;
  public String cFZ;
  public final List<String> cGa;
  public final List<String> cGc;
  public List<String> cGd;
  public List<String> cGe;
  private final b ehh;
  private f ehi;
  public final List<String> ehk;

  public g(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(103916);
    this.cFY = 0;
    ab.d("MicroMsg.NetSceneCreateChatRoom", "topic : " + paramString + " size : " + paramList.size() + " username : " + (String)paramList.get(0));
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new up();
    ((b.a)localObject).fsK = new uq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/createchatroom";
    ((b.a)localObject).fsI = 119;
    ((b.a)localObject).fsL = 37;
    ((b.a)localObject).fsM = 1000000037;
    this.ehh = ((b.a)localObject).acD();
    localObject = (up)this.ehh.fsG.fsP;
    ((up)localObject).wcc = aa.vy(paramString);
    paramString = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      bay localbay = new bay();
      localbay.wcG = aa.vy(str);
      paramString.add(localbay);
    }
    ((up)localObject).vEh = paramString;
    ((up)localObject).ehB = paramString.size();
    this.cGa = new LinkedList();
    this.ehk = new LinkedList();
    this.cGc = new LinkedList();
    this.cGd = new LinkedList();
    this.cGe = new LinkedList();
    this.cFZ = "";
    AppMethodBeat.o(103916);
  }

  private void M(List<baz> paramList)
  {
    AppMethodBeat.i(103920);
    int i = 0;
    if (i < paramList.size())
    {
      int j = ((baz)paramList.get(i)).wFJ;
      if (j == 0)
        this.cGe.add(aa.a(((baz)paramList.get(i)).wcG));
      while (true)
      {
        i++;
        break;
        if (j == 3)
        {
          ab.d("MicroMsg.NetSceneCreateChatRoom", " blacklist : " + ((baz)paramList.get(i)).wcG);
          this.ehk.add(aa.a(((baz)paramList.get(i)).wcG));
        }
        else if (j == 1)
        {
          ab.d("MicroMsg.NetSceneCreateChatRoom", " not user : " + ((baz)paramList.get(i)).wcG);
          this.cGc.add(aa.a(((baz)paramList.get(i)).wcG));
        }
        else if (j == 2)
        {
          ab.d("MicroMsg.NetSceneCreateChatRoom", " invalid username : " + ((baz)paramList.get(i)).wcG);
          this.cGa.add(aa.a(((baz)paramList.get(i)).wcG));
        }
        else if (j == 4)
        {
          ab.d("MicroMsg.NetSceneCreateChatRoom", " verify user : " + ((baz)paramList.get(i)).wcG);
          this.cGd.add(aa.a(((baz)paramList.get(i)).wcG));
        }
        else if ((j != 5) && (j != 6))
        {
          ab.w("MicroMsg.NetSceneCreateChatRoom", "unknown member status : status = ".concat(String.valueOf(j)));
        }
      }
    }
    AppMethodBeat.o(103920);
  }

  private static boolean a(uq paramuq)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(103918);
    if ((!aa.a(paramuq.vEi).toLowerCase().endsWith("@chatroom")) || (paramuq.ehB == 0))
    {
      ab.e("MicroMsg.NetSceneCreateChatRoom", "CreateChatroom: room:[" + paramuq.vEi + "] listCnt:" + paramuq.ehB);
      AppMethodBeat.o(103918);
    }
    while (true)
    {
      return bool;
      ad localad = new ad();
      localad.iB(aa.a(paramuq.wcc));
      localad.iC(aa.a(paramuq.wce));
      localad.iD(aa.a(paramuq.wcf));
      localad.setUsername(aa.a(paramuq.vEi));
      bd localbd = ((j)com.tencent.mm.kernel.g.K(j.class)).XM();
      if (!localbd.aoQ(localad.field_username))
        localbd.Z(localad);
      Object localObject = new h();
      ((h)localObject).username = localad.field_username;
      ((h)localObject).frW = paramuq.vXm;
      ((h)localObject).frV = paramuq.vXn;
      ((h)localObject).dtR = 3;
      ((h)localObject).cB(false);
      ((h)localObject).bJt = -1;
      o.act().b((h)localObject);
      ArrayList localArrayList = new ArrayList();
      if (i < paramuq.vEh.size())
      {
        if (((baz)paramuq.vEh.get(i)).wFJ == 0)
        {
          localObject = localbd.aoO(aa.a(((baz)paramuq.vEh.get(i)).wcG));
          if ((int)((com.tencent.mm.n.a)localObject).ewQ == 0)
            break label340;
          ((ad)localObject).NA();
          localbd.b(((ap)localObject).field_username, (ad)localObject);
        }
        while (true)
        {
          localArrayList.add(((ap)localObject).field_username);
          i++;
          break;
          label340: localObject = n.a((ad)localObject, (baz)paramuq.vEh.get(i));
          localbd.Z((ad)localObject);
        }
      }
      if (!localArrayList.contains(r.Yz()))
      {
        localArrayList.add(r.Yz());
        ab.d("MicroMsg.NetSceneCreateChatRoom", "respon has not self add one " + localArrayList.contains(r.Yz()));
      }
      bool = n.a(localad.field_username, localArrayList, r.Yz());
      AppMethodBeat.o(103918);
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(103917);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103917);
    return i;
  }

  public final com.tencent.mm.roomsdk.a.b.a a(com.tencent.mm.roomsdk.a.b.a parama)
  {
    AppMethodBeat.i(103921);
    if ((parama instanceof c))
    {
      parama = (c)parama;
      parama.chatroomName = this.cFZ;
      parama.cGa = this.cGa;
      parama.cEX = this.cFY;
      parama.cFX = this.cGe;
      parama.ehj = this.cGe;
      parama.ehk = this.ehk;
      parama.cGc = this.cGc;
      parama.ehl = new LinkedList();
      parama.cGd = this.cGd;
      AppMethodBeat.o(103921);
    }
    while (true)
    {
      return parama;
      AppMethodBeat.o(103921);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103919);
    ab.d("MicroMsg.NetSceneCreateChatRoom", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramq = (uq)this.ehh.fsH.fsP;
    this.cFZ = aa.a(paramq.vEi);
    paramInt1 = this.ehh.fsH.vyl;
    this.cFY = paramq.ehB;
    M(paramq.vEh);
    if ((!bo.isNullOrNil(this.cFZ)) && (paramInt1 == 0))
      a(paramq);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(103919);
  }

  public final int getType()
  {
    return 119;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.g
 * JD-Core Version:    0.6.2
 */