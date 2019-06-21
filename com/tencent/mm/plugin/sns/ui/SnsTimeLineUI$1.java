package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.a.a;
import com.tencent.mm.plugin.sns.ui.a.b.b;

final class SnsTimeLineUI$1
  implements Runnable
{
  SnsTimeLineUI$1(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39442);
    a locala = SnsTimeLineUI.a(this.rzs);
    if (locala != null)
    {
      locala.rEB.ctK();
      locala.rEB.notifyVendingDataChange();
    }
    AppMethodBeat.o(39442);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.1
 * JD-Core Version:    0.6.2
 */