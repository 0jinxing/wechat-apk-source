package com.tencent.mm.plugin.brandservice.ui.timeline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.bizui.widget.StoryListView;
import com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView;

final class BizTimeLineUI$10
  implements Runnable
{
  BizTimeLineUI$10(BizTimeLineUI paramBizTimeLineUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14193);
    if ((this.jOK.isFinishing()) || (BizTimeLineUI.b(this.jOK) == null) || (BizTimeLineUI.b(this.jOK).getFirstVisiblePosition() != 0) || (BizTimeLineUI.r(this.jOK) == null))
      AppMethodBeat.o(14193);
    while (true)
    {
      return;
      BizTimeLineUI.r(this.jOK).aWJ();
      AppMethodBeat.o(14193);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI.10
 * JD-Core Version:    0.6.2
 */