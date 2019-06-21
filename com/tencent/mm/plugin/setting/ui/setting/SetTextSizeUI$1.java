package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SetTextSizeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SetTextSizeUI$1(SetTextSizeUI paramSetTextSizeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127052);
    this.qlJ.aqX();
    this.qlJ.finish();
    AppMethodBeat.o(127052);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SetTextSizeUI.1
 * JD-Core Version:    0.6.2
 */