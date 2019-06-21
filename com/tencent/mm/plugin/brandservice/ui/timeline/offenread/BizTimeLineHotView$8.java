package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizTimeLineHotView$8
  implements Runnable
{
  BizTimeLineHotView$8(BizTimeLineHotView paramBizTimeLineHotView, b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14313);
    Object localObject = BizTimeLineHotView.f(this.jQt);
    b localb = this.jQy;
    if (localb != null)
    {
      localObject = (BizTimeLineHotListView.b)((BizTimeLineHotListView)localObject).cf(localb.position);
      if (localObject != null)
        if (localb.jQz)
        {
          ((BizTimeLineHotListView.b)localObject).jQj.setVisibility(0);
          AppMethodBeat.o(14313);
        }
    }
    while (true)
    {
      return;
      ((BizTimeLineHotListView.b)localObject).jQj.setVisibility(8);
      AppMethodBeat.o(14313);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView.8
 * JD-Core Version:    0.6.2
 */