package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BakOperatingUI$5
  implements MenuItem.OnMenuItemClickListener
{
  BakOperatingUI$5(BakOperatingUI paramBakOperatingUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(17937);
    boolean bool;
    if (BakOperatingUI.a(this.jAF))
    {
      BakOperatingUI.e(this.jAF);
      bool = false;
      AppMethodBeat.o(17937);
    }
    while (true)
    {
      return bool;
      BakOperatingUI.b(this.jAF);
      BakOperatingUI.f(this.jAF);
      bool = true;
      AppMethodBeat.o(17937);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakOperatingUI.5
 * JD-Core Version:    0.6.2
 */