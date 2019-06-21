package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.protocal.protobuf.chc;
import com.tencent.mm.protocal.protobuf.chd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class BizTimeLineHotView$4
  implements Runnable
{
  BizTimeLineHotView$4(BizTimeLineHotView paramBizTimeLineHotView, chc paramchc)
  {
  }

  public final void run()
  {
    boolean bool = false;
    AppMethodBeat.i(14310);
    BizTimeLineHotView.a(this.jQt, new ArrayList());
    Iterator localIterator = this.jQw.xfW.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      localObject = (chd)localIterator.next();
      int j = i + 1;
      if (j > 12)
        break;
      b localb = new b();
      i = j;
      if (t.mY(((chd)localObject).vGE))
      {
        localb.vGE = ((chd)localObject).vGE;
        BizTimeLineHotView.a(this.jQt).add(localb);
        i = j;
      }
    }
    this.jQt.aWK();
    Object localObject = this.jQt;
    if (this.jQw.xfY == 1)
      bool = true;
    BizTimeLineHotView.a((BizTimeLineHotView)localObject, bool);
    BizTimeLineHotView.b(this.jQt);
    AppMethodBeat.o(14310);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView.4
 * JD-Core Version:    0.6.2
 */