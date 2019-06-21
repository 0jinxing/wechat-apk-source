package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsTimeLineUI$30
  implements Runnable
{
  SnsTimeLineUI$30(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39498);
    ab.i("MicroMsg.SnsTimeLineUI", "onResume go to playAnim " + SnsTimeLineUI.G(this.rzs));
    if (SnsTimeLineUI.G(this.rzs))
    {
      SnsTimeLineUI.i(this.rzs);
      SnsTimeLineUI.h(this.rzs).cur();
    }
    AppMethodBeat.o(39498);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.30
 * JD-Core Version:    0.6.2
 */