package com.tencent.mm.plugin.shake.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeReportUI$28
  implements MenuItem.OnMenuItemClickListener
{
  ShakeReportUI$28(ShakeReportUI paramShakeReportUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24810);
    ShakeReportUI.a(this.qwj, false);
    paramMenuItem = new Intent();
    paramMenuItem.setClass(this.qwj, ShakePersonalInfoUI.class);
    this.qwj.startActivityForResult(paramMenuItem, 3);
    AppMethodBeat.o(24810);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.28
 * JD-Core Version:    0.6.2
 */