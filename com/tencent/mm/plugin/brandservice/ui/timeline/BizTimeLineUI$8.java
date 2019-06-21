package com.tencent.mm.plugin.brandservice.ui.timeline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.bizui.widget.StoryListView;

final class BizTimeLineUI$8
  implements Runnable
{
  BizTimeLineUI$8(BizTimeLineUI paramBizTimeLineUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14190);
    BizTimeLineUI.p(this.jOK);
    if ((!this.jOK.isFinishing()) && (BizTimeLineUI.b(this.jOK) != null))
      BizTimeLineUI.b(this.jOK, BizTimeLineUI.b(this.jOK).getFirstVisiblePosition(), BizTimeLineUI.b(this.jOK).getLastVisiblePosition());
    AppMethodBeat.o(14190);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI.8
 * JD-Core Version:    0.6.2
 */