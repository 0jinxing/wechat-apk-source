package com.tencent.mm.plugin.clean.ui.newui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CleanMsgUI$1
  implements MenuItem.OnMenuItemClickListener
{
  CleanMsgUI$1(CleanMsgUI paramCleanMsgUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(18887);
    this.kyS.finish();
    AppMethodBeat.o(18887);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanMsgUI.1
 * JD-Core Version:    0.6.2
 */