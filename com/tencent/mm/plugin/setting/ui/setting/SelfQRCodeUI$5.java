package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelfQRCodeUI$5
  implements MenuItem.OnMenuItemClickListener
{
  SelfQRCodeUI$5(SelfQRCodeUI paramSelfQRCodeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127017);
    this.qly.aqX();
    this.qly.finish();
    AppMethodBeat.o(127017);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.5
 * JD-Core Version:    0.6.2
 */