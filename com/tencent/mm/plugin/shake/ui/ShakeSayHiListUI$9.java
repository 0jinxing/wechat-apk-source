package com.tencent.mm.plugin.shake.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeSayHiListUI$9
  implements MenuItem.OnMenuItemClickListener
{
  ShakeSayHiListUI$9(ShakeSayHiListUI paramShakeSayHiListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24882);
    this.qwt.aqX();
    this.qwt.finish();
    AppMethodBeat.o(24882);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.9
 * JD-Core Version:    0.6.2
 */