package com.tencent.mm.plugin.account.bind.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.j;

final class BindMContactIntroUI$23
  implements MenuItem.OnMenuItemClickListener
{
  BindMContactIntroUI$23(BindMContactIntroUI paramBindMContactIntroUI, int paramInt)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13433);
    paramMenuItem = new j(this.grt.mController.ylL);
    paramMenuItem.rBl = new BindMContactIntroUI.23.1(this);
    paramMenuItem.rBm = new BindMContactIntroUI.23.2(this);
    paramMenuItem.cuu();
    AppMethodBeat.o(13433);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.23
 * JD-Core Version:    0.6.2
 */