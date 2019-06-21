package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.plugin.topstory.a.g;
import com.tencent.mm.protocal.protobuf.bdk;
import com.tencent.mm.protocal.protobuf.bqg;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.protocal.protobuf.chy;
import com.tencent.mm.protocal.protobuf.clz;
import com.tencent.mm.protocal.protobuf.cnq;
import com.tencent.mm.protocal.protobuf.cnt;
import com.tencent.mm.protocal.protobuf.cnu;
import com.tencent.mm.protocal.protobuf.ue;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class n$2$1
  implements Runnable
{
  n$2$1(n.2 param2, bqg parambqg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1758);
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = this.sFk.wSz.vHk.iterator();
    Object localObject3;
    Object localObject5;
    Object localObject6;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (cnu)((Iterator)localObject2).next();
      ??? = new chw();
      if (!bo.isNullOrNil(((cnu)localObject3).xkY.wbI))
      {
        ((chw)???).xgS = ((cnu)localObject3).xkY.wbI;
        if ((((cnu)localObject3).xla != null) && (((cnu)localObject3).xla.xkW == 1))
          if ((((cnu)localObject3).xla.xkX != null) && (!bo.ek(((cnu)localObject3).xla.xkX.wHo)))
          {
            ((chw)???).xhb.clear();
            localObject3 = ((cnu)localObject3).xla.xkX.wHo.iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localObject5 = (clz)((Iterator)localObject3).next();
              localObject6 = new chy();
              ((chy)localObject6).url = ((clz)localObject5).xjH.dlY();
              ((chy)localObject6).xhg = 0;
              ((chw)???).xhb.add(localObject6);
              ((chw)???).xha = ((clz)localObject5).xjJ;
            }
            localObject3 = g.dM(((chw)???).xhb);
            if (localObject3 != null)
            {
              ((chw)???).videoUrl = ((chy)localObject3).url;
              ((chw)???).xhg = ((chy)localObject3).xhg;
            }
          }
        while (true)
        {
          localArrayList.add(???);
          break;
          if (!bo.isNullOrNil(((cnu)localObject3).xlb))
          {
            ((chw)???).xhb.clear();
            n.b((chw)???, ((cnu)localObject3).xlb, "");
            localObject3 = g.dM(((chw)???).xhb);
            if (localObject3 != null)
            {
              ((chw)???).videoUrl = ((chy)localObject3).url;
              ((chw)???).xhg = ((chy)localObject3).xhg;
            }
          }
        }
      }
    }
    while (true)
    {
      int i;
      synchronized (this.sFl.sFe)
      {
        localObject3 = this.sFl.sFe.cGQ();
        if (bo.ek((List)localObject3))
        {
          AppMethodBeat.o(1758);
          return;
        }
        i = 0;
        if (i >= ((List)localObject3).size())
          break label509;
        localObject2 = (chw)((List)localObject3).get(i);
        localObject5 = localArrayList.iterator();
        if (((Iterator)localObject5).hasNext())
        {
          localObject6 = (chw)((Iterator)localObject5).next();
          if (!((chw)localObject2).xgS.equals(((chw)localObject6).xgS))
            continue;
          ((chw)localObject2).xhb = ((chw)localObject6).xhb;
          ((chw)localObject2).xha = ((chw)localObject6).xha;
          ((chw)localObject2).videoUrl = ((chw)localObject6).videoUrl;
          ab.d("MicroMsg.TopStory.TopStoryVideoDataMgr", "item title:%s, after url:%s", new Object[] { ((chw)localObject2).title, ((chw)localObject2).videoUrl });
        }
      }
      i++;
      continue;
      label509: AppMethodBeat.o(1758);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.n.2.1
 * JD-Core Version:    0.6.2
 */