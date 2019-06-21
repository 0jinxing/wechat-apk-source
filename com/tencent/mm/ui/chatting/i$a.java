package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.k;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

final class i$a
  implements az.a
{
  private Set<Long> yIu;
  private p yIv;
  private ah yIw;

  public i$a(Set<Long> paramSet, p paramp, ah paramah)
  {
    this.yIu = paramSet;
    this.yIv = paramp;
    this.yIw = paramah;
  }

  public final boolean acf()
  {
    AppMethodBeat.i(30529);
    Object localObject1 = this.yIu;
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = ((Set)localObject1).iterator();
    if (localIterator.hasNext())
    {
      localObject1 = (Long)localIterator.next();
      aw.ZK();
      Object localObject2 = c.XO().jf(((Long)localObject1).longValue());
      if (((cy)localObject2).field_msgId == ((Long)localObject1).longValue())
      {
        if (!((bi)localObject2).bAA())
          break label147;
        com.tencent.mm.modelstat.b.fRa.c((bi)localObject2, k.k((bi)localObject2));
      }
      while (true)
      {
        localLinkedList.add(localObject1);
        localObject2 = new nt();
        ((nt)localObject2).cJY.type = 3;
        ((nt)localObject2).cJY.cvx = ((Long)localObject1).longValue();
        a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        break;
        label147: com.tencent.mm.modelstat.b.fRa.E((bi)localObject2);
      }
    }
    bf.X(localLinkedList);
    if (this.yIw != null)
      this.yIw.a(ah.a.yLO);
    AppMethodBeat.o(30529);
    return true;
  }

  public final boolean acg()
  {
    AppMethodBeat.i(30530);
    if (this.yIv != null)
    {
      this.yIv.dismiss();
      if (this.yIw != null)
        this.yIw.b(ah.a.yLO);
    }
    AppMethodBeat.o(30530);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.a
 * JD-Core Version:    0.6.2
 */