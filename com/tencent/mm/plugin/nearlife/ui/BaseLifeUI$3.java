package com.tencent.mm.plugin.nearlife.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseLifeUI$3
  implements MenuItem.OnMenuItemClickListener
{
  BaseLifeUI$3(BaseLifeUI paramBaseLifeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22938);
    this.oRY.a(-1, false, "", this.oRY.oRT);
    this.oRY.finish();
    AppMethodBeat.o(22938);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.BaseLifeUI.3
 * JD-Core Version:    0.6.2
 */