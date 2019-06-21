package com.tencent.mm.plugin.setting.ui.fixtools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FixToolsUplogUI$4
  implements MenuItem.OnMenuItemClickListener
{
  FixToolsUplogUI$4(FixToolsUplogUI paramFixToolsUplogUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(126897);
    this.qkt.finish();
    AppMethodBeat.o(126897);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.4
 * JD-Core Version:    0.6.2
 */