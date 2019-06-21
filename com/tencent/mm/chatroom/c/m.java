package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.aut;
import com.tencent.mm.protocal.protobuf.auu;
import com.tencent.mm.protocal.protobuf.bay;
import com.tencent.mm.roomsdk.a.b.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class m extends com.tencent.mm.roomsdk.a.a
  implements k
{
  public bi cKd;
  public int ehB;
  private final b ehh;
  private f ehi;

  public m(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(103940);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aut();
    ((b.a)localObject).fsK = new auu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/invitechatroommember";
    ((b.a)localObject).fsI = 610;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    aut localaut = (aut)this.ehh.fsG.fsP;
    localObject = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      bay localbay = new bay();
      localbay.wcG = aa.vy(paramList);
      ((LinkedList)localObject).add(localbay);
    }
    localaut.vEh = ((LinkedList)localObject);
    localaut.ehB = ((LinkedList)localObject).size();
    localaut.vEi = aa.vy(paramString);
    localaut.wyV = 0;
    AppMethodBeat.o(103940);
  }

  public m(String paramString1, List<String> paramList, String paramString2, bi parambi)
  {
    AppMethodBeat.i(103941);
    this.cKd = parambi;
    parambi = new b.a();
    parambi.fsJ = new aut();
    parambi.fsK = new auu();
    parambi.uri = "/cgi-bin/micromsg-bin/invitechatroommember";
    parambi.fsI = 610;
    parambi.fsL = 0;
    parambi.fsM = 0;
    this.ehh = parambi.acD();
    parambi = (aut)this.ehh.fsG.fsP;
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      bay localbay = new bay();
      localbay.wcG = aa.vy(paramList);
      localLinkedList.add(localbay);
    }
    this.ehB = localLinkedList.size();
    parambi.vEh = localLinkedList;
    parambi.ehB = localLinkedList.size();
    parambi.vEi = aa.vy(paramString1);
    parambi.wyV = 2;
    parambi.wyW = paramString2;
    AppMethodBeat.o(103941);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(103942);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103942);
    return i;
  }

  public final com.tencent.mm.roomsdk.a.b.a a(com.tencent.mm.roomsdk.a.b.a parama)
  {
    Object localObject = parama;
    if ((parama instanceof d))
    {
      localObject = (d)parama;
      ((d)localObject).ehB = this.ehB;
      ((d)localObject).xuW = this.cKd;
    }
    return localObject;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103943);
    ab.d("MicroMsg.NetSceneInviteChatRoomMember", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(103943);
  }

  public final int getType()
  {
    return 610;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.m
 * JD-Core Version:    0.6.2
 */