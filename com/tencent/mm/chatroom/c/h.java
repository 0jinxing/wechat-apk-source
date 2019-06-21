package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.n;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.vj;
import com.tencent.mm.protocal.protobuf.vk;
import com.tencent.mm.protocal.protobuf.vt;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h extends m
  implements k
{
  public List<String> cFX;
  private b ehh;
  private f ehi;

  public h(String paramString, List<String> paramList, int paramInt)
  {
    AppMethodBeat.i(103922);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new vj();
    ((b.a)localObject).fsK = new vk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/delchatroommember";
    ((b.a)localObject).fsI = 179;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (vj)this.ehh.fsG.fsP;
    ((vj)localObject).vEf = paramString;
    paramString = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      vt localvt = new vt();
      localvt.wcG = aa.vy(str);
      paramString.add(localvt);
    }
    ((vj)localObject).vEh = paramString;
    ((vj)localObject).ehB = paramString.size();
    ((vj)localObject).Scene = paramInt;
    this.cFX = paramList;
    AppMethodBeat.o(103922);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(103923);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103923);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103924);
    ab.d("MicroMsg.NetSceneDelChatRoomMember", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (vj)this.ehh.fsG.fsP;
    paramq = (vk)this.ehh.fsH.fsP;
    if (this.ehh.fsH.vyl != 0)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(103924);
    }
    while (true)
    {
      return;
      n.a(paramArrayOfByte.vEf, paramq);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(103924);
    }
  }

  public final int getType()
  {
    return 179;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.h
 * JD-Core Version:    0.6.2
 */