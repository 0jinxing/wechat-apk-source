package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;

final class BakToPcUI$1
  implements MenuItem.OnMenuItemClickListener
{
  BakToPcUI$1(BakToPcUI paramBakToPcUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(17967);
    a.aUB().aUC().rE(1);
    BakToPcUI.a(this.jAK);
    AppMethodBeat.o(17967);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI.1
 * JD-Core Version:    0.6.2
 */