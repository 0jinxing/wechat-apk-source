package com.tencent.mm.plugin.choosemsgfile.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChooseMsgFileListUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ChooseMsgFileListUI$1(ChooseMsgFileListUI paramChooseMsgFileListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(54411);
    this.kvB.finish();
    AppMethodBeat.o(54411);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI.1
 * JD-Core Version:    0.6.2
 */