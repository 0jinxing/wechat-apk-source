package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ah;
import com.tencent.mm.g.a.ah.a;
import java.util.Iterator;
import java.util.List;

final class BizTimeLineHotView$2$1
  implements Runnable
{
  BizTimeLineHotView$2$1(BizTimeLineHotView.2 param2, ah paramah)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14306);
    Iterator localIterator = BizTimeLineHotView.a(this.jQv.jQt).iterator();
    b localb;
    do
    {
      if (!localIterator.hasNext())
        break;
      localb = (b)localIterator.next();
    }
    while (!this.jQu.ctf.userName.equals(localb.vGE));
    while (true)
    {
      if (localb != null)
        BizTimeLineHotView.a(this.jQv.jQt).remove(localb);
      BizTimeLineHotView.b(this.jQv.jQt);
      AppMethodBeat.o(14306);
      return;
      localb = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView.2.1
 * JD-Core Version:    0.6.2
 */