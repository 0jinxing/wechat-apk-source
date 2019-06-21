package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.support.v7.widget.LinearLayoutManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import java.util.List;

final class ConsolePanel$9
  implements Runnable
{
  ConsolePanel$9(ConsolePanel paramConsolePanel, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(11145);
    int i = this.jpR.jpO.getItemCount();
    this.jpR.jpO.jpE.addAll(this.jpS);
    this.jpR.jpO.at(i, this.jpS.size());
    if (((LinearLayoutManager)this.jpR.iIE.getLayoutManager()).iS() == i - 1)
      this.jpR.iIE.smoothScrollToPosition(this.jpR.jpO.getItemCount() - 1);
    AppMethodBeat.o(11145);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.ConsolePanel.9
 * JD-Core Version:    0.6.2
 */