package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView;

final class SnsTimeLineUI$37
  implements Runnable
{
  SnsTimeLineUI$37(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39510);
    if (SnsTimeLineUI.g(this.rzs) == null)
      AppMethodBeat.o(39510);
    while (true)
    {
      return;
      SnsTimeLineUI.g(this.rzs).rhr.rpW = SnsTimeLineUI.j(this.rzs).nDp.getBottom();
      SnsTimeLineUI.g(this.rzs).rhr.rDO = SnsTimeLineUI.j(this.rzs).ooW.getTop();
      SnsTimeLineUI.h(this.rzs).rzX = SnsTimeLineUI.j(this.rzs).qQt.getTop();
      AppMethodBeat.o(39510);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.37
 * JD-Core Version:    0.6.2
 */