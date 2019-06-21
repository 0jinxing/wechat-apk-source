package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.n;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.arz;
import com.tencent.mm.protocal.protobuf.tk;
import com.tencent.mm.protocal.protobuf.tl;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

public final class f extends m
  implements k
{
  private LinkedList<arz> cFS;
  private final b ehh;
  private com.tencent.mm.ai.f ehi;

  public f(LinkedList<arz> paramLinkedList)
  {
    AppMethodBeat.i(103913);
    this.cFS = paramLinkedList;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new tk();
    ((b.a)localObject).fsK = new tl();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/collectchatroom";
    ((b.a)localObject).fsI = 181;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (tk)this.ehh.fsG.fsP;
    ((tk)localObject).waB = paramLinkedList;
    ((tk)localObject).waA = paramLinkedList.size();
    AppMethodBeat.o(103913);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(103914);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103914);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103915);
    ab.d("MicroMsg.NetSceneCollectChatRoom", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if (paramq.ZS().vyl != 0)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(103915);
    }
    while (true)
    {
      return;
      if (this.cFS != null)
      {
        paramArrayOfByte = this.cFS.iterator();
        while (paramArrayOfByte.hasNext())
        {
          paramq = (arz)paramArrayOfByte.next();
          ab.d("MicroMsg.NetSceneCollectChatRoom", "del groupcard Name :" + paramq.wvO);
          n.mv(paramq.wvO);
        }
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(103915);
    }
  }

  public final int getType()
  {
    return 181;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.f
 * JD-Core Version:    0.6.2
 */