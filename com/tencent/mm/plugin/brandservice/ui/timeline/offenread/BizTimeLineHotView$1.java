package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import java.util.Iterator;
import java.util.List;

final class BizTimeLineHotView$1
  implements Runnable
{
  BizTimeLineHotView$1(BizTimeLineHotView paramBizTimeLineHotView, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14305);
    if (BizTimeLineHotView.a(this.jQt) == null)
      AppMethodBeat.o(14305);
    while (true)
    {
      return;
      if ((this.ewn == null) || (t.ny(this.ewn)))
      {
        AppMethodBeat.o(14305);
      }
      else
      {
        Iterator localIterator = BizTimeLineHotView.a(this.jQt).iterator();
        while (true)
          if (localIterator.hasNext())
          {
            b localb = (b)localIterator.next();
            if (this.ewn.equals(localb.vGE))
              if (BizTimeLineHotView.a(localb))
              {
                BizTimeLineHotView.a(this.jQt, localb);
                AppMethodBeat.o(14305);
                break;
              }
          }
        AppMethodBeat.o(14305);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView.1
 * JD-Core Version:    0.6.2
 */