package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelfQRCodeUI$4
  implements MenuItem.OnMenuItemClickListener
{
  SelfQRCodeUI$4(SelfQRCodeUI paramSelfQRCodeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127016);
    SelfQRCodeUI.b(this.qly);
    AppMethodBeat.o(127016);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.4
 * JD-Core Version:    0.6.2
 */