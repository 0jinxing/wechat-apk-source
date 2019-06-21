package com.tencent.mm.plugin.setting.ui.fixtools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FixToolsUI$1
  implements MenuItem.OnMenuItemClickListener
{
  FixToolsUI$1(FixToolsUI paramFixToolsUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(126883);
    this.qkj.finish();
    AppMethodBeat.o(126883);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI.1
 * JD-Core Version:    0.6.2
 */