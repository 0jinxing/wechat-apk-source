package com.tencent.mm.plugin.shake.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeReportUI$27
  implements MenuItem.OnMenuItemClickListener
{
  ShakeReportUI$27(ShakeReportUI paramShakeReportUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24809);
    ShakeReportUI.a(this.qwj, false);
    this.qwj.finish();
    AppMethodBeat.o(24809);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.27
 * JD-Core Version:    0.6.2
 */