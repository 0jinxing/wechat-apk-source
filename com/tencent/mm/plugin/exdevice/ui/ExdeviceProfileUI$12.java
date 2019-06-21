package com.tencent.mm.plugin.exdevice.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class ExdeviceProfileUI$12
  implements MenuItem.OnMenuItemClickListener
{
  ExdeviceProfileUI$12(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(20034);
    paramMenuItem = new d(this.lCu.mController.ylL, 1, false);
    paramMenuItem.rBl = new ExdeviceProfileUI.12.1(this);
    paramMenuItem.rBm = ExdeviceProfileUI.n(this.lCu);
    paramMenuItem.cpD();
    AppMethodBeat.o(20034);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.12
 * JD-Core Version:    0.6.2
 */