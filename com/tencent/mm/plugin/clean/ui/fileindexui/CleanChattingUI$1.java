package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CleanChattingUI$1
  implements MenuItem.OnMenuItemClickListener
{
  CleanChattingUI$1(CleanChattingUI paramCleanChattingUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(18778);
    this.kxM.finish();
    AppMethodBeat.o(18778);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingUI.1
 * JD-Core Version:    0.6.2
 */