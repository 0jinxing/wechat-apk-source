package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class UnfamiliarContactUI$1
  implements MenuItem.OnMenuItemClickListener
{
  UnfamiliarContactUI$1(UnfamiliarContactUI paramUnfamiliarContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127684);
    this.qqA.finish();
    AppMethodBeat.o(127684);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactUI.1
 * JD-Core Version:    0.6.2
 */