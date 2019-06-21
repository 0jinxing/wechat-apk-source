package com.tencent.mm.plugin.brandservice.ui.timeline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.bizui.widget.StoryListView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.q;

final class BizTimeLineUI$17
  implements Runnable
{
  BizTimeLineUI$17(BizTimeLineUI paramBizTimeLineUI, q paramq)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14201);
    BizTimeLineUI.c(this.jOK).jNw = false;
    BizTimeLineUI.i(this.jOK);
    int i = Math.max(0, BizTimeLineUI.b(this.jOK).getFirstVisiblePosition() - BizTimeLineUI.b(this.jOK).getHeaderViewsCount());
    BizTimeLineUI.c(this.jOK).a(this.jEl);
    BizTimeLineUI.c(this.jOK).a(BizTimeLineUI.c(this.jOK).sg(i));
    BizTimeLineUI.j(this.jOK);
    ab.i("MicroMsg.BizTimeLineUI", "resetKeep pos %d", new Object[] { Integer.valueOf(i) });
    AppMethodBeat.o(14201);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI.17
 * JD-Core Version:    0.6.2
 */