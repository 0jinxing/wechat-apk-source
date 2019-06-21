package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bhp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

final class n$a$1
  implements ap.a
{
  private int fIf = 0;
  private int fLL = 0;

  n$a$1(n paramn1, List paramList, LinkedList paramLinkedList1, LinkedList paramLinkedList2, n paramn2)
  {
  }

  public final boolean BI()
  {
    int i = 0;
    AppMethodBeat.i(994);
    int j = this.fLN.size();
    int k = this.fLO.size();
    int m;
    ArrayList localArrayList;
    Object localObject;
    if (j < k)
    {
      m = j;
      if (j != k)
        ab.w("MicroMsg.OplogService", "summeroplog oplogSize[%d] not equal to resultSize[%d]! now size[%d] respIndex[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(this.fIf) });
      localArrayList = new ArrayList();
      if (this.fIf < m)
        break label177;
      this.fLM.frc = false;
      if (this.fLL > 0)
      {
        localObject = this.fLM.fCF;
        if (this.fLM.fCy.size() <= 0)
          break label171;
      }
    }
    boolean bool;
    label171: for (long l = 500L; ; l = 0L)
    {
      ((ap)localObject).ae(l, l);
      AppMethodBeat.o(994);
      bool = false;
      return bool;
      m = k;
      break;
    }
    label177: k = this.fIf + 20;
    if (k > m);
    while (true)
    {
      if (this.fIf < m)
      {
        j = ((Integer)this.fLO.get(this.fIf)).intValue();
        j.b localb = (j.b)this.fLN.get(this.fIf);
        if (this.fIf < this.fLP.size())
        {
          localObject = (bhp)this.fLP.get(this.fIf);
          label266: k = localb.id;
          ab.d("MicroMsg.OplogService", "summeroplog id:%d, cmd:%d, result:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(localb.getCmdId()), Integer.valueOf(j) });
          al.d(new n.a.1.1(this, localb, j, (bhp)localObject));
          if (j != 0)
            break label384;
          this.fLL += 1;
          localArrayList.add(localb);
          this.fLM.fCy.remove(Integer.valueOf(k));
        }
        while (true)
        {
          this.fIf += 1;
          break;
          localObject = null;
          break label266;
          label384: if (j == -433)
          {
            ab.e("MicroMsg.OplogService", "oplog not yet process, id:%d, cmd:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(localb.getCmdId()) });
          }
          else
          {
            localObject = (Integer)this.fLM.fCy.ai(Integer.valueOf(k));
            ab.d("MicroMsg.OplogService", "summeroplog id:%d, inserttime:%d, mapCnt:%d", new Object[] { Integer.valueOf(k), Long.valueOf(localb.fCv), localObject });
            if (localObject == null)
            {
              this.fLM.fCy.k(Integer.valueOf(k), Integer.valueOf(1));
            }
            else if (((Integer)localObject).intValue() < 2)
            {
              this.fLM.fCy.k(Integer.valueOf(k), Integer.valueOf(((Integer)localObject).intValue() + 1));
            }
            else
            {
              ab.d("MicroMsg.OplogService", "summeroplog LRUMap Max now id:%d, inserttime:%d", new Object[] { Integer.valueOf(k), Long.valueOf(localb.fCv) });
              localArrayList.add(localb);
            }
          }
        }
      }
      k = localArrayList.size();
      if (k > 0)
      {
        g.RQ();
        l = g.RP().eJN.iV(Thread.currentThread().getId());
        for (m = i; m < k; m++)
          this.fLM.fLJ.b((j.b)localArrayList.get(m));
        g.RQ();
        g.RP().eJN.mB(l);
      }
      AppMethodBeat.o(994);
      bool = true;
      break;
      m = k;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(995);
    String str = super.toString() + "|RespHandler";
    AppMethodBeat.o(995);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.n.a.1
 * JD-Core Version:    0.6.2
 */