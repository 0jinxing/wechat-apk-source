package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;

final class UnfamiliarContactDetailUI$d$1
  implements Runnable
{
  UnfamiliarContactDetailUI$d$1(UnfamiliarContactDetailUI.d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127662);
    if (this.qqq.qql != null)
    {
      this.qqq.qql.fh(UnfamiliarContactDetailUI.b(this.qqq.qpX).size(), this.qqq.qqn);
      UnfamiliarContactDetailUI.b(this.qqq.qpX).clear();
    }
    AppMethodBeat.o(127662);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.d.1
 * JD-Core Version:    0.6.2
 */