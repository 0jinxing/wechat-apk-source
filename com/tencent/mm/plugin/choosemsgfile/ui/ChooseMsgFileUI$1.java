package com.tencent.mm.plugin.choosemsgfile.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChooseMsgFileUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ChooseMsgFileUI$1(ChooseMsgFileUI paramChooseMsgFileUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(54440);
    this.kvQ.finish();
    AppMethodBeat.o(54440);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI.1
 * JD-Core Version:    0.6.2
 */