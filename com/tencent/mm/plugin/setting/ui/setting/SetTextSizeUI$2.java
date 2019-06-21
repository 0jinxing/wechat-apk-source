package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

final class SetTextSizeUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SetTextSizeUI$2(SetTextSizeUI paramSetTextSizeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127053);
    a.h(this.qlJ, SetTextSizeUI.a(this.qlJ));
    this.qlJ.finish();
    AppMethodBeat.o(127053);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SetTextSizeUI.2
 * JD-Core Version:    0.6.2
 */