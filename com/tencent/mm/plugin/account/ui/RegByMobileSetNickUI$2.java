package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegByMobileSetNickUI$2
  implements MenuItem.OnMenuItemClickListener
{
  RegByMobileSetNickUI$2(RegByMobileSetNickUI paramRegByMobileSetNickUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(125430);
    this.gGx.aqX();
    this.gGx.finish();
    AppMethodBeat.o(125430);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileSetNickUI.2
 * JD-Core Version:    0.6.2
 */