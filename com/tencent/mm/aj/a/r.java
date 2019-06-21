package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.afr;
import com.tencent.mm.protocal.protobuf.afs;
import com.tencent.mm.protocal.protobuf.lj;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class r extends m
  implements k
{
  Object data;
  public b ehh;
  private f ehi;
  Map<String, String> fyh;

  public r(LinkedList<lj> paramLinkedList, Object paramObject)
  {
    AppMethodBeat.i(11624);
    this.fyh = new HashMap();
    Object localObject1 = paramLinkedList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (lj)((Iterator)localObject1).next();
      Object localObject3 = ((lj)localObject2).vOW;
      localObject2 = ((lj)localObject2).vNb;
      if ((localObject2 != null) && (localObject3 != null) && (((LinkedList)localObject3).size() > 0))
      {
        localObject3 = ((LinkedList)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          String str = (String)((Iterator)localObject3).next();
          this.fyh.put(str, localObject2);
        }
      }
    }
    localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new afr();
    ((b.a)localObject1).fsK = new afs();
    ((b.a)localObject1).uri = "/cgi-bin/mmocbiz-bin/getbizchatuserinfolist";
    ((b.a)localObject1).fsI = 1353;
    ((b.a)localObject1).fsL = 0;
    ((b.a)localObject1).fsM = 0;
    this.ehh = ((b.a)localObject1).acD();
    ((afr)this.ehh.fsG.fsP).wmU = paramLinkedList;
    this.data = paramObject;
    AppMethodBeat.o(11624);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11626);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneGetBizChatUserInfoList", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11626);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11625);
    ab.d("MicroMsg.brandservice.NetSceneGetBizChatUserInfoList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11625);
  }

  public final int getType()
  {
    return 1353;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.r
 * JD-Core Version:    0.6.2
 */