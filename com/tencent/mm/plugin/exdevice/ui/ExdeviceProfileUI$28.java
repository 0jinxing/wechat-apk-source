package com.tencent.mm.plugin.exdevice.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceProfileUI$28
  implements MenuItem.OnMenuItemClickListener
{
  ExdeviceProfileUI$28(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(20055);
    this.lCu.finish();
    AppMethodBeat.o(20055);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.28
 * JD-Core Version:    0.6.2
 */