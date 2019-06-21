package com.tencent.mm.plugin.shake.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class ShakeSayHiListUI$3
  implements MenuItem.OnMenuItemClickListener
{
  ShakeSayHiListUI$3(ShakeSayHiListUI paramShakeSayHiListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24876);
    h.a(this.qwt.mController.ylL, true, this.qwt.getString(2131302715), "", this.qwt.getString(2131302714), this.qwt.getString(2131296868), new ShakeSayHiListUI.3.1(this), new ShakeSayHiListUI.3.2(this));
    AppMethodBeat.o(24876);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.3
 * JD-Core Version:    0.6.2
 */