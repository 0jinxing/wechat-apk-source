package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.ui.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsTimeLineUI$18
  implements Runnable
{
  SnsTimeLineUI$18(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39470);
    if (SnsTimeLineUI.a(this.rzs) == null)
      AppMethodBeat.o(39470);
    while (true)
    {
      return;
      if (!SnsTimeLineUI.s(this.rzs))
      {
        ab.v("MicroMsg.SnsTimeLineUI", "zeustest update onFling notify resume %s", new Object[] { Integer.valueOf(SnsTimeLineUI.j(this.rzs).nDp.getFirstVisiblePosition() - SnsTimeLineUI.j(this.rzs).nDp.getHeaderViewsCount()) });
        af.cnC().start();
        SnsTimeLineUI.a(this.rzs).rEA.cub();
      }
      AppMethodBeat.o(39470);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.18
 * JD-Core Version:    0.6.2
 */