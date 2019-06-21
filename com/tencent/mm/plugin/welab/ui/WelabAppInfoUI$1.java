package com.tencent.mm.plugin.welab.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WelabAppInfoUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WelabAppInfoUI$1(WelabAppInfoUI paramWelabAppInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(80599);
    this.uMr.aqX();
    this.uMr.finish();
    AppMethodBeat.o(80599);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.ui.WelabAppInfoUI.1
 * JD-Core Version:    0.6.2
 */