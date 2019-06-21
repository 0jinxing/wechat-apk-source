package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GestureGuardLogicUI$1
  implements MenuItem.OnMenuItemClickListener
{
  GestureGuardLogicUI$1(GestureGuardLogicUI paramGestureGuardLogicUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(51586);
    if (GestureGuardLogicUI.a(this.tVW))
      AppMethodBeat.o(51586);
    while (true)
    {
      return true;
      GestureGuardLogicUI.a(this.tVW, 0, 4, "user cancel when setting gesture");
      AppMethodBeat.o(51586);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.1
 * JD-Core Version:    0.6.2
 */