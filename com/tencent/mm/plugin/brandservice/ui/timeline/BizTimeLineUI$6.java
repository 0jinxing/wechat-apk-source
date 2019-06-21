package com.tencent.mm.plugin.brandservice.ui.timeline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class BizTimeLineUI$6
  implements Runnable
{
  BizTimeLineUI$6(BizTimeLineUI paramBizTimeLineUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14188);
    BizTimeLineUI.n(this.jOK);
    if (!this.jOK.isFinishing())
    {
      this.jOK.aWC();
      AppMethodBeat.o(14188);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.BizTimeLineUI", "Activity is finished!!!");
      AppMethodBeat.o(14188);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI.6
 * JD-Core Version:    0.6.2
 */