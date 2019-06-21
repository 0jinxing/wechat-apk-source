package com.tencent.mm.plugin.exdevice.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class ExdeviceProfileUI$26
  implements MenuItem.OnMenuItemClickListener
{
  ExdeviceProfileUI$26(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(20053);
    paramMenuItem = new d(this.lCu.mController.ylL, 1, false);
    paramMenuItem.rBl = new ExdeviceProfileUI.26.1(this);
    paramMenuItem.rBm = ExdeviceProfileUI.n(this.lCu);
    paramMenuItem.cpD();
    AppMethodBeat.o(20053);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.26
 * JD-Core Version:    0.6.2
 */