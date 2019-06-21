package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;

final class BakFinishUI$1
  implements MenuItem.OnMenuItemClickListener
{
  BakFinishUI$1(BakFinishUI paramBakFinishUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(17921);
    a.aUB().aUC().jzK = -1;
    BakFinishUI.a(this.jAw);
    AppMethodBeat.o(17921);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakFinishUI.1
 * JD-Core Version:    0.6.2
 */