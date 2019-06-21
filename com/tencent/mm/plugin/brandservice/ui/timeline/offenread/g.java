package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.aj.z;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.chb;
import com.tencent.mm.protocal.protobuf.chc;
import com.tencent.mm.protocal.protobuf.chd;
import com.tencent.mm.protocal.protobuf.sr;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.r;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g extends m
  implements k
{
  b ehh;
  private f ehi;

  public g()
  {
    AppMethodBeat.i(14359);
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new chb();
    ((b.a)localObject1).fsK = new chc();
    ((b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/bizattr/timeline_often_read_biz";
    ((b.a)localObject1).fsI = 2768;
    ((b.a)localObject1).fsL = 0;
    ((b.a)localObject1).fsM = 0;
    this.ehh = ((b.a)localObject1).acD();
    localObject1 = (chb)this.ehh.fsG.fsP;
    Object localObject2 = d.aWL();
    if (localObject2 == null);
    while (true)
    {
      ((chb)localObject1).xfV = localLinkedList;
      AppMethodBeat.o(14359);
      return;
      localObject2 = ((chc)localObject2).xfW;
      if (!bo.ek((List)localObject2))
      {
        localLinkedList = new LinkedList();
        localObject2 = ((LinkedList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          Object localObject3 = (chd)((Iterator)localObject2).next();
          if (localObject3 != null)
          {
            sr localsr = new sr();
            localsr.vGE = ((chd)localObject3).vGE;
            long l = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoP(((chd)localObject3).vGE);
            localObject3 = z.aeX().mE(l);
            if (localObject3 != null)
              localsr.wag = ((int)(((com.tencent.mm.storage.q)localObject3).field_createTime / 1000L));
            localLinkedList.add(localsr);
          }
        }
      }
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(14361);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(14361);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(14360);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(14360);
  }

  public final int getType()
  {
    return 2768;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.g
 * JD-Core Version:    0.6.2
 */