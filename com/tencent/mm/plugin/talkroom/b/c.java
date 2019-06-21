package com.tencent.mm.plugin.talkroom.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aow;
import com.tencent.mm.protocal.protobuf.aox;
import com.tencent.mm.protocal.protobuf.cgm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class c extends f
{
  private final b ehh;
  private com.tencent.mm.ai.f ehi;
  private final String nNq;
  private int sceneType;
  public int syE;
  public LinkedList<cgm> sza;

  public c(int paramInt1, long paramLong, String paramString, int paramInt2)
  {
    AppMethodBeat.i(25875);
    this.sceneType = 0;
    this.sceneType = paramInt2;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aow();
    ((b.a)localObject).fsK = new aox();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/gettalkroommember";
    ((b.a)localObject).fsI = 336;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aow)this.ehh.fsG.fsP;
    ((aow)localObject).wem = paramInt1;
    ((aow)localObject).wen = paramLong;
    this.nNq = paramString;
    ((aow)localObject).Scene = paramInt2;
    AppMethodBeat.o(25875);
  }

  private static LinkedList<cgm> as(LinkedList<cgm> paramLinkedList)
  {
    AppMethodBeat.i(25878);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      paramLinkedList = (cgm)localIterator.next();
      if (!bo.isNullOrNil(paramLinkedList.jBB))
        localLinkedList.add(paramLinkedList);
    }
    AppMethodBeat.o(25878);
    return localLinkedList;
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(25876);
    ab.d("MicroMsg.NetSceneGetTalkRoomMember", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(25876);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25877);
    ab.d("MicroMsg.NetSceneGetTalkRoomMember", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25877);
    }
    while (true)
    {
      return;
      paramq = (aox)this.ehh.fsH.fsP;
      ab.i("MicroMsg.NetSceneGetTalkRoomMember", "resp %s", new Object[] { paramq.toString() });
      this.syE = paramq.weo;
      this.sza = as(paramq.vEh);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25877);
    }
  }

  public final String cED()
  {
    return this.nNq;
  }

  public final int cEE()
  {
    return this.sceneType;
  }

  public final int getType()
  {
    return 336;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.b.c
 * JD-Core Version:    0.6.2
 */