package com.tencent.mm.plugin.shake.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class ShakeTvHistoryListUI$2
  implements MenuItem.OnMenuItemClickListener
{
  ShakeTvHistoryListUI$2(ShakeTvHistoryListUI paramShakeTvHistoryListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24894);
    h.a(this.qwx.mController.ylL, true, this.qwx.getString(2131303481), "", this.qwx.getString(2131302714), this.qwx.getString(2131296868), new ShakeTvHistoryListUI.2.1(this), new ShakeTvHistoryListUI.2.2(this));
    AppMethodBeat.o(24894);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI.2
 * JD-Core Version:    0.6.2
 */