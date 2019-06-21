package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.a.a;
import com.tencent.mm.plugin.sns.ui.a.b.b;

final class SnsTimeLineUI$54
  implements Runnable
{
  SnsTimeLineUI$54(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39528);
    if (SnsTimeLineUI.a(this.rzs) != null)
      SnsTimeLineUI.a(this.rzs).rEB.notifyVendingDataChange();
    SnsTimeLineUI.S(this.rzs);
    AppMethodBeat.o(39528);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.54
 * JD-Core Version:    0.6.2
 */