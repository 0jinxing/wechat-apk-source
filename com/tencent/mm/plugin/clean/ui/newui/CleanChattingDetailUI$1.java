package com.tencent.mm.plugin.clean.ui.newui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CleanChattingDetailUI$1
  implements MenuItem.OnMenuItemClickListener
{
  CleanChattingDetailUI$1(CleanChattingDetailUI paramCleanChattingDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(18863);
    this.kyM.finish();
    AppMethodBeat.o(18863);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanChattingDetailUI.1
 * JD-Core Version:    0.6.2
 */