package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.model.n;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.bay;
import com.tencent.mm.protocal.protobuf.baz;
import com.tencent.mm.protocal.protobuf.ca;
import com.tencent.mm.protocal.protobuf.cb;
import com.tencent.mm.roomsdk.a.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e extends com.tencent.mm.roomsdk.a.a
  implements k
{
  private int cEX;
  public final List<String> cFX;
  private final List<String> cGa;
  private final List<String> cGc;
  private final List<String> cGd;
  private String chatroomName;
  private final b ehh;
  private f ehi;
  private final List<String> ehj;
  private final List<String> ehk;
  private final List<String> ehl;

  public e(String paramString1, List<String> paramList, String paramString2)
  {
    AppMethodBeat.i(103910);
    this.ehi = null;
    this.cEX = 0;
    this.chatroomName = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ca();
    ((b.a)localObject).fsK = new cb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addchatroommember";
    ((b.a)localObject).fsI = 120;
    ((b.a)localObject).fsL = 36;
    ((b.a)localObject).fsM = 1000000036;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ca)this.ehh.fsG.fsP;
    ((ca)localObject).vEi = aa.vy(paramString1);
    this.chatroomName = paramString1;
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramString1 = (String)localIterator.next();
      bay localbay = new bay();
      localbay.wcG = aa.vy(paramString1);
      localLinkedList.add(localbay);
    }
    ((ca)localObject).vEh = localLinkedList;
    ((ca)localObject).ehB = localLinkedList.size();
    this.ehj = new ArrayList();
    this.cGa = new LinkedList();
    this.ehk = new LinkedList();
    this.cGc = new LinkedList();
    this.cGd = new LinkedList();
    this.ehl = new ArrayList();
    this.cFX = paramList;
    ((ca)localObject).vEk = paramString2;
    AppMethodBeat.o(103910);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(103911);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103911);
    return i;
  }

  public final com.tencent.mm.roomsdk.a.b.a a(com.tencent.mm.roomsdk.a.b.a parama)
  {
    Object localObject = parama;
    if ((parama instanceof c))
    {
      localObject = (c)parama;
      ((c)localObject).chatroomName = this.chatroomName;
      ((c)localObject).cGa = this.cGa;
      ((c)localObject).cEX = this.cEX;
      ((c)localObject).cFX = this.cFX;
      ((c)localObject).ehk = this.ehk;
      ((c)localObject).ehj = this.ehj;
      ((c)localObject).cGc = this.cGc;
      ((c)localObject).ehl = this.ehl;
      ((c)localObject).cGd = this.cGd;
    }
    return localObject;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103912);
    paramq = (ca)this.ehh.fsG.fsP;
    cb localcb = (cb)this.ehh.fsH.fsP;
    this.cEX = localcb.ehB;
    paramArrayOfByte = localcb.vEh;
    paramInt1 = 0;
    if (paramInt1 < paramArrayOfByte.size())
    {
      int i = ((baz)paramArrayOfByte.get(paramInt1)).wFJ;
      if (i == 0)
        this.ehj.add(aa.a(((baz)paramArrayOfByte.get(paramInt1)).wcG));
      while (true)
      {
        paramInt1++;
        break;
        if (i == 3)
        {
          ab.d("MicroMsg.NetSceneAddChatRoomMember", " blacklist : " + ((baz)paramArrayOfByte.get(paramInt1)).wcG);
          this.ehk.add(aa.a(((baz)paramArrayOfByte.get(paramInt1)).wcG));
        }
        else if (i == 1)
        {
          ab.d("MicroMsg.NetSceneAddChatRoomMember", " not user : " + ((baz)paramArrayOfByte.get(paramInt1)).wcG);
          this.cGc.add(aa.a(((baz)paramArrayOfByte.get(paramInt1)).wcG));
        }
        else if (i == 2)
        {
          ab.d("MicroMsg.NetSceneAddChatRoomMember", " invalid username : " + ((baz)paramArrayOfByte.get(paramInt1)).wcG);
          this.cGa.add(aa.a(((baz)paramArrayOfByte.get(paramInt1)).wcG));
        }
        else if (i == 4)
        {
          ab.d("MicroMsg.NetSceneAddChatRoomMember", " verify user : " + ((baz)paramArrayOfByte.get(paramInt1)).wcG);
          this.cGd.add(aa.a(((baz)paramArrayOfByte.get(paramInt1)).wcG));
        }
        else if (i != 5)
        {
          if (i == 6)
            this.ehl.add(aa.a(((baz)paramArrayOfByte.get(paramInt1)).wcG));
          else
            ab.w("MicroMsg.NetSceneAddChatRoomMember", "unknown member status : status = ".concat(String.valueOf(i)));
        }
      }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if ((paramInt2 == 0) && (paramInt3 == 0))
      n.a(aa.a(paramq.vEi), localcb);
    AppMethodBeat.o(103912);
  }

  public final int getType()
  {
    return 120;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.e
 * JD-Core Version:    0.6.2
 */