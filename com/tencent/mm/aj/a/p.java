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
import com.tencent.mm.protocal.protobuf.afl;
import com.tencent.mm.protocal.protobuf.afm;
import com.tencent.mm.protocal.protobuf.ke;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class p extends m
  implements k
{
  public b ehh;
  private f ehi;
  Map<String, String> fyg;

  public p(LinkedList<ke> paramLinkedList)
  {
    AppMethodBeat.i(11618);
    this.fyg = new HashMap();
    Object localObject1 = paramLinkedList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (ke)((Iterator)localObject1).next();
      String str = ((ke)localObject2).vMV;
      localObject2 = ((ke)localObject2).vNb;
      if ((localObject2 != null) && (str != null))
        this.fyg.put(str, localObject2);
    }
    localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new afl();
    ((b.a)localObject1).fsK = new afm();
    ((b.a)localObject1).uri = "/cgi-bin/mmocbiz-bin/getbizchatinfolist";
    ((b.a)localObject1).fsI = 1365;
    ((b.a)localObject1).fsL = 0;
    ((b.a)localObject1).fsM = 0;
    this.ehh = ((b.a)localObject1).acD();
    ((afl)this.ehh.fsG.fsP).wmS = paramLinkedList;
    AppMethodBeat.o(11618);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11620);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneGetBizChatInfoList", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11620);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11619);
    ab.d("MicroMsg.brandservice.NetSceneGetBizChatInfoList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11619);
  }

  public final int getType()
  {
    return 1365;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.p
 * JD-Core Version:    0.6.2
 */