package com.tencent.mm.plugin.shake.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class ShakeMsgListUI$2
  implements MenuItem.OnMenuItemClickListener
{
  ShakeMsgListUI$2(ShakeMsgListUI paramShakeMsgListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24753);
    h.a(this.quR.mController.ylL, true, this.quR.getString(2131303437), "", this.quR.getString(2131302714), this.quR.getString(2131296868), new ShakeMsgListUI.2.1(this), new ShakeMsgListUI.2.2(this));
    AppMethodBeat.o(24753);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeMsgListUI.2
 * JD-Core Version:    0.6.2
 */