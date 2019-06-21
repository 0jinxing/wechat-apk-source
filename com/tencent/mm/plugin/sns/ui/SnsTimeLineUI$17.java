package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;

final class SnsTimeLineUI$17
  implements Runnable
{
  SnsTimeLineUI$17(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39469);
    if (SnsTimeLineUI.a(this.rzs) == null)
      AppMethodBeat.o(39469);
    while (true)
    {
      return;
      if (SnsTimeLineUI.s(this.rzs))
        af.cnC().pause();
      AppMethodBeat.o(39469);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.17
 * JD-Core Version:    0.6.2
 */