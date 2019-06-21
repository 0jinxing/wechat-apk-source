package com.tencent.mm.plugin.shake.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeMsgListUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ShakeMsgListUI$1(ShakeMsgListUI paramShakeMsgListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24751);
    this.quR.aqX();
    this.quR.finish();
    AppMethodBeat.o(24751);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeMsgListUI.1
 * JD-Core Version:    0.6.2
 */